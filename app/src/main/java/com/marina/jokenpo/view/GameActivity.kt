package com.marina.jokenpo.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModel
import com.marina.jokenpo.R
import kotlinx.android.synthetic.main.activity_game_over.*
import org.koin.android.viewmodel.ext.android.viewModel

class GameActivity : AppCompatActivity() {

    val gameViewModel: GameViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        btPlayAgain.setOnClickListener {
           gameViewModel.setChosenOption()


        }
    }


}
