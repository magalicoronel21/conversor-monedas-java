# Conversor de Monedas en Java

Este proyecto es un **Conversor de Monedas** desarrollado en Java como parte del programa **ONE - Oracle Next Education**.  
El sistema permite convertir valores desde **USD** hacia distintas monedas latinoamericanas utilizando una **API de tasas de cambio en tiempo real**.

---

## Funcionalidades

✔ Menú interactivo por consola  
✔ Conversión en tiempo real usando ExchangeRate-API  
✔ Uso de `HttpClient` para solicitudes HTTP  
✔ Análisis de respuestas JSON con la librería **Gson**  
✔ Arquitectura organizada en paquetes (`app`, `service`, `model`)  
✔ Manejo de múltiples monedas:

- ARS 🇦🇷 (Peso argentino)
- BRL 🇧🇷 (Real brasileño)
- CLP 🇨🇱 (Peso chileno)

---

## Estructura del Proyecto

src/
├── app/
│ └── ConversorApp.java
├── service/
│ ├── ApiService.java
│ └── ConversorService.java
├── model/
├── Moneda.java
└── RespuestaApi.java


---

## Tecnologías utilizadas

- **Java 17**
- **IntelliJ IDEA**
- **HttpClient (Java 11+)**
- **Gson 2.10.1**
- **ExchangeRate-API**

---

## API utilizada

Este proyecto consume la API:

https://www.exchangerate-api.com/

Endpoint utilizado:https://v6.exchangerate-api.com/v6/af0c44143063d16d65c6df57/latest/USD


>la API KEY es personal y debe mantenerse privada.

---

## Cómo ejecutar el proyecto

1. Clonar el repositorio:

git clone https://github.com/magalicoronel21/conversor-monedas-java.git

Abrir el proyecto en IntelliJ IDEA

Verificar que la librería Gson está instalada (carpeta /lib)

Ejecutar desde:

src/app/ConversorApp.java


Seguir las instrucciones del menú.

Ejemplo de ejecución
==== CONVERSOR DE MONEDAS ====
1) USD → ARS
2) USD → BRL
3) USD → CLP
4) Salir
Elige una opción: 2
Ingrese el monto en USD: 10
Resultado: 52.979

Mejoras futuras

Agregar historial de conversiones

Soporte para más monedas

Guardar logs con fecha y hora

Interfaz gráfica (JavaFX)

Autora

Magalí Coronel
Proyecto realizado para el desafío Backend con Java — Alura + Oracle ONE.


---