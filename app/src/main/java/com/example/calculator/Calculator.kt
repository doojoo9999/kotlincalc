package com.example.calculator

class Calculator {
    fun operate(num1: Int, num2: Int, operator: Int): Double {
        val operation = when (operator) {
            1 -> AddOperation()
            2 -> SubstractOperation()
            3 -> MultiplyOperation()
            4 -> DivideOperation()
            else -> throw IllegalArgumentException("1~4 중 입력해 주세요.")
        }

        return operation.operate(num1, num2)
    }
}