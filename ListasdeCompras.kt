fun main(){
//Vamos criar uma lista de compras.
//Crie uma array de frutas, exiba-a ao usuário e, em seguida, peça ao usuário para digitar o nome de uma das frutas.
//Caso a fruta esteja no array, remova-a e exiba a mensagem "Fruta foi retirada da lista". // Peça novamente para o usuário digitar o nome de uma fruta para ser removida.
//Sempre que o usuário procurar por uma fruta que não está no array exiba a mensagem "Fruta indisponível no nosso mercado".
//Quando o usuário digitar "PARE", exiba a lista de frutas restantes.
//Quando o array não possuir mais itens dentro de si, escreva "Lista de compras finalizada".

    val frutas = mutableListOf<String>("Maça", "Uva", "Melancia", "Maracuja", "Tomate", "Banana", "Abacate", "Pera", "Morango")

    println(frutas)
    while (frutas.isNotEmpty()) {
        print("Digite o nome de uma das fruta (ou PARE): ")
        val resposta = readln()
        if (resposta.equals("PARE", true)) {
            println(frutas)
            break
        }
        else if (frutas.removeIf { it.equals(resposta, ignoreCase = true)}) {
            println ("Fruta foi retirada da lista!")
        }else {
            println("Fruta Indisponivel no nosso mercado")
        }
    }
    if (frutas.isEmpty()){
        println("Lista de compras finalizada")
    }
}