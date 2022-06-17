package business

class InvitationBusness {
    fun typeValidate(type: String) : Boolean{
        return (type == "comum" || type == "premium" || type == "luxo")
    }
    fun codeValidate(code: String, type: String) : Boolean{
        return if (type == "comum" && code.startsWith("xt")) {
            true
        } else (type == "premium" || type == "luxo") && type.startsWith("xl")
    }
}