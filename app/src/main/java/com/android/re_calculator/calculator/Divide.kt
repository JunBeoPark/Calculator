package com.android.re_calculator.calculator

import com.android.re_calculator.abs.AbstractOperation

class Divide : AbstractOperation() {
    @Throws(ArithmeticException::class)
    override fun operate(num1: Int, num2: Int): Double {
        require(num2 != 0) {
            ArithmeticException( "Divide by Zero")
        }
        return (num1 / num2).toDouble()
    }
}