# La Cafetería Creativa - Solución

---

## Patrón Utilizado
Decorator de Estructurales

---

## Justificación
El patrón Decorator es ideal para este escenario porque permite agregar funcionalidades (en este caso toppings) a un objeto base (el café) de manera dinámica y flexible, sin necesidad de modificar la clase base del café. Esto cumple con el requisito del administrador de agregar nuevos toppings sin alterar el código existente. Además, evita la utilización de muchas subclases que ocurriría si se usaran herencia directa para cada combinación posible de toppings.

## Cómo lo aplicamos
- Definimos una interfaz `Beverage` que representa cualquier bebida, con métodos para obtener la descripción y el costo.
- Creamos una clase concreta `Coffee` que implementa `Beverage` como el café base.
- Creamos una clase abstracta `ToppingDecorator` que también implementa `Beverage` y mantiene una referencia a un `Beverage` envuelto.
- Para cada topping específico, extendimos `ToppingDecorator` y hacemos override a los métodos para agregar la descripción y el costo adicional al beverage envuelto.
- En la clase principal `Reto5`, permitimos al usuario agregar toppings envolviendo el café base sucesivamente con decoradores.
- Para manejar múltiples cafés y calcular el total general, usamos una lista de `Beverage` y streams de Java para sumar los costos de manera eficiente y concisa.