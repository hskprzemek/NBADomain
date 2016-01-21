package org.hsk.domain;

/**
 * Created by pjakubowski on 2016-01-18.
 */
public enum Position {

    PG("Point guard"), SG("Shooting guard"), SF("Small forward"),PF("Power forward"),C("Center");

    private String name;

    private Position(String name){
        this.name = name;
    }
}
