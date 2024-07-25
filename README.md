En el siguiente proyecto se colocó como objetivo la creación grafica de un Login mediante la herramienta Android Studio, teniendo como guía el recurso audiovisual "Building a Complete Login Registration Flow in Jetpack Compose | Step-by-Step Tutorial".
Principalmente se modificó la ruta "app/src/main/java/co/edu/sena/myapp2/", allí se crearon 5 carpetas, y cada una contiene una parte específica del proyecto.
- app
  Contiene el archivo encargado de llamar a las diferentes paginas o actividades del proyecto al archivo "MainActivity.kt" para poder ser mostradas
- navigation
  Contiene los archivos que permiten la navegación entre las actividades del proyecto
- screens
  Contiene cada actividad del proyecto junto con sus diferentes componentes
- components
  Contiene cada componente usado en las actividades del proyecto, aquí podemos encontrar la estructura de los diferentes elementos, tales como textos y botones, junto con sus funcionalidades visuales
- ui/theme
  Aquí se definieron contenidos de texto y características de los componentes como su color. Esto permitió que solo se tuviera que declarar dichas características una sola vez, permitiendo el ahorro de código.
