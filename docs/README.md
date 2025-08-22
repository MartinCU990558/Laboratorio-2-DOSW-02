# Laboratorio-2-DOSW-02

**Integrantes**
- David Eduardo Salamanca Aguilar
- Sofia Nicolle Ariza Goenaga

**Nombre de la rama:**
'feature/Salamanca_Ariza_2025-2'

---

## Retos Completados

### Parte 1
#### Preguntas Iniciales
**1. ¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?**
- La principal ventaja que ofrece el polimorfismo es la simplicidad del codigo pues permite que cada clase implemente su propio comportamiento en metodos declarados inicialmente en interfaces o clases base.

**2. ¿Por qué una clase inmutable puede mejorar mejorar la seguridad?**
- Una clase inmutable puede mejorar la seguridad ya que garantiza que las instancias de esta no permiten modificaciones una vez creadas y por lo tanto, el estado del objeto no cambia.

**3. ¿Qué problema podría aparacer en un sistema si los atributos de las clases se mantienen públicos en lugar de privado con getters y setters controlados**
- De los problemas generados por esta práctica tenemos la falta de encapsulamiento en el código, donde se puede acceder a los atributos desde cualquier parte sin control alguno. Respecto a la seguridad, vuelve vulnerable las instancias de la clase correspondiente pues se puede modificar su estado en cualquier momento. 

**4. ¿Según el principio de Abierto/Cerrado, como deberiamos modificar el sistema si queremeos añadir una nueva funcionalidad sin alterar el código existente?**
- Según este principio, si queremos añadir nuevas funcionalidades la recomendación es hacerlo a traves de Interfaces o con Herencia. Si preferimos herencia, debemos sobre-escribir los métodos de interes o crear sub clases. Hay un tercer método que es la Composición, la cual consiste en manejar instancias de la clase de interes como atributo en otra clase que implementa nuevos métodos.

**5. ¿Por qué es importante que una clase cumpla con el Principio de Única Responsabilidad y que ejemplo sencillo podrlías dar donde se vulnere?**
- Es importante que una clase cumpla con este principio ya que facilita el desarrollo de un proyecto en todos los aspectos, hace que la clase sea entendible, reutilizable en varios contextos, mantenible y facil de testear.
```java
public class saludarInvitados {
    public void saludar() {
        System.out.println("Hola Invitados");
    }
    public void despedir() {
        System.out.println("Hasta Luego Invitados");
    }
}
```
**6. ¿Qué es y por qué usamos el pom.xml?**
- Este archivo es utilizado por la herramienta Maven y sus siglas significan Project Object Model, en el esta toda la información del proyecto, incluido nombre, versión, empaquetado, dependencias, etc. Se utiliza ya que centraliza la información y automatiza la gestión del proyecto.

**7. ¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**
- **mvn compile**: Compila el codigo de los archivos .java y genera los archivos .class. Usar cuando queremos verificar que el codigo compila correctamente.
- **mvn package**: Después de compilar, empaqueta el proyecto en el formato definido. Usar cuando ya queremos tener un ejecutable del proyecto.
- **mvn install**: Compila, empaqueta y además instala el artefacto (.jar o .war) en el repositorio local de maven. Usar si queremos utilizar nuestro proyecto como dependencia de otro proyecto en nuestro PC.

**8. ¿Qué diferencia existe entre una interfaz y una clase abstracta?**
- Utilizamos interfaces cuando queremos definir un contrato que muchas clases diferentes puedan implementar.
- Utilizamos clases abstractas cuando queremos compartir código común entre clases relacionadas y obligarlas a implementar ciertos métodos.
- Adicional, se diferencian en la definición de jerarquias (interfaz ingnora - clase abstracta respeta), implementación de constructores (interfaz no - clase abstracta si), atributos de instancia (interfaz no - clase abstracta si) y herencia (una clase puede implementar varias interfaces pero una sola clase abstracta).