package com.kkbox.openapi.model

import java.io.Serializable

/**
 * Represents playlists.
 */
class Playlist(
    val info: PlaylistInfo,
    val tracks: List<Track>
) : Serializable {

    init {
        for (track in tracks) {
            track.currentPlaylist = this
        }
    }

}