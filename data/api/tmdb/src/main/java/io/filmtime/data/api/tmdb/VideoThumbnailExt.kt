package io.filmtime.data.api.tmdb


import io.filmtime.data.model.VideoDetail
import io.filmtime.data.model.VideoIds
import io.filmtime.data.model.VideoThumbnail
import io.filmtime.data.network.TmdbMovieDetailsResponse

private val TMDB_BASE_IMAGE_URL = "https://image.tmdb.org/t/p/original/"
fun TmdbMovieDetailsResponse.toVideoThumbnail() =
    VideoThumbnail(
        ids = VideoIds(trackId = null, tmdbId = id),
        title = title ?: "",
        postUrl = posterPath ?: "",
        year = releaseDate?.take(4)?.toInt() ?: 0,
    )


fun TmdbMovieDetailsResponse.toVideoDetail() =
    VideoDetail(
        ids = VideoIds(trackId = null, tmdbId = id),
        title = title ?: "",
        postUrl = TMDB_BASE_IMAGE_URL.plus(posterPath),
        coverUrl = TMDB_BASE_IMAGE_URL.plus(backdropPath),
        year = releaseDate?.take(4)?.toInt() ?: 0,
        genres = genres?.map { it.name } ?: listOf<String>(),
        originalLanguage = originalLanguage,
        spokenLanguages = spokenLanguages?.map { it.englishName ?: "" }?.filter { it.isNotEmpty() }
            ?: listOf(),
        description = overview ?: "",
    )