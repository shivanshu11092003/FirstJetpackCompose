package com.example.compose.Screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.compose.Quote

@Composable
fun QuoteListScreen(data : Array<Quote>,onClick : ()-> Unit) {
    Column {
        Text(text = "Quote App",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(8.dp, 24.dp)
                .fillMaxSize(1f)
        , style = MaterialTheme.typography.headlineMedium)
        Quotelist(data = data) {
            onClick
            
        }
    }
    
    
}