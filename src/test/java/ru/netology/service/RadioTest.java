package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RadioTest {
    @Test
    public void shouldSetRadioStation() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(5);
        int expexted = 5;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetRadioStationUnderLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(-1);
        int expexted = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetRadioStationMoreLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(10);
        int expexted = 0;
        int actual = rad.getCurrentRadioStation();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void sholdNextRadioStationMoreLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(9);

        rad.nextRadioStation();
        int expected = 0;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextRadioStation() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(0);

        rad.nextRadioStation();
        int expected = 1;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousRadioStationUnderLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(0);

        rad.previousRadioStation();
        int expected = 9;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldPreviousRadioStation() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentRadioStation(9);

        rad.previousRadioStation();
        int expected = 8;
        int actual = rad.getCurrentRadioStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNextVolumeMoreLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentVolume(10);

        rad.nextVolume();
        int expected = 10;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextVolume() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentVolume(0);

        rad.nextVolume();
        int expected = 1;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPreviousVolumeUnderLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentVolume(0);

        rad.previousVolume();
        int expected = 0;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldPreviousVolume() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentVolume(10);

        rad.previousVolume();
        int expected = 9;
        int actual = rad.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldSetVolumeUnderLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentVolume(-1);
        int expexted = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }

    @Test
    public void shouldSetVolumeMoreLimit() {
        ru.netology.service.Radio rad = new ru.netology.service.Radio();
        rad.setCurrentVolume(11);
        int expexted = 0;
        int actual = rad.getCurrentVolume();

        Assertions.assertEquals(expexted, actual);
    }


}
