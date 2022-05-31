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
        station.nextStation(10);
        int actual = station.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choiceNextStation2() {
        Radio station = new Radio();
        station.nextStation(8);
        int actual = station.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choiceNextStation3() {
        Radio station = new Radio();
        station.nextStation(9);
        int actual = station.getCurrentStation();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    //Выбор предыдущей станции Prev, , проверка граничных значений 2, 0, -1
    @Test
    void choicePrevStation1() {
        Radio station = new Radio();
        station.prevStation(2);
        int actual = station.getCurrentStation();
        int expected = 1;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choicePrevStation2() {
        Radio station = new Radio();
        station.prevStation(0);
        int actual = station.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void choicePrevStation3() {
        Radio station = new Radio();
        station.prevStation(-1);
        int actual = station.getCurrentStation();
        int expected = 9;

        Assertions.assertEquals(actual, expected);
    }

    //Выбор громкости звука в диапазоне от 0 до 10
    //Проверка значений 11, 10, 9, -1
    @Test
    void choiceVolumeSound1() {
        Radio station = new Radio();
        station.setSoundVolume(9);
        int actual = station.getSoundVolume();
        int expected = 9;

        assertEquals(actual, expected);
    }

    @Test
    void choiceVolumeSound2() {
        Radio station = new Radio();
        station.setSoundVolume(10);
        int actual = station.getSoundVolume();
        int expected = 10;

        assertEquals(actual, expected);
    }

    @Test
    void choiceVolumeSound3() {
        Radio station = new Radio();
        station.setSoundVolume(11);
        int actual = station.getSoundVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    @Test
    void choiceVolumeSound4() {
        Radio station = new Radio();
        station.setSoundVolume(-1);
        int actual = station.getSoundVolume();
        int expected = 0;

        assertEquals(actual, expected);
    }

    //Увеличение громкости звука +, проверка значений 6, 10, 11
    @Test
    void increaseVolumeSound1() {
        Radio station = new Radio();
        station.increaseSoundVolume(6);
        int actual = station.getSoundVolume();
        int expected = 7;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeSound2() {
        Radio station = new Radio();
        station.increaseSoundVolume(10);
        int actual = station.getSoundVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void increaseVolumeSound3() {
        Radio station = new Radio();
        station.increaseSoundVolume(11);
        int actual = station.getSoundVolume();
        int expected = 10;

        Assertions.assertEquals(actual, expected);
    }

    //Уменьшение громкости звука -, проверка значений -1, 0, 3, 10
    @Test
    void decreaseVolumeSound1() {
        Radio station = new Radio();
        station.decreaseSoundVolume(-1);
        int actual = station.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeSound2() {
        Radio station = new Radio();
        station.decreaseSoundVolume(0);
        int actual = station.getSoundVolume();
        int expected = 0;

        Assertions.assertEquals(actual, expected);
    }

    @Test
    void decreaseVolumeSound3() {
        Radio station = new Radio();
        station.decreaseSoundVolume(3);
        int actual = station.getSoundVolume();
        int expected = 2;

        Assertions.assertEquals(actual, expected);
    }
}
