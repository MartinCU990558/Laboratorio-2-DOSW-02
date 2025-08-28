# Reto3 - El Reino de los Vehículos

---

## Patrones de Diseño Utilizados

### Patrón de Diseño 1
- **Categoría**: Creacional
- **Patrón Utilizado**: Factory Method
- **Justificación**: El patrón Factory Method centraliza la creación de objetos vehículo facilitando la adición de nuevos tipos de vehículos sin modificar el código existente. Esto cumple con el principio Open-Closed y simplifica la creación de vehículos con categorías específicas.
- **Cómo lo aplicamos**:
    - La clase `VehicleFactory` proporciona un método estático `createVehicle(VehicleType type, CategoryType catType)` que crea instancias de vehículos según el tipo (`VehicleType`: CAR, BIKE, etc.) y la categoría (`CategoryType`: ECONOMIC, LUXURY, USED).
    - Usa un `switch` para mapear el tipo de vehículo a su clase concreta (`Car`, `Bike`, etc.) y la categoría a su implementación (`EconomicCategory`, `LuxuryCategory`, etc.).


---

### Patrón de Diseño 2
- **Categoría**: Comportamiento
- **Patrón Utilizado**: Strategy
- **Justificación**: El patrón Strategy permite definir un conjunto de algoritmos intercambiables para modificar los atributos de los vehículos (velocidad máxima, comodidad, precio y equipamiento) según la categoría (Económico, Lujo, Usado). Esto evita la duplicación de código.
- **Cómo lo aplicamos**:
    - Se define una interfaz `Category` con métodos para obtener modificadores de velocidad (`getSpeedModifier`), comodidad (`getComfortModifier`), precio (`getPriceModifier`) y equipamiento (`modifyEquipment`).
    - Clases concretas como `EconomicCategory`, `LuxuryCategory` y `UsedCategory` implementan esta interfaz, definiendo cómo cada categoría afecta los atributos y el equipamiento según el tipo de vehículo.
    - La clase `AbstractVehicle` recibe una instancia de `Category` en su constructor (inyección de dependencias), delegando la modificación de atributos y equipamiento a la categoría seleccionada.
    - Ejemplo: Un auto de lujo usa `LuxuryCategory`, que aumenta la velocidad en un 50%, la comodidad en 5 puntos, duplica el precio y añade equipamiento como GPS, Asientos de cuero, Sistema de sonido premium.

