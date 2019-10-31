package com.kkbox.openapi.model

import java.io.Serializable

/**
 * Represents tracks.
 */
class Track(
    val id: String,
    val name: String,
    val duration: Long,
    val albumIndex: Int,
    val explicitness: Boolean,
    val availableTerritories: List<Territory>,
    val webUrl: String,
    var album: AlbumInfo? = null
) : Serializable {
    var currentPlaylist: Playlist? = null
    var currentAlbum: Album? = null
}
