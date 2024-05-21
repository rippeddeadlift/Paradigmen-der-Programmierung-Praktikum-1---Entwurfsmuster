interface TemperatureSubject {
    val observers : MutableList < TemperatureObserver >
    fun addObserver (o: TemperatureObserver )
    fun removeObserver (o: TemperatureObserver )
}
