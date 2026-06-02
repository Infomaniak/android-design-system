package com.infomaniak.generateddstokens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.infomaniak.designsystem.core.theme.EsdsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Screen()
            }
        }
    }
}

@Composable
private fun Screen() {
    Scaffold {
        Column(modifier = Modifier.padding(it), verticalArrangement = Arrangement.spacedBy(EsdsTheme.spacing.eightXl)) {
            Button(
                onClick = {},
                colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.primary),
            ) {
                Text("Hello")
            }
        }
    }
}

@Preview
@Composable
private fun Preview() {
    AppTheme {
        Screen()
    }
}
