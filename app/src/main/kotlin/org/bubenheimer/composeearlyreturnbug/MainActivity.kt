package org.bubenheimer.composeearlyreturnbug

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.Composable
import androidx.compose.ui.window.Dialog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { Screen() }
    }
}

@Composable
fun Screen() = MyDialog { if (false) Box {} }

@Composable
inline fun MyDialog(crossinline content: @Composable () -> Unit) = Dialog({}) { content() }
