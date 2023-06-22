package com.example.insta.screens.dicover

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.AppBarDefaults
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.time.format.TextStyle

@Composable
fun SearchBar(onSearchTrigger:()->Unit) {
    Row {
        TopAppBar(
            modifier = Modifier
                .padding(all = 10.dp)
                .clip(RoundedCornerShape(size = 15.dp))
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Text(

                    text = "Search",
                    textAlign = TextAlign.Left,
                    modifier = Modifier
                        .weight(5f)
                        .padding(start = 10.dp),
                    softWrap = true,
                    color = if (isSystemInDarkTheme()) Color.White else Color.Black,
                    fontSize = 23.sp
                )
                IconButton(onClick = { onSearchTrigger()}) {
                    Icon(
                        imageVector = Icons.Default.Search,
                        contentDescription = "Send message",
                        tint = if (isSystemInDarkTheme()) Color.White else Color.Black,
                        modifier = Modifier
                            .weight(1f)
                    )
                }

            }
        }
    }
}

@Composable
fun OnClickedSearchBar(
    text: String,
    onTextChange: (String) -> Unit,
    onCloseClicked: () -> Unit,
    onSearchClicked: (String) -> Unit
) {
    val isDarkTheme = isSystemInDarkTheme()

    Surface(
        modifier = Modifier
            .padding(all = 10.dp)
            .clip(RoundedCornerShape(size = 15.dp))
            .fillMaxWidth()
            .height(56.dp),
        elevation = AppBarDefaults.TopAppBarElevation
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            TextField(
                value = text,
                onValueChange = { onTextChange(it) },
                modifier = Modifier
                    .weight(1f)
                    .padding(horizontal = 10.dp),
                textStyle = androidx.compose.ui.text.TextStyle(
                    fontSize = 20.sp,
                    color = if (isDarkTheme) Color.White else Color.Black
                ),
                singleLine = true,
                keyboardOptions = KeyboardOptions(
                    imeAction = ImeAction.Search,
                    autoCorrect = true
                ),
                keyboardActions = KeyboardActions(
                    onSearch = { onSearchClicked(text) }
                ),
                placeholder = {
                    Text(
                        text = "Type Here...",
                        fontSize = 20.sp,
                        color = if (isDarkTheme) Color.White else Color.Black.copy(alpha = 0.7f),
                        modifier = Modifier.alpha(0.7f)
                    )
                },
                colors = TextFieldDefaults.textFieldColors(
                    backgroundColor = Color.Transparent,
                    textColor = if (isDarkTheme) Color.White else Color.Black,
                    cursorColor = if (isDarkTheme) Color.White.copy(alpha = 0.7f) else Color.Black.copy(alpha = 0.7f)
                ),
                trailingIcon = {
                    IconButton(onClick = {
                        if (text.isNotBlank()) {

                            onTextChange("")
                        } else {
                            onCloseClicked()
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Default.Close,
                            contentDescription = "Close",
                            tint = if (isDarkTheme) Color.White else Color.Black
                        )
                    }
                }
            )
        }
    }
}


@Preview
@Composable
fun Searchbarpreview() {
    SearchBar(onSearchTrigger = {})
}


