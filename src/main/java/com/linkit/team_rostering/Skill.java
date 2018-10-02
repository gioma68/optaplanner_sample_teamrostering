package com.linkit.team_rostering;

public class Skill implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String name;

    public Skill() {
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName( java.lang.String name ) {
        this.name = name;
    }

    public Skill( java.lang.String name ) {
        this.name = name;
    }

}