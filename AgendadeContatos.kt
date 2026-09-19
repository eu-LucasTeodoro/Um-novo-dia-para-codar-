data class Contato(var nome:String, var telefone: String)

fun main (){
//Crie um programa que funcione como uma agenda de contatos.
//O usuário pode cadastrar contatos informando nome e telefone (armazene como objetos em um array).
//O programa deve permitir que o usuário busque um contato pelo nome.
//Se o contato existir, exiba o telefone; se não existir, exiba "Contato não encontrado".
//O usuário também pode remover um contato pelo nome.
//Quando o usuário digitar "LISTAR", exiba todos os contatos cadastrados (nome e telefone).
//Quando o usuário digitar "SAIR", encerre o programa exibindo a mensagem "Agenda encerrada. Total de contatos: X".

    val agenda = mutableListOf<Contato>()

    agenda.add(Contato("Dudinha",  "(11) 91234-5678"))
    agenda.add(Contato("Lara",  "(11) 92345-6789"))
    agenda.add(Contato("Alice",  "(11) 97890-1234"))
    agenda.add(Contato("Isaac",  "(11) 93456-7890"))
    agenda.add(Contato("Breno",  "(11) 94567-8901"))
    agenda.add(Contato("José",  "(11) 95678-9012"))
    agenda.add(Contato("Rafinha",  "(11) 96789-0123"))
    agenda.add(Contato("Gabriel Lindo",  "(11) 98901-2345"))
    agenda.add(Contato("Wanda Maximorff",  "(11) 99123-4567"))
    agenda.add(Contato("Daenerys Targaryen",  "(11) 96432-7815"))
    agenda.add(Contato("Jon Snow",  "(11) 95176-3248"))

    while (true){
        println("---------------------------AGENDA DE CONTATOS---------------------------")
        println("1 - Adicionar")
        println("2 - Buscar ")
        println("3 - Remover")
        println("4 - Listar")
        println("5 - Sair")
        val escolha = readln()

        when (escolha) {
            "1" -> {
                print("Nome: ")
                val nome = readln()
                print("Numero: ")
                val numero = readln()
                agenda.add(Contato(nome, numero))
                println("Contado adicionado!")
            }
            "2" -> {
                print("Nome: ")
                val nome = readln()

                var encontrado = false

                for (contato in agenda) {
                    if (contato.nome.equals(nome, ignoreCase = true)) {
                        println("Telefone: ${contato.telefone}")
                        encontrado = true
                    }
                }
                if (!encontrado){
                    println("Contado não encontrado")
                }
            }
            "3" -> {
                print("Nome do contato a remover: ")
                val remover = readln()

                if (agenda.removeIf { it.nome.equals(remover, ignoreCase = true) }) {
                    println("Contato removido!")
                }else {
                    println("Contato não encontrado")
                }
            }
            "4" -> {
                for (contato in agenda) {
                    println("${contato.nome} - ${contato.telefone}")
                }
            }
            "5" -> break
            else -> println("Opção Invalida!")
        }
    }
    println("Agenda encerrada. Total de contados: ${agenda.size}")
}
