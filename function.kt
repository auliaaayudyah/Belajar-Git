class function {
}
fun main() {
    val user = setUser("Aulia","watching drama", 16)
    println(user)
    printUser("Aulia")
}
fun setUser(name: String,hobby: String, age: Int) = "my name is $name, my hobby is $hobby and my $age years old"
fun printUser(name: String) { println("my name is $name")
}