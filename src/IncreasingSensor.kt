class IncreasingSensor(startTemp: Double) : Sensor {
    private var currentTemp = startTemp
    override fun getTemperature(): Double {
        currentTemp += 0.5
        return currentTemp
    }
}