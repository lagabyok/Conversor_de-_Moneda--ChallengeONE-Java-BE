# Conversor_de-_Moneda--ChallengeONE-Java-BE
Conversor de Moneda - Challenge ONE Java
Este proyecto es un conversor de moneda que utiliza la API de ExchangeRate-API para obtener las tasas de cambio entre diferentes monedas. Está construido en Java y utiliza Maven como sistema de construcción.

Requisitos
Java 17: Asegúrate de tener instalado Java 17 o una versión posterior en tu máquina.
Maven: Necesitarás Maven para construir el proyecto. Puedes instalarlo desde aquí si aún no lo tienes.
Pasos para ejecutar el proyecto
1. Clonar el repositorio
Primero, clona el repositorio en tu máquina local usando el siguiente comando:
git clone https://github.com/lagabyok/Conversor_de-_Moneda--ChallengeONE-Java-BE.git

2. Navegar a la carpeta del proyecto
Una vez clonado el repositorio, navega a la carpeta del proyecto:
cd Conversor_de-_Moneda--ChallengeONE-Java-BE

3. Construir el proyecto con Maven
Si no tienes el archivo JAR compilado, debes construirlo. Para ello, ejecuta el siguiente comando en la terminal:
mvn clean package

Este comando limpiará cualquier construcción anterior y luego construirá el proyecto generando un archivo JAR ejecutable.

4. Ejecutar el Conversor de Moneda
Una vez que el proyecto esté construido, puedes ejecutar el conversor de moneda con el siguiente comando:
java -jar target/Conversor_de_Moneda-1.0-SNAPSHOT.jar
O simplemente con RUN

5. Ingresar los datos para la conversión
Cuando ejecutes el comando anterior, el programa te pedirá que ingreses los siguientes datos:

Moneda base (ej. USD): La moneda de la que deseas convertir.
Moneda de destino (ej. EUR): La moneda a la que deseas convertir.
Monto a convertir: La cantidad de dinero que deseas convertir.
Ejemplo de ejecución:
Introduce la moneda base (ej. USD): USD
Introduce la moneda de destino (ej. EUR): EUR
Introduce el monto a convertir: 100
100,00 USD equivalen a 94,35 EUR
(SIEMPRE USAR MAYUSCULAS AL COLOCAR LA MONEDA)

6-Verificar el archivo JAR
El archivo JAR ejecutable se encuentra en el directorio target/. Si todo ha funcionado correctamente, el archivo Conversor_de_Moneda-1.0-SNAPSHOT.jar estará listo para ser ejecutado.

Estructura del Proyecto
La estructura del proyecto es la siguiente:
Conversor_de-_Moneda--ChallengeONE-Java-BE/
├── pom.xml                # Archivo de configuración de Maven
├── src/                   # Código fuente del proyecto
│   ├── main/
│   │   ├── java/
│   │   │   ├── models/    # Modelos de datos (por ejemplo, ExchangeRateResponse.java)
│   │   │   ├── services/  # Servicios (por ejemplo, ExchangeRateClient.java)
│   │   │   └── utils/     # Utilidades (por ejemplo, CurrencyConverterUtil.java)
├── target/                # Carpeta donde Maven coloca el JAR compilado
├── .git/                  # Carpeta oculta con la configuración de git
└── README.md              # Este archivo

Dependencias
Este proyecto utiliza las siguientes dependencias:

Gson: Para parsear la respuesta JSON de la API de ExchangeRate-API.
Maven Compiler Plugin: Para compilar el código con Java 17.
Licencia
Este proyecto está bajo la Licencia MIT. Consulta el archivo LICENSE para más detalles.

MONEDAS QUE LA API SOPORTA:
https://www.exchangerate-api.com/docs/supported-currencies

Conversor de moneda creado por :
Gabriela soledad Coronel 
