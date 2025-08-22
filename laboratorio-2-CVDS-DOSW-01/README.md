# Laboratorio 02 -SOLID, Patrones de Diseño y UML
**Integrantes**
- Julian Eduardo Arenas Alfonso
- Ramirez Alvarez Tomas Felipe
- Manuel Alejandro Guarnizo 

**Nombre de la rama**
feature/guarnizo_ramirez_arenas_2025-2
---
## Retos completados

# Reto 8
**Descripción**

Aplicando los diseños y conocimientos en diagramas, patrones, se realiza el diseño de una solución.
para graficar el flujo de funcionamineto del zoologíco.

![img.png](img.png)

Creamos 4 clases principales, Zoo, la cual es la clase principal, alución al zoológico. Creamos la 
interface animal, la cual tiene herencias de especies (Mamiferos, Reptiles y Aves), los cuales son 
una herencia de dicha clase abstracta. 
Añadimos la clase cuidadores, la cual se relaciona con los animales en su labor (alimentar, limpiar y bañar).
Por ultimo, se añadio la clase visitante, la cual se relaciona con los animales (alimentandolos),
y los cuidadores (dandoles propinas).
Añadimos metodos relevantes en las interacciones de los animales.

**SOLID**
Para implementar parte de los pilares de solid utilizamos s(responsabilidad unitaria) que cada clase tienen
que hacer solo lo que tiene que hacer,la o(open-clouse) cerrado a modificaciones y abierto a extenciones 
que las clases sean extendibles sin modificar lo que ya esta hecho como que llegue un nuevo animal.
tambien ingresamos el principio l(sustitucion de liskov) que establece que los objetos de una subclase puede ser
sustituidos por los de la clase superior sin ser afectados

**polimorfismo** 
Lo utilizamos de manera que los animales pudieran realizar mismos metodos aplicandolos de diferente 
manera.

**metodos y atributos**
colocamos metodos y atributos alucibos a los comportamientos y actividades que pueden realizar cada uno de los 
objetos ya sea alimentarse o dar propinas.

