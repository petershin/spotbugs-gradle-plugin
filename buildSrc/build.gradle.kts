plugins {
    `kotlin-dsl`
    id("com.diffplug.spotless") version "6.25.0"
}

repositories {
    mavenCentral()
    gradlePluginPortal()
}

dependencies {
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.25.0")
    implementation("net.ltgt.gradle:gradle-errorprone-plugin:4.1.0")
    implementation("com.gradle.publish:plugin-publish-plugin:1.3.0")
    implementation("org.sonarsource.scanner.gradle:sonarqube-gradle-plugin:6.0.0.5145")
}

spotless {
    kotlinGradle {
        ktlint()
    }
}
