pluginManagement {
    repositories {
        google()
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "Film Time"
include(":app")
include(":data:model")
include(":data:network")
include(":data:api:tmdb")
include(":data:tmdb-movies")
include(":domain:tmdb-movies")
include(":feature:movie-detail")
