package ru.netology.domain.radio;

public class Radio {

    private int currentStation;
    private int soundVolume;


    //Возможность выставлять номер радиостанции через прямое указание её номера, но в рамках 0 - 9
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > 9) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    //Выбор следующей станции Next
    public int nextStation(int newCurrentStation) {
        if (newCurrentStation >= 9) {
            currentStation = 0;
        }
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        return currentStation;
    }

    //Выбор предыдущей станции Prev
    public int prevStation(int newCurrentStation) {
        if (newCurrentStation <= 0) {
            currentStation = 9;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
        return currentStation;
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //Выбор громкости звука в диапазоне от 0 до 10
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            return;
        }
        if (newSoundVolume > 10) {
            return;
        }
        this.soundVolume = newSoundVolume;
    }


    //Увеличение громкости звука +
    public int increaseSoundVolume(int newSoundVolume) {
        if (newSoundVolume >= 10) {
            soundVolume = 10;
        }
        if (newSoundVolume < 10) {
            soundVolume = newSoundVolume + 1;
        }
        return soundVolume;
    }

    //Уменьшение громкости звука -
    public int decreaseSoundVolume(int newSoundVolume) {
        if (newSoundVolume <= 0) {
            soundVolume = 0;
        }
        if (newSoundVolume > 0) {
            soundVolume = newSoundVolume - 1;
        }
        return soundVolume;
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}
