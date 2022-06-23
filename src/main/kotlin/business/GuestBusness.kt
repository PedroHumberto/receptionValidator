package business

import entity.Guest

class GuestBusness {
    fun typeValidate(type: String): Boolean {
        return (type == "comum" || type == "premium" || type == "luxo")
    }

    fun ofAge(age: Int): Boolean {
        return age >= 18
    }

    fun guestValidate(guest: Guest): Boolean {
        return when (guest.type) {
            "comum" -> guest.code.startsWith("xt")
            "premium", "luxo" -> guest.code.startsWith("xl")
            else -> false
        }
    }

}