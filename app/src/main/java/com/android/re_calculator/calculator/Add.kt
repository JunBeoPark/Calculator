package com.android.re_calculator.calculator

import com.android.re_calculator.abs.AbstractOperation

class Add : AbstractOperation() {
    override fun operate(num1: Int, num2: Int): Double = (num1 + num2).toDouble()
}