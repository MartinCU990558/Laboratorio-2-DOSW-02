# Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes**
-Maria Belen Quintero Aldana
-Nikolas Martinez Rivera
-Juan Pablo Contreras

**Nombre de la rama**
'feature/Quintero_Martinez_Contreras_2025-2'


___

## Retos Completados :D

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

# Reto 2  - Hamburguesas Don pepe

## Patrón de diseño Utilizado
Builder de los patrones creacionales

## Justificacion
Para la realizacion de el reto 2, pensamos en el uso de `Builder` pues parecia 
el patron mas adecuado para la realizacion de este reto, sin embargo durante el desarrollo del codigo e implementacion
de la clase constructora que iba a ser `Chef` y la clase directora `Cajero`, nos percatamos de la no necesidad de esta estructura
para poder entregar el output requerido por el reto, pues el objeto de `Hamburguesa` no requeria de mayor tratamiento,
asi preferimos dejar solamente el recibo con el cual construimos los datos requeridos para el output e ignoramos la necesidad
de una clase `Hamburguesa` como tal, igualmente se tomo la idea de clase directora y clase constructora concreta.Como `Cajero` siendo
la clase directora asi como plantea el diseno mas acercado al patron, y `Recibo` como la constructora, el resultado final igualmente sigue
los principios `SOLID`.

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

# Reto 4 - Casa de Cambio de don Pepe

## Patrón de diseño Utilizado
Strategy Pattern de los patrones de comportamiento.

## Justificacion

Para la realización del reto 4 pensamos en basarnos un poco en `Strategy`, ya que la conversión de monedas no debía quedar dentro 
de la clase `Transaccion`. En vez de eso, dejamos que esa lógica se manejara desde la clase `Conversor`, que es la que se encarga de 
hacer el cambio. Aunque no llegamos a implementar varias estrategias diferentes de conversión, la idea sí se acerca al patrón porque 
separamos las responsabilidades: `Transaccion` solo guarda y organiza la información, mientras que `Conversor` se encarga del cálculo. Al final
no quedó un `Strategy puro`, pero sí usamos el mismo principio de dividir funciones para que el diseño fuera más limpio y fácil de extender
más adelante.

# Reto 5 - El Café Personalizado

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



# Reto 6 - Habla con Soporte Técnico

## Patrón de Diseño
**Comportamiento**

## Patrón Utilizado
**Chain of Responsability**

## Justificación
Elegimos el patrón Chain of Responsability para este reto de soporte técnico porque encaja perfecto con lo que necesitamos. Básicamente, los tickets pueden ir pasando solos entre los diferentes niveles de técnicos que existen sin tener que decirle al sistema quién es el que lo tiene que resolver. Además, como los técnicos tienen distintos niveles (básico, intermedio, avanzado), este patrón muestra muy bien esa jerarquía. También, en caso de que quisieramos, podríamos agregar más técnicos sin necesidad de dañar lo que ya funciona.

## Como Lo aplico

