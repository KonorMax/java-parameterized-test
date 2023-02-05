package ru.yandex.praktikum;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CheckIsAdultTest {

    private final int age;
    private final boolean result;

    public CheckIsAdultTest(int age, boolean result) {
        this.age = age;
        this.result = result;
    }

    @Parameterized.Parameters// Пометь метод аннотацией для параметров
    public static Object[][] getTextData() {
        return new Object[][]{
                {17, false}, // Заполни массив тестовыми данными и ожидаемым результатом
                {18, true},
                {19, true},
                {21, true},
        };
    }

    @Test
    public void checkIsAdultWhenAgeThenResult() {
        Program program = new Program();
        getTextData();
        boolean isAdult = program.checkIsAdult(age);
        assertEquals("Что-то пошло не так", result, isAdult);
    }
}
