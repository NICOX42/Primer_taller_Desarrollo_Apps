val edad : Int = 4
var esUrgencia : Boolean = false
val categoria = when{

     edad in 0 .. 1 -> "Cachorro"
     edad in 2 .. 7 -> "Adulto"
     edad >= 8 -> "Senior"
     else -> "Edad no valida"

}

println("El paciente es $categoria")

if( categoria == "Senior" || esUrgencia == true){

     println("Requiere Prioridad Alta")
} else{
     println("Requiere Atención Regular")
}