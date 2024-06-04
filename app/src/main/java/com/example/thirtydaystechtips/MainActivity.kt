package com.example.thirtydaystechtips

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.thirtydaystechtips.model.TipRepo
import com.example.thirtydaystechtips.ui.theme._30DaysTechTipsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30DaysTechTipsTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TechTipApps()
                }
            }
        }
    }
}


private val tipRepository = TipRepo()



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TechTipApps() {

    TipItemList(tips = tipRepository.tips)
    
}


@Composable
fun TopAppBar() {

}


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun HeroesPreview() {
    _30DaysTechTipsTheme(darkTheme = false) {
        Surface (
            color = MaterialTheme.colorScheme.background
        ) {
            TipItemList(tips = tipRepository.tips)
        }
    }
}