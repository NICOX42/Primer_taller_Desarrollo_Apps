val mascotas = listOf("pedro","simon", "jose", "manuel" )
var tiempoPara = 10 downTo 0


for((turno, paciente) in mascotas.withIndex()){

    println("el paciente $paciente tiene el turno $turno")
}

for(minutos in tiempoPara) {
    println("El tiempo para la apertura es de $minutos minutos")
}