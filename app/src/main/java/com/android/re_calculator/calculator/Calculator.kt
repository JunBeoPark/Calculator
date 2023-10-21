package com.android.re_calculator.calculator

import com.android.re_calculator.abs.AbstractOperation

class Calculator(private val operator: AbstractOperation) {
    fun operate(num1: Int, num2: Int): Double {
        return operator.operate(num1, num2)
    }
}