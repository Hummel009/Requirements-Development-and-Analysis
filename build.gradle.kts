plugins {
	id("org.jetbrains.kotlin.jvm") version "latest.release"
	id("io.ktor.plugin") version "latest.release"
}

group = "com.github.hummel"
version = "1.0-SNAPSHOT"

dependencies {
	implementation("com.mysql:mysql-connector-j:latest.release")
	implementation("com.rabbitmq:amqp-client:latest.release")

	implementation("io.ktor:ktor-server-core-jvm")
	implementation("io.ktor:ktor-server-freemarker-jvm")
	implementation("io.ktor:ktor-server-netty-jvm")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(11)
	}
}

application {
	mainClass = "com.github.hummel.rda.ApplicationKt"

	val isDevelopment = project.ext.has("development")
	applicationDefaultJvmArgs = listOf("-Dio.ktor.development=$isDevelopment")
}