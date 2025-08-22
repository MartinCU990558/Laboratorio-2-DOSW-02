## Preguntas iniciales 

### 1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?

El **polimorfismo** permite que distintas clases implementen un mismo método de manera diferente, eliminando la necesidad de usar muchos `if` o `switch`.  

**Ventaja:** el código es más limpio, extensible y mantenible, porque basta con invocar el método sin preocuparse de qué clase concreta lo implementa.

---

### 2. ¿Por qué una clase inmutable puede mejorar la seguridad?

- Una clase inmutable no permite que sus atributos cambien una vez inicializados.  
- **Ventaja en seguridad:** evita modificaciones inesperadas o maliciosas de datos compartidos, y asegura consistencia en entornos concurrentes.

---

### 3. ¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?

Si los atributos son públicos:

- Se rompe el **encapsulamiento**.  
- Cualquier parte del código puede modificar valores sin validación.  
- Puede provocar **estados inconsistentes** en el objeto.  

**Ejemplo:** un atributo `saldo` de una cuenta bancaria podría volverse negativo si no se controla desde un método.

---

### 4. ¿Según el principio de Abierto/Cerrado, cómo deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?

El **principio Abierto/Cerrado (OCP)** dice:  

- Las clases deben estar **abiertas a extensión** pero **cerradas a modificación**.  
- Para añadir una funcionalidad, creamos **nuevas clases o implementaciones** (por ejemplo, nuevas subclases o estrategias) en lugar de modificar las existentes.

---

### 5. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad y qué ejemplo sencillo podrías dar donde se vulnere?

Porque cada clase debe encargarse de **una sola cosa**. Esto facilita pruebas, mantenimiento y evita que cambios en una responsabilidad afecten otra.

**Ejemplo de violación:**  
Una clase `Usuario` que además de guardar datos del usuario también gestione la conexión a la base de datos y envíe correos electrónicos. Esto mezcla responsabilidades.

---

### 6. ¿Qué es y por qué usamos el `pom.xml`?

El `pom.xml` (**Project Object Model**) es el archivo central de un proyecto **Maven**.  

**Usos:**
- Define dependencias externas (librerías).  
- Configura plugins de compilación y empaquetado.  
- Gestiona versiones del proyecto.  
- Permite reproducir el proyecto fácilmente en cualquier máquina.  

---

### 7. ¿Qué diferencia hay entre `mvn compile`, `mvn package` y `mvn install`?

- `mvn compile` → **Compila** el código fuente (no genera JAR/WAR).  
- `mvn package` → Compila + ejecuta tests + empaqueta en un **JAR/WAR**.  
- `mvn install` → Hace lo anterior + instala el paquete en el **repositorio local de Maven** (`.m2`), para que otros proyectos en la misma máquina lo puedan usar como dependencia.  

---

### 8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?

**Interfaz:**
- Define solo **métodos abstractos** (desde Java 8 puede tener métodos `default` y `static`).  
- No puede tener estado (salvo constantes).  
- Una clase puede implementar **múltiples interfaces**.  

**Clase abstracta:**
- Puede tener métodos abstractos **y concretos**.  
- Puede tener atributos y estado.  
- Una clase solo puede heredar **una abstracta** (herencia simple).  
