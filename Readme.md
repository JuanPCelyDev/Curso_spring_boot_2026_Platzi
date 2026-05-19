# 🎬 Movie Management API con IA Integrada

¡Bienvenido/a! Este es un proyecto desarrollado como parte de mi aprendizaje en Spring Boot(Curso de Platzi.com). 
Es una API REST completa para la gestión de un catálogo de películas, potenciada con capacidades de Inteligencia Artificial 
para ofrecer recomendaciones personalizadas a los usuarios.

---

## 🚀 Características Principales

El proyecto cubre un ciclo completo de desarrollo de software backend, incluyendo:

*   **CRUD Completo:** Operaciones para agregar (`POST`), actualizar (`PUT`), eliminar (`DELETE`), listar todas (`GET`) y buscar películas por ID (`GET`).
*   **Inteligencia Artificial (IA):** Integración de **LangChain4j** para analizar las preferencias del usuario (en texto libre) y sugerir películas guardadas en la base de datos que coincidan con sus gustos.
*   **Mapeo Eficiente:** Uso de **MapStruct** para separar de forma limpia las entidades de la base de datos de los objetos de transferencia de datos (DTOs).
*   **Validaciones Robustas:** Validación de campos y tipos de datos en los endpoints utilizando **Spring Boot Validation** para asegurar la integridad de la información.
*   **Documentación Interactiva:** Implementación de **Swagger UI** bajo el estándar **OpenAPI**, permitiendo probar la API de forma visual y rápida.

---

## 🛠️ Tecnologías y Herramientas Utilizadas

*   **Java 21** (última versión estable recomendada)
*   **Spring Boot 4.0.6** (Spring Web, Spring Data JPA)
*   **LangChain4j** (Integración con modelos de lenguaje)
*   **MapStruct** (Mapeador de objetos DTO <-> Entity)
*   **Jakarta Validation** (Validación de datos de entrada)
*   **Springdoc OpenAPI / Swagger UI** (Documentación de la API)
*   **Gradle** (Gestor de dependencias)

---

## 📋 Requisitos Previos

Para ejecutar este proyecto localmente necesitarás:
1. Tener instalado **Java JDK** (versión 21 o superior recomendado).
2. Un gestor de dependencias **Gradle**.
3. *[Opcional]* Una clave de API (API Key) si configuraste LangChain4j con un proveedor en la nube (como OpenAI o Anthropic), o configurar un modelo local (Ollama).


## ☁️ Despliegue en la Nube (Render)

La aplicación se encuentra actualmente desplegada en **Render.com**. 
Al estar configurada con un `Dockerfile`, el proceso de Integración y Despliegue Continuo (CI/CD) se realiza de forma automática 
cada vez que se hace un `git push` a la rama principal.

### Configuración en Render:
Para que el proyecto funcione correctamente en producción, 
se configuraron las siguientes **Environment Variables** en el panel de control de Render (reemplazando los valores del ambiente de desarrollo):

*   `SPRING_PROFILES_ACTIVE`: `prod` *(indica a Spring Boot que use la configuración de producción)*
*   `SPRING_DATASOURCE_URL`: Enlace de conexión a la base de datos gestionada en la nube.
*   `SPRING_DATASOURCE_USERNAME`: Usuario de la base de datos de producción.
*   `SPRING_DATASOURCE_PASSWORD`: Contraseña de la base de datos de producción.
*   `LANGCHAIN4J_OPENAI_API_KEY`: Llave de acceso para las funciones de Inteligencia Artificial.