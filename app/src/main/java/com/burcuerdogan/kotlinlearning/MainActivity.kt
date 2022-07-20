package com.burcuerdogan.kotlinlearning

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Res: kotlinlang.org && developer.android.com

        // Variables && Constants

        // Integer

        var x = 5
        var y = 4
        println(x * y)

        var age = 35
        val result = age / 7 * 5
        println(result)

        //Defining

        var myInteger : Int

        //Initialize

        myInteger = 10

        val a : Int = 23
        println(a / 2)

        // Long

        var myLong : Long = 100

        // Double & Float

        val pi = 3.14

        println(pi * 2)

        val myFloat = 3.14f
        println(myFloat * 2)

        var myAge : Double = 23.0
        println(myAge / 2)

        //camelCase, snake_case

        // String

        val myString = "burcu"

        val name = "James"
        val surname = "Hetfield"
        val fullname = name + " " + surname
        println(fullname)

        val larsName : String = "Lars"

        println(myString.capitalize())

        // Boolean

        var myBoolean : Boolean = true
        myBoolean = false

        var isAlive = true

        // Operatörler: < , > , <= , => , == , != , && , ||

        println(3 < 5)
        println(2 > 3)
        println(3 == 3)
        println(4 != 5)

        // Conversion

        var myNumber = 5
        var myLongNumber = myNumber.toLong()
        println(myLongNumber)

        var input = "10"
        var inputNumber = input.toInt()
        println(inputNumber * 2)

        // Collections

        // Arrays

        val myArray = arrayOf("James", "Kirk", "Rob", "Lars")

        // index

        myArray[0]
        println(myArray[0]) // myArray.get(0)
        myArray[0] = "James Hetfield"
        println(myArray[0])

        myArray.set(1,"Kirk Hammett")
        println(myArray[1])

        val numberArray = arrayOf(1,2,3,4,5)
        println(numberArray[3])

        val myNewArray = doubleArrayOf(1.0,2.0,3.0)

        val mixedArray = arrayOf("Burcu",30)
        println(mixedArray[0])
        println(mixedArray[1])

        // ArrayList

        val myMusician = arrayListOf<String>("James","Kirk")
        myMusician.add("Lars")
        println(myMusician[2])
        myMusician.add(0,"Rob")
        println(myMusician[0])

        val myArrayList = ArrayList<Int>()
        myArrayList.add(1)
        myArrayList.add(200)

        val myMixedArrayList = ArrayList<Any>()
        myMixedArrayList.add("Burcu")
        myMixedArrayList.add(12.25)
        myMixedArrayList.add(true)
        println(myMixedArrayList[0])
        println(myMixedArrayList[1])
        println(myMixedArrayList[2])

        // Set

        val myExampleArray = arrayOf(1,1,2,3,4)
        println("Element 1: ${myExampleArray[0]}")
        println("Element 2: ${myExampleArray[1]}")

        val mySet = setOf<Int>(1,1,2,3)
        println(mySet.size)

        // For Each
        mySet.forEach { println(it * 3) }

        val myStringSet = HashSet<String>()
        myStringSet.add("Burcu")
        myStringSet.add("Burcu")
        println(myStringSet.size)

        // Map - HashMap

        // Key - Value

        val fruitArray = arrayOf("Apple", "Banana")
        val calorieArray = arrayOf(100,200)
        println("${fruitArray[0]} : ${calorieArray[0]}")

        val fruitCalorieMap = hashMapOf<String,Int>()
        fruitCalorieMap.put("Elma",100)
        fruitCalorieMap.put("Banana",200)
        println(fruitCalorieMap["Apple"])

        val myHashMap = HashMap<String,String>()

        val myNewMap = hashMapOf<String,Int>("Apple" to 100,"Banana" to 200)
        println(myNewMap["Apple"])

        // Operator

        var m = 5
        println(m)
        m = m + 1
        println(m)
        m++
        println(m)
        m--
        println(m)

        var n = 7
        println(n > m)

        // &&
        println(n > m && 1 > 2)

        // ||
        println(n > m || 1 > 2)

        println(10 + 2)
        println(10 - 2)
        println(10 * 2)
        println(10 / 2)

        // Remainder
        println(10 % 2)

        // If Control

        val myAgeNumber = 32

        if (myAgeNumber < 30) {
            println("${myAgeNumber} < 30")
        } else if (myAgeNumber >= 30 && myAgeNumber < 40) {
            println("40 > ${myAgeNumber} >= 30")
        } else if (myAgeNumber >= 40 && myAgeNumber < 50) {
            println("50 > ${myAgeNumber} >= 40")
        } else {
            println("${myAgeNumber} >= 50")
        }

        // Switch - When

        val day = 3
        var dayString = ""

        when(day) {
            1 -> dayString = "Monday"
            2 -> dayString = "Tuesday"
            3 ->  dayString = "Wednesday"
            else -> dayString = ""
        }

        println(dayString)

        // Loops

        // For Loop

        val myArrayofNumbers = arrayOf(12,15,18,21,24,27,30,33)
        val q = myArrayofNumbers[0] / 3 * 5
        println(q)

        for (number in myArrayofNumbers) {
            val z = number / 3 * 5
            println(z)
        }

        // or you can use this code

        for (i in myArrayofNumbers.indices) {
            val qz = myArrayofNumbers[i] / 3 * 5
            println(qz)
        }

        for (no in 0..9) {
            println(no)
        }

        // val myStringArrayList = arrayListOf<String>("Burcu","Erdogan")
        val myStringArrayList = ArrayList<String>()
        myStringArrayList.add("Berlin")
        myStringArrayList.add("London")
        myStringArrayList.add("Sydney")

        for (str in myStringArrayList) {
            println(str)
        }

        myStringArrayList.forEach { println(it) }

        // While Loop

        var j = 0

        while (j < 10) {
            println(j)
            j++
        }
    
    }
}