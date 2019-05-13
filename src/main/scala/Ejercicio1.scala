object Ejercicio1 extends App {

  abstract class Vehiculo(){
    var color: String
    var peso: Int
  }

  class Coche(numeroRuedas :Int,c: String, p:Int) extends Vehiculo {
    var color = c
    var peso = p
  }

  class Barco(numeroVelas: Int,c: String, p:Int) extends Vehiculo {
    var color = c
    var peso = p
  }

  object Main extends App {
    def devolverColor(v: Vehiculo) = v.color
    def devolverPeso(v: Vehiculo) = v.peso

    val vehiculos:List[Vehiculo] = List(new Coche(4,"rojo",1500),new
        Barco(2,"azul",2000),new Coche(4,"amarillo",1500),new
        Barco(2,"verde",2000))

    vehiculos.foreach()

    /**
      * Recorreremos esta lista para con un bucle foreach y llamaremos a los métodos genéricos pasando como parámetros los vehículos de cada iteración. Con estas llamadas a los métodos nos damos cuenta que usando el polimorfismo podremos devolver el color y el peso del vehículo que pasemos, indiferentemente de si es un Coche o un Barco.
      */


}
