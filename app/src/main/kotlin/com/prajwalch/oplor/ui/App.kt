package com.prajwalch.oplor.ui

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.prajwalch.oplor.data.DirEntry
import com.prajwalch.oplor.data.DirEntryType
import com.prajwalch.oplor.ui.components.DirEntryList
import com.prajwalch.oplor.ui.components.FloatingActionButton
import com.prajwalch.oplor.ui.components.TopAppBar

@Composable
fun App() {
    val dirEntries = listOf(
        DirEntry("Downloads", "2.02 MB", "Fri, 2025", DirEntryType.Dir),
        DirEntry("MainActivity.kt", "2.00 MB", "Fri, 2020", DirEntryType.File)
    )

    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = { TopAppBar(onNavigationClick = {}, onSettingsClick = {}) },
        floatingActionButton = { FloatingActionButton(onClick = {}) },
    ) { innerPadding ->
        DirEntryList(
            dirEntries = dirEntries,
            onEntryClick = { println(it.name) },
            modifier = Modifier.padding(innerPadding)
        )
    }
}
