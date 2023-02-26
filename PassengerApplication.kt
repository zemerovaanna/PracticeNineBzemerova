package PassengerApplication
open class PassengerApplication() {
    open var lastNamePassenger = "Undifined"
    open var destinationStation = "Undefined"
    var time:String = "00:00"
    var travelDay:Byte = 1
    var travelMonth:Byte = 1
    var travelYear:Short = 2023

    constructor(_lastNamePassenger:String): this(){
        lastNamePassenger = _lastNamePassenger
    }

    constructor(_lastNamePassenger:String, _destinationStation:String): this(_lastNamePassenger){
        destinationStation = _destinationStation
    }
    constructor(_lastNamePassenger:String, _destinationStation: String, _time:String): this(_lastNamePassenger, _destinationStation){
        time=_time
    }
    constructor(_lastNamePassenger:String, _destinationStation: String, _time:String, _travelDay:Byte): this(_lastNamePassenger, _destinationStation, _time){
        travelDay=_travelDay
    }
    constructor(_lastNamePassenger:String, _destinationStation: String, _time:String, _travelDay:Byte, _travelMonth:Byte): this(_lastNamePassenger, _destinationStation, _time, _travelDay){
        travelMonth=_travelMonth
    }
    constructor(_lastNamePassenger:String, _destinationStation: String, _time:String, _travelDay:Byte, _travelMonth:Byte, _travelYear:Short): this(_lastNamePassenger, _destinationStation, _time, _travelDay, _travelMonth){
        travelYear=_travelYear
    }

    open fun Passenger(){
        println("Пассажир: $lastNamePassenger.")
    }
    open fun TrainStationDestination(){
        println("Поезд прибудет на станцию назначения $destinationStation.")
    }
    open fun TrainArrivalTime(){
        println("Время прибития поезда: $time.")
    }
    open fun TimeArrivalTime(){
        println("Дата прибития поезда: $travelDay/$travelMonth/$travelYear.")
    }
}