package io.filmtime.data.model

data class VideoThumbnail (
    val ids : VideoIds,
    val title : String,
    val postUrl : String,
    val year:Int

)
data class VideoIds(
    val trackId : Int?,
    val tmdbId : Int?
)
