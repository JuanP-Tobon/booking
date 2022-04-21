# INTRODUCCIÓN
El objetivo general es implementar la automatizacion hacia la pagina web www.booking.com, específicamente a cada uno 
de los modulos que lo componen . A manera de obtener un sistema que pueda ser ejecutado por cada uno de sus interesados. 

#HERRAMIENTAS UTILIZADAS
Se emplea el IDE de IntelliJ. Se usa el driver de google en su ultima version 100.0.4896.60 para ejecucion de la automatizacion. SerenityBDD, Screenplay, lenguaje Gherkin, Cucumber.
 
#ESTRATEGIA DE AUTOMATIZACIÓN.
El proyecto hace uso del patrón Screenplay, con Cucumber y Gradle. Screenplay se orienta en el usuario y específicamente en las tareas, además utiliza los principios 
S.O.L.I.D. Con este patrón as pruebas se pueden escribir en un lenguaje más natural y entendible. El proyecto se estructura de la siguiente manera:
Task: Son las tareas que realiza el actor a nivel de negocio.
User-Interface: Donde se realiza el mapeo de los target con los que el usuario interactúa. 
Question: Donde se realizan los Assert y las verificaciones del proceso. 
Util: Son las utilidades necesarias dentro del proyecto. 
Model: Clases donde se encuentran los objetos complejos de negocio.
Feature: Donde se narran los casos de prueba utilizando el lenguaje Gherkin. 

#DESCRIPCIÓN GENERAL AUTOMATIZACIONES
1. Componente reserva de estadia: Está diseñado para definir procesos y agregarle características que permitirán detectar y/o alertar incongruencias en las 
lecturas resultantes de los procesos. Alli se realiza el proceso de filtrado para las caracteristicas que se desean específicamente para el hospedaje, para asi realizar la busqueda de la estadia y validar que sus datos si correspondan a los de la consulta.
2. Componente Compra de Vuelos: programa diseñado para realizar la compra de vuelos dependiendo del destino y las comodidades que desee el cliente, en este se puede filtrar tanto por el mejorvuelo, como por los vuelos mas baratos, estas seran unas de las validaciones que realizara la automatización para asi validar el correcto funcionamiento de cada uno de estos filtrosque proporciona el componente.
3. Componente de compra de tiquetes para atracciones turisticas: Esta automatizacion fue diseñanada para validar el flujo principal de un cliente al querer realizar la compra de tiquetes para el ingreso a atracciones turisticas, en esta se intentara realizar la compra de tiquetes pero sin una cuenta de usuario registrada, a la hora de llenar el formulario de los datos del cliente se dejara el campo "nombre" en blanco y se verificara que dicho componente, no deje seguir el proceso de compra de los tiquetes y se verificara que aparezca un mensaje indicando cual es el problema.
	
#TENER EN CUENTA ANTES DE EJECUTAR LA AUTOMATIZACIÓN
1. Tener el driver de la ultima version de google chrome dentro del proyecto.
2. El ultimo escenario de la automatización de estadia o alojamiento (stay_module) puede llegar a fallar, debido a que se encontro un hallazgo en dicho programa ya que en el momento de filtrar por los precios mas bajos, antes de realizar el filtrado se guarda en una variable del actor el numero de opciones que aparecen antes de seleccionar el filtro, luego se selecciona el filtro y se verifica que el numero de opciones luego de seleccionarlo sea igual al que aparecia al lado del filtro antes de ser seleccionado. En algunos casos aparece una opcion adicional o una opcion menos, por ende la automatizacion falla en ese caso porque no es igual y deberia serlo.



