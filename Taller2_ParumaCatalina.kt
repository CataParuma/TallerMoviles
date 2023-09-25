fun agregarNumero(lista: MutableList<Int>) {
    println("Ingresa un numero:")
    val numero = readLine()?.toIntOrNull()
    if (numero != null) {
        lista.add(numero)
        println("Numero agregado")
    } else {
        println("No es valido")
    }
}

fun calcularSuma(lista: List<Int>) {
    val suma = lista.sum()
    println("La suma es: $suma")
}

fun calcularPromedio(lista: List<Int>) {
    val promedio = lista.average()
    println("El promedio es: $promedio")
}

fun calcularPares(lista: List<Int>) {
    val numerosPares = lista.filter { it % 2 == 0 }
    if (numerosPares.isNotEmpty()) {
        println("Los números pares son: $numerosPares")
    } else {
        println("No hay pares")
    }
}

fun elevarCuadrados(lista: MutableList<Int>) {
    if (lista.isNotEmpty()) {
        for (i in 0 until lista.size) {
            lista[i] = lista[i] * lista[i]
        }
        println("Los numeros quedaron asi: $lista")
    } else {
        println("No hay numeros")
    }
}

fun main() {
    val listaNumeros = mutableListOf<Int>()

    while (true) {
        println("Digite la opción que deseas realizar:")
        println(
            "1.Agregar números a la lista.\n" +
                    "2.Calcular la suma de los números en la lista.\n" +
                    "3.Calcular el promedio de los números en la lista.\n" +
                    "4.Encontrar los números pares en la lista.\n" +
                    "5.Elevar al cuadrado todos los números en la lista.\n" +
                    "6.Salir del programa."
        )
        val opcion = readLine()

        when (opcion) {
            "1" -> agregarNumero(listaNumeros)
            "2" -> calcularSuma(listaNumeros)
            "3" -> calcularPromedio(listaNumeros)
            "4" -> calcularPares(listaNumeros)
            "5" -> elevarCuadrados(listaNumeros)
            "6" -> {
                println("¡Vuelva pronto!")
                return
            }
            else -> {
                println("No es valido")
            }
        }
    }
}

