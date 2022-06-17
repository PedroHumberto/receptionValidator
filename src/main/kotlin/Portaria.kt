class Portaria {



    fun controle(){
       val idade = Console.readInt("Qual sua idade? ")
        if(idade < 18){
            println("Negado. Menores de idade não são permitidos.")
            return
        }

        val tipoConvite = Console.readString("Qual é o tipo de convite? ")
        println(tipoConvite)
    }
}

fun portaria() {

    print("Qual é o tipo de convite? ")
    var tipoConvite = readLine()
    if (tipoConvite != null && tipoConvite != "") {
        tipoConvite = tipoConvite.lowercase()
        // Validação do tipo de convite
        if (tipoConvite != "comum" && tipoConvite != "premium" && tipoConvite != "luxo") {
            println("Negado. Convite inválido.")
            return
        }
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
                println("Negado. Convite inválido")
            }
        }
    }
}