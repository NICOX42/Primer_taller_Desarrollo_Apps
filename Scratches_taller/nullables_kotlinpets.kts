var contactoEmergencia : String? = null
println(contactoEmergencia?.length)

var contactoFinal = contactoEmergencia ?: "Sin contacto registrado"

println("El estado de su contacto de emergencia es: $contactoFinal")