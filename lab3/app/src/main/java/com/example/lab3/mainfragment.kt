package com.example.lab3

class mainfragment {
    companion object{
        var firstVal: Double? = null
        var secondVal: Double? = null
        var action: String = ""
        fun result(): Double? {
            var result: Double? = null
            if(firstVal != null && secondVal != null) {
                when (action) {
                    "+" -> result = firstVal!! + secondVal!!
                    "-" -> result = firstVal!! - secondVal!!
                    "*" -> result = firstVal!! * secondVal!!
                    "/" -> result = firstVal!! / secondVal!!
                }
            }
            return result
        }
    }
}