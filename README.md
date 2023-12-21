# Calculadora de Preu de Furgoneta Volkswagen

## Descripción del Proyecto
Este proyecto es una aplicación Kotlin diseñada para calcular el precio actual de una furgoneta Volkswagen basado en ciertos criterios como la versión de la furgoneta, el estado de los neumáticos y otros factores relacionados con la depreciación y características adicionales.

## Funcionalidades Principales

### 1. Selección de Versión
- El usuario puede especificar si tiene una furgoneta Volkswagen Grand California en versión "normal" o "camper".

### 2. Estado de los Neumáticos
- Según los kilómetros recorridos por los neumáticos, se determina un valor de depreciación, es decir el valor que se le resta al precio inicial:
  - Menos de 5000 km: 0€
  - Entre 5000 y 10000 km: -200€
  - Más de 10000 km: -300€

### 3. Cálculo de Precio Base
- Basado en la versión seleccionada, se determina un precio base para la furgoneta:
  - Versión "normal": €73,490
  - Versión "camper": €93,490

### 4. Cálculo de Precio Actual
- Se tiene en cuenta la depreciación basada en los kilómetros recorridos y otros factores:
  - Depreciación por kilómetro recorrido.
  - Posible adición de portabicis (+€250).
  - Depreciación adicional según la edad del vehículo.

## Cómo Ejecutar
1. Debes clonar el repositorio en tu máquina local.
2. Asegúrate antes de nada de tener configuradas las herramientas necesarias para ejecutar proyectos de tipo Kotlin.
3. Debes ejecutar la aplicación para interactuar con la calculadora de precio.

![Furgoneta](Yo/Imágenes/furgoneta.png)
![Menu de selección del modelo](Yo/Imágenes/ejecucionMenu)
![Precio Base vs Precio Final ](Yo/Imágenes/ejecucionPrecio)
![Calculo Precio Base](Yo/Imágenes/codigoPrecioBase)
![Calculo Precio Actual](Yo/Imágenes/codigoPrecioActual)


