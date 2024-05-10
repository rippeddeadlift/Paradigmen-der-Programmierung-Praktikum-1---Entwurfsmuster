class Thermometer(var sensor: Sensor) {
    fun measure(times: Int) {
        repeat(times) {
            println("Temperature: ${sensor.getTemperature()}")
        }
    }

}