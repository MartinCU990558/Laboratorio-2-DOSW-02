## Cuestionario
1. **¿Qué ventaja ofrece el polimorfismo en el diseño de clases frente al uso de múltiples condicionales para determinar el comportamiento de un objeto?**

   El polimorfismo permite que exista en unb diseño con muchos comportamientos o caracteristicas que nacen de un mismo tipo de objeto permite diseñar un esqueleto para que se desarrollen metodo con soluciones diferentes pero con un mismo nombre o atributos compartidos, lo que permite evitar al momento de creacion del codigo una cantidad creciente de condicionales simplemente teniendo una clase de la cual otras nacen, lo que permite obedecer el principio de abierto a extension cerrado a modificacion.


2. **¿Por qué una clase inmutable puede mejorar la seguridad?**

   Puede mejorar la cuenta debido a que esta no puede cambiar su estado interno lo que permite predictibilidad con respecto a su estado y, por otra parte, permite seguridad en multi hilo


3. **¿Qué problema podría aparecer en un sistema si los atributos de las clases se mantienen públicos en lugar de privados con getters y setters controlados?**

    El principal problema es la pérdida de control sobre el estado del objeto. Cualquier parte del código puede modificar el atributo público directamente, sin ninguna validación, lo que puede llevar a que el objeto quede en un estado inconsistente o inválido (por ejemplo, asignando una edad negativa). Además, se genera un alto acoplamiento, porque si la implementación del atributo cambia (su tipo o cómo se calcula), se debe modificar todo el código que lo usa, en lugar de solo modificar un getter o setter. Esto hace el sistema mucho más frágil y difícil de mantener.


4. **¿Según el principio de Abierto/Cerrado, como deberíamos modificar el sistema si queremos añadir una nueva funcionalidad sin alterar el código existente?**

    Para poder añadir una nueva funcionalidad siguiendo el principio sería añadiendo clases que implementen una interfaz o extiendan una clase abstracta que realicen esta nueva funcionalidad, pero por encima de eso estaria el polimorfismo ya que se puede agregar una nueva funcionalidad sin afectar el estado del sistema actual.


5. **¿Por qué es importante que una clase cumpla con el Principio de única responsabilidad y que ejemplo sencillo podrías dar donde se vulnere?**

    Es importante que cumpla con el principio para poder llevar registro de lo que hace cada metodo y clase y de esta manera si llega a surgir un error poder ubicarlo de manera mas sencilla y de esta manera solucionarlo con mas eficiencia y por otra parte genera menor acoplamiento 

    **Ejemplo**

        class Empleado {
            private String nombre;
            private String puesto;
    
            public String getNombre() {     
                return nombre; 
            }
            public void setNombre(String nombre) { 
            this.nombre = nombre;   
            }
    
            public double calcularPago() {
            return 1200.00;
            }
    
            public void guardarEnBaseDeDatos() {
                System.out.println("Guardando " + nombre + " en la base de datos...");
            }
        }
    este ejemplo permite ver un ejemplo de mala implementacion debido a que la persistencia de datos no debería ser responsabilidad de la clase Empleado.


6. **¿Qué es y porque usamos el pom.xml?**

    El pom.xml es un archivo que funciona como los planos del proyecto este contiene toda la información necesaria para que maven sea capaz de saber que construir, como construirlo y de que librerias externas necesitaría y se usa principalmente para gestionar dependencias  para simplemente  declarar la dependencia en el pom.xml con su groupId, artifactId y version.


7. **¿Qué diferencia hay entre mvn compile, mvn package y mvn install?**

    el mvn compile únicamente compila, mientras que el mvn package adicionalmente puede ejecutar tests y crear el JAR, y por último el mvn install permite todo lo anterior pero adicionalmente lo instala localmente  por lo que resumidamente se usarian de la siguiente manera>
    
    - Escribes código -> mvn compile (para ver que no hay errores de compilación).
    - Terminas una funcionalidad -> mvn package (para generar el JAR y asegurarte de que todos los tests pasan).
    - Quieres usar tu librería en otro proyecto -> mvn install (para que el otro proyecto pueda referenciarla como dependencia).

    
8. **¿Qué diferencia existe entre una interfaz y una clase abstracta?**

   La diferencia principal entre la interfaz y una clase abstracta es que la interfaz es para comportamientos exclusivamente generando el contrato con sus subclases de tener que implementar metodos, mientras que la clase abstracta permite tener atributos a diferencia de la interfaz y está con los metodos solo genera un contrato con las firmas de los metodos.

