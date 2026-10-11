
    val precios = listOf(80000, 55000, 120000) //"Consulta", "Baño", "desparasitacion"
    val recargo = { precio: Int -> (precio * 1.1).toInt() }
    precios.forEach { println("El precio original de el servicio de es: $it , y el precio con recargo es ${recargo(it)}") }
