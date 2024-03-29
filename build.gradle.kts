plugins {
	id("org.jetbrains.kotlin.jvm") version "1.9.22"
	id("io.ktor.plugin") version "2.3.8"
}

group = "com.github.hummel"
version = "1.0-SNAPSHOT"

dependencies {
	implementation("com.mysql:mysql-connector-j:8.2.0")
	implementation("com.rabbitmq:amqp-client:5.12.0")

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

tasks {
	withType<JavaCompile>().configureEach {
		options.encoding = "UTF-8"
	}
}
