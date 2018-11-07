package com.example.travis.calckotlin

import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception


class CalcModel () {

    private var calculated = false
    private var needNewEnter = true
    private var secondAct = false
    private var radButton = true
    private var radFunc = ""
    private var memRes = ""
    private var tvACText = ""
    private var tvExpressionString = ""
    private var tvResultString = ""


    fun handleButtonPressed(string: String) {
        when (string) {
            "0" -> {checkEmptyExtension(false)
                appendOnExpression("0")}
            "1" -> {checkEmptyExtension(false)
                appendOnExpression("1")}
            "2" -> {checkEmptyExtension(false)
                appendOnExpression("2")}
            "3" -> {checkEmptyExtension(false)
                appendOnExpression("3")}
            "4" -> {checkEmptyExtension(false)
                appendOnExpression("4")}
            "5" -> {checkEmptyExtension(false)
                appendOnExpression("5")}
            "6" -> {checkEmptyExtension(false)
                appendOnExpression("6")}
            "7" -> {checkEmptyExtension(false)
                appendOnExpression("7")}
            "8" -> {checkEmptyExtension(false)
                appendOnExpression("8")}
            "9" -> {checkEmptyExtension(false)
                appendOnExpression("9")}
            "+" -> appendOperationOnExpression("", "+",true)
            "-" -> appendOperationOnExpression("", "-",true)
            "/" -> appendOperationOnExpression("", "/",true)
            "*" -> appendOperationOnExpression("", "*",true)
            "=" -> calculateResult()
            "+-" -> {
                val expression = Expression("-1*$tvResultString")
                tvResultString =expression.calculate().toString()
            }
            "mc" -> memRes = ""
            "m+" -> { memRes += "+$tvResultString"
                needNewEnter = true}
            "m-" -> { memRes += "-$tvResultString"
                needNewEnter = true}
            "mr" -> {
                tvExpressionString = "mr: $memRes="
                checkNonsInExtension(memRes)
                val expressionMem = Expression(memRes)
                tvResultString = expressionMem.calculate().toString()
                calculated = true
            }
            "(" -> appendOperationOnExpression("", ")",false)
            ")" -> appendOperationOnExpression("", "(",false)
            "x^2" -> appendOnResult("", "^2",false,true)
            "x^3" -> appendOnResult("", "^3",false,true)
            "x^y" -> {
                checkEmptyExtension(true)
                appendOperationOnExpression("", "^",true)}
            "1/x" -> appendOnResult("(1/", ")",false,true)
            "2sqrt" -> appendOnResult("sqrt(", ")",false,true)
            "3sqrt" -> appendOnResult("(", ")^(1/3)",false,true)
            "Ysqrt" -> appendOperationOnExpression("(", ")^1/(",true)
            "%" -> appendOnResult("", "/100",false,true)
            "rnd" -> {
                tvResultString = ""
                appendOnExpression( Math.random().toString() )}
            "x!" -> appendOnResult("", "!",false,true)
            "e" -> appendOnResult("e", "",false,true)
            "Pi" -> appendOnExpression(Math.PI.toString())
            "EE" -> appendOnResult("10^", "",false,true)
            "rad" -> {
                if (radButton) {
                    radFunc = "rad"
                    radButton = false
                } else {
                    radFunc = ""
                    radButton = true
                }
            }
            "y^x" -> {
                checkEmptyExtension(true)
                appendOperationOnExpression("","^", true)}
            "e^" -> appendOnResult("e^", "", false, true)
            "2^" -> appendOnResult("2^", "",false,true)
            "10^" -> appendOnResult("10^", "",false,true)
            "log" -> {
                checkEmptyExtension(false)
                appendOnExpression("log")}
            "ln" -> appendOnResult("ln(", ")",false,true)
            "log2" -> appendOnResult("log2(", ")",false ,true)
            "log10" -> appendOnResult("log10(", ")",false,true)
            "asin" -> appendOnResult("asin(", ")",false,true)
            "sin" -> appendOnResult("sin($radFunc(", "))",false,true)
            "acos" -> appendOnResult("acos(", ")",false,true)
            "cos" -> appendOnResult("cos($radFunc(", "))",false,true)
            "atan" -> appendOnResult("atan(", ")",false,true)
            "tan" -> appendOnResult("tan($radFunc(", "))",false,true)
            "asinh" -> appendOnResult("asinh(", ")",false,true)
            "sinh" -> appendOnResult("sinh($radFunc(", "))",false,true)
            "acosh" -> appendOnResult("acosh(", ")",false,true)
            "cosh" -> appendOnResult("cosh($radFunc(", "))",false,true)
            "atanh" -> appendOnResult("atanh(", ")",false,true)
            "tanh" -> appendOnResult("tanh($radFunc(", "))",false,true)
            "AC" -> {
                if (calculated) {
                    tvExpressionString = ""
                    tvResultString = ""
                } else {
                    tvResultString = ""
                }}
            "." ->{
                if (tvResultString.indexOf('.') == -1 || calculated) {
                    if (tvResultString == ""|| calculated)
                        appendOnExpression("0.")
                    else
                        appendOnExpression(".")
                }}
            else -> appendOnExpression("")
        }

    }

