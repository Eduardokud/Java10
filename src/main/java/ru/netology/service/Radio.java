package ru.netology.service;

public class Radio {
    private int currentRadioStation;
    private int currentVolume;

    public int getCurrentRadioStation() {
        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > 9) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {
        int target = currentRadioStation + 1;

        if (target > 9) {
            target = 0;
        }
        setCurrentRadioStation(target);

    }

    public void previousRadioStation() {
        int target = currentRadioStation - 1;

        if (target < 0) {
            target = 9;
        }
        setCurrentRadioStation(target);

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextVolume() {
        int target = currentVolume + 1;
        if (target > 10) {
            target = 10;
        }
        setCurrentVolume(target);
    }

    public void previousVolume() {
        int target = currentVolume - 1;
        if (target < 0) {
            target = 0;
        }
        setCurrentVolume(target);
    }


}
