package io.filmtime.data.tmdb.movies

import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
internal abstract class TmdbMovieModule {

    @Binds
    abstract fun bindTmdbMoviesRemoteSource(
        impl: TmdbMovieRepositoryImpl
    ):TmdbMovieRepository
}