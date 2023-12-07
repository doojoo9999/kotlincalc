package com.example.calculator


fun main() {
    val calc = Calculator()

    print("첫 번째 숫자를 입력하세요: ")
    val num1 = readLine()!!.toInt()

    print("두 번째 숫자를 입력하세요: ")
    val num2 = readLine()!!.toInt()

    print("연산자를 입력하세요 \n1.더하기\n2.빼기\n3.곱하기\n4.나누기\n: ")
    val operator = readLine()!!.toInt()

    val result = calc.operate(num1, num2, operator)
    println("결과: $result")
}

