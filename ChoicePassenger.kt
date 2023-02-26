package ChoicePassenger
import PassengerApplication.*
open class ChoicePassenger(namePassenger:String): PassengerApplication(namePassenger) {
    open var trainNumber:Byte = 1
    open var stations:String = "Undefined"
    open var check:Byte = 25
    open var freeSeat:Boolean = true

    open fun TrainChoice(){
        if(destinationStation == "А")
        {
            println("Выберите номер поезда: 1 - комфорт, 2 - эконом)")
            trainNumber = readln()!!.toByte()
        }
        if(destinationStation == "Б")
        {
            println("Выберите номер поезда: 3 - комфорт, 4 - эконом)")
            trainNumber = readln()!!.toByte()
        }
        if(destinationStation == "В")
        {
            println("Выберите номер поезда: 5 - комфорт, 6 - эконом)")
            trainNumber = readln()!!.toByte()
        }
    }
    open fun TrainCheck(){
        if (trainNumber.toInt() == 1)
        {
            stations = "Г-В-Б-А"
            check = 25
        }
        if (trainNumber.toInt() == 2)
        {
            stations = "Г-В-Б-А"
            check = 20
        }
        if (trainNumber.toInt() == 3)
        {
            stations = "Г-В-Б"
            check = 35
        }
        if (trainNumber.toInt() == 4)
        {
            stations = "Г-В-Б"
            check = 30
        }
        if (trainNumber.toInt() == 5)
        {
            stations = "Г-В"
            check = 45
        }
        if (trainNumber.toInt() == 6)
        {
            stations = "Г-В"
            check = 40
        }
    }
    open fun ProverkaFreeSeat(){
        if (freeSeat == true)
        {
            println("Место свободно")
            freeSeat = false
        }
        else (freeSeat == false)
        {
            println("Место занято")
        }
    }
}