package io.filmtime.data.api.tmdb


import io.filmtime.data.model.VideoIds
import io.filmtime.data.model.VideoThumbnail
import io.filmtime.data.network.TmdbMovieDetailsResponse


fun TmdbMovieDetailsResponse.toVideoThumbnail() =
    VideoThumbnail(
        ids = VideoIds(trackId = null, tmdbId = id),
        title = title ?: "",
        postUrl = posterPath ?: "",
        year = releaseDate?.take(4)?.toInt() ?: 0,
    )