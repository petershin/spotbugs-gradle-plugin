plugins {
    `kotlin-dsl`
    id("com.diffplug.spotless") version "6.14.1"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.15.0")
    implementation("net.ltgt.gradle:gradle-errorprone-plugin:3.0.1")
    implementation("com.gradle.publish:plugin-publish-plugin:0.21.0")
    implementation("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:3.5.0.2730")
}

spotless {
    kotlinGradle {
        ktlint()
    }
}
