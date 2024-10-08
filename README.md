# University Course Enrollment System

## Описание

Это упрощенная система для вуза, позволяющая студентам записываться на курсы на следующий семестр. Система обеспечивает контроль за количеством мест на курсах, а также обрабатывает параллельные попытки записи. Кроме того, система учитывает временные окна доступности для записи студентов.

## Технологии

- Java
- Spring Boot
- PostgreSQL
- Liqubase
- Maven
- REST API
- JUnit

## Функциональность

- Просмотр доступных курсов с указанием количества свободных мест.
- Запись на курс с проверкой наличия мест и времени доступа.
- Обработка ошибок, связанных с переполнением мест, попытками записи вне доступного "окна", записи одного студента несколько раз.
