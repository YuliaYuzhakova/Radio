package ru.netology.domain.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    //Возможность выставлять номер радиостанции через прямое указание её номера, но в рамках 0 - 9
    //Проверка значений 10, 5, -1
    @Test
    void choiceRadioStation() {
        Radio station = new Radio();

        station.setCurrentStation(5);

        int actual = station.getCurrentStation();
        int expected = 5;

        assertEquals(actual, expected);
    }

    @Test
    void choiceRadioStationMax() {
        Radio station = new Radio();

        station.setCurrentStation(10);

        int actual = station.getCurrentStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void choiceRadioStationMin() {
        Radio station = new Radio();

        station.setCurrentStation(-1);

        int actual = station.getCurrentStation();
        int expected = 0;

        assertEquals(actual, expected);
    }

    //Выбор следующей станции Next, проверка граничных значений 10, 9, 8
    @Test
    void choiceNextStation1() {
        Radio station = new Radio();
        station.NextStation(10);
        int actual = station.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choiceNextStation2() {
        Radio station = new Radio();
        station.NextStation(8);
        int actual = station.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choiceNextStation3() {
        Radio station = new Radio();
        station.NextStation(9);
        int actual = station.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    //Выбор предыдущей станции Prev, , проверка граничных значений 2, 0, -1
    @Test
    void choicePrevStation1() {
        Radio station = new Radio();
        station.PrevStation(2);
        int actual = station.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choicePrevStation2() {
        Radio station = new Radio();
        station.PrevStation(0);
        int actual = station.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choicePrevStation3() {
        Radio station = new Radio();
        station.PrevStation(-1);
        int actual = station.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }
}