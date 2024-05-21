 abstract class Thermometer(var sensor: Sensor): TemperatureSubject {
    fun measure(times: Int) {
        repeat(times) {
            println("Temperature: ${sensor.getTemperature()}")
        }
    }
}