package com.ncs.hostel

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.ncs.hostel.ui.theme.accent
import com.ncs.hostel.ui.theme.secondary

@Composable
fun bottomBar(
    items:List<BottomBarContent>,
    navController: NavController,
    onItemClick: (BottomBarContent) -> Unit
){
    val backStackEntry=navController.currentBackStackEntryAsState()
    Column (Modifier.fillMaxWidth()){
        Box(
            Modifier
                .fillMaxWidth()
                .height(3.dp)
                .background(secondary)) {
        }
        Row (
            modifier = Modifier
                .padding(top = 15.dp, start = 30.dp, end = 30.dp)
                .fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ){

            items.forEach{item ->
                val state=item.route==backStackEntry.value?.destination?.route
                BottomBarItem(item = item, state = state, onItemClick = {onItemClick(item)})
            }

        }
    }

}
@Composable
fun BottomBarItem(
    item: BottomBarContent,
    state:Boolean=false,
    selectedColor: Color = accent,
    onItemClick:()-> Unit
){
    Row() {
        Icon(
            painter = painterResource(item.iconId),
            contentDescription ="item",
            modifier = Modifier
                .size(33.dp)
                .clickable { onItemClick() },
            tint = if (state) selectedColor else Color.Gray,
        )

    }

}