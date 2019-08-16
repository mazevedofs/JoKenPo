package com.marina.jokenpo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marina.jokenpo.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btPlay.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }

        btRanking.setOnClickListener {

        }

        btSobre.setOnClickListener {

        }

        btSair.setOnClickListener {
            finish()
        }

    }


}
