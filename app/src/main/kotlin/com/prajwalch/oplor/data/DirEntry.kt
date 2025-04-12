package com.prajwalch.oplor.data

/**
 * Represents an entry within in a directory.
 *
 * @param name Name of an entry
 * @param size Either file/directory size or total entries in a directory.
 * @param date Modified date. Fix this.
 * @param type Type of an entry.
 */
data class DirEntry(
    val name: String,
    val size: String,
    val date: String,
    val type: DirEntryType,
)

/** Represents a type of directory entry. */
enum class DirEntryType {
    Dir,
    File,
}