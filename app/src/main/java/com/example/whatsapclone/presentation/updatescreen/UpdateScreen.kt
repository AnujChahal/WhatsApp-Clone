package com.example.whatsapclone.presentation.updatescreen

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.FloatingActionButton
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.whatsapclone.R
import com.example.whatsapclone.presentation.bottomnavigation.BottomNavigation
import com.example.whatsapclone.presentation.homescreen.ChatDesign
import com.example.whatsapclone.presentation.homescreen.ChatDesignModel

@Composable
//@Preview(showSystemUi = true)
fun UpdateScreen(navController: NavHostController) {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /*TODO*/ },
                containerColor = colorResource(R.color.light_green),
                modifier = Modifier.size(65.dp),
                contentColor = Color.White
            ) {
                Icon(
                    painterResource(id = R.drawable.camera),
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
                    text = "Updates",
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
                            text = "Status",
                            fontSize = 26.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.black),
                            modifier = Modifier
                                .align(Alignment.CenterStart)
                                .padding(start = 16.dp)
                        )
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
                //Status Row
                item {
                    LazyRow {
                        items(15) {
                            ChatDesign(
                                chatDesignModel = ChatDesignModel(
                                    R.drawable.salmank,
                                    name = "Salman Khan",
                                    time = "10:00 AM",
                                    message = "Hello"
                                )
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
                //Channel Header
                item {
                    Box(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            text = "Channels",
                            fontSize = 26.sp,
                            fontWeight = FontWeight.SemiBold,
                            color = colorResource(R.color.black),
                            modifier = Modifier
                                .align(Alignment.CenterStart)
                                .padding(start = 16.dp)
                        )
                        Row(
                            modifier = Modifier
                                .align(Alignment.CenterEnd)
                                .background(
                                    color = colorResource(R.color.search_bar_bg),
                                    shape = androidx.compose.foundation.shape.RoundedCornerShape(20.dp)
                                )
                        ) {
                            Button(
                                onClick = {},
                                colors = ButtonDefaults.buttonColors(
                                    containerColor = colorResource(
                                        R.color.light_grey
                                    )
                                )
                            ) {
                                Text(
                                    text = "Explore",
                                    fontSize = 16.sp,
                                    color = colorResource(R.color.black)
                                )
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(8.dp))
                }
                //Followed Channel list (example)
                items(3) {
                    FollowedChannel(
                        followedChannelModel = FollowedChannelModel(
                            followedChannelImage = R.drawable.hrithik_roshan,
                            followedChannelName = "Hrithik Roshan",
                            followedChannelTime = "Yesterday",
                            followedChannelMessage = "Making New Film"
                        )
                    )
                }
                item{
                    Text(
                        text = "Find channels to follow",
                        fontSize = 16.sp,
                        color = colorResource(R.color.dark_grey),
                        modifier = Modifier.padding(horizontal = 16.dp)
                    )
                }
                //Channel List
                items(3) {
                    ChannelsToFollow(
                        channelsToFollowModel = ChannelsToFollowModel(
                            channelName = "Sharadha",
                            channelImage = R.drawable.sharadha,
                            channelFollowing = "200K Following",
                            channelFollowButton = "Follow"
                        )
                    )
                }
                item{
                    Button(
                        onClick = {},
                        colors = ButtonDefaults.buttonColors(
                            containerColor = colorResource(
                                R.color.transparent_white
                            )
                        ),
                        modifier = Modifier.padding(horizontal = 10.dp).border(
                            width = 1.dp,
                            color = colorResource(R.color.Grey),
                            shape = RoundedCornerShape(40.dp) // match button shape
                        ),
                        shape = RoundedCornerShape(40.dp)
                    ) {
                        Text(
                            text = "Explore more",
                            fontSize = 16.sp,
                            color = colorResource(R.color.light_green)
                        )
                    }
                }
            }
        }
    }
}

