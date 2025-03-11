# Ejercicio: Sistema de Gestión de Vehículos

Crea una aplicación en Scala que gestione diferentes tipos de vehículos con las siguientes características:

## 1. Clase base `Vehiculo`:
- Atributos:
    - `modelo`, `matricula`, `propietario`, `velocidad`.
- Métodos:
    - `mostrarInformacion()`: Imprime la información del vehículo.
    - `acelerar()`: Aumenta la velocidad del vehículo.
    - `frenar()`: Disminuye la velocidad del vehículo.
    - `detener()`: Establece la velocidad a cero.

## 2. Clases derivadas:
- `Coche`: Añadir el método `abrirMaletero()`.
- `Motocicleta`: Añadir el método `realizarStunt()`.
- `Camion`: Añadir el método `cargarCarga()`.

## 3. Acción de vehículos:
- Crea una función que, dependiendo del tipo de vehículo, ejecute una acción específica:
    - Si es un `Coche`, abre el maletero.
    - Si es una `Motocicleta`, realiza un stunt.
    - Si es un `Camion`, carga la carga.

## 4. Manejo de errores:
- Implementa manejo de excepciones para casos donde las acciones puedan fallar (ej. exceder la velocidad máxima).

## 5. Colección de vehículos:
- Crea una lista de vehículos y recorre la lista realizando acciones para cada uno.

## 6. Búsqueda por matrícula:
- Implementa una función para buscar un vehículo por su matrícula en la lista.