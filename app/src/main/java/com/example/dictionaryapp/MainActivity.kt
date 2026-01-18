package com.example.dictionaryapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.dictionaryapp.ui.theme.DictionaryAppTheme
import com.example.dictionaryapp.viewmodel.DictionaryViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DictionaryAppTheme {
                val dictionaryViewModel: DictionaryViewModel = viewModel()  // Allow UI to adapt to data changes, screen configurations changes like different size of screen, landscape or portrait screen, etc.
                DictionaryScreen(dictionaryViewModel)
            }
        }
    }
}