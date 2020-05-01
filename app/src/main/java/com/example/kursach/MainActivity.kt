package com.example.kursach

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity(), View.OnClickListener {
    var buttonSTART: Button? = null
    var buttonAUTHOR: Button? = null
    /** Called when the activity is first created.  */
    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        buttonSTART = findViewById<View>(R.id.buttonSTART) as Button
        buttonSTART!!.setOnClickListener(this)
        buttonAUTHOR = findViewById<View>(R.id.buttonAUTHOR) as Button
        buttonAUTHOR!!.setOnClickListener(this)
    }

    override fun onClick(v: View) {
        when (v.id) {
            R.id.buttonSTART -> {
                // TODO Call second activity
                val intent = Intent(this, AboutActivity::class.java)
                startActivity(intent)
            }
            R.id.buttonAUTHOR -> {
                // TODO Call THIRD activity
                val intent1 = Intent(this, AuthorActivity::class.java)
                startActivity(intent1)
            }
            else -> {
            }
        }
    }
}
