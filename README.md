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

o   Qué comprobaciones de integridad (y excepciones) se han implementado.

o   Qué técnicas de ordenación y búsqueda ha utilizado y por qué lo ha hecho.

o   Diagramas de clases UML.

•           Listado de fallos conocidos y funcionalidades definidas en el enunciado que no se han implementado en el código entregado.

•           Listado de todo el código fuente de la aplicación organizado por paquetes (si aplica) y clases.

•           Listado de pruebas unitarias realizadas.

•           Conclusiones (que incluirán, obligatoriamente, una valoración del tiempo dedicado a la práctica).

 Además de la defensa, la práctica se evaluará en relación a:

•           Organización y estructura del código (utilización de conceptos y patrones de programación, orientada a objetos: herencia, polimorfismo, encapsulación, reutilización, utilización correcta de estructuras de control, etc.).

•           Uso de Javadoc para documentar las clases y métodos.

•           Funcionamiento ajustado a los requisitos establecidos (incluyendo, además de chequeos de datos, integridad de la información, gestión de excepciones...).

•           Claridad del código y adecuación a las normas de estilo (correcto nombrado de clases, métodos y variables, comentarios internos, indentación del código...).
