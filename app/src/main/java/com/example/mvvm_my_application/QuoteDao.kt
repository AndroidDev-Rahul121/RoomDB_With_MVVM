package com.example.mvvm_my_application

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

@Dao
interface QuoteDao {
    @Query("SELECT * FROM quote" )
    fun getQuotes():LiveData<List<Quote>>
    @Insert
   fun insertQuote(quote: Quote)

}