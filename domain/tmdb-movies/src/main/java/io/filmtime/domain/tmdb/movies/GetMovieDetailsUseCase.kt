package io.filmtime.domain.tmdb.movies

import io.filmtime.data.model.VideoThumbnail

interface GetMovieDetailsUseCase {
    operator suspend fun invoke(movieId:Int):VideoThumbnail
}