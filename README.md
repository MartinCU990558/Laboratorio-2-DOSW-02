# 🧪 Laboratorio 02 -SOLID, Patrones de Diseño y UML
**Integrantes**
- Carolina Cepeda Valencia
- Marlio Charry Espitia 
- Daniel Palacios Moreno

**Nombre de la rama**
feature/CharryMarlio_CepedaCarolina_PalaciosDaniel_2025-2
---
## ✅ Retos completados

### reto 1: El problema de la tienda de don Pepe
![img.png](docs/imagenes/reto1.png)
Se hace uso de patrones creacionales.
Los productos, camiseta, pantalón, galletas, que heredan de una clase base Product. Nos basamos en el Factory Method, ya que la clase principal no necesita
conocer como se construyen los productos, solo necesita tenerlos. Por ello, hicimos los productos de 
manera que cada producto concreto sabe como inicializarse con su propio nombre y precio.

Por otro lado, también hicimos uso de una clase abstracta Customer y dos implementaciones concretas, estas serían
Frequentcustomer y NewCustomer y que según una condición en la entrada del usuario, decidiéndose
que tipo de objeto concreto instanciar.

### reto 2: El chef de 5 estrellas
![img.png](docs/imagenes/reto2.png)

Se hace uso de patrones estructurales. Por ejemplo, usamos el patrón composite a la hora de tener objetos individuales que
en este caso serían los ingredientes y un compuesto de estos mismos que es la hamburguesa.
A su vez, se podría decir que el ingrediente de la clase extra está usando un patrón de diseño
Adapter porque adapta las entradas dinámicas del usuario a un objeto que encaje en la jerarquía de
Ingredient.