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
    public void nextStation() {
        if (currentStation >= 9) {
            this.currentStation = 0;
            return;
        } else {
            this.currentStation = currentStation + 1;
            return;
        }
    }

    //Выбор предыдущей станции Prev
    public void prevStation() {
        if (currentStation <= 0) {
            this.currentStation = 9;
            return;
        } else {
            this.currentStation = currentStation - 1;
            return;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }

    //Выбор громкости звука в диапазоне от 0 до 10
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < 0) {
            //this.soundVolume = 0;
            return;
        }
        if (newSoundVolume > 10) {
            this.soundVolume = 10;
            return;
        }
        this.soundVolume = newSoundVolume;
    }


    //Увеличение громкости звука +
    public void increaseSoundVolume() {
        if (soundVolume < 10) {
            this.soundVolume = soundVolume + 1;
        }
    }

    //Уменьшение громкости звука -
    public void decreaseSoundVolume() {
        if (soundVolume > 0) {
            this.soundVolume = soundVolume - 1;
        }
    }

    public int getSoundVolume() {
        return soundVolume;
    }
}
