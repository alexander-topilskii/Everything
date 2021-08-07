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
apply(from = "ui/modules.gradle.kts")
apply(from = "ui/holder/modules.gradle.kts")
include(":benchmark")
