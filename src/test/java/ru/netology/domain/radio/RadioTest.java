package ru.netology.domain.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {

    Radio station = new Radio();

    //Выставляем желаемое количество станций
    @Test
    void choiceCountOfRadioStation() {
        Radio station = new Radio(30);
        station.setCurrentStation(20);
        assertEquals(20, station.getCurrentStation());
    }
    @Test
    void choiceCountOfRadioStation2() {
        Radio station = new Radio(30);
        station.setCurrentStation(30);
        assertEquals(0, station.getCurrentStation());
    }

    //Возможность выставлять номер радиостанции через прямое указание её номера, но в рамках 0 - 9
    @Test
    void choiceRadioStation() {
        station.setCurrentStation(5);
        assertEquals(5, station.getCurrentStation());
    }

    @Test
    void choiceRadioStationMax() {
        station.setCurrentStation(10);
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    void choiceRadioStationMin() {
        station.setCurrentStation(-1);
        assertEquals(0, station.getCurrentStation());
    }

    //Выбор следующей станции Next
    @Test
    void choiceNextStation1() {
        station.setCurrentStation(7);
        station.nextStation();
        assertEquals(8, station.getCurrentStation());
    }

    @Test
    void choiceNextStation2() {
        station.setCurrentStation(9);
        station.nextStation();
        assertEquals(0, station.getCurrentStation());
    }

    @Test
    void choiceNextStation3() {
        station.setCurrentStation(0);
        station.nextStation();
        assertEquals(1, station.getCurrentStation());
    }

    //Выбор предыдущей станции Prev
    @Test
    void choicePrevStation1() {
        station.setCurrentStation(2);
        station.prevStation();
        assertEquals(1, station.getCurrentStation());
    }

    @Test
    void choicePrevStation2() {
        station.setCurrentStation(0);
        station.prevStation();
        assertEquals(9, station.getCurrentStation());
    }

    @Test
    void choicePrevStation3() {
        station.setCurrentStation(-1);
        station.prevStation();
        assertEquals(9, station.getCurrentStation());
    }

    //Выбор громкости звука в диапазоне от 0 до 100
    @Test
    void choiceVolumeSound1() {
        station.setSoundVolume(100);
        assertEquals(100, station.getSoundVolume());
    }

    @Test
    void choiceVolumeSound2() {
        station.setSoundVolume(99);
        assertEquals(99, station.getSoundVolume());
    }

    @Test
    void choiceVolumeSound3() {
        station.setSoundVolume(101);
        assertEquals(100, station.getSoundVolume());
    }

    @Test
    void choiceVolumeSound4() {
        station.setSoundVolume(-1);
        assertEquals(0, station.getSoundVolume());
    }

    //Увеличение громкости звука
    @Test
    void increaseVolumeSound1() {
        station.setSoundVolume(0);
        station.increaseSoundVolume();
        assertEquals(1, station.getSoundVolume());
    }

    @Test
    void increaseVolumeSound2() {
        station.setSoundVolume(100);
        station.increaseSoundVolume();
        assertEquals(100, station.getSoundVolume());
    }

    @Test
    void increaseVolumeSound3() {
        station.setSoundVolume(99);
        station.increaseSoundVolume();
        assertEquals(100, station.getSoundVolume());
    }

    //Уменьшение громкости звука
    @Test
    void decreaseVolumeSound1() {
        station.setSoundVolume(-1);
        station.decreaseSoundVolume();
        assertEquals(0, station.getSoundVolume());
    }

    @Test
    void decreaseVolumeSound2() {
        station.setSoundVolume(0);
        station.decreaseSoundVolume();
        assertEquals(0, station.getSoundVolume());
    }

    @Test
    void decreaseVolumeSound3() {
        station.setSoundVolume(2);
        station.decreaseSoundVolume();
        assertEquals(1, station.getSoundVolume());
    }
}
