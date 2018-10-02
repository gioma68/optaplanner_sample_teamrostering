package com.linkit.team_rostering;

public class Employee implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private java.lang.String name;

    public Employee() {
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName( java.lang.String name ) {
        this.name = name;
    }



    public Employee( java.lang.String name) {
        this.name = name;
    }


}