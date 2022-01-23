package com.example.recyclerviewjetpackcompose

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import com.example.recyclerviewjetpackcompose.data.Puppy
import com.example.recyclerviewjetpackcompose.ui.theme.RecyclerviewJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RecyclerviewJetpackComposeTheme {
                MyApp {
                    startActivity(ProfileActivity.newIntent(this, it))
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Puppy) -> Unit) {
    Scaffold(
        content = {
            BarkHomeContent(navigateToProfile=navigateToProfile)
        }
    )
}
