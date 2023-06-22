package com.example.insta.screens.dicover

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

import com.example.insta.screens.dicover.SearchWidgetState.*


@Composable
fun DiscoverScreen() {

//    val searchWidgetState by remember {
//        mainViewModel.searchWidgetState
//    }
//
//    val searchTextState by remember {
//        mainViewModel.searchTextState
//    }
    Column(modifier = Modifier.safeContentPadding()) {

        SearchBar (onSearchTrigger = {})

//        MainAppBar(
//            searchWidgetState = searchWidgetState,
//            searhTextState = searchTextState,
//            onTextChange = { mainViewModel.updateSearchTextState(it) },
//            onSearchClicked = { Log.i("Searched", searchTextState) },
//            onCloseClicked = { mainViewModel.updateSearchWidgetState(CLOSED) },
//            onSearchTriggered = {mainViewModel.updateSearchWidgetState(OPENED)}
//        )

    }
}

@Composable
fun MainAppBar(
    searchWidgetState: SearchWidgetState,
    searhTextState: String,
    onTextChange: (String) -> Unit,
    onSearchClicked: (String) -> Unit,
    onCloseClicked: () -> Unit,
    onSearchTriggered: () -> Unit
) {
    when (searchWidgetState) {
        OPENED -> {
            OnClickedSearchBar(
                text = searhTextState,
                onTextChange = onTextChange,
                onCloseClicked = onCloseClicked,
                onSearchClicked = onSearchClicked
            )
        }

        CLOSED -> {
            SearchBar(onSearchTriggered)
        }
    }
}



