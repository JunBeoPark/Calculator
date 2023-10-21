package com.android.re_calculator

import com.android.re_calculator.calculator.Calculator
import com.android.re_calculator.calculator.Add
import com.android.re_calculator.calculator.Divide
import com.android.re_calculator.calculator.Multiply
import com.android.re_calculator.calculator.Substract

fun main() {
    // 더하기
    val addCalc = Calculator(Add())
    println("10 더하기 20 결과는 : ${addCalc.operate(10, 20)} 입니다")
    // 빼기
    val subCalc = Calculator(Substract())
    println("10 빼기 20 결과는 : ${subCalc.operate(10, 20)} 입니다")
    // 곱하기
    val mulCalc = Calculator(Multiply())
    println("10 곱하기 20 결과는 : ${mulCalc.operate(10, 20)} 입니다")
    // 나누기
    val divCalc = Calculator(Divide())
    println("10 나누기 20 결과는 : ${divCalc.operate(10, 20)} 입니다")
}