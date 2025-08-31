package com.example.whatsapclone.ViewUI.callsscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.whatsapclone.R
import com.example.whatsapclone.ViewUI.bottomnavigation.BottomNavigation
import com.example.whatsapclone.ViewUI.updatescreen.FollowedChannel
import com.example.whatsapclone.Model.FollowedChannelModel

@Composable
//@Preview(showSystemUi = true)
fun CallsScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painterResource(id = R.drawable.telephone),
                    contentDescription = null,
                    modifier = Modifier.size(28.dp),
                    tint = Color.Black
                )
            }
        },
        bottomBar = {
            BottomNavigation(navController)
        }
    ) { innerPadding ->
        Column(modifier = Modifier.padding(innerPadding)) {
            Spacer(modifier = Modifier.height(16.dp))
            Box(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Calls",
                    fontSize = 28.sp,
                    fontWeight = FontWeight.Normal,
                    color = colorResource(R.color.black),
                    modifier = Modifier
                        .align(Alignment.CenterStart)
                        .padding(start = 16.dp)
                )
                Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.scanner),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.search),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                    IconButton(
                        onClick = {}
                    ) {
                        Icon(
                            painter = painterResource(id = R.drawable.more),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                }
            }
            Spacer(modifier = Modifier.height(8.dp))
            LazyColumn {
                //Status Header
                item {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Favourites",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.black),
                            modifier = Modifier
                                .align(Alignment.CenterStart)
                                .padding(start = 16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
                //Recent Header
                item {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Recent",
                            fontSize = 24.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.black),
                            modifier = Modifier
                                .align(Alignment.CenterStart)
                                .padding(start = 16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
                //Followed Channel list (example)
                items(10) {
                    FollowedChannel(
                        followedChannelModel = FollowedChannelModel(
                            followedChannelImage = R.drawable.hrithik_roshan,
                            followedChannelName = "Hrithik Roshan",
                            followedChannelTime = "Yesterday",
                            followedChannelMessage = "Making New Film"
                        )
                    )
                }
            }
            HorizontalDivider(modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                color = colorResource(R.color.light_grey),
                thickness = 1.dp
            )
            Spacer(modifier = Modifier.height(8.dp))
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        color = colorResource(R.color.search_bar_bg),
                        shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp)
                    ),
                horizontalArrangement = Arrangement.Center
            ){
                Icon(
                    painter = painterResource(id = R.drawable.camera),
                    contentDescription = null,
                    tint = Color.Black,
                    modifier = Modifier.size(10.dp)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "Your personal calls are",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    color = colorResource(R.color.dark_grey)
                )
                Spacer(modifier = Modifier.width(4.dp))
                Text(
                    text = "end-to-end encrypted.",
                    fontSize = 10.sp,
                    textAlign = TextAlign.Center,
                    color = colorResource(R.color.light_green)
                )
            }
        }
    }
}