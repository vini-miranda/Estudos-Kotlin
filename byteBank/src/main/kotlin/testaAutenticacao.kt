fun testaAutenticacao() {
    val vitor = Gerente("Vitor", "32546879-12", 2000.0, 1234)
    val rapha = Diretor("Raphaela", "987654321-22", 3000.0, 4321, 200.0)
    val cliente = Cliente ("Renato", "357789654-12", 789)

    val sistema = SistemaInterno()
    sistema.entra(vitor, 1234)
    sistema.entra(rapha, 4321)
    sistema.entra(cliente, 789)
}
