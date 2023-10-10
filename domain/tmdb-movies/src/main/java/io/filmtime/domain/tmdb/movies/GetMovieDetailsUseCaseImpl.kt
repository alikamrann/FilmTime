package io.filmtime.domain.tmdb.movies

import io.filmtime.data.model.VideoThumbnail
import io.filmtime.data.tmdb.movies.TmdbMovieRepository

internal class GetMovieDetailsUseCaseImpl(
    private val tmdbMovieRepository: TmdbMovieRepository
) : GetMovieDetailsUseCase {
    override suspend fun invoke(movieId: Int): VideoThumbnail = tmdbMovieRepository.getMovieDetails(movieId)
}