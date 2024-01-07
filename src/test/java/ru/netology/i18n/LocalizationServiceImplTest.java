package ru.netology.i18n;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.entity.Country;

import static org.junit.jupiter.api.Assertions.*;

class LocalizationServiceImplTest {
    @Test
    void localeTest() {
        LocalizationService localizationService = new LocalizationServiceImpl();
        String actual = "Добро пожаловать";
        String expected = localizationService.locale(Country.RUSSIA);

        Assertions.assertEquals(expected, actual);
    }
}