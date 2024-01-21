rootProject.name = "cyclic" // TODO: Change this to your addon id

dependencyResolutionManagement {
    repositories {
        mavenCentral()
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://repo.xenondevs.xyz/releases/")
    }
    versionCatalogs {
        create("libs") {
            version("nova", "0.16-alpha.1")
            
            from("xyz.xenondevs.nova:catalog:0.16-alpha.1") // TODO: change this when updating to a newer Nova version
        }
    }
}

pluginManagement {
    repositories {
        gradlePluginPortal()
        mavenCentral()
        maven("https://papermc.io/repo/repository/maven-public/")
        maven("https://repo.xenondevs.xyz/releases/")
    }
}