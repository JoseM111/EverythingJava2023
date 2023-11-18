plugins {
    id("java")
}

group = "josem111"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    // added by me
    implementation("org.projectlombok:lombok:1.18.30")
}

tasks.test {
    useJUnitPlatform()
}