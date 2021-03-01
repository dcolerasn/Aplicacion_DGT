# Aplicacion_DGT
Se trata de una aplicación dirigida a hacer una prueba tipo test de conducir. El diseño se ha basado en las interfaces  que ví cuando yo hacía estos test. Una pantalla que permite iniciarlo y otra que muestra el enunciado y las respuestas, además de permitir moverse de una a otra.
Está dividida en tres pantallas:
  1º:Inicio. Interfaz que permite al usuario iniciar una prueba o insertar una pregunta;
  2ºExamen: Permite al usuario seleccionar el archivo de preguntas y muestra a continuación un examen de 10 preguntas de las cuales puede fallar un máximo de 1. Al pulsar el boton finalizar aparece un mensaje informándo al usuario del resultado de la prueba y pregunta si quiere hacer una nueva prueba.
  3ºInsertar: Permite al usuario seleccionar el archivo de preguntas al que se desea intoducir una nueva e insertarla.
El programa lanza una excepción "NullPointerException" en las ventanas de elección de archivo si dicha ventana es cancelada.
