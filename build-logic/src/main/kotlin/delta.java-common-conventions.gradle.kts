plugins {
    java
}

repositories {
    mavenCentral()
}

dependencies {
    constraints {
        implementation("io.javalin:javalin:5.6.1")
        implementation("org.slf4j:slf4j-simple:2.0.9")
        implementation("com.fasterxml.jackson.core:jackson-databind:2.15.2")
        implementation("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.15.2")
    }
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter("5.10.0")
        }
    }
}
