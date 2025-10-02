package jaf.praktikum.oop.fuhrpark;

import java.util.ArrayList;

public class Fuhrpark {
    String name;
    Auto[] autos = new Auto[0];
    Auto[] reserviert = new Auto[0];

    public Fuhrpark(String name) {
        this.name = name;
    }

    public void hinzufuegenAuto(Auto auto) {
        autos = addToList(auto, autos);
    }

    public void hinzufuegenAuto(Auto[] autos) {
        for (Auto auto : autos) {
            hinzufuegenAuto(auto);
        }
    }

    public Auto reservierenAuto(AutoTyp autoTyp) {
        for (Auto auto : autos) {
            if (auto.getAutoTyp() == autoTyp) {
                if (!isReserviert(auto)) {
                    reserviert = addToList(auto, reserviert);
                    return auto;
                }
            }
        }
        return null;
    }

    @SuppressWarnings("all")
    public boolean zurueckgebenAuto(Auto auto) {
        var index = indexOf(auto, reserviert);
        if (index == -1) {
            return false;
        }
        reserviert[index] = null;
        return true;
    }

    private boolean isReserviert(Auto auto) {
        for (Auto reserviert : reserviert) {
            if (auto.equals(reserviert)) {
                return true;
            }
        }
        return false;
    }

    private int indexOf(Auto auto, Auto[] list) {
        for (int i = 0; i < list.length; i++) {
            if (auto == list[i]) {
                return i;
            }
        }
        return -1;
    }

    private Auto[] addToList(Auto auto, Auto[] list) {
        // Check or an empty slot
        for (int i = 0; i < list.length; i++) {
            if (list[i] == null) {
                list[i] = auto;
                return list;
            }
        }
        // Extend list
        Auto[] newList = new Auto[list.length + 1];
        System.arraycopy(list, 0, newList, 0, list.length);
        newList[list.length] = auto;
        return newList;
    }
}
