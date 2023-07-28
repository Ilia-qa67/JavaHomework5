package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalcServiceTest {

    @Test
    void calcServiceTest1 () {
        CalcService service = new CalcService();
        int income = 10000;
        int expenses = 3000;
        int treshold = 20000;
        int expected = 3;

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(actual, expected);

    }

    @Test
    void calcServiceTest2 () {
        CalcService service = new CalcService();
        int income = 100_000;
        int expenses = 60_000;
        int treshold = 150_000;
        int expected = 2;

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(actual, expected);

    }

}
