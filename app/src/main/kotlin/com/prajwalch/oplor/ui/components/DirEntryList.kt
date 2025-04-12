package com.prajwalch.oplor.ui.components

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.prajwalch.oplor.R
import com.prajwalch.oplor.data.DirEntry
import com.prajwalch.oplor.data.DirEntryType

@Composable
fun DirEntryList(
    dirEntries: List<DirEntry>,
    onEntryClick: (DirEntry) -> Unit,
    modifier: Modifier = Modifier
) {
    LazyColumn(modifier = modifier) {
        items(dirEntries) {
            DirEntryListItem(dirEntry = it, onClick = { onEntryClick(it) })
        }
    }
}

@Composable
private fun DirEntryListItem(
    dirEntry: DirEntry,
    onClick: () -> Unit,
    modifier: Modifier = Modifier
) {
    val iconId = when (dirEntry.type) {
        DirEntryType.Dir -> R.drawable.folder_24dp
        DirEntryType.File -> R.drawable.file_24dp
    }

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = modifier
            .fillMaxWidth()
            .clickable(onClick = onClick)
            .padding(horizontal = 16.dp, vertical = 6.dp)
    ) {
        // TODO: Give the content description.
        DirEntryIcon(id = iconId, contentDescription = null)
        Spacer(Modifier.width(16.dp))
        Column {
            DirEntryName(name = dirEntry.name)
            DirEntryMetadataInfo(dirEntry = dirEntry)
        }
    }
}

@Composable
private fun DirEntryIcon(
    @DrawableRes id: Int,
    contentDescription: String?,
    modifier: Modifier = Modifier
) {
    Image(
        painter = painterResource(id),
        contentDescription = contentDescription,
        modifier = modifier,
        colorFilter = ColorFilter.tint(color = MaterialTheme.colorScheme.primary)
    )
}

@Composable
private fun DirEntryName(name: String, modifier: Modifier = Modifier) {
    Text(text = name, modifier = modifier, style = MaterialTheme.typography.titleMedium)
}

@Composable
private fun DirEntryMetadataInfo(dirEntry: DirEntry, modifier: Modifier = Modifier) {
    Row(modifier = modifier, verticalAlignment = Alignment.CenterVertically) {
        MetadataInfoText(text = dirEntry.size)
        Text(text = " . ", modifier = Modifier.offset(y = (-4).dp))
        MetadataInfoText(text = dirEntry.date)
    }
}

@Composable
private fun MetadataInfoText(text: String, modifier: Modifier = Modifier) {
    Text(
        text = text,
        modifier = modifier,
        color = MaterialTheme.colorScheme.onSurfaceVariant,
        style = MaterialTheme.typography.bodySmall
    )
}