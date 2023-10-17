package io.filmtime.data.model

data class VideoDetail(
    val ids: VideoIds,
    val title: String,
    val postUrl: String,
    val coverUrl: String,
    val year: Int,
    val genres: List<String?>,
    val originalLanguage: String?,
    val spokenLanguages: List<String>,
    val description: String
)