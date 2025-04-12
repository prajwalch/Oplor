package com.prajwalch.oplor.ui.components

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import com.prajwalch.oplor.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppTopBar(
    onNavigationClick: () -> Unit,
    onSettingsClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(stringResource(R.string.app_name)) },
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(
                    Icons.Outlined.Menu,
                    contentDescription = null
                )
            }
        },
        actions = {
            IconButton(onClick = onSettingsClick) {
                Icon(
                    Icons.Default.Settings,
                    contentDescription = null
                )
            }
        }
    )
}