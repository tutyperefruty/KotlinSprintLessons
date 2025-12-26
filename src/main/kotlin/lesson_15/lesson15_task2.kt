package org.example.lesson_15

abstract class WeatherStationStats {
    abstract fun getFromSensor(): String
}

class Temperature(val degree: Double) : WeatherStationStats() {
    override fun getFromSensor(): String {
        return "Sensor's Temperature value: $degree°C"
    }
}

class PrecipitationAmount(val amount: Int) : WeatherStationStats() {
    override fun getFromSensor(): String {
        return "Sensor's Amount value: $amount mm"
    }
}

class WeatherServer {
    fun sendToServer(valueForSending: WeatherStationStats) {
        println("Sending data to server: ${valueForSending.getFromSensor()}")
    }
}

fun main() {
    val serverGotNext = WeatherServer().run {
        sendToServer(Temperature(30.5))
        sendToServer(PrecipitationAmount(5))
    }
}