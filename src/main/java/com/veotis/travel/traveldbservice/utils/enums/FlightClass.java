package com.veotis.travel.traveldbservice.utils.enums;

import java.io.Serializable;

public enum FlightClass implements Serializable {

    A("A - First Class Discounted"),
    B("B - Economy/Coach"),
    C("C - Business Class"),
    D("D - Business Class Discounted"),
    E("E - Shuttle Service or Economy/Coach Discounted"),
    F("F - First Class"),
    G("G - Conditional Reservation"),
    H("H - Economy/Coach Discounted"),
    J("J - Business Class Premium"),
    K("K - Economy/Coach Discounted"),
    L("L - Economy/Coach Discounted"),
    M("M - Economy/Coach Discounted"),
    N("N - Economy/Coach Discounted"),
    P("P - First Class Premium"),
    Q("Q - Economy/Coach Discounted"),
    R("R - First Class Suite or Supersonic (discontinued)"),
    S("S - Economy/Coach"),
    T("T - Economy/Coach Discounted"),
    U("U - Shuttle Service (no reservation needed/seat guaranteed)"),
    V("V - Economy/Coach Discounted"),
    W("W - Economy/Coach Discounted"),
    Y("Y - Economy/Coach"),
    Z("Z - Business Class Discounted");

    private final String value;

    FlightClass(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }
}
