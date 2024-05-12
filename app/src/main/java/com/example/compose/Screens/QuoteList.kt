package com.example.compose.Screens

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.compose.Quote

@Composable
fun Quotelist(data :  Array<Quote>,onClick: ()-> Unit) {
    LazyColumn( content =  {
        items(data){
            QuoteListItem(quote = it) {
                onClick
                
            }
        }

    })
    
}