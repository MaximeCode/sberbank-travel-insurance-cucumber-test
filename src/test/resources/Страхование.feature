#language: ru
Функциональность: Страхование

  Сценарий: Страхование путешественников
    Когда на главной странице в меню выбираем раздел "Страхование"
    Когда на открывшемся на главной странице меню выбираем "СберСтрахование"
    Когда на странице "СберСтрахование" в блоке "Страхование путешественников" нажимаем "Подробнее"
    Тогда на странице "Страхование путешественников" проверяем наличие заголовка "Страхование путешественников"
    Когда на странице "Страхование путешественников" нажимаем "Оформить Онлайн"
    Когда на вкладке "Выбор полиса" выбираем сумму страховой защиты "Минимальная"
    Когда на вкладке "Выбор полиса" нажимаем "Оформить"
    Когда на вкладке "Оформление" заполняем поля данными:
      | фамилия застрахованного           | Иванов     |
      | имя  застрахованного              | Иван       |
      | дата рождения застрахованного     | 01.01.1960 |
      | фамилия  страхователя             | Петров     |
      | имя      страхователя             | Пётр       |
      | отчество  страхователя            | Петрович   |
      | дата рождения страхователя        | 01.01.2000 |
      | серия паспорта страхователя       | 1010       |
      | номер паспорта страхователя       | 101010     |
      | дата выдачи паспорта страхователя | 01.01.2020 |
      | кем выдан паспорт страхователя    | МВД России |
    Тогда на вкладке "Оформление" проверяем правильность заполнения полей:
      | фамилия застрахованного           | Иванов     |
      | имя  застрахованного              | Иван       |
      | дата рождения застрахованного     | 01.01.1960 |
      | фамилия  страхователя             | Петров     |
      | имя      страхователя             | Пётр       |
      | отчество  страхователя            | Петрович   |
      | дата рождения страхователя        | 01.01.2000 |
      | серия паспорта страхователя       | 1010       |
      | номер паспорта страхователя       | 101010     |
      | дата выдачи паспорта страхователя | 01.01.2020 |
      | кем выдан паспорт страхователя    | МВД России |
    Когда на вкладке "Оформление" нажимаем "Продолжить"
    Тогда на вкладке "Оформление" проверяем, что появилось сообщение "При заполнении данных произошла ошибка"
