package com.linkit.trostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

@com.thoughtworks.xstream.annotations.XStreamAlias("Operaio")
public class Employee extends AbstractPersistable{

    private java.lang.String name;

    public Employee() {
    }

    public java.lang.String getName() {
        return this.name;
    }

    public void setName( java.lang.String name ) {
        this.name = name;
    }



    public Employee( long id, java.lang.String name) {
        super(id);
        this.name = name;
    }


}