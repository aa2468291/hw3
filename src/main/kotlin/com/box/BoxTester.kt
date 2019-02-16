package com.box.kotlin
import java.util.*

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    println("Please enter object's length")
    val length = input.nextFloat()
    println("Please enter object's width")
    val width = input.nextFloat()
    println("Please enter object's height")
    val height = input.nextFloat()
    val box3 = Box3()
    val box5 = Box5()




    if (box3.validate(length, width, height)) {
        println("應使用Box3的箱子")
    } else if (box5.validate(length, width, height)) {
        println("應使用Box5的箱子")
    } else {
        println("尺寸太大，沒有可選的箱子")
    }

}

open class Box{
    var length = 0f
    var width = 0f
    var height = 0f

    fun validate(length:Float , width:Float , height:Float):Boolean{
        return (this.length >= length && this.width >= width && this.height >= height)
    }
}

class Box3 : Box(){
    init{
        length = 23f
        width = 14f
        height = 13f
    }
}

class Box5 : Box(){
    init{
        length = 39.5f
        width = 27.5f
        height = 23f
    }
}