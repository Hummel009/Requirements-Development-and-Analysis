[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=code_smells)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=sqale_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=security_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=bugs)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=vulnerabilities)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=duplicated_lines_density)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Reliability Rating](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=reliability_rating)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=alert_status)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=sqale_index)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)
[![Lines of Code](https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=ncloc)](https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis)

Мои лабораторные работы для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - RiAT/РиАТ (разработка и анализ требований).

## Общая информация

Этот репозиторий - проект Gradle, который должен быть открыт через IntelliJ IDEA.

| Технология                             | Версия |
|----------------------------------------|--------|
| Система автоматической сборки Gradle   | 8.5    |
| Java, используемая для запуска Gradle  | 11+    |
| Java, используемая для сборки проекта  | 11+    |
| Java, используемая для запуска проекта | 11+    |
| Kotlin                                 | 1.9.22 |

## Установка

Установка моих проектов Gradle и основы работы с ними примерно одинаковы, так что
смотрите [общую инструкцию](https://github.com/Hummel009/The-Rings-of-Power#readme).

## Условие

Разработать прототип проекта, соответствующего разработанным требованиям. Требования включали технологию фронтенда, язык бэкенда, брокер и микросервисы.

Мой проект состоит из 7-8 "микросервисов", которые запускаются отдельными командами. Язык - Kotlin/Java, БД - MySQL, брокер - RabbitMQ. Пользователь через сайт с кнопками может взаимодействовать с базой данных, каждое действие посылает в брокер положительный или отрицательный сигнал. Положительные сигналы уходят в свой собственный канал, а отрицательные - в канал ошибок. Две последние кнопки открывают микросервисы прослушиваения именных каналов и ошибочного канала.
