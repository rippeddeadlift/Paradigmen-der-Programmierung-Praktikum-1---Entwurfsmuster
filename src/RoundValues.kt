class RoundValues(var sensor: Sensor) : Sensor {
    override fun getTemperature(): Double {
        val temp = sensor.getTemperature()
        val roundedTemp = kotlin.math.floor(temp)
        return roundedTemp
    }
}