plugins {
	id("org.jetbrains.kotlin.jvm") version "2.0.0"
	id("io.ktor.plugin") version "2.3.11"
}

group = "com.github.hummel"
version = "1.0-SNAPSHOT"

dependencies {
	implementation("com.mysql:mysql-connector-j:8.4.0")
	implementation("com.rabbitmq:amqp-client:5.21.0")

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