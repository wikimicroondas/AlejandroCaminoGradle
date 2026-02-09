### Introducción
Segunda parte de un ejercicio centrado en builders de Java.
### Descripción
En este bloque vamos a desarrollar un programa en Java que genere una conversación entre 2 LLMs. Dado que el uso de los servicios que vamos a utilizar es muy limitado de forma gratuita, la conversación se reducirá a que una IA hace una pregunta y la otra responde. Para ello vamos a utilizar Ollama y para facilitar el acceso a las IA desde Java, utilizaremos la librería LangChain4j.

<p align="center">
	<img src="https://gradle.org/assets/images/gradle-knowledge-graph-logo.png" width="100" alt="Maven logo" >
</p>

### Dependencias
- **LangChain4j**

```kotlin
implementation(platform("dev.langchain4j:langchain4j-bom:1.10.0"))
implementation("dev.langchain4j:langchain4j-open-ai")
```
