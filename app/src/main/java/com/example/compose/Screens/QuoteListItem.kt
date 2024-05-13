package com.example.compose.Screens

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.compose.DataManager
import com.example.compose.Quote

@Composable
fun QuoteListItem(quote: Quote?,onClick: ()-> Unit) {



    Card (
        elevation = CardDefaults.cardElevation(
            defaultElevation = 4.dp
        ),
        modifier = Modifier
            .clickable { onClick }
            .padding(8.dp)
            .background(Color.White)
    ){

        Row (modifier = Modifier.padding(16.dp)){
            Image(
                imageVector = Icons.Filled.Person,
                colorFilter = ColorFilter.tint(Color.White),
                alignment = Alignment.Center,
                contentDescription = "Quotes",
                modifier = Modifier
                    .size(40.dp)
                    .rotate(360f)
                    .background(Color.Black)

            )
            Spacer(modifier = Modifier.padding(4.dp))
            Column(modifier = Modifier.weight(1f)) {
                if (quote != null) {
                    Log.d("QuoteListItem", "Quote data: ${quote.quote} - ${quote.author}")
                }
                if (quote != null) {
                    Text(text = quote.quote,
                        style = MaterialTheme.typography.bodyLarge,
                        modifier = Modifier.padding(0.dp,0.dp,0.dp,8.dp)
                    )
                }


                
                Box ( modifier = Modifier
                    .background(Color(0xFFEEEEEE))
                    .fillMaxSize(.4f)
                    .height(1.dp)
                )
                if (quote != null) {
                    Text(text = quote.author, style = MaterialTheme.typography.bodySmall,
                        fontWeight = FontWeight.Thin,
                        modifier = Modifier
                            .padding(top = 4.dp)
                    )
                }


            }

        }

    }
    
}



@Composable
private fun QuoteDetails(quote: Quote) {
    Box(modifier = Modifier
        .fillMaxSize(1f)
        .background(
            Brush.sweepGradient(
                colors = listOf(
                    Color(0xFFffffff),
                    Color(0xFFE3E3E3)
                )
            )
        )
    ){
        Card (
            elevation = CardDefaults.cardElevation(
                defaultElevation = 4.dp
            )
            , modifier = Modifier
                .padding(30.dp)
                .align(alignment = Alignment.Center)
                .background(Color.White)
        ){
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .background(Color.White)

                    .padding(16.dp,24.dp)
            ) {
                Image(
                    imageVector = Icons.Filled.ThumbUp,
                    contentDescription = "Thumb"
                    , modifier = Modifier
                        .size(80.dp)

                )
                Text(text =quote.quote,
                    style = MaterialTheme.typography.headlineLarge
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(text = quote.author,
                    style = MaterialTheme.typography.bodyMedium)

            }

        }

    }

    

}
