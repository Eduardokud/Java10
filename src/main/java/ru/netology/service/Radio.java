package ru.netology.service;

public class Radio {
    private int currentRadioStation;

    private int amountRadioStations;
    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;

    public Radio(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations;
    }

    public Radio() {
        this.amountRadioStations = 10;
    }


    public int getAmountRadioStations() {
        return amountRadioStations;
    }


    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > amountRadioStations - 1) {
            return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {

        if (amountRadioStations - 1 > currentRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }


        setCurrentRadioStation(currentRadioStation);

    }

    public void previousRadioStation() {
        int target = currentRadioStation - 1;

        if (target < 0) {
            target = amountRadioStations - 1;
        }
        setCurrentRadioStation(target);

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void nextVolume() {
        int target = currentVolume + 1;
        if (target > maxVolume) {
            target = maxVolume;
        }

        setCurrentVolume(target);
    }

    public void previousVolume() {
        int target = currentVolume - 1;
        if (target < minVolume) {
            target = minVolume;
        }
        setCurrentVolume(target);
    }


}
