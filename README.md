[![Code Smells][code_smells_badge]][code_smells_link]
[![Maintainability Rating][maintainability_rating_badge]][maintainability_rating_link]
[![Security Rating][security_rating_badge]][security_rating_link]
[![Bugs][bugs_badge]][bugs_link]
[![Vulnerabilities][vulnerabilities_badge]][vulnerabilities_link]
[![Duplicated Lines (%)][duplicated_lines_density_badge]][duplicated_lines_density_link]
[![Reliability Rating][reliability_rating_badge]][reliability_rating_link]
[![Quality Gate Status][quality_gate_status_badge]][quality_gate_status_link]
[![Technical Debt][technical_debt_badge]][technical_debt_link]
[![Lines of Code][lines_of_code_badge]][lines_of_code_link]

Мои лабораторные работы для BSUIR/БГУИР (белорусский государственный университет информатики и радиоэлектроники).

Предмет - RiAT/РиАТ (разработка и анализ требований).

## Условие

Разработать прототип проекта, соответствующего разработанным требованиям. Требования включали технологию фронтенда, язык
бэкенда, брокер и микросервисы.

Мой проект состоит из 7-8 "микросервисов", которые запускаются отдельными командами. Язык - Kotlin/Java, БД - MySQL,
брокер - RabbitMQ. Пользователь через сайт с кнопками может взаимодействовать с базой данных, каждое действие посылает в
брокер положительный или отрицательный сигнал. Положительные сигналы уходят в свой собственный канал, а отрицательные -
в канал ошибок. Две последние кнопки открывают микросервисы прослушиваения именных каналов и ошибочного канала.

<!----------------------------------------------------------------------------->

[code_smells_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=code_smells

[code_smells_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[maintainability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=sqale_rating

[maintainability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[security_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=security_rating

[security_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[bugs_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=bugs

[bugs_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[vulnerabilities_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=vulnerabilities

[vulnerabilities_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[duplicated_lines_density_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=duplicated_lines_density

[duplicated_lines_density_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[reliability_rating_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=reliability_rating

[reliability_rating_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[quality_gate_status_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=alert_status

[quality_gate_status_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[technical_debt_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=sqale_index

[technical_debt_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis

[lines_of_code_badge]: https://sonarcloud.io/api/project_badges/measure?project=Hummel009_Requirements-Development-and-Analysis&metric=ncloc

[lines_of_code_link]: https://sonarcloud.io/summary/overall?id=Hummel009_Requirements-Development-and-Analysis
