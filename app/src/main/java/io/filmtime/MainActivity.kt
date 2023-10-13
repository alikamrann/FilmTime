package io.filmtime

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import dagger.hilt.android.AndroidEntryPoint
import io.filmtime.feature.movie.detail.MovieDetailScreen
import io.filmtime.feature.movie.detail.MovieDetailViewModel

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    val viewModel by viewModels<MovieDetailViewModel>()
    setContent {
      Surface(modifier = Modifier.fillMaxWidth(), color = MaterialTheme.colorScheme.background) {

        MovieDetailScreen(viewModel = hiltViewModel())
      }
    }
  }
}
