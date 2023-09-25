class Persona(val nombre: String, val numero: String, val correo: String)

val listaContactos = mutableListOf<Persona>()

fun agregarContacto() {
    println("Ingresa el nombre:")
    val nombre = readLine()

    println("Ingresa el número:")
    val numero = readLine()

    println("Ingresa el correo:")
    val correo = readLine()

    val nuevoContacto = Persona(nombre.orEmpty(), numero.orEmpty(), correo.orEmpty())
    listaContactos.add(nuevoContacto)
}

fun mostrarContacto() {

    var cont = 0
    for (contacto in listaContactos) {
        cont++
        println("Contacto #$cont")
        println("Nombre: ${contacto.nombre}")
        println("Número: ${contacto.numero}")
        println("Correo: ${contacto.correo}")
    }
}

fun buscarContacto() {
    println("Ingresa el contacto que deseas buscar:")
    val buscar = readLine()

    for (contacto in listaContactos) {
        if (contacto.nombre.equals(buscar)) {
            println("Aqui esta el contacto:")
            println("Nombre: ${contacto.nombre}")
            println("Número: ${contacto.numero}")
            println("Correo: ${contacto.correo}")
        }
    }
}

fun eliminarContacto() {
    println("Ingresa el contacto que deseas eliminar:")
    val eliminar = readLine()

    val eliminado = listaContactos.removeIf { it.nombre.equals(eliminar, ignoreCase = true) }

    if (eliminado) {
        println("Contacto eliminado")
    }
}

fun main() {
    println("¡Hola, Bienvenido a tu lista de contactos!")

    while (true) {
        println("Digite la opción que deseas realizar:")
        println(
            "1. Agregar un nuevo contacto.\n" +
                    "2. Mostrar la lista de contactos.\n" +
                    "3. Buscar un contacto por nombre.\n" +
                    "4. Eliminar un contacto por nombre.\n" +
                    "5. Salir del programa."
        )
        val opcion = readLine()

        when (opcion) {
            "1" -> agregarContacto()
            "2" -> mostrarContacto()
            "3" -> buscarContacto()
            "4" -> eliminarContacto()
            "5" -> {
                println("¡Vuelva pronto!")
                return
            }
            else -> {
                println("Opción no válida")
            }
        }
    }
}