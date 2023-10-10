package io.filmtime.data.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.json.Json
import okhttp3.MediaType
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query


interface TmdbMoviesService {

    @GET("movie/{movie_id}")
    suspend fun getMovieDetails(
        @Path("movie_id") movieId: Int,
        @Header("Authorization") apiKey: String = BuildConfig.TMDB_API_KEY
    ): TmdbMovieDetailsResponse
}

suspend fun main() {
    val json = Json { ignoreUnknownKeys = true }
    val retrofit = Retrofit.Builder()
        .baseUrl("https://api.themoviedb.org/3/")
        .addConverterFactory(
            json.asConverterFactory(MediaType.get("application/json")
            ,),
        )
        .build()

    val tmdbMovieService = retrofit.create(TmdbMoviesService::class.java)
    val result = tmdbMovieService.getMovieDetails(550)
    println(result)
}