# 🐉 Bestiary BFF

¡Bienvenido al proyecto Bestiary BFF! Este proyecto es una **API de backend** construida con Spring Boot, que sirve como
intermediario entre la base de datos y los clientes que desean obtener información sobre diversas criaturas fantásticas
y bestias mitológicas. Ideal para aplicaciones de exploración de bestiarios, juegos de rol, o cualquier proyecto
relacionado con criaturas mágicas. 🧙‍♂️✨

## 🚀 Características

- **API RESTful**: Permite a los clientes realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) en un conjunto
  de criaturas míticas y fantásticas.
- **Filtros y Búsquedas Avanzadas**: Encuentra bestias específicas mediante filtros como tipo, tamaño, entorno y nivel
  de amenaza.
- **Conexión a Base de Datos**: Utiliza una base de datos relacional para almacenar información detallada sobre cada
  criatura.
- **Endpoints bien estructurados**: Las rutas API están organizadas para un fácil acceso y administración de datos de
  bestiario.

## 🛠️ Tecnologías

- **Java** 🟡
- **Spring Boot** 🌱
- **Spring Data JPA** 🗄️
- **H2 Database** (para desarrollo) 🗃️
- **Maven** (para la gestión de dependencias) 📦

## 📦 Instalación y Ejecución

### Requisitos Previos

- Tener **Java 11** o superior instalado.
- **Maven** para manejar dependencias y construir el proyecto.

### Paso a Paso

1. **Clona el repositorio** en tu máquina local.
   ```bash
   git clone https://github.com/SrEscoz/bestiary-bff.git
   ```

2. **Navega al directorio del proyecto**:
   ```bash
   cd bestiary-bff
   ```

3. **Instala las dependencias** usando Maven:
   ```bash
   mvn install
   ```

4. **Ejecuta el proyecto**:
   ```bash
   mvn spring-boot:run
   ```

5. La aplicación estará disponible en `http://localhost:8020`. 🎉

## 📖 Documentación de la API

Una vez que la aplicación esté en ejecución, puedes acceder a la documentación de la API y probar los endpoints
directamente a través de Swagger en:

- `http://localhost:8020/bestiary-bff/v1/swagger-ui/index.html`

Aquí verás detalles de cada endpoint, los métodos HTTP disponibles, parámetros requeridos y ejemplos de respuestas.

## 📁 Estructura del Proyecto

- **src/main/java**: Código fuente principal.
    - **controller**: Controladores REST, donde se definen los endpoints de la API.
    - **service**: Lógica de negocio para manejar las operaciones de bestias.
    - **repository**: Repositorios para acceder a la base de datos.
    - **model**: Entidades que representan la estructura de datos.

- **src/main/resources**: Archivos de configuración, como `application.properties` para configurar la conexión a la base
  de datos y otros ajustes.

## 🧪 Pruebas

Este proyecto incluye pruebas unitarias para asegurar que la lógica de negocio y los endpoints funcionen correctamente.

Para ejecutar las pruebas, simplemente usa el siguiente comando:

```bash
mvn test
```
