package control

import business.InvitationBusness

class Portaria {
    private val invitationBusness = InvitationBusness()

    init {
        println("Portaria Inicializada")
        println(this.controle())
    }

    private fun controle(): String{
       val idade = Console.readInt("Qual sua idade? ")
        if(idade < 18){
            return "Negado. Menores de idade não são permitidos."
        }

        val typeInvitation = Console.readString("Qual é o tipo de convite? ")
        if (!invitationBusness.typeValidate(typeInvitation)){
            return "Negado. Convite inválido."
        }
        val code = Console.readString("Qual o código do convite? ")
        if (!invitationBusness.codeValidate(code, typeInvitation)){
            return "Negado. Convite inválido."
        }

        return "TODO!"
    }
}

fun portaria() {

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
       /* tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. entity.Convite inválido.")
            return
        } */
        print("Qual o código do convite? ")
        var codigo = readLine()
        if (codigo != null && codigo != "") {
            codigo = codigo.lowercase()
            if (tipoConvite == "comum" && codigo.startsWith("xt")) {
                println("Welcome :)")
            } else if ((tipoConvite == "premium" || tipoConvite == "luxo") && codigo.startsWith("xl")
            ) {
                println("Welcome :)")
            } else {
                println("Negado. entity.Convite inválido")
            }
        }
    }
}