package Kassa
import ChoicePassenger.*
open class Kassa(namePassenger:String): ChoicePassenger(namePassenger) {
    open var Number:Byte = trainNumber
    open var checkTotal:Byte = check
    open var stationsTotal:String = stations
    open var pay:Boolean = true
    open var seat:Boolean = freeSeat

    open fun InformationPassenger(){
        println("Пассажир: $lastNamePassenger")
    }

    open fun Registration(){
        println("Поезд номер $trainNumber стоимостью: $check рублей. Остановки: $stations")
    }

    open fun ProverkaOplat(){
        if(pay == true && seat == true)
        {
            println("Спасибо! Хорошего пути")
        }
        else
        {
            seat = false
        }
    }
}