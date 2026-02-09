plugins {
    id("java")
    id("application")
}

group = "com.alejandrocamino.tema4gradle"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    implementation(platform("dev.langchain4j:langchain4j-bom:1.10.0"))
    implementation("dev.langchain4j:langchain4j-open-ai")
}

tasks.test {
    useJUnitPlatform()
}

application {
    mainClass.set("com.alejandrocamino.tema4gradle.Main")
}

// ¿Está Ollama vivo?
tasks.register<Exec>("ollamaVersion") {
    group = "ollama custom"
    description = "Muestra la versión instalada de Ollama"

    commandLine("ollama", "--version")
}

// 2. ¿Hay modelos cargados?
tasks.register<Exec>("ollamaPs") {
    group = "ollama custom"
    description = "Muestra los modelos de Ollama cargados en memoria"

    commandLine("ollama", "ps")
}

// 3. Dependencias entre tareas
tasks.register("llmInfo") {
    group = "ollama custom"
    description = "Ejecuta todas las comprobaciones de Ollama"

    dependsOn("ollamaVersion", "ollamaPs")

    doLast {
        println("Demo finalizada")
    }
}