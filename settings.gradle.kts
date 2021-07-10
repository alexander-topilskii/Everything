dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
rootProject.name = "Recycler"
include(":app")
include(":viewModel")
include(":navigation")
include(":dataProducer")
apply(from = "pages/modules.gradle.kts")
