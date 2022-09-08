package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        Radio rad = new Radio(14);
        rad.setCurrentRadioStation(11);
        int expexted = 11;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetRadioStationUnderLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(-1);
        int expexted = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetRadioStationMoreLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(21);
        int expexted = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void sholdNextRadioStationMoreLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(19);

        rad.nextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(0);

        rad.nextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousRadioStationUnderLimit() {
        Radio rad = new Radio(30);
        rad.setCurrentRadioStation(0);

        rad.previousRadioStation();
        int expected = rad.getAmountRadioStations();
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousRadioStation() {
        Radio rad = new Radio(20);
        rad.setCurrentRadioStation(10);

        rad.previousRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeMoreLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentVolume(100);

        rad.nextVolume();
        int expected = 100;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextVolume() {
        Radio rad = new Radio(20);
        rad.setCurrentVolume(0);

        rad.nextVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPreviousVolumeUnderLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentVolume(0);

        rad.previousVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPreviousVolume() {
        Radio rad = new Radio(20);
        rad.setCurrentVolume(100);

        rad.previousVolume();
        int expected = 99;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeUnderLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentVolume(-1);
        int expexted = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetVolumeMoreLimit() {
        Radio rad = new Radio(20);
        rad.setCurrentVolume(101);
        int expexted = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }


}
