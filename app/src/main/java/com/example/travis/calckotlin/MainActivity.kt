package com.example.travis.calckotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    companion object {
        const val CALC_MODEL_KEY = "calc_model_key"
    }

    private lateinit var calcModel: CalcModel


    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        val savedCalcModel = savedInstanceState?.getSerializable(MainActivity.CALC_MODEL_KEY) as? CalcModel

        calcModel = savedCalcModel ?: CalcModel()

        tvResult.text = calcModel.getResultString()
        tvExpression.text = calcModel.getExpressionString()

        tv1?.setOnClickListener {
            calcModel.handleButtonPressed("1")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv2?.setOnClickListener {
            calcModel.handleButtonPressed("2")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv3?.setOnClickListener {
            calcModel.handleButtonPressed("3")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv4?.setOnClickListener {
            calcModel.handleButtonPressed("4")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv5?.setOnClickListener {
            calcModel.handleButtonPressed("5")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv6?.setOnClickListener {
            calcModel.handleButtonPressed("6")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv7?.setOnClickListener {
            calcModel.handleButtonPressed("7")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv8?.setOnClickListener {
            calcModel.handleButtonPressed("8")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv9?.setOnClickListener {
            calcModel.handleButtonPressed("9")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvZero?.setOnClickListener {
            calcModel.handleButtonPressed("0")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvDot?.setOnClickListener {
            calcModel.handleButtonPressed(".")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvPlus?.setOnClickListener {
            calcModel.handleButtonPressed("+")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvMinus?.setOnClickListener {
            calcModel.handleButtonPressed("-")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvMult?.setOnClickListener {
            calcModel.handleButtonPressed("*")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvDiv?.setOnClickListener {
            calcModel.handleButtonPressed("/")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvPM?.setOnClickListener {
            calcModel.handleButtonPressed("+-")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvMc?.setOnClickListener {
            calcModel.handleButtonPressed("mc")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvMPlus?.setOnClickListener {
            calcModel.handleButtonPressed("m+")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvMMinus?.setOnClickListener {
            calcModel.handleButtonPressed("m-")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvMr?.setOnClickListener {
            calcModel.handleButtonPressed("mr")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvRightBracket?.setOnClickListener {
            calcModel.handleButtonPressed(")")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvRightBracket?.setOnClickListener {
            calcModel.handleButtonPressed(")")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvLeftBracket?.setOnClickListener {
            calcModel.handleButtonPressed("(")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvxPowTwo?.setOnClickListener {
            calcModel.handleButtonPressed("x^2")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvXPowThree?.setOnClickListener {
            calcModel.handleButtonPressed("x^3")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvXPowY?.setOnClickListener {
            calcModel.handleButtonPressed("x^y")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvOneDivX?.setOnClickListener {
            calcModel.handleButtonPressed("1/x")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvTwoSquareRoot?.setOnClickListener {
            calcModel.handleButtonPressed("2sqrt")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvThreeSquareRoot?.setOnClickListener {
            calcModel.handleButtonPressed("3sqrt")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvYSquareRoot?.setOnClickListener {
            calcModel.handleButtonPressed("Ysqrt")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvPersent?.setOnClickListener {
            calcModel.handleButtonPressed("%")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvRand?.setOnClickListener {
            calcModel.handleButtonPressed("rnd")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvModuleX?.setOnClickListener {
            calcModel.handleButtonPressed("x!")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvE?.setOnClickListener {
            calcModel.handleButtonPressed("e")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvPi?.setOnClickListener {
            calcModel.handleButtonPressed("Pi")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvEE?.setOnClickListener {
            calcModel.handleButtonPressed("EE")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvRad?.setOnClickListener {
            calcModel.handleButtonPressed("rad")

            if (calcModel.getRad()) {
                tvRad?.text = "Deg"
            } else {
                tvRad?.text = "Rad"
            }
        }

        tv2nd?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                tvEPowX?.text = "eˣ"
                tv10PowX?.text = "10ˣ"
                tvLn?.text = "ln"
                tvLogTen?.text = "log10"
                tvSin?.text = "sin"
                tvCos?.text = "cos"
                tvTan?.text = "tan"
                tvSinh?.text = "sinh"
                tvCosh?.text = "cosh"
                tvTanh?.text = "tanh"

                calcModel.setSecondAct(false)
            } else {
                tvEPowX?.text = "yˣ"
                tv10PowX?.text = "2ˣ"
                tvLn?.text = "logy"
                tvLogTen?.text = "log2"
                tvSin?.text = "sin⁻¹"
                tvCos?.text = "cos⁻¹"
                tvTan?.text = "tan⁻¹"
                tvSinh?.text = "sinh⁻¹"
                tvCosh?.text = "cosh⁻¹"
                tvTanh?.text = "tanh⁻¹"

                calcModel.setSecondAct(true)
            }
        }

        tvEPowX?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("y^x")
            } else {
                calcModel.handleButtonPressed("e^")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tv10PowX?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("2^")
            } else {
                calcModel.handleButtonPressed("10^")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }

        tvLn?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("logy")
            } else {
                calcModel.handleButtonPressed("ln")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvLogTen?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("log2")
            } else {
                calcModel.handleButtonPressed("log10")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvSin?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("asin")
            } else {
                calcModel.handleButtonPressed("sin")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvCos?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("acos")
            } else {
                calcModel.handleButtonPressed("cos")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvTan?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("atan")
            } else {
                calcModel.handleButtonPressed("tan")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvSinh?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("asinh")
            } else {
                calcModel.handleButtonPressed("sinh")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvCosh?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("acosh")
            } else {
                calcModel.handleButtonPressed("cosh")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvTanh?.setOnClickListener {
            if (calcModel.getSecondAct()) {
                calcModel.handleButtonPressed("atanh")
            } else {
                calcModel.handleButtonPressed("tanh")
            }

            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvAC?.setOnClickListener {
            calcModel.handleButtonPressed("AC")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }

        tvEquals?.setOnClickListener {
            calcModel.handleButtonPressed("=")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
            tvAC?.text = calcModel.getACText()
        }
    }


    override fun onRetainCustomNonConfigurationInstance(): Any {
        return calcModel
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putSerializable(CALC_MODEL_KEY, calcModel)
    }
}
