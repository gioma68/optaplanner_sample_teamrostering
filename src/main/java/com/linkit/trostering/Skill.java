package com.linkit.trostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

@com.thoughtworks.xstream.annotations.XStreamAlias("Ambito")
public class Skill extends AbstractPersistable {

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

    public Skill( long id, java.lang.String name ) {
        super(id);
        this.name = name;
    }

}