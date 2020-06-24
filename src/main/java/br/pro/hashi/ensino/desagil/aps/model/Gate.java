package br.pro.hashi.ensino.desagil.aps.model;

public abstract class Gate implements Emitter, Receiver {
    private final String name;

    protected Gate(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

// --Commented out by Inspection START (6/24/2020 11:04 AM):
//    public int getInputSize() {
//        return inputSize;
//    }
// --Commented out by Inspection STOP (6/24/2020 11:04 AM)
}
