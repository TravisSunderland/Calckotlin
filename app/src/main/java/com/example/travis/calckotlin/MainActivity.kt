package com.example.travis.calckotlin

import android.annotation.SuppressLint
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private var calcModel: CalcModel = CalcModel()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        //val tvExpressionText = savedInstanceState?.getCharSequence(KEY_Expression, "0").toString();
        //val calcModel = CalcModel()
        if (lastNonConfigurationInstance != null)
            calcModel = lastNonConfigurationInstance as CalcModel

        //tvResult.text = tvResultText
        //tvExpression.text = tvExpressionText


        tv1.setOnClickListener {calcModel.handleButtonPressed("1")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv2.setOnClickListener {calcModel.handleButtonPressed("2")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv3.setOnClickListener {calcModel.handleButtonPressed("3")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv4.setOnClickListener {calcModel.handleButtonPressed("4")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv5.setOnClickListener {calcModel.handleButtonPressed("5")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv6.setOnClickListener {calcModel.handleButtonPressed("6")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv7.setOnClickListener {calcModel.handleButtonPressed("7")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv8.setOnClickListener {calcModel.handleButtonPressed("8")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tv9.setOnClickListener {calcModel.handleButtonPressed("9")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tvZero.setOnClickListener {calcModel.handleButtonPressed("0")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tvDot.setOnClickListener {calcModel.handleButtonPressed(".")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}

        tvPlus.setOnClickListener { calcModel.handleButtonPressed("+")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tvMinus.setOnClickListener { calcModel.handleButtonPressed("-")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString() }
        tvMult.setOnClickListener { calcModel.handleButtonPressed("*")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString() }
        tvDiv.setOnClickListener { calcModel.handleButtonPressed("/")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString() }

        tvPM.setOnClickListener {calcModel.handleButtonPressed("+-")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }


        val mc = findViewById(R.id.tvMc) as? TextView
        val mPlus = findViewById(R.id.tvMPlus) as? TextView
        val mMinus = findViewById(R.id.tvMMinus) as? TextView
        val mr = findViewById(R.id.tvMr) as? TextView

        mc?.setOnClickListener { calcModel.handleButtonPressed("mc")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        mPlus?.setOnClickListener { calcModel.handleButtonPressed("m+")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        mMinus?.setOnClickListener { calcModel.handleButtonPressed("m-")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        mr?.setOnClickListener {calcModel.handleButtonPressed("mr")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString() }



        val rightBracket = findViewById(R.id.tvRightBracket) as? TextView
        rightBracket?.setOnClickListener { calcModel.handleButtonPressed(")")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val leftBracket = findViewById(R.id.tvLeftBracket) as? TextView
        leftBracket?.setOnClickListener { calcModel.handleButtonPressed("(")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}

        val xPowTwo = findViewById(R.id.tvxPowTwo) as? TextView
        xPowTwo?.setOnClickListener { calcModel.handleButtonPressed("x^2")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val xPowThree = findViewById(R.id.tvXPowThree) as? TextView
        xPowThree?.setOnClickListener { calcModel.handleButtonPressed("x^3")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val xPowY = findViewById(R.id.tvXPowY) as? TextView
        xPowY?.setOnClickListener {calcModel.handleButtonPressed("x^y")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}

        val oneDivX = findViewById(R.id.tvOneDivX) as? TextView
        oneDivX?.setOnClickListener { calcModel.handleButtonPressed("1/x")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val twoSquareRoot = findViewById(R.id.tvTwoSquareRoot) as? TextView
        twoSquareRoot?.setOnClickListener { calcModel.handleButtonPressed("2sqrt")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val threeSquareRoot = findViewById(R.id.tvThreeSquareRoot) as? TextView
        threeSquareRoot?.setOnClickListener { calcModel.handleButtonPressed("3sqrt")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val ySquareRoot = findViewById(R.id.tvYSquareRoot) as? TextView
        ySquareRoot?.setOnClickListener { calcModel.handleButtonPressed("Ysqrt")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val percent = findViewById(R.id.tvPersent) as? TextView
        percent?.setOnClickListener { calcModel.handleButtonPressed("%")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val rand = findViewById(R.id.tvRand) as? TextView
        rand?.setOnClickListener {calcModel.handleButtonPressed("rnd")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}

        val moduleX = findViewById(R.id.tvModuleX) as? TextView
        moduleX?.setOnClickListener { calcModel.handleButtonPressed("x!")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString() }

        val e = findViewById(R.id.tvE) as? TextView
        e?.setOnClickListener { calcModel.handleButtonPressed("e")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}

        val pi = findViewById(R.id.tvPi) as? TextView
        pi?.setOnClickListener { calcModel.handleButtonPressed("Pi")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val ee = findViewById(R.id.tvEE) as? TextView
        ee?.setOnClickListener { calcModel.handleButtonPressed("EE")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        val rad = findViewById(R.id.tvRad) as? TextView

        rad?.setOnClickListener {calcModel.handleButtonPressed("rad")
            if (calcModel.getRad()) {
                tvRad.text = "Deg"
            } else {
                tvRad.text = "Rad"
            }
        }

        val second = findViewById(R.id.tv2nd) as? TextView
        second?.setOnClickListener {
            if (calcModel.getSecondAct())
            {
                tvEPowX.text = "eˣ"
                tv10PowX.text = "10ˣ"
                tvLn.text = "ln"
                tvLogTen.text = "log10"
                tvSin.text = "sin"
                tvCos.text = "cos"
                tvTan.text = "tan"
                tvSinh.text = "sinh"
                tvCosh.text = "cosh"
                tvTanh.text = "tanh"
                calcModel.setSecondAct(false)
            }
            else
            {
                tvEPowX.text = "yˣ"
                tv10PowX.text = "2ˣ"
                tvLn.text = "logy"
                tvLogTen.text = "log2"
                tvSin.text = "sin⁻¹"
                tvCos.text = "cos⁻¹"
                tvTan.text = "tan⁻¹"
                tvSinh.text = "sinh⁻¹"
                tvCosh.text = "cosh⁻¹"
                tvTanh.text = "tanh⁻¹"
                calcModel.setSecondAct(true)
            }
        }

        val ePowX = findViewById(R.id.tvEPowX) as? TextView
        val tenPowX = findViewById(R.id.tv10PowX) as? TextView
        val ln = findViewById(R.id.tvLn) as? TextView
        val logTen = findViewById(R.id.tvLogTen) as? TextView
        val sin = findViewById(R.id.tvSin) as? TextView
        val cos = findViewById(R.id.tvCos) as? TextView
        val tan = findViewById(R.id.tvTan) as? TextView
        val sinH = findViewById(R.id.tvSinh) as? TextView
        val cosH = findViewById(R.id.tvCosh) as? TextView
        val tanH = findViewById(R.id.tvTanh) as? TextView


        ePowX?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("^")}
            else
                calcModel.handleButtonPressed("e^")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }
        tenPowX?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("2^")}
            else
                calcModel.handleButtonPressed("10^")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }
        ln?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("log")}
            else
                calcModel.handleButtonPressed("ln")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }
        logTen?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("log2")}
            else
                calcModel.handleButtonPressed("log10")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }
        sin?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("asin")}
            else
                calcModel.handleButtonPressed("sin")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }
        cos?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("acos")}
            else
                calcModel.handleButtonPressed("cos")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tan?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("atan")}
            else
                calcModel.handleButtonPressed("tan")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        sinH?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("asinh")}
            else
                calcModel.handleButtonPressed("sinh")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        cosH?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("acosh")}
            else
                calcModel.handleButtonPressed("cosh")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}
        tanH?.setOnClickListener {
            if (calcModel.getSecondAct()){
                calcModel.handleButtonPressed("atanh")}
            else
                calcModel.handleButtonPressed("tanh")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}


        tvAC.setOnClickListener {calcModel.handleButtonPressed("AC")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()}


        tvEquals.setOnClickListener {calcModel.handleButtonPressed("=")
            tvResult.text = calcModel.getResultString()
            tvExpression.text = calcModel.getExpressionString()
        }

    }



    override fun onRetainCustomNonConfigurationInstance(): Any {
        return calcModel
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        //outState.putBoolean(keySecondAct, secondAct)
    }
}
