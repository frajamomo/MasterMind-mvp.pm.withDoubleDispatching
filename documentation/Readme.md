
= Entrega Mastermind con Doble Despacho
Francisco Javier Moreno Moreno <franciscojavier.moreno@alumnos.upm.es>
v1.0, 15 de Noviembre, 2020
:imagesdir: ./images

Documentación del código entregado para la prática de evaluación obligatoria de la
asignatura Fundamentos del Software del curso de **Experto en Arquitectura y Desarrollo Software** (EADS)
(Oct-2020/Mar-2021).

Este documento incluye los diagramas de paquetes y relaciones entre clases que describen
la arquitectura del código que aconpaña a este documento. En este diseño y su correspondiente
implementación sólo se entrega con soporte para interfaz de consola, de acuerdo con los requisitos.
El diseño se puede ampliar para otros interfaces, implementados como un nuevo paquete
"mastermind.views.__nombreDelNuevoInterface__" y reutilizando el resto de elementos de la
arquitectura (modelos y controladores).

Se trata de que el impacto en el código existente sea el mínimo posible a la hora de ampliar funcionalidad.

Además se utilizan las siguientes técnicas o estrategias para conseguir un código mas robusto:

* **Arquitectura Modelo/Controlador/Vista**, separando las respondabilidades de cada parte de la arquitetura.
* **Distribución en paquetes**. El código común que puede reutilizarse en otros proyectos se ha sacado a un
paquete llamado "Utils".
* **Patrón Singleton**: El acceso a la consola se realiza mediante el método instance() de la clase Console,
que controla el acceso al recurso.
* **Patrón Facade**: La clase Logic disminye la complejidad del sistema mediante una interfaz mas sencilla para
acceder a los controladores desde otras partes del código.
* **Patrón Visitor**: La clase UseCaseController proporciona el método accept a sus clases derivadas (StartController,
PlayController y ResumeController), y el interface ControllerVisitor que implementa la clase Vista proporciona el
método visit para poner en marcha el código del controlador adecuado en cada fase del juego.


== Vista de Lógica/Diseño

Modelo/Vista/Presentador con Presentador del Modelo con Vista Achicada

image::architecture.svg[]

== Paquete Mastermind

image::mastermind.svg[]

== Paquete mastermind.views.console

image::mastermind.views.svg[]

== Paquete mastermind.models

image::mastermind.models.svg[]

== Paquete mastermind.controllers

image::mastermind.controllers.svg[]

== Paquete mastermind.utils

image::mastermind.utils.svg[]

'''
Francisco Javier Moreno Moreno <francisco.javier.moreno@ericsson.com>
