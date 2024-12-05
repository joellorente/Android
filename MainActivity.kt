package com.example.joenavigation2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.joenavigation2.navigation.AppNavigation
import com.example.joenavigation2.screens.FirstScreen
import com.example.joenavigation2.ui.theme.JoeNavigation2Theme
import com.example.joenavigation2.ui.theme.primaryGray

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JoeNavigation2Theme {
                Surface(color = primaryGray) {
                    AppNavigation()
                }
            }
        }
    }
}

@Preview
@Composable
fun DefaultPreview(){
    JoeNavigation2Theme {
        AppNavigation()
    }

}
