package ru.netology.radio;

public class Radio {

    protected int currentRadio;
    protected int currentVolume;

    public int getCurrentRadio() {

        return currentRadio;
    }

    public int getCurrentVolume() {

        return currentVolume;
    }

    public void nextStation() {
        if (currentRadio == 9) {
            currentRadio = 0;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevStation() {
        if (currentRadio == 0) {
            currentRadio = 9;
        } else {
            currentRadio = currentRadio - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= 10) {
            currentVolume = 10;
        } else {
            currentVolume = currentVolume + 1;
        }
    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
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

}


