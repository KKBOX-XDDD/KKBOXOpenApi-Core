package com.kkbox.openapi.model

import java.io.Serializable

/**
 * Represents metadata of playlists.
 */
class PlaylistInfo(
    val id: String,
    val title: String,
    val description: String,
    val updateTime: Long,
    val owner: Person,
    val covers: List<ImageInfo>,
    val webUrl: String
) : Serializable
