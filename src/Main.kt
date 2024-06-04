//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
    val randomSensor = RandomSensor(min = 2.0, max = 8.0) // liefert zufällige Temperaturen zwischen 2.0 und 8.0 Grad
    repeat(3) {
        println("Random Sensor: ${randomSensor.getTemperature()}")
    }
    val constantSensor = ConstantSensor(temp = 21.5) // liefert jedes Mal 21.5 Grad
    repeat(3) {
        println("Constant Sensor: ${constantSensor.getTemperature()}")
    }
    val increasingSensor =
        IncreasingSensor(startTemp = 15.0) // fängt bei 15 Grad an und erhöht jedes mal die Temperatur um 0.5 Grad
    repeat(3) {
        println("Increasing Sensor: ${increasingSensor.getTemperature()}")
    }
    val realWorldSenor = RealWorldSensor(51.023080, 7.562183) //    Koordinaten für den Campus Gummersbach
    //println(" Gummersbach : ${realWorldSenor.getTemperature()}")
    realWorldSenor.lat = 50.963473 // Koordinaten für Köln
    realWorldSenor.long = 6.875728
    println(" Köln: ${realWorldSenor.getTemperature()}")


    val sinusoidalSensor = SinusoidalSensor(amplitude = 10.0, frequency = 0.1)
    repeat(100) {
        println("Sinusoidal Sensor: ${sinusoidalSensor.getTemperature()}")
    }
    val t1 = Thermometer(SensorLogger(RoundValues(RandomSensor(2.0, 5.0))))
    val t2 = Thermometer(RoundValues(SensorLogger(RandomSensor(2.0, 5.0))))
    println("CHECK!")
    t1.measure(2)
    t2.measure(2)
    println("CHECK!")
    val sensor = SensorLogger(RoundValues(RandomSensor(10.0, 30.0)))
    val thermometer = Thermometer(sensor = sensor)
    val alertObserver = TemperatureAlert(
        alertTmp = 30.0,
        alertMsg = "Ganz schön heiß!"
    )
    val heatingSystemObserver = HeatingSystemObserver(
        offThreshold = 23.0,
        onThreshold = 19.0
    )
    thermometer.addObserver(alertObserver)
    thermometer.addObserver(heatingSystemObserver)
    thermometer.measure(20)
}
