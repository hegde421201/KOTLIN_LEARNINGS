import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.8.0"
}

group = "me.user"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Other dependencies.
    testImplementation(kotlin("test"))
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")

}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "17"
}

tasks.test {
    useJUnitPlatform()
}
