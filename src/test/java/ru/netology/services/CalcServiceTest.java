package ru.netology.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalcServiceTest {

    @ParameterizedTest
    @CsvFileSource(files="src/test/resources/CalcService.csv")
    void calcServiceTest (int expected, int income, int expenses, int treshold) {
        CalcService service = new CalcService();

        int actual = service.calculate(income, expenses, treshold);

        Assertions.assertEquals(actual, expected);

    }

}

