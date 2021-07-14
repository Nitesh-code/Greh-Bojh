package com.example.grehbojh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_go.*

class GoActivity : AppCompatActivity() {

    var mercuryGravity: Float = 0.38F
    var venusGravity: Float = 0.91F
    var earthGravity: Float = 1.00F
    var marsGravity: Float = 0.38F
    var jupiterGravity: Float = 2.34F
    var saturnGravity: Float = 1.06F
    var uranusGravity: Float = 0.92F
    var neptuneGravity: Float = 1.19F




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_go)
        var input = intent.extras
        var weight = Integer.parseInt(input?.get("weigh").toString())





        var choosenItem = intent.extras
        if (choosenItem != null) {
            var a: Float? = null
            var item = choosenItem.get("position")
            when(item) {
                1 -> a = mercuryWeight(mercuryGravity, weight)
                2 -> a = venusWeight(venusGravity, weight)
                3 -> a = earthWeight(earthGravity, weight)
                4 -> a = marsWeight(marsGravity, weight)
                5 -> a = jupiterWeight(jupiterGravity, weight)
                6 -> a = saturnWeight(saturnGravity, weight)
                7 -> a = uranusWeight(uranusGravity, weight)
                8 -> a = neptuneWeight(neptuneGravity,   weight)
            }
            outputWeight.text = "Your weight is\n " + a.toString() + "\n kg"
        }




    }
}

fun neptuneWeight(neptuneGravity: Float, weight: Int): Float {
    return neptuneGravity * weight

}

fun uranusWeight(uranusGravity: Float, weight: Int): Float {
    return uranusGravity * weight

}

fun saturnWeight(saturnGravity: Float, weight: Int): Float {
    return saturnGravity * weight

}

fun jupiterWeight(jupiterGravity: Float, weight: Int): Float {
    return jupiterGravity * weight

}

fun marsWeight(marsGravity: Float, weight: Int): Float {
    return marsGravity * weight

}

fun earthWeight(earthGravity: Float, weight: Int): Float {
    return earthGravity * weight

}

fun venusWeight(venusGravity: Float, weight: Int): Float {
    return venusGravity * weight

}


fun mercuryWeight(mercuryGravity: Float, weight: Int): Float {
    return mercuryGravity * weight

}



