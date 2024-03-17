package com.example.ex_artigocompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ex_artigocompose.ui.theme.Ex_ArtigoComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ex_ArtigoComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArtigo()
                }
            }
        }
    }
}

@Composable
fun ComposeArtigo() {
    ArtigoCartao(
        title = stringResource(R.string.title),
        descricaoCurta = stringResource(R.string.descCurta),
        descricaoLonga = stringResource(R.string.descLonga),
        imagem = painterResource(R.drawable.bg_compose_background)
    )
}
@Composable
fun ArtigoCartao(
    title: String,
    descricaoCurta: String,
    descricaoLonga: String,
    imagem: Painter,
    modifier: Modifier = Modifier,
) {
    Column (modifier = modifier) {
        Image(painter = imagem, contentDescription = null)
        Text(
            text = title,
            modifier = Modifier.padding(16.dp),
            fontSize = 24.sp
        )
        Text (
            text = descricaoCurta,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify
        )
        Text(
            text = descricaoCurta,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArtigoComposePreview() {
    Ex_ArtigoComposeTheme {
        ComposeArtigo()
    }
}