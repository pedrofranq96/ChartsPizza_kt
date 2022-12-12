package com.infnet.chartspizza_kt

import android.graphics.Color
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import org.eazegraph.lib.charts.PieChart
import org.eazegraph.lib.models.PieModel

class MainActivity : AppCompatActivity() {


    var tvR: TextView? = null
    var tvPython:TextView? = null
    var tvCPP:TextView? = null
    var tvJava:TextView? = null
    var pieChart: PieChart? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvR = findViewById(R.id.tvR)
        tvPython = findViewById(R.id.tvPython)
        tvCPP = findViewById(R.id.tvCPP)
        tvJava = findViewById(R.id.tvJava)
        pieChart = findViewById(R.id.piechart)


        setData()
    }

    private fun setData() {




        tvR!!.setText(Integer.toString(40))
        tvPython!!.setText(Integer.toString(30))
        tvCPP!!.setText(Integer.toString(5))
        tvJava!!.setText(Integer.toString(25))


        pieChart!!.addPieSlice(
            PieModel(
                "R", tvR!!.text.toString().toInt().toFloat(),
                Color.parseColor("#FFA726")
            )
        )
        pieChart!!.addPieSlice(
            PieModel(
                "Python", tvPython!!.text.toString().toInt().toFloat(),
                Color.parseColor("#66BB6A")
            )
        )
        pieChart!!.addPieSlice(
            PieModel(
                "C++", tvCPP!!.text.toString().toInt().toFloat(),
                Color.parseColor("#EF5350")
            )
        )
        pieChart!!.addPieSlice(
            PieModel(
                "Java", tvJava!!.text.toString().toInt().toFloat(),
                Color.parseColor("#29B6F6")
            )
        )
        pieChart!!.startAnimation()

    }
}