package com.List
fun main(args: Array<String>) {

    var arrlist=ArrayList<Int>()
    arrlist.add(10)
    arrlist.add(20)
    arrlist.add(30)
    arrlist.add(40)
    arrlist.add(50)

    for(i in arrlist)
        print("$i ")

    val list = arrayListOf(1, 2, 3)

    println("$list")


    list.add(4)
    list.add(1, 5)

    println(" $list")


    list.remove(2)
    list.removeAt(0)
    println(" $list")
}
