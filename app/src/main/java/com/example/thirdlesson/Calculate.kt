package com.example.thirdlesson

class Calculate {

    companion object{

        var first_field: Int? = null
        var second_field: Int? = null

        var operation: String = ""

        fun calculate(): Int? {
            var result: Int? = null
            if(first_field != null && second_field != null){
                when (operation) {
                    "+" -> result = first_field!! + second_field!!
                    "-" -> result = first_field!! - second_field!!
                    "*" -> result = first_field!! * second_field!!
                    "/" -> result = first_field!! / second_field!!
                }
            }
            return result
        }

    }

}