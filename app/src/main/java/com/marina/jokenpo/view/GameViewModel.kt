package com.marina.jokenpo.view

import androidx.lifecycle.ViewModel
import com.marina.jokenpo.view.repository.JoKenPoRepository

data class GameViewModel(val repository: JoKenPoRepository): ViewModel() {

    val stone = 0
    val paper = 1
    val scisor = 2

    fun setChosenOption() {
        computerOption()

    }

    fun computerOption() {
        val computerChioce = (0..2).shuffled().first()
    }



}
