# Laboratorio 02 - SOLID, Patrones de Diseño y UML

**Integrantes**
-Maria Belen Quintero Aldana
-Nikolas Martinez Rivera
-Juan Pablo Contreras

**Nombre de la rama**
'feature/Quintero_Martinez_Contreras_2025-2'


___

## Retos Completados :D

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





