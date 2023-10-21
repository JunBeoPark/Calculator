package com.android.re_calculator.calculator

import com.android.re_calculator.abs.AbstractOperation

class Substract: AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 - num2).toDouble()
}