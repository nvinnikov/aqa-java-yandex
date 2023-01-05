# Финальный проект 7 спринта

Тебе предстоит протестировать API учебного сервиса Яндекс.Самокат. Его документация: qa-scooter.praktikum-services.ru/docs/.
Перед тем как писать тесты, протестируй API вручную в Postman. Это поможет разобраться, как работают запросы.

### Подготовка
Перед тем как приступить к заданиям:
1. Создай Maven-проект.
2. Назови проект Sprint_7.
3. Подключи JUnit 4, RestAssured, Allure.

### Протестируй ручки
Проверь, что они корректно работают и выдают нужные ошибки.
1. #### Создание курьера
    Проверь:
* курьера можно создать;
* нельзя создать двух одинаковых курьеров;
* чтобы создать курьера, нужно передать в ручку все обязательные поля;
* запрос возвращает правильный код ответа;
* успешный запрос возвращает ok: true;
* если одного из полей нет, запрос возвращает ошибку;
* если создать пользователя с логином, который уже есть, возвращается ошибка.

2. #### Логин курьера
   Проверь:
* курьер может авторизоваться;
* для авторизации нужно передать все обязательные поля;
* система вернёт ошибку, если неправильно указать логин или пароль;
* если какого-то поля нет, запрос возвращает ошибку;
* если авторизоваться под несуществующим пользователем, запрос возвращает ошибку;
* успешный запрос возвращает id.

3. #### Создание заказа
    Проверь, что когда создаёшь заказ:
* можно указать один из цветов — BLACK или GREY;
* можно указать оба цвета;
* можно совсем не указывать цвет;
* тело ответа содержит track.

    Чтобы протестировать создание заказа, нужно использовать параметризацию.

4. #### Список заказов
   Проверь, что в тело ответа возвращается список заказов.

5. #### Список заказов
   Сгенерируй его и запушь в репозиторий.
   Обрати внимание: всю папку target коммитить не нужно. Чтобы добавить в коммит только отчёт, можно перейти в папку проекта в консоли и выполнить команды:
   Не забудь: тесты должны быть независимыми. Все данные нужно удалять после того, как тест выполнится. Если для проверки нужен пользователь, создай его перед тестом и удали после. 