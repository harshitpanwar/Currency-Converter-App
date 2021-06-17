package com.example.currencyconverter.data

import com.example.currencyconverter.data.models.CurrencyResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CurrencyApi {

    @GET("/v1/latest?access_key=a3e8dde455806bdeb2733a02ddb27292")

    suspend fun getRates(
        @Query("base") base: String
        ): Response<CurrencyResponse>
    }