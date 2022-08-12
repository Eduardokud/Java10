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
        Volume vol = new Volume();
        vol.setCurrentVolume(100);

        vol.nextVolume();
        int expected = 100;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextVolume() {
        Volume vol = new Volume();
        vol.setCurrentVolume(0);

        vol.nextVolume();
        int expected = 1;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPreviousVolumeUnderLimit() {
        Volume vol = new Volume();
        vol.setCurrentVolume(0);

        vol.previousVolume();
        int expected = 0;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPreviousVolume() {
        Volume vol = new Volume();
        vol.setCurrentVolume(100);

        vol.previousVolume();
        int expected = 99;
        int actual = vol.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeUnderLimit() {
        Volume vol = new Volume();
        vol.setCurrentVolume(-1);
        int expexted = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetVolumeMoreLimit() {
        Volume vol = new Volume();
        vol.setCurrentVolume(101);
        int expexted = 0;
        int actual = vol.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }


}
