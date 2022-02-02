package com.rmg.calcmvc.controllers

import android.view.View
import android.widget.Button
import android.widget.EditText
import com.rmg.calcmvc.R
import com.rmg.calcmvc.views.MainActivity

class ControllerMainActivity {
    private lateinit var buttonCalculate : Button
    private lateinit var editTextA : EditText
    private lateinit var editTextB : EditText
    private lateinit var editTextResult : EditText

    private lateinit var mainActivity : MainActivity

    constructor(mainActivity: MainActivity) {
        this.mainActivity = mainActivity

        editTextA = mainActivity.findViewById(R.id.editTextA)
        editTextB = mainActivity.findViewById(R.id.editTextB)
        editTextResult = mainActivity.findViewById(R.id.editTextResult)

        buttonCalculate = mainActivity.findViewById(R.id.buttonCalculate)
        buttonCalculate.setOnClickListener(buttonCalculateClickListener)
    }

    private var buttonCalculateClickListener = View.OnClickListener {
        var a = editTextA.text.toString().toDouble()
        var b = editTextB.text.toString().toDouble()

        var result = a + b

        editTextResult.setText(result.toString())
    }
}