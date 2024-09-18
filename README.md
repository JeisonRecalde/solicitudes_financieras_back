# Sistema de Automatización de Solicitud de Tarjeta de Crédito (SASTC)

El Sistema de Automatización de Solicitud de Tarjeta de Crédito (SASTC) es una aplicación desarrollada para el Banco "Centauros Bank", con el objetivo de automatizar y agilizar el proceso de solicitud de tarjetas de crédito para sus clientes.

## Descripción del Proyecto

El proyecto SASTC se centra en optimizar los procesos asociados con la solicitud de tarjetas de crédito, desde la captura inicial de información del cliente hasta la entrega del producto final. El sistema automatiza tareas como la verificación crediticia, el procesamiento de documentos y la creación de cuentas, proporcionando una experiencia más eficiente tanto para los clientes como para el personal del banco.

## Estructura del Proyecto

El proyecto sigue una arquitectura hexagonal, donde se separan claramente las capas de dominio, aplicación e infraestructura. A continuación se presenta la estructura del proyecto:

- **dominio**: Contiene las clases que representan los objetos de dominio del negocio, como la solicitud de tarjeta de crédito y la verificación crediticia.
- **aplicacion**: Aquí se encuentran las clases que implementan la lógica de negocio y los controladores que gestionan las solicitudes de los usuarios.
- **infraestructura**: Contiene las implementaciones concretas de las interfaces definidas en la capa de aplicación, así como cualquier código relacionado con la persistencia de datos o la integración con sistemas externos.
- **controladores**: Define los controladores que actúan como punto de entrada para las solicitudes de la interfaz de usuario.

## Configuración y Ejecución

Para ejecutar la aplicación SASTC, sigue estos pasos:

1. Clona el repositorio desde GitHub: `git clone https://github.com/tu_usuario/sastc.git`
2. Importa el proyecto en tu entorno de desarrollo preferido.
3. Asegúrate de tener todas las dependencias necesarias instaladas, incluyendo Java, Spring Framework, y MySQL.
4. Configura la base de datos MySQL con las credenciales adecuadas y asegúrate de que el servidor esté en ejecución.
5. Ejecuta la aplicación desde tu entorno de desarrollo o utilizando un servidor de aplicaciones compatible con Spring Boot.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas contribuir al desarrollo del proyecto SASTC, sigue estos pasos:

1. Realiza un fork del repositorio.
2. Crea una nueva rama para tu funcionalidad: `git checkout -b nueva-funcionalidad`
3. Realiza tus cambios y commits: `git commit -am 'Añade nueva funcionalidad'`
4. Sube tus cambios a tu repositorio: `git push origin nueva-funcionalidad`
5. Crea un pull request en el repositorio original.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
