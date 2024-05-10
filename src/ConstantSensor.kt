class ConstantSensor (private val temp: Double) : Sensor {
    override fun getTemperature(): Double {
        return temp
    }

}