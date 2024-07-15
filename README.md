# ProjectBooking

Proyecto de Automatización Mobile se utiliza Cucumber,Gherkin,Maven,Java y Appium para la creación de un framework de automatización que permita probar el APK Booking

EL proyecto ha sido desarrollado por [Joel Leiva](https://www.linkedin.com/in/joel-armando-l-7aa263124/) para mejorar el desarrollo en pruebas avanzadas de mobile automation.


![Joel Leiva](https://github-readme-stats.vercel.app/api?username=NextLeiva&show_icons=true&theme=dark)



## Tabla de Contenidos

- [Instalación](#instalación)
- [Lenguajes & Frameworks](#Lenguajes & Frameworks)
- [Descarga el proyecto desde GitHub](#Descarga el proyecto desde GitHub)
- [Configuracion de entorno de prueba](#Configuracion de entorno de prueba)
- [Conéctate conmigo](#Conéctate conmigo)

## Instalación
- Java 11
- Appium
- Appium Inspector
- Intellij IDEA
- Maven

Instrucciones paso a paso sobre cómo instalar y configurar el proyecto.

## Lenguajes & Frameworks
Este proyecto utiliza los siguientes lenguajes y frameworks:


- Appium: Como framework para probar y validar aplicaciones web nativas, híbridas y móviles.
- Cucumber: Como software de testing BDD que permite elaborar pruebas a partir de AC.
- Java 11: Como lenguaje de programación.
- Page Object Model (POM): Como el patrón de diseño.
- Maven como herramienta de compilación.

## Descarga el proyecto desde GitHub

- (HTTPS): https://github.com/NextLeiva/ProjectBooking
- (SSH): git@github.com:NextLeiva/ProjectBooking.git
- Descargar: Descárgalo como archivo Zip y extráelo

## Configuracion de entorno de prueba

- Configurar las variables de entorno( Java , Maven y Android Studio)
- Configurar el dispositivo movil

Ingresar el comando adb devices
```
\Users\Joel: adb devices
List of devices attached
emulator-5554	device
```
Configurar el Appium Inspector:

```
{
  "platformName": "Android",
  "appium:deviceName": "emulador",
  "appium:platformVersion": "10.0",
  "appium:automationName": "UiAutomator2",
  "appium:appPackage": "com.booking",
  "appium:appActivity": "com.booking.startup.HomeActivity"
}
```
Configurar Appium Server GUI:

```
{
  HOST: 127.0.0.1
  PORT: 4724
}
```

## Conéctate conmigo
Joel Leiva(https://www.linkedin.com/in/joel-armando-l-7aa263124/)

![Top Langs](https://github-readme-stats.vercel.app/api/top-langs/?username=NextLeiva&hide_progress=true)



