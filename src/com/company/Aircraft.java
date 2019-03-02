package com.company;

public abstract class Aircraft implements Movement {
    private Wing leftWing = new Wing(), rightWing = new Wing();

    private class Wing {
    }
}

abstract class PassengerPlane extends Aircraft {

}

abstract class CargoPlane extends Aircraft {

}

abstract class Warplane extends Aircraft {

}