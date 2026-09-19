fun main (){
    //Exiba uma lista de planetas do sistema solar ("Mercúrio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano", "Netuno" e "Plutão") para o usuário. Em seguida, peça ao usuário para digitar o nome de um planeta. Verifique se o planeta que o usuário informou está na lista e informe ao usuário.

    val planetas = mutableListOf<String>("Mercurio", "Vênus", "Terra", "Marte", "Júpiter", "Saturno", "Urano","Netuno", "Plutão")

    while(true){
        print("Digite o nome de um planeta (ou 'sair'): ")
        val inputPlaneta = readln()
        if (inputPlaneta.equals("sair", ignoreCase = true)) {
            break
        }
        if (planetas.any {it.equals(inputPlaneta,ignoreCase = true)}) {
            println("O $inputPlaneta está na lista")
            println(planetas)
        }else {
            print("$inputPlaneta não está na lista. Deseja adicionar? (S/N): ")
            val resposta = readln()

            if (resposta.equals("S", ignoreCase = true)) {
                planetas.add(inputPlaneta)
                println("Adicionado!")
                print("Está é a lista: $planetas")
            } else {
                println("OK.")
                println("Esta é a lista: $planetas")
            }
        }
        println("Aperte ENTER para continuar...")
        readln()
    }
}