//Faça um algoritmo que leia um vetor inteiro de 8 posições e
//retorne quantos valores pares e quantos valores ímpares foram informados
fun main() {
    val limits : Int = 8
    val myVector = IntArray(limits)
    var par  : Int = 0
    var impar  : Int = 0


    for (i in 0..<limits)
    {
        print("Informe um valor para a posição [$i]: ")
        myVector[i] = readLine()!!.toInt()
    }
    for (i in 0..<limits)
    {
        if (myVector[i] % 2 == 0)
        {
            par++

        }else
        {
            impar++

        }

    }
    println("Numero de pares digitados: $par")
    println("Numero de ímpares digitados: $impar")

}
