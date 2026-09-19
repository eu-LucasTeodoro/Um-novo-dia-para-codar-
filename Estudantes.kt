fun main(){

    //Crie um programa onde o usuário possa cadastrar estudantes sem limites, e, em seguida, Se o usuário digitar "PARE" o programa deve exibir a quantidade de estudantes cadastrados e a lista com cada um deles.

    val input1: String
    val InputAluno = mutableListOf<String>()

    print("Digite \"começar\": ")
    input1 = readln()

    while (true) {
        print("Informe o nome do aluno (ou 'pare' para encerrar): ")
        val entrada = readln()

        if (entrada.lowercase() == "pare") {
            break
        }
        InputAluno.add(entrada)
    }
    println("Lista de alunos cadastrados: ")
    println(InputAluno)
}