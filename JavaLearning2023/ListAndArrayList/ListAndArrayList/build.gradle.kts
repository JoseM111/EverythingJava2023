plugins {
    id("java")
}

group = "josem111"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // added by me
    implementation("org.projectlombok:lombok:1.18.26")
}

tasks.test {
    useJUnitPlatform()
}