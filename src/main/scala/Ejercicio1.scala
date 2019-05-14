  object Main extends App {
    def devolverColor(v: Vehiculo) = v.color
    def devolverPeso(v: Vehiculo) = v.peso

    val vehiculos:List[Vehiculo] = List(
      new Coche(4,"rojo",1500),
      new Barco(2,"azul",2000),
      new Coche(4,"amarillo",1500),
      new Barco(2,"verde",2000))

    vehiculos.foreach{ vehiculos =>
      println(" El color del vehículo es: " + devolverColor(vehiculos))
      println(" El peso del vehículo es: " +devolverPeso(vehiculos))
    }
}
