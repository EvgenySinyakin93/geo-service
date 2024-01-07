package ru.netology.geo;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import ru.netology.entity.Location;

import static org.junit.jupiter.api.Assertions.*;

class GeoServiceImplTest {
    @Test
    void geoTest(){
        GeoService geoService = new GeoServiceImpl();
        Location actual = geoService.byIp("127.0.0.1");
        Location expected = new Location(null, null, null, 0);
        Assertions.assertEquals(actual, expected);
    }
}