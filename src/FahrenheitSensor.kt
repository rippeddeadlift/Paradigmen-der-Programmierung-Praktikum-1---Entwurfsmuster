class FahrenheitSensor(var sensor: Sensor) : Sensor {
    override fun getTemperature(): Double {
        val temp = sensor.getTemperature()
        val fahrenheitTemp = temp * 9 / 5 + 32
        println("FahrenheitSensor: Temperature in Fahrenheit = $fahrenheitTemp")
        return fahrenheitTemp
    }
}