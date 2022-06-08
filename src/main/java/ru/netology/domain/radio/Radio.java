package ru.netology.domain.radio;

public class Radio {

    private int currentStation;
    private int countStation = 10;
    private int minStation;

    private int soundVolume;
    private int minSoundVolume;
    private int maxSoundVolume = 100;

    public int getCurrentStation() {
        return currentStation;
    }
    public int getSoundVolume() {
        return soundVolume;
    }
    public Radio() {
    }
    public Radio(int countStation) {
        this.countStation = countStation;
    }

    //Возможность выставлять номер радиостанции через прямое указание её номера, но в рамках 0 - 9
    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < minStation) {
            return;
        }
        if (newCurrentStation > countStation - 1) {
            return;
        }
        this.currentStation = newCurrentStation;
    }

    //Выбор следующей станции Next
    public void nextStation() {
        if (currentStation >= countStation - 1) {
            this.currentStation = minStation;
            return;
        } else {
            this.currentStation = currentStation + 1;
            return;
        }
    }

    //Выбор предыдущей станции Prev
    public void prevStation() {
        if (currentStation <= minStation) {
            this.currentStation = countStation - 1;
            return;
        } else {
            this.currentStation = currentStation - 1;
            return;
        }
    }


    //Выбор громкости звука в диапазоне от 0 до 10
    public void setSoundVolume(int newSoundVolume) {
        if (newSoundVolume < minSoundVolume) {
            return;
        }
        if (newSoundVolume > maxSoundVolume) {
            this.soundVolume = maxSoundVolume;
            return;
        }
        this.soundVolume = newSoundVolume;
    }


    //Увеличение громкости звука +
    public void increaseSoundVolume() {
        if (soundVolume < maxSoundVolume) {
            this.soundVolume = soundVolume + 1;
        }
    }

    //Уменьшение громкости звука -
    public void decreaseSoundVolume() {
        if (soundVolume > minSoundVolume) {
            this.soundVolume = soundVolume - 1;
        }
    }
}