(Usando la página https://refactoring.guru/es para poder guiarnos)
1. **Abstract Handler**: Corresponde a `Tecnico` y es la clase que define la estructura base. Contiene la referencia al siguiente técnico (relevo) y el método abstracto `puedeResolver()`.
2. **Concrete Handler**: Los 3 tipos de técnicos:
    - TecnicoBasico: Solo maneja tickets básicos con prioridad baja.
    - TecnicoIntermedio: Maneja tickets básicos e intermedios con prioridad hasta media.
    - TecnicoAvanzado: Maneja cualquier tipo de ticket con cualquier prioridad.
3. **Request**: Corresponde a `Ticket`, y contiene la información del problema (descripción, nivel, prioridad) y su estado.
4. **Client**: Corresponde a `SistemaSoporteTecnico`, y se encarga de configura la cadena Básico → Intermedio → Avanzado y de procesar los tickets.

Algo de lo que nos percatamos, es que entre la salida del ticket 2 y el 4, hay una contradicción, puesto que el técnico avanzado debería ser capaz de resolver el ticket 4.


# Reto 7 - El control remoto mágico

## Patrón de Diseño
**Comportamiento**

## Patrón Utilizado
**Command**

## Justificación
Elegimos el patrón Command para el reto 7 porque nos daba varias ventajas: 
1. Command ofrece la posibilidad de separar el que hace la acción del que la ejecuta.
2. El hecho de que mencionara que era necesario poder deshacer acciones, nos dio el indicio de que este era el patrón adecuado, ya que es perfecto para manejar esa función.
3. Es fácil llevar un historial de todo lo que se ha hecho (ayuda a lo que se dijo en el segundo punto), por lo que facilitaba la impresión del historial de cambios.
4. Brinda la facilidad de agregar más comandos sin necesidad de hacer grandes cambios, ya que, gracias a Command no hay acoplamiento.

## Como Lo aplico

(Usando la página https://refactoring.guru/es para poder guiarnos)
1. **Command**: Interfaz que define `ejecutar()` y `paAtras()`.
2. **Concrete Commands**: Las clases que implementan los comandos (AbrirPuertaCommand, AjustarVolumenCommand, EncenderLuzCommand, ReproducirMusicaCommand).
3. **Receiver**: Los dispositivos que reciben las acciones. En este caso las clases Luz, Puerta, Musica y Volumen.
4. **Invoker**: Sería la clase ControlRemoto.


# Reto 8 - El Zoológico de los UML

# 🧩 Patrón de Diseño

- **Creacionales** → Para la creación flexible de objetos.  
- **Comportamiento** → Para gestionar las interacciones y responsabilidades entre objetos.  

---

## 📌 Patrones Utilizados

1. **Strategy** (Comportamiento)  
   Aplicado en el sistema de especialización de cuidadores, donde diferentes tipos de cuidadores manejan diferentes especies de animales.  

2. **Template Method** (Comportamiento)  
   Implementado en la clase base `Animal`, que define métodos comunes que las subclases especializan.  

3. **Factory** (Creacional)  
   Utilizado para la creación de diferentes tipos de animales (`Mamífero`, `Reptil`, `Ave`).  

---

## ⚖️ Justificación principios SOLID

### 🔹 S - Single Responsibility Principle
- **Animal** → Gestiona datos y comportamientos básicos del animal.  
- **Cuidador** → Maneja las responsabilidades de cuidado y gestión de animales.  
- **Visitante** → Se enfoca en actividades de visita e interacción con el zoológico.  

### 🔹 O - Open/Closed Principle (OCP)
- **Herencia de Animal** → Clase base cerrada para modificación pero abierta para extensión.  
- Nuevos tipos de animales (`Mamífero`, `Reptil`, `Ave`) se agregan sin modificar la clase `Animal`.  
- Nuevas especialidades de cuidadores se implementan sin cambiar la lógica base.  

### 🔹 L - Liskov Substitution Principle (LSP)
- Subclases de `Animal` (`Mamífero`, `Reptil`, `Ave`) pueden usarse donde se espere un `Animal`.  
- Uso de **polimorfismo** para mantener el comportamiento esperado de la clase padre.  

### 🔹 I - Interface Segregation Principle (ISP)
- Interfaces específicas → Cada clase implementa solo los métodos que necesita.  
- Métodos especializados → Los cuidadores tienen métodos específicos para su especialidad.  
    (Sin dependencias innecesarias)  

### 🔹 D - Dependency Inversion Principle (DIP)
- El sistema depende de la **abstracción `Animal`**, no de implementaciones concretas.  
- **Inversión de control** → Los cuidadores trabajan con `Animals` en general, no con tipos específicos.  
- Mayor flexibilidad → Se pueden agregar nuevos tipos sin romper el código existente.  


# Preguntas y Respuestas sobre Programación y Maven

## 1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?

El polimorfismo permite que diferentes clases implementen el mismo método de distintas maneras, evitando el uso de múltiples condicionales (`if` o `switch`).  
Esto hace que el código sea más limpio, fácil de mantener y extender, además de respetar principios de diseño como **Abierto/Cerrado**.

---

## 2. ¿Por qué una clase inmutable puede mejorar la seguridad?

Una clase inmutable no permite que sus atributos cambien después de su creación.  
Esto aumenta la seguridad porque:
- Evita modificaciones inesperadas de los datos.
- Es naturalmente segura para el trabajo en múltiples hilos (*thread-safe*).
- Garantiza consistencia en los objetos compartidos.

---

## 3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?

- Pérdida de **encapsulación**.
- Los datos pueden ser modificados de forma inconsistente o inválida.
- Se rompe la capacidad de validar, controlar o proteger la lógica de acceso.  
  En resumen: el sistema se vuelve más frágil y menos seguro.

---

## 4. ¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

El principio de **Abierto/Cerrado (OCP)** indica que una clase debe estar **abierta a la extensión, pero cerrada a la modificación**.  
Esto significa que, para añadir nuevas funcionalidades, debemos hacerlo extendiendo clases existentes o implementando nuevas clases/interfaz, **sin modificar el código que ya funciona**.

---

## 5. ¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?

Es importante porque:
- Facilita el mantenimiento.
- Reduce errores.
- Hace que el sistema sea más entendible y escalable.

**Ejemplo de violación:**  
Una clase `Reporte` que:
- Genera el contenido del reporte.
- Lo guarda en la base de datos.
- Lo envía por correo.

→ Aquí se mezclan varias responsabilidades en una sola clase.

---

## 6. ¿Qué es y por qué usamos el `pom.xml`?

El `pom.xml` es el archivo de configuración de un proyecto Maven.  
Sirve para:
- Definir dependencias externas.
- Especificar configuración de compilación y empaquetado.
- Gestionar versiones de librerías.
- Automatizar tareas como compilación, pruebas, empaquetado e instalación.

---

## 7. ¿Qué diferencia hay entre `mvn compile`, `mvn package` y `mvn install`?

- **`mvn compile`**: Compila el código fuente en bytecode (`.class`).
- **`mvn package`**: Compila, ejecuta pruebas y empaqueta en un archivo ejecutable (`.jar` o `.war`).
- **`mvn install`**: Realiza lo anterior y además instala el paquete en el repositorio local de Maven para que pueda ser usado por otros proyectos.

---

## 8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

- **Interfaz**:
    - Define un contrato (qué debe hacer una clase, pero no cómo).
    - Todos sus métodos son públicos y abstractos por defecto (en versiones modernas puede tener métodos `default` y `static`).
    - Una clase puede implementar múltiples interfaces.

- **Clase abstracta**:
    - Puede tener métodos abstractos y métodos implementados.
    - Puede contener atributos y constructores.
    - Una clase solo puede heredar de una clase abstracta.

---










