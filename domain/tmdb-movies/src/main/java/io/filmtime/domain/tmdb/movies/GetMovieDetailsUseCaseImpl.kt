package io.filmtime.domain.tmdb.movies

import io.filmtime.data.model.VideoDetail
import io.filmtime.data.tmdb.movies.TmdbMovieRepository
import javax.inject.Inject

internal class GetMovieDetailsUseCaseImpl @Inject constructor(
    private val tmdbMovieRepository: TmdbMovieRepository,
) : GetMovieDetailsUseCase {

    override suspend fun invoke(movieId: Int): VideoDetail =
        tmdbMovieRepository.getMovieDetails(movieId)
}