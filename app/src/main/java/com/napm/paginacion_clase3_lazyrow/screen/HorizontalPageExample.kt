package com.napm.paginacion_clase3_lazyrow.screen

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.napm.paginacion_clase3_lazyrow.R
import com.napm.paginacion_clase3_lazyrow.ui.theme.orange


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun  horizonal_prueba(){
    val pagerState= rememberPagerState(initialPage = 0) {
        2
    }
    Column (modifier =Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround){
        Box(modifier =Modifier.fillMaxSize()){
            HorizontalPager(state = pagerState,modifier= Modifier.fillMaxSize()) {
                    page -> when (page){
                0->CajaMain1()
                1->Content()

            }

            }
        }
    }
}

@Composable
fun CajaMain1(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Filas1(img1 = R.drawable.cajafuerte, descript = "imagen2" ,Modifier.padding(30.dp,9.dp))
        Column(modifier=Modifier) {

                Text(
                    text = "Welcome to LeamonPie!",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp, 0.dp)
                    , textAlign = TextAlign.Center, fontSize = 31.sp, color= Color.Black, fontWeight = FontWeight.Bold
                )
                Text(
                    text = "Keep your data safe",
                    modifier = Modifier
                        .fillMaxWidth()
                    , textAlign = TextAlign.Center, fontSize = 16.sp, color= Color.LightGray
                )


        }
        TextfileMain()

        Column {
            Button(
                onClick = { /*TODO*/ },
                colors = ButtonDefaults.buttonColors(orange),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(61.dp, 4.dp)

            ) {
                Text(text = "LOGIN", fontSize = 17.sp, color = Color.Black)
            }
            Text(
                text = "Forgot password?",
                modifier = Modifier
                    .fillMaxWidth()

                , textAlign = TextAlign.Center, fontSize = 16.sp, color= orange
            )

        }

        Column(modifier=Modifier){
            Row{
                Text(
                    text = "Don´t have an account?",
                    modifier = Modifier
                        .weight(1.5f)
                        .padding(10.dp,0.dp)
                    , textAlign = TextAlign.Right, fontSize = 15.sp
                )
                Text(text = "Register!",
                    modifier= Modifier
                        .weight(1f)
                        .padding(5.dp,0.dp)
                    ,textAlign = TextAlign.Left, fontSize = 16.sp, color= orange )
            }

        }
    }
}




@Preview(showSystemUi = true, device = Devices.DEFAULT)
@Composable
private  fun Result(){
    horizonal_prueba()
}