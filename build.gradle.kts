plugins {
    id("org.openapi.generator") version "7.2.0"
    id("java")
}

allprojects {
    group = "com.harbour"
    version = "0.0.1"
}

repositories {
    mavenCentral()
}

tasks.test {
    useJUnitPlatform()
}
openApiGenerate {
    generatorName.set("kotlin-spring")
    inputSpec.set("$projectDir/specs/harbour-eats-v1.yaml")
    outputDir.set("$projectDir/generated")
    generateModelDocumentation.set(false)
    generateApiTests.set(false)
    generateModelTests.set(false)
    generateApiDocumentation.set(false)
}
