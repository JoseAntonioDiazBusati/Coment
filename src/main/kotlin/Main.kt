//**@author Jose Antonio
//**version 1.01
fun main(){
    val baraja_de_paso = Baraja()
    println("jugador1:")
    val mano1 = Mano(baraja_de_paso)
    println("\nvemos la segunda")
    mano1.mostrar_esta_carta(1)
    println("\ncambiamos la segunda")
    mano1.actualizar_carta(1, baraja_de_paso.sacar_carta())
    println("\nvemos la segunda otra vez")
    mano1.mostrar_esta_carta(1)
    println("\njugador2:")
    val mano2 = Mano(baraja_de_paso)
    println("\nimprimimos mano 1")
    mano1.mostrar_mano()
    println("\nimprimimos mano 2")
    mano2.mostrar_mano()
    mano1.ganador(mano2)
}
