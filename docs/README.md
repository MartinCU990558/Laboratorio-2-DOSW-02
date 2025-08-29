# Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes:**
- lizabeth Correa
- Juan Sebastian Ortega
- Daniel Rodriguez

**Nombre de la rama:**
"feature/CorreaElizabeth_OrtegaSebastian_RodriguezDaniel_2025-2"

---

## Retos Completados

## RETO #2: El chef de 5 estrellas
### Evidencias
![img.png](img.png)

Para este ejercicio se aplicó el patrón Builder, dado que necesitabamos uno que nos permitiera construir objetos mediante un paso a paso. Se escogió este modelo porque una 
hamburguesa puede tener diferentes combinaciones de ingredientes (pan, carne, queso, vegetales, salsas) y no todos son obligatorios, es decir no manejamos unos parametros especificos.
La clase HamburgerBuilder agrega ingredientes de forma encadenada y luego genera el objeto final con build(), mientras que Hamburger 
representa el producto completo y calcula el precio con streams. Así, el patrón se ve reflejado en la flexibilidad para 
personalizar la hamburguesa y en la claridad del proceso de construcción.

### RETO #6: Habla con Soporte Técnico
### Evidencias
![img_1.png](img_1.png)}

En este ejercicio utilizamos el patrón Chain of Responsibility, que se ve reflejado en la clase abstracta Technician, donde cada técnico decide si puede resolver un
ticket; si no, lo pasa al siguiente con next.resolve(), con esto se permite que los tickets se procesen en cadena sin depender de un técnico específico.Se escogió 
este patrón dado que el problema maneja distintos niveles y prioridades, por lo que debería ser flexible el escoger quién resuelve cada caso, dejando los que no puedan ser atendidos como pendientes para escalar.

## Preguntas Iniciales

**1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?**

Permite que cada clase implemente su propio comportamiento sobrescribiendo métodos, eliminando if/else o switch. Esto hace el código más legible, extensible y fácil de mantener.

**2. ¿Por qué una clase inmutable puede mejorar la seguridad?**

Un objeto inmutable no cambia después de creado. Así se evita que otras partes del sistema o hilos modifiquen su estado de forma inesperada, reduciendo errores de concurrencia y manipulaciones inseguras.

**3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?**

Cualquier código puede modificar esos atributos sin control. Esto rompe encapsulación, genera estados inválidos y dificulta depuración. Con getters/setters podemos validar, proteger o notificar cambios.

**4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?**

El sistema debe estar abierto a extensión pero cerrado a modificación. Para añadir funcionalidades se crean nuevas clases o implementaciones que extienden/implementan interfaces existentes, sin alterar código ya probado. Ejemplo: añadir una nueva forma de pago creando una nueva clase PaypalPayment que implemente Payment, en lugar de modificar un switch.

**5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?**

Una clase debe tener un único motivo de cambio.
Ejemplo: una clase Report que genera datos y los imprime en PDF. Si cambia el formato o la lógica de negocio, la misma clase se rompe por dos motivos distintos. Lo correcto sería separar en ReportGenerator y ReportPrinter.

**6. ¿Qué es y porque usamos el pom.xml?**

Archivo de configuración de Maven. Define dependencias, plugins, versión de Java, empaquetado, etc. Permite reproducibilidad del proyecto y automatiza la construcción.

**7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**
**-mvn compile:** compila código fuente a .class.
**-mvn package:** compila + empaqueta en un .jar o .war.
**-mvn install:** compila + empaqueta + instala el artefacto en el repositorio local     (~/.m2/repository) para que otros proyectos lo usen.

**8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?**
**Interfaz:** solo define contratos. Desde Java 8 puede tener métodos default y static. No tiene estado (atributos salvo constantes).

**Clase abstracta:** puede definir métodos abstractos y concretos, además de atributos. Permite compartir implementación parcial.

**Diferencia clave:** una clase puede implementar múltiples interfaces pero solo extender una clase abstracta.
