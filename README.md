# ED_Practica-Final-1a-parte

### Análisis y descripción de la aplicación. Este análisis y descripción dará respuesta a las siguientes preguntas:

o   Cómo se han organizado y estructurado las clases y cuál es la responsabilidad de cada una.
A continuacion explico las clases principaes y sus resposabilidades:
Main: Esta es la clase principal, responsable de la interfaz de usuario y de manejar las interacciones del usuario, como crear y visualizar poblaciones de bacterias, borrar poblaciones, ver información detallada de una población y guardar el estado del experimento.  
Gestor: es responsable de gestionar el estado del experimento actual. Mantiene una lista de las poblaciones de bacterias en el experimento y proporciona métodos para manipular estas poblaciones (como agregar y eliminar poblaciones). Aqui he tenido problemas que detallo mas tarde 
Experimento: Esta clase representa un experimento individual. Tambien mantiene una lista de las poblaciones de bacterias en el experimento y proporciona métodos para manipular estas poblaciones.  
PoblacionDeBacterias: Esta clase representa una población de bacterias en un experimento. Aqui se muestra como es el archivo que usamos aunque finalmente no se muestra sino que el proprio programa lo guarda
MainTest: Esta es una clase de prueba que parece estar diseñada para probar la clase Main. Aunque el método de prueba mostrado (testCalculate) no tiene nad que ver con el programa de bacterias, pero muestra como funciona correctamente esta clase

o   Qué decisiones de diseño se han tomado.
Al principio queria crear una interfaz de usuario como pide el programa para el usuario pudiera hacer uso de ella y fuese mas claro, despues opte porque el usuario relizase todo desdela consola aunque finlamente implemente la intefaz de usuario lo que me genero problems con los botones y sus funciones

o   Qué comprobaciones de integridad (y excepciones) se han implementado.
Aunque al principio no añadi ningun manejo de expeciones finalmente opte por añadirlo a la clase principal main, añadir un manejo de expeciones basico

o   Qué técnicas de ordenación y búsqueda ha utilizado y por qué lo ha hecho.
Al integrar los botones de la interfaz de usuario consrgui añadir que el programa guardase los experimentos añadidos, como se muestra en el programa y se puede valorar, el programa busca entre todos los experimentos añadidos y muestra todos los datos de cada experimento

o   Diagramas de clases UML.
Clase Experimento:  
Campos: nombre (String), poblaciones (List<poblaciondebacterias>)</poblaciondebacterias>
Métodos: agregarPoblacion(PoblacionDeBacterias), eliminarPoblacion(PoblacionDeBacterias), getPoblaciones(), guardar(String), cargar(String), getNombre()
Clase PoblacionDeBacterias:  
Campos y métodos:  campos para representar las características de la población de bacterias y métodos para manipular y acceder a estos campos.
Clase GestorDeExperimentos:  
Campos: experimentoActual (Experimento), gestorDeArchivos (GestorDeArchivos), experimentos (List<experimento>)</experimento>
Métodos: crearNuevoExperimento(String), abrirExperimento(String), guardarExperimento(String), guardarExperimentoComo(String), getExperimentoActual(), getNombresExperimentos()
Clase GestorDeArchivos:  
Campos y métodos: lectura y escritura de archivos, por lo que tendría métodos como abrirArchivo(String) y guardarArchivo(String, Experimento).
Clase Main:  
Métodos: main(String[])
Las relaciones entre las clases serían:  
GestorDeExperimentos tiene una relación de agregación con Experimento, ya que gestiona una lista de experimentos.
Experimento tiene una relación de agregación con PoblacionDeBacterias, ya que gestiona una lista de poblaciones de bacterias.
PoblacionDeBacterias, ya que gestiona una lista de poblaciones de bacterias.
GestorDeExperimentos tiene una relación de asociación con GestorDeArchivos, ya que utiliza un GestorDeArchivos para abrir y guardar experimentos.
Main tiene una relación de dependencia con GestorDeExperimentos, ya que utiliza un GestorDeExperimentos en su método main

•           Listado de fallos conocidos y funcionalidades definidas en el enunciado que no se han implementado en el código entregado.
El principal problema que he tenido ha sifo a la hora de desarrollar la interfaz de usuario, ya que como he dicho anteriormente, mi principal objetivo era que el usuario hiciera uso del programa desde la consola. Más tarde, cuando tenía el programa completo, he decidido implmenetar una interfaz de uaurio gráfica, y aquí llega el problema, ya que me ha sido bastante dificil ser capaz de agregar las funcionalidades a cada botón, y auqneu finalmente lo he logrado, algunos experimentos al crearlos pueden no mostrarse del todo, y aunque todas las funcionalidaes y metodod están implementadod algunos pueden no funcionar de la mejor manera.

•           Listado de pruebas unitarias realizadas.
Prueba unitaria del MainTest dentro del modulo de Test

•           Conclusiones (que incluirán, obligatoriamente, una valoración del tiempo dedicado a la práctica).
Para concluir puede decir que ha sido un trabajo exigente, sobre todo por la interfaz gráfica para el usuario y como se puede hacer uso del programa. Las demás partes ya las había trabajado en otros trabajos, y auque la interfaz también, me ha supuesto un gran esfuerzo acabarla. Empecé a hacer el programa el miercoles, y tanto miercoles por la tarde como todo el jueves estuve tratando de crear el rograma perfecto directamente con la interfaz de usuario. El viernes a medio-día borre el trabajo entero y empecé de nuevo, de ahí que quisiera hacer la interacción usuario-máquina desde la consola, logré alm final de la tarde un proyecto bastante completo, y hoy, sabádo, día de la entrega, hago los últimos retoques y termino la descripción del proyecto y las preguntas.

