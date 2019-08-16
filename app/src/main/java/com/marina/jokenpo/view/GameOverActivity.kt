package com.marina.jokenpo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.marina.jokenpo.R
import kotlinx.android.synthetic.main.activity_game_over.*

class GameOverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        btPlayAgain.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}
