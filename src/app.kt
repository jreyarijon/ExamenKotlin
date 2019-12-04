fun main(){
    //Creo varios objetos de tipo coches y tres aparcamientos de tipo aparcamiento. A su vez, declaro el valor de los parámetros.
    var cocheRojo = coches("123k4","11:00","15:00")
    var cocheAzul = coches("432l1","14:00","16:30")
    var cocheNegro = coches("321f5","12:45","13:30")
    var cocheVerde  = coches("987y6","21:00","22:00")
    var cocheAmarillo  = coches("837h5","19:00","22:00")
    var cocheMagenta  = coches("10p79","21:00","22:00")
    var cocheBlanco  = coches("926o9","21:00","00:00")
    var cocheLila  = coches("182f7","11:00","12:00")
    var cocheRosa  = coches("012j8","11:00","23:00")
    var primerAparcamiento = aparcamiento("Juana de Vega",30,17,cocheRojo,cocheAmarillo,cocheLila)
    var segundoAparcamiento = aparcamiento("San Andrés",20,2, cocheAzul,cocheRosa,cocheBlanco)
    var tercerAparcamiento = aparcamiento("Cantones",40,5, cocheNegro,cocheMagenta,cocheVerde)
    //Visualizo los valores
    println("Datos de los aparcamientos y de algunos coche que guarda: ${primerAparcamiento}.${segundoAparcamiento}.${tercerAparcamiento}")
}