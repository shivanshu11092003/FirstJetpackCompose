package com.example.compose

import android.content.Context
import androidx.compose.runtime.mutableStateOf
import com.google.gson.Gson

object DataManager {
    var data = emptyArray<Quote>()
    var isloaded = mutableStateOf(false)

    fun loadAssets(context: Context){
        val inputStream = context.assets.open("new.json")
        val size= inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()
        val  json   = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        data =  gson.fromJson(json,Array<Quote>::class.java)
        isloaded.value = true
    }
}