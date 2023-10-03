package ru.netology.services;
// import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class RestDaysServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/restdays.csv")
    void countDaysRest(int income, int expenses, int threshold, int expected) {
        RestDaysService service = new RestDaysService();

        // подготавливаем данные:
        // int income = 10_000;
        // int expenses = 3_000;
        // int threshold = 20_000;
        // int expected = 3;

        // вызываем целевой метод:
        int count = service.calculate(income, expenses, threshold);
        System.out.println("В году " + count + " месяц(а,ев) отдыха");
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, count);
    }

    /*   @Test
    void countDaysRest1() {
        RestDaysService service = new RestDaysService();

        // подготавливаем данные:
        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;
        //boolean registered = true;
        int expected = 2;

        // вызываем целевой метод:
        int count = service.calculate(income, expenses, threshold);
        System.out.println("В году " + count + " месяц(а,ев) отдыха");
        // производим проверку (сравниваем ожидаемый и фактический):
        Assertions.assertEquals(expected, count);
    } */

}
