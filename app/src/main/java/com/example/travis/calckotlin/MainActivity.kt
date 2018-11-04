package com.example.travis.calckotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*
import org.mariuszgromada.math.mxparser.Expression
import java.lang.Exception
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    private val KEY_Result = "0";
    private val KEY_Expression = "1";

    private var calculated = false
    private var needNewEnter = true
    private var secondAct = false
    private var radButton = true
    private var radFunc = ""
    private var memRes = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContentView(R.layout.activity_main)

        tvResult.text = savedInstanceState?.getCharSequence(KEY_Result, "0");
        tvExpression.text = savedInstanceState?.getCharSequence(KEY_Expression, "0");


        tv1.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("1") }
        tv2.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("2") }
        tv3.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("3") }
        tv4.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("4") }
        tv5.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("5") }
        tv6.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("6") }
        tv7.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("7") }
        tv8.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("8") }
        tv9.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("9") }
        tvZero.setOnClickListener {checkEmptyExtension(false)
            appendOnExpression("0") }
        tvDot.setOnClickListener {
            val tvResultText = tvResult.text.toString();
            if (tvResultText.indexOf('.') == -1 || calculated) {
                if (tvResultText == ""|| calculated)
                    appendOnExpression("0.")
                else
                    appendOnExpression(".")
            }
        }

        tvPlus.setOnClickListener { appendOperationOnExpression("", "+",true) }
        tvMinus.setOnClickListener { appendOperationOnExpression("", "-",true) }
        tvMult.setOnClickListener { appendOperationOnExpression("", "*",true) }
        tvDiv.setOnClickListener { appendOperationOnExpression("", "/",true) }

        tvPM.setOnClickListener {
            val expression = Expression("-1*"+tvResult.text.toString())
            tvResult.text =expression.calculate().toString()
        }


        val mc = findViewById(R.id.tvMc) as? TextView
        val mPlus = findViewById(R.id.tvMPlus) as? TextView
        val mMinus = findViewById(R.id.tvMMinus) as? TextView
        val mr = findViewById(R.id.tvMr) as? TextView

        mc?.setOnClickListener { memRes = ""}
        mPlus?.setOnClickListener { memRes += "+"+tvResult.text.toString()
            needNewEnter = true}
        mMinus?.setOnClickListener { memRes += "-"+tvResult.text.toString()
            needNewEnter = true}
        mr?.setOnClickListener {
            tvExpression.text = "mr: "+memRes+"=";
            checkNonsInExtension(memRes);
            val expressionMem = Expression(memRes)
            tvResult.text =expressionMem.calculate().toString()
            calculated = true
        }



        val rightBracket = findViewById(R.id.tvRightBracket) as? TextView
        rightBracket?.setOnClickListener { appendOperationOnExpression("", ")",false)}
        val leftBracket = findViewById(R.id.tvLeftBracket) as? TextView
        leftBracket?.setOnClickListener { appendOperationOnExpression("", "(",false)}

        val xPowTwo = findViewById(R.id.tvxPowTwo) as? TextView
        xPowTwo?.setOnClickListener { appendOnResult("", "^2",false,true)}
        val xPowThree = findViewById(R.id.tvXPowThree) as? TextView
        xPowThree?.setOnClickListener { appendOnResult("", "^3",false,true)}
        val xPowY = findViewById(R.id.tvXPowY) as? TextView
        xPowY?.setOnClickListener {
            checkEmptyExtension(true)
            appendOperationOnExpression("", "^",true)}

        val oneDivX = findViewById(R.id.tvOneDivX) as? TextView
        oneDivX?.setOnClickListener { appendOnResult("(1/", ")",false,true)}
        val twoSquareRoot = findViewById(R.id.tvTwoSquareRoot) as? TextView
        twoSquareRoot?.setOnClickListener { appendOnResult("sqrt(", ")",false,true)}
        val threeSquareRoot = findViewById(R.id.tvThreeSquareRoot) as? TextView
        threeSquareRoot?.setOnClickListener { appendOnResult("(", ")^(1/3)",false,true)}
        val ySquareRoot = findViewById(R.id.tvYSquareRoot) as? TextView
        ySquareRoot?.setOnClickListener { appendOperationOnExpression("(", ")^1/(",true)}
        val percent = findViewById(R.id.tvPersent) as? TextView
        percent?.setOnClickListener { appendOnResult("", "/100",false,true)}
        val rand = findViewById(R.id.tvRand) as? TextView
        rand?.setOnClickListener {
            tvResult.text = ""
            appendOnExpression( Math.random().toString() )}

        val moduleX = findViewById(R.id.tvModuleX) as? TextView
        moduleX?.setOnClickListener { appendOnResult("", "!",false,true) }

        val e = findViewById(R.id.tvE) as? TextView
        e?.setOnClickListener { appendOnResult("e", "",false,true)}

        val pi = findViewById(R.id.tvPi) as? TextView
        pi?.setOnClickListener { appendOnExpression(Math.PI.toString())}
        val ee = findViewById(R.id.tvEE) as? TextView
        ee?.setOnClickListener { appendOnResult("10^", "",false,true)}
        val rad = findViewById(R.id.tvRad) as? TextView

        rad?.setOnClickListener {
            if (radButton) {
                tvRad.text = "Deg"
                radFunc = "rad"
                radButton = false
            } else {
                tvRad.text = "Rad"
                radFunc = ""
                radButton = true
            }
        }

        val second = findViewById(R.id.tv2nd) as? TextView
        second?.setOnClickListener {
            if (secondAct)
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
                secondAct = false
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
                secondAct = true
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
            if (secondAct){
                checkEmptyExtension(true)
                appendOperationOnExpression("","^", true)}
            else {
                appendOnResult("e^", "", false, true)
            }
        }
        tenPowX?.setOnClickListener {
            if (secondAct)
                appendOnResult("2^", "",false,true)
            else
                appendOnResult("10^", "",false,true)
        }
        ln?.setOnClickListener {
            if (secondAct) {
                checkEmptyExtension(false)
                appendOnExpression("log")}
            else
                appendOnResult("ln(", ")",false,true)
        }
        logTen?.setOnClickListener {
            if (secondAct)
                appendOnResult("log2(", ")",false ,true)
            else
                appendOnResult("log10(", ")",false,true)
        }
        sin?.setOnClickListener {
            if (secondAct)
                appendOnResult("asin(", ")",false,true)
            else
                appendOnResult("sin("+radFunc +"(", "))",false,true)
        }
        cos?.setOnClickListener {
            if (secondAct)
                appendOnResult("acos(", ")",false,true)
            else
                appendOnResult("cos("+radFunc +"(", "))",false,true)}
        tan?.setOnClickListener {
            if (secondAct)
                appendOnResult("atan(", ")",false,true)
            else
                appendOnResult("tan("+radFunc +"(", "))",false,true)}
        sinH?.setOnClickListener {
            if (secondAct)
                appendOnResult("asinh(", ")",false,true)
            else
                appendOnResult("sinh("+radFunc +"(", "))",false,true)}
        cosH?.setOnClickListener {
            if (secondAct)
                appendOnResult("acosh(", ")",false,true)
            else
                appendOnResult("cosh("+radFunc +"(", "))",false,true)}
        tanH?.setOnClickListener {
            if (secondAct)
                appendOnResult("atanh(", ")",false,true)
            else
                appendOnResult("tanh("+radFunc +"(", "))",false,true)}


        tvAC.setOnClickListener {

            if (calculated) {
                tvExpression.text = ""
                tvResult.text = ""
            } else {
                tvResult.text = ""
            }}



        tvEquals.setOnClickListener {
            calculateResult();
        }

    }

    private fun checkEmptyExtension(setZero: Boolean)
    {
        val tvExpressionString = tvExpression.text.toString()
        if (setZero && tvExpressionString =="")
            tvExpression.text = "0"
        else if(tvExpressionString == "0")
            tvExpression.text = ""

    }


    private fun checkResult(Result: Double) : String
    {
        val intRes = Result.toInt()
        if (intRes.toDouble() == Result)
            return intRes.toString()
        else return Result.toString()
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

        var toCalculate = ""
        try {
            tvAC.text = "AC"
            if (!calculated)
            {
                tvExpression.append(tvResult.text.toString())
                toCalculate = checkNonsInExtension(tvExpression.text.toString())
                tvExpression.text = toCalculate
            }
            else
            {
                tvExpression.text = tvResult.text.toString();
                toCalculate = checkNonsInExtension(tvResult.text.toString())
                tvResult.text = toCalculate
            }
            val expression = Expression(toCalculate)
            val result = checkResult(expression.calculate())
            tvResult.text = result
            calculated = true
            tvExpression.append(" = $result")

        }catch (e:Exception){
            Log.d("Exception",""+ e.printStackTrace())

        }
    }

    private fun appendOnResult(stringBefore: String, stringAfter: String, calculateThis: Boolean, calculateAll: Boolean){
        var tvResultString = tvResult.text.toString()
        if (tvResultString == "")
            tvResultString = "0"
        val stringToDo = stringBefore + tvResultString + stringAfter
        if(calculateThis) {
            val stringToDo = checkNonsInExtension(stringToDo);
            val expression = Expression(stringToDo)
            tvResult.text = expression.calculate().toString()
        }
        else
            tvResult.text = stringToDo
        if (calculateAll)
            calculateResult()
    }
    private fun appendOnExpression(string: String){

        val tvResultString = tvResult.text.toString();
        if (string == "0" && (calculated || needNewEnter || tvResultString == "" || tvResultString == "0")) {
            return
        }
        tvAC.text = "C"
        if (calculated) {
            tvExpression.text = ""
            tvResult.text = string
            calculated = false

        }
        else
        {
            if (tvResultString == "" || tvResultString == "0" || needNewEnter) {
                    tvResult.text = string
                    needNewEnter = false
            }
            else
                tvResult.append(string)
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
            tvExpression.text = ""

        var expressionString = tvExpression.text.toString() + stringBefore+  tvResult.text ;
        if (isOperation)
            expressionString = deleteLustOperation(expressionString)

        calculated = false
        tvExpression.text = expressionString + stringAfter
        tvResult.text = ""
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)

        outState.putCharSequence(KEY_Result, tvResult.text)
        outState.putCharSequence(KEY_Expression, tvExpression.text)
    }
}
