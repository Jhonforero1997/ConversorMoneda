# Conversor de Monedas

## Descripción
Este proyecto es un **conversor de monedas** interactivo desarrollado en Java. Permite realizar conversiones entre diferentes monedas utilizando tasas de cambio obtenidas de una API externa. El usuario puede seleccionar la conversión deseada, ingresar la cantidad a convertir y recibir el resultado en tiempo real.

## Características
- Menú interactivo con varias opciones de conversión.
- Soporte para las siguientes monedas:
  - Dólar (USD)
  - Peso Argentino (ARS)
  - Real Brasileño (BRL)
  - Peso Colombiano (COP)
- Llamadas dinámicas a una API para obtener tasas de cambio actualizadas.
- Validación de entradas del usuario.
- Manejo de errores en la conexión a la API.

## Estructura del Proyecto
El proyecto está compuesto por las siguientes clases:

### 1. `Main`
Contiene la lógica principal del programa:
- Presenta el menú al usuario.
- Solicita la cantidad a convertir.
- Realiza la conversión llamando a la clase `ConsumoApi`.
- Muestra los resultados al usuario.

### 2. `ConsumoApi`
Se encarga de realizar las solicitudes a la API externa para obtener las tasas de cambio:
- Método principal: `getExchangeRate(String monedaBase, String monedaDestino)`

## Requisitos
- Java Development Kit (JDK) 8 o superior.
- Acceso a internet para conectar con la API de tasas de cambio.
- IDE o editor de texto para ejecutar y editar el código (e.g., IntelliJ IDEA, Eclipse, Visual Studio Code).

## Instalación y Ejecución
1. Clona este repositorio en tu máquina local:
   ```bash
   git clone <URL_DEL_REPOSITORIO>
   ```

2. Abre el proyecto en tu IDE favorito.

3. Asegúrate de tener configurada la clase `ConsumoApi` con la URL correcta de la API y cualquier clave de acceso necesaria.

4. Ejecuta la clase `Main`.

## Uso
1. Al iniciar el programa, se mostrará un menú con las opciones de conversión disponibles.

2. Selecciona una opción ingresando el número correspondiente.

3. Ingresa la cantidad que deseas convertir.

4. El programa mostrará la tasa de cambio y el resultado de la conversión.

5. Puedes realizar más conversiones o salir del programa seleccionando la opción correspondiente.

## Ejemplo de Ejecución
```
*********************************************
  Sea bienvenido/a al Conversor de Moneda =]
*********************************************

1) Dólar => Peso argentino
2) Peso argentino => Dólar
3) Dólar => Real brasileño
4) Real brasileño => Dólar
5) Dólar => Peso colombiano
6) Peso colombiano => Dólar
7) Salir

Elija una opción válida:
*********************************************
Ingrese la cantidad a convertir: 100
Tasa de cambio: 1 USD = 350.00 ARS
Cantidad convertida: 35000.00 ARS
```

## Notas
- La precisión de las tasas de cambio depende de la API utilizada.
- Asegúrate de manejar posibles excepciones en caso de problemas con la conexión a la API.

## Contribuciones
Si deseas contribuir a este proyecto:
1. Realiza un fork del repositorio.
2. Crea una rama nueva para tus cambios:
   ```bash
   git checkout -b feature/nueva-funcionalidad
   ```
3. Envía un pull request con una descripción detallada de los cambios realizados.

## Licencia
Este proyecto se distribuye bajo la licencia MIT. Puedes usarlo, modificarlo y distribuirlo libremente.

---
**Desarrollado con ❤ en Java.**

