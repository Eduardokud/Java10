package ru.netology.service;

public class Radio {
    private int currentRadioStation;

    private int amountRadioStations = 9;
    public Radio(int amountRadioStations) {
        this.amountRadioStations = amountRadioStations - 1;
    }


    public int getAmountRadioStations() {
        return amountRadioStations ;
    }

    public int getCurrentRadioStation() {

        return currentRadioStation;
    }

    public void setCurrentRadioStation(int newCurrentRadioStation) {
        if (newCurrentRadioStation < 0) {
            return;
        }
        if (newCurrentRadioStation > amountRadioStations) {
           return;
        }
        currentRadioStation = newCurrentRadioStation;
    }

    public void nextRadioStation() {

        if (amountRadioStations > currentRadioStation) {
            currentRadioStation++;
        } else {
            currentRadioStation = 0;
        }


        setCurrentRadioStation(currentRadioStation);

    }

    public void previousRadioStation() {
        int target = currentRadioStation - 1;

        if (target < 0) {
            target = amountRadioStations;
        }
        setCurrentRadioStation(target);

    }










}
