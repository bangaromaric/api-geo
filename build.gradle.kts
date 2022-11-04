import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.kapt3.base.Kapt
import org.jetbrains.kotlin.kapt3.base.Kapt.kapt

plugins {
    id("org.springframework.boot") version "2.6.0"
    id("io.spring.dependency-management") version "1.0.11.RELEASE"
    id("com.github.johnrengelman.processes") version "0.5.0"
    id("org.springdoc.openapi-gradle-plugin") version "1.3.3"
    id("org.jetbrains.dokka") version "1.6.10"
    kotlin("jvm") version "1.6.0"
    kotlin("plugin.spring") version "1.6.0"
    kotlin("plugin.jpa") version "1.5.21"
    kotlin("kapt") version "1.3.72"
}

group = "ga.banga"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}



repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-validation:2.5.6")
    implementation("org.springframework.boot:spring-boot-starter-web:2.5.6")
    implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.13.0")
    implementation("org.jetbrains.kotlin:kotlin-reflect")

    developmentOnly("org.springframework.boot:spring-boot-devtools:2.5.6")
    implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.5.6")
    compileOnly("org.projectlombok:lombok:1.18.22")

//    implementation("io.springfox:springfox-boot-starter:3.0.0")
//    implementation("io.springfox:springfox-swagger2:3.0.0")
//    implementation("io.springfox:springfox-swagger-ui:3.0.0")
    implementation("org.springdoc:springdoc-openapi-ui:1.5.12")
    implementation("org.springdoc:springdoc-openapi-data-rest:1.5.12")
    implementation("org.springdoc:springdoc-openapi-kotlin:1.5.12")




    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    kapt("org.mapstruct:mapstruct-processor:1.4.2.Final")
    implementation ("org.mapstruct:mapstruct:1.4.2.Final")


    runtimeOnly("org.postgresql:postgresql:42.3.1")

    runtimeOnly("com.h2database:h2")

    //Dokka plugin creates Gradle configuration for each output format in the form of dokka${format}Plugin:
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.6.10")

    testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.6")
}

tasks.withType<KotlinCompile> {
    kotlinOptions {
        freeCompilerArgs = listOf("-Xjsr305=strict")
        jvmTarget = "11"
    }
}

tasks.withType<Test> {
    useJUnitPlatform()
}

tasks.getByName<org.springframework.boot.gradle.tasks.bundling.BootJar>("bootJar") {
    archiveClassifier.set("boot")
    manifest {
        attributes("Start-Class" to "ga.banga.entgeo.EntgeoApplicationKt")
    }
}

tasks.getByName<Jar>("jar") {
    archiveClassifier.set("")
}
