# Reto 1 - Tienda Don Pepe

---

## Patrón de diseño Utilizado
Strategy Pattern de los patrones de comportamiento.

---

## Justificación
Elegimos el Strategy Pattern para manejar de forma
flexible y extensible los diferentes tipos de
descuentos según el tipo de cliente (nuevo o frecuente).
Esto permite añadir nuevos tipos de descuentos
en un futuro sin modificar el código existente, 
alineándose con el principio Open-Closed.
Además, separa la lógica de cálculo del descuento 
del resto del sistema, mejorando la mantenibilidad y reusabilidad.

## Cómo Lo aplicamos
Implementamos una interfaz `DescuentoStrategy` con métodos como `getPorcentaje()` para definir el comportamiento de descuento. Clases concretas como `DescuentoNuevo` (5%) y `DescuentoFrecuente` (10%) implementan esta interfaz. La clase `Cliente` inyecta dinámicamente la estrategia adecuada según el tipo de cliente, y `Recibo` utiliza el porcentaje devuelto por la estrategia para calcular el descuento aplicado, promoviendo polimorfismo y encapsulamiento.