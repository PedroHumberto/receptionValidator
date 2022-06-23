package control

import business.GuestBusness
import entity.Guest

class Reception {
    private val guestBusness = GuestBusness()

    init {
        println("Reception Initialized")
        println(this.controle())
    }

    private fun controle(): String{

       val age = Console.readInt("Type your age? ")
        val guest = Guest(age = age)
        if(!guestBusness.ofAge(guest.age)){
            return "Denied. Under age it isn't allowed."
        }


        guest.type = Console.readString("Whats the type of the invitation? ")
        if (!guestBusness.typeValidate(guest.type)){
            return "Negado. Type invalid."
        }

        guest.code = Console.readString("And the Invatation Code? ")
        if (!guestBusness.guestValidate(guest)){
            return "Denied. Code Invalid."
        }

        return "Welcome! :)"
    }
}