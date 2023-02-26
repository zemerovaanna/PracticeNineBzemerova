import PassengerApplication.PassengerApplication

fun main() {
    println("Пассажир:")
    var Passenger = PassengerApplication()
    print("Введите Фамилию:")
    Passenger.lastNamePassenger = readln()
    print("Введите станцию назначения:")
    Passenger.destinationStation = readln()
    print("Введите желательное время поездки:")
    Passenger.time = readln()
    print("Введите день поездки:")
    Passenger.travelDay = readln()!!.toByte()
    print("Введите месяц поездки:")
    Passenger.travelMonth = readln()!!.toByte()
    print("Введите год поездки:")
    Passenger.travelYear = readln()!!.toShort()
}