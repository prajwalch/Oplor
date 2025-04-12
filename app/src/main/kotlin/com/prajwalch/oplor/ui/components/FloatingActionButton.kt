package com.prajwalch.oplor.ui.components

import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.prajwalch.oplor.R

@Composable
fun FloatingActionButton(onClick: () -> Unit, modifier: Modifier = Modifier) {
    FloatingActionButton(
        onClick = onClick,
        modifier = modifier.size(68.dp),
        shape = RoundedCornerShape(100)
    ) {
        Icon(
            imageVector = Icons.Default.Add,
            contentDescription = "${stringResource(R.string.app_name)}'s floating action button"
        )
    }
}