package DH

fun main() {
    val professorEdu = Professor("Edu", 1234)

    val materiaKotlin = Materia("Aula de Kotlin")
    val aulaKotlin = Aula(materiaKotlin, "19h30", "21h30")

    val materiaAndroid = Materia("Aula de Android")
    val aulaAndroid = Aula(materiaAndroid, "15h30", "17h30")

    val victor = Aluno("Victor", "Motta", 777)
    val cecilia = Aluno("Cecilia", "Sena", 888)

    val cursoDev = Curso(
        "Dev Android",
        professorEdu,
        listOf(aulaKotlin, aulaAndroid),
        listOf(victor, cecilia)
    )

    val turma1 = Turma("Turma 1 de Android", cursoDev)

    turma1.curso.listaDeAlunos.forEach {
        println("O nome do aluno é ${it.nome} ${it.sobrenome} e seu RA é ${it.registroAcademico}")
    }

    turma1.curso.listaDeAulas.forEach {
        println("No ${cursoDev.nomeCurso} você vai ter: ${it.materia.nome}")
    }


}

