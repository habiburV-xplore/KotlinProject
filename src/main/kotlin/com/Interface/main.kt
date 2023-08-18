import com.Interface.MyInterfaceImpl

fun main(args: Array<String>) {
    val obj = MyInterfaceImpl()

    println("${obj.variable}")

    obj.hello()

    println(obj.funct())
}