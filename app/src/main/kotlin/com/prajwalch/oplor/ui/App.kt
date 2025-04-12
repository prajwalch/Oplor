package com.prajwalch.oplor.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.prajwalch.oplor.ui.components.DirEntryList
import com.prajwalch.oplor.ui.components.TopAppBar

@Composable
fun App() {
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                onNavigationClick = {},
                onSettingsClick = {}
            )
        }) { innerPadding ->
        DirEntryList(modifier = Modifier.padding(innerPadding))
    }
}