    fun getExpressionString(): String{
        return tvExpressionString
    }

    fun getResultString(): String{
        return tvResultString
    }

    fun getSecondAct(): Boolean{
        return secondAct
    }

    fun getRad(): Boolean {
        return radButton
    }

    fun setRad(RadButton: Boolean){
        radButton = RadButton
    }

    private fun checkEmptyExtension(setZero: Boolean)
    {
        if (setZero && tvExpressionString =="")
            tvExpressionString = "0"
        else if(tvExpressionString == "0")
            tvExpressionString = ""

    }


    private fun checkResult(Result: Double) : String
    {
        val intRes = Result.toInt()
        return if (intRes.toDouble() == Result)
            intRes.toString()
        else Result.toString()
    }

    private fun checkNonsInExtension(stringToCheck: String) : String
    {   val stringToCheck1 = stringToCheck.replace("--", "+", false)
        val stringToCheck2 = stringToCheck1.replace("+-", "-", false)
        val stringToCheck3 = stringToCheck2.replace("-+", "-", false)
        val stringToCheck4 = stringToCheck3.replace("++", "+", false)
        return deleteLustOperation(stringToCheck4)
    }
    private fun calculateResult()
    {

        val toCalculate: String
        try {
            tvACText = "AC"
            if (!calculated)
            {
                tvExpressionString += tvResultString
                toCalculate = checkNonsInExtension(tvExpressionString)
                tvExpressionString = toCalculate
            }
            else
            {
                tvExpressionString = tvResultString
                toCalculate = checkNonsInExtension(tvResultString)
                tvResultString = toCalculate
            }
            val expression = Expression(toCalculate)
            val result = checkResult(expression.calculate())
            tvResultString = result
            calculated = true
            tvExpressionString += " = $result"

        }catch (e: Exception){
            Log.d("Exception",""+ e.printStackTrace())

        }
    }

    private fun appendOnResult(stringBefore: String, stringAfter: String, calculateThis: Boolean, calculateAll: Boolean){

        if (tvResultString == "")
            tvResultString = "0"
        val stringToDo = stringBefore + tvResultString + stringAfter
        if(calculateThis) {
            val expression = Expression(checkNonsInExtension(stringToDo))
            tvResultString = expression.calculate().toString()
        }
        else
            tvResultString = stringToDo
        if (calculateAll)
            calculateResult()
    }
    private fun appendOnExpression(string: String){

        if (string == "0" && (calculated || needNewEnter || tvResultString == "" || tvResultString == "0")) {
            return
        }
        tvACText = "C"
        if (calculated) {
            tvExpressionString = ""
            tvResultString = string
            calculated = false

        }
        else
        {
            if (tvResultString == "" || tvResultString == "0" || needNewEnter) {
                tvResultString = string
                needNewEnter = false
            }
            else
                tvResultString += string
        }
    }

    private fun deleteLustOperation(ExpressionString: String) : String
    {
        if( ExpressionString.endsWith("+") || ExpressionString.endsWith("-")|| ExpressionString.endsWith("/")|| ExpressionString.endsWith("*")|| ExpressionString.endsWith("."))
            return ExpressionString.substring(0,ExpressionString.length-1)
        else
            return ExpressionString
    }

    private fun appendOperationOnExpression(stringBefore: String, stringAfter: String, isOperation: Boolean){
        if (calculated)
            tvExpressionString = ""

        var expressionString = tvExpressionString + stringBefore+  tvResultString
        if (isOperation)
            expressionString = deleteLustOperation(expressionString)

        calculated = false
        tvExpressionString = expressionString + stringAfter
        tvResultString = ""
    }

    fun setSecondAct(secondAct: Boolean) {
        this.secondAct = secondAct
    }
}
