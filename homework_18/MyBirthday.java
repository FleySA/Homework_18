package com.proftelran.org.homework_18;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class MyBirthday {
    public static void main(String[] args) {

        // Задача 1: Создать дату своего рождения, вывести на консоль в формате "6 Января 1979"
        LocalDate myBirthday = LocalDate.of(1979, Month.JANUARY, 6);
        System.out.println("1) " + myBirthday.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));

        // Задача 2: Проверить, является ли дата "6 Января 1979" пятницей
        DayOfWeek dayOfWeek = myBirthday.getDayOfWeek();
        System.out.println("2) День недели: " + dayOfWeek);
        System.out.println("   Это пятница? " + (dayOfWeek == DayOfWeek.FRIDAY));

        // Задача 3: Вычесть 10 лет из созданной даты, вывести на консоль
        LocalDate tenYearsAgo = myBirthday.minusYears(10);
        System.out.println("3) " + tenYearsAgo.format(DateTimeFormatter.ofPattern("d MMMM yyyy")));

        // Задача 4: Получить объект Instant из "2022-12-19T06:55:30.00Z", вывести на консоль
        Instant instant = Instant.parse("2022-12-19T06:55:30.00Z");
        System.out.println("4) " + instant);

        // Задача 5: Получить ZonedDateTime из "Pacific/Midway", вывести на консоль
        ZoneId zoneId = ZoneId.of("Pacific/Midway");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        System.out.println("5) " + zonedDateTime);
    }
}
