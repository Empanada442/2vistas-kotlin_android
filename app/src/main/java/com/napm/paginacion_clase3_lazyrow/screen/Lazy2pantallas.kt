package com.napm.paginacion_clase3_lazyrow.screen

import  com.napm.paginacion_clase3_lazyrow.ui.theme.orange
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.napm.paginacion_clase3_lazyrow.R

@Composable
fun Entregable1(){
    Box(modifier =Modifier.fillMaxSize() ){
        Content()
    }
}





@Composable
fun Content(){
    Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.SpaceAround) {
        Filas(img = R.drawable.bloqueo1, descript = "imagen1")
        Text(
            text = "pleace use the link below to verify your email and start your journey",
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp), textAlign = TextAlign.Center, fontSize = 21.sp, color= Color.LightGray
        )

        Button(
            onClick = { /*TODO*/ },
            colors = ButtonDefaults.buttonColors(orange),
            modifier = Modifier
                .fillMaxWidth()
                .padding(60.dp)
        ) {
            Text(text = "VERIFY EMAIL", fontSize = 17.sp, color = Color.Black)
        }
        Column(modifier=Modifier){
            Text(
                text = "Do you have any Question?",
                modifier = Modifier
                    .fillMaxWidth()
                , textAlign = TextAlign.Center, fontSize = 15.sp
            )
            Text(text = "contact@email.com",
                modifier= Modifier
                    .fillMaxWidth()
                ,textAlign = TextAlign.Center, fontSize = 16.sp, color= orange )
        }
    }
}


@Composable
fun TextfileMain(){
    var user by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }
    Box {
        Column (modifier = Modifier.fillMaxWidth().padding(10.dp,2.dp), verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally){

            OutlinedTextField(value = user,
                onValueChange ={
                user = it
                },
                label={
                    Text(text = "Email")
                },
                placeholder = {
                    Text(text = "JMRG")
                },
                    shape= RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(0.dp,0.dp))
                OutlinedTextField(value = password,
                onValueChange ={
                password = it
                },
                label={
                    Text(text = "Password")
                },
                placeholder = {
                    Text(text = "******")
                },
                    shape= RoundedCornerShape(20.dp),
                    modifier = Modifier.padding(0.dp,0.dp)
                )
        }
    }
}


@Composable
fun Filas(
    img:Int,
    descript:String,
    modifier: Modifier = Modifier.fillMaxWidth(),
    ){
    Row(modifier= modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img), contentDescription =descript ,modifier= Modifier
            .width(350.dp)
            .height(400.dp))
        }
}

@Composable
fun Filas1(
    img1:Int,
    descript:String,
    modifier: Modifier = Modifier.fillMaxWidth(),
){
    Row(modifier= modifier,
        horizontalArrangement = Arrangement.Center){
        Image(painter = painterResource(id = img1), contentDescription =descript ,modifier= Modifier
            .width(350.dp)
            .height(150.dp))
    }
}

@Preview(name = "entregable1", showSystemUi = true, device = Devices.DEFAULT)
@Composable
private  fun PreviewEntregable1(){
    Entregable1()
}