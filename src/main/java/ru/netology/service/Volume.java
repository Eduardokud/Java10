package ru.netology.service;

public class Volume {

    private int currentVolume;
    private int minVolume = 0;
    private int maxVolume = 100;


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
