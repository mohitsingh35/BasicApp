package com.ncs.hostel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ncs.hostel.ui.theme.HostelTheme
import com.ncs.hostel.ui.theme.primary

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HostelTheme {
                Box(modifier = Modifier
                    .fillMaxSize()
                    .background(primary)){
                    val navController= rememberNavController()
                    Column(modifier = Modifier
                        .fillMaxHeight()
                        .padding(bottom = 15.dp), verticalArrangement = Arrangement.SpaceBetween) {
                        Box{
                            Navigation(navController = navController)
                        }
                        bottomBar(items = listOf(
                            BottomBarContent(R.drawable.home,"Home"),
                            BottomBarContent(R.drawable.add,"Add"),
                            BottomBarContent(R.drawable.search,"Search")
                        ),
                            navController = navController, onItemClick = {
                                navController.navigate(it.route)
                            }
                        )
                    }
                }
            }
        }
    }
}


