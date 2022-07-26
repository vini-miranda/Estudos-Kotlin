import Class.CalculaBonificacao
import Class.Endereco

fun main() {

   val endereco = Endereco(logradouro = "Albacora", cep = "02878020")
   val endereco2 = Endereco(logradouro = "Albacora", cep = "02878020")

   println(endereco.equals(endereco2))
   println(endereco.hashCode())
   println(endereco2.hashCode())

}
fun linha(){
   println("=====================================================")
}

fun imprime(valor: Any){
   println(valor)
}