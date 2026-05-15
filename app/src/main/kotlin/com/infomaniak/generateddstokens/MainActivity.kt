package com.infomaniak.generateddstokens

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import com.infomaniak.designsystem.core.theme.EsdsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppTheme {
                Scaffold {
                    Column(modifier = Modifier.padding(it)) {
                        Button(
                            onClick = {},
                            colors = ButtonDefaults.buttonColors(containerColor = EsdsTheme.color.backgroundBrandDefault)
                        ) {
                            Text("Hello")
                        }
                    }
                }
            }
        }
    }
}
