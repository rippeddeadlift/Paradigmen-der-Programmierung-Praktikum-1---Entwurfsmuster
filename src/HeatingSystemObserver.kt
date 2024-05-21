class HeatingSystemObserver(
    private val offThreshold: Double,
    private val onThreshold: Double
) : TemperatureObserver {
    private val temperatures = mutableListOf<Double>()

    override fun update(tmp: Double) {
        temperatures.add(tmp)
        if (temperatures.size == 5) {
            val averageTmp = temperatures.average()
            println("Die Durchschnittstemperatur der letzten 5 Messungen ist $averageTmp")
            if (averageTmp > onThreshold) {
                println("Heizung aus!")
            } else if (averageTmp < offThreshold) {
                println("Heizung an!")
            }
            temperatures.clear()
        }
    }
}
