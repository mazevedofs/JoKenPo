package com.marina.jokenpo.view.service

import com.marina.jokenpo.view.model.ScoreResponse
import retrofit2.Call
import retrofit2.http.GET

interface ScoreService {

    @GET("/jokenpokemon/pontuacao")
    fun getScore() : Call<ScoreResponse>


}
