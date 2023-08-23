package com.ncs.hostel

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.ncs.hostel.ui.theme.primary

@Composable
fun HomeScreen(){
    Column(modifier = Modifier.background(primary)){
        setActionBar(screenName = "Home", image = R.drawable.ic_launcher_foreground)

    }
}
@Composable
fun AddScreen(){
    Column(modifier = Modifier.background(primary)){
        setActionBar(screenName = "Add", image = R.drawable.ic_launcher_foreground)
    }
}
@Composable
fun SearchScreen(){
    Column(modifier = Modifier.background(primary)){
        setActionBar(screenName = "Search", image = R.drawable.ic_launcher_foreground)
    }
}