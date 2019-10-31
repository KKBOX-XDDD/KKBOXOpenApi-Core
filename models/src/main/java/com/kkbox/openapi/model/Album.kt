package com.kkbox.openapi.model

data class Album(
    val info: AlbumInfo,
    val tracks: List<Track>
) {
    init {
        for (track in tracks) {
            track.currentAlbum = this
            track.album = info
        }
    }
}
