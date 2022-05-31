package ru.netology.domain.radio;

public class Radio {

    private int currentStation;
    public int soundVolume;


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
    public int NextStation(int newCurrentStation) {
        if (newCurrentStation >= 9) {
            currentStation = 0;
        }
        if (newCurrentStation < 9) {
            currentStation = newCurrentStation + 1;
        }
        return currentStation;
    }

    //Выбор предыдущей станции Prev
    public void PrevStation(int newCurrentStation) {
        if (newCurrentStation <= 0) {
            currentStation = 9;
        }
        if (newCurrentStation > 0) {
            currentStation = newCurrentStation - 1;
        }
    }

    public int getCurrentStation() {
        return currentStation;
    }
}
