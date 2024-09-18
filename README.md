# solicitudes_financieras_back

## Sistema de Gestión Automatizada de Solicitudes de Tarjeta de Crédito (SASTC)

El **Sistema de Gestión Automatizada de Solicitudes de Tarjeta de Crédito (SASTC)** es una solución diseñada para el banco *Centauros Bank*, cuyo objetivo es optimizar y agilizar el proceso de solicitud de tarjetas de crédito para sus clientes, asegurando una mayor eficiencia en la validación de solicitudes, verificación crediticia, y gestión de cuentas.

## Descripción del Proyecto

El propósito de este sistema es mejorar los procesos vinculados a la solicitud y procesamiento de tarjetas de crédito, desde la captura inicial de datos del cliente hasta la entrega de la tarjeta. El sistema automatiza operaciones clave, como la verificación del historial crediticio y el procesamiento de documentación, facilitando una experiencia fluida tanto para los usuarios como para el personal bancario.

## Arquitectura del Proyecto

El proyecto se fundamenta en una **arquitectura hexagonal**, también conocida como arquitectura limpia, que separa las diferentes capas de la aplicación de manera modular para asegurar un alto grado de mantenibilidad, extensibilidad y escalabilidad. A continuación, se describen brevemente las principales capas:

- **Dominio**: Define las entidades de negocio principales, como la *Solicitud de Tarjeta de Crédito* y los servicios de verificación de crédito.
- **Aplicación**: Contiene la lógica de negocio que orquesta el flujo de las solicitudes y las interacciones entre las diferentes capas. Los controladores de esta capa gestionan las solicitudes provenientes de los usuarios.
- **Infraestructura**: Provee las implementaciones concretas de las interfaces definidas en la capa de aplicación. También se encarga de la persistencia de datos y la integración con sistemas externos.
- **Controladores**: Gestionan las interacciones del sistema con la capa de presentación (interfaz de usuario), sirviendo como punto de entrada para las solicitudes HTTP.

## Requisitos del Sistema

Para ejecutar el sistema **SASTC**, es necesario cumplir con los siguientes requisitos:

1. Clonar el repositorio desde GitHub: `git clone https://github.com/tu_usuario/sastc.git`
2. Importar el proyecto en tu entorno de desarrollo preferido (IDE como IntelliJ IDEA o Eclipse).
3. Asegurarse de que las dependencias necesarias estén correctamente instaladas, incluyendo **Java**, **Spring Framework**, y **MySQL**.
4. Configurar la base de datos MySQL con las credenciales adecuadas, y verificar que el servidor de base de datos esté en ejecución.
5. Ejecutar la aplicación utilizando un servidor compatible con **Spring Boot** desde el IDE o línea de comandos.

## Contribuciones

Las contribuciones son bienvenidas. Si deseas colaborar en el desarrollo del sistema **SASTC**, sigue los siguientes pasos:

1. Realiza un *fork* del repositorio.
2. Crea una nueva rama para tu funcionalidad o corrección: `git checkout -b nueva-funcionalidad`.
3. Implementa los cambios requeridos y realiza un commit: `git commit -am 'Agregar nueva funcionalidad'`.
4. Sube tus cambios a tu repositorio remoto: `git push origin nueva-funcionalidad`.
5. Envía un *pull request* hacia el repositorio original para revisión y aprobación.

## Licencia

Este proyecto está licenciado bajo la **Licencia MIT**. Para más detalles, consulta el archivo `LICENSE`.
