plugins {
	id("org.jetbrains.kotlin.jvm") version "1.9.20"
	id("war")
}

group = "hummel"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	implementation("com.mysql:mysql-connector-j:8.2.0")
	implementation("jakarta.servlet:jakarta.servlet-api:6.0.0")
	implementation("jakarta.servlet.jsp.jstl:jakarta.servlet.jsp.jstl-api:3.0.0")
	implementation("org.glassfish.web:jakarta.servlet.jsp.jstl:3.0.1")
	implementation("com.rabbitmq:amqp-client:5.12.0")
	implementation("org.slf4j:slf4j-api:1.7.32")
	implementation("org.slf4j:slf4j-simple:1.7.32")
}

java {
	toolchain {
		languageVersion = JavaLanguageVersion.of(17)
	}
}

kotlin {
	jvmToolchain(17)
}
