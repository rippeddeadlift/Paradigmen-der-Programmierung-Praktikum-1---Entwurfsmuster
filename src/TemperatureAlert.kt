class TemperatureAlert(private val alertTmp: Double, private val alertMsg: String) : TemperatureObserver {
    override fun update(tmp: Double) {
        if (tmp >= alertTmp) {
            println(alertMsg)
        }
    }
}
