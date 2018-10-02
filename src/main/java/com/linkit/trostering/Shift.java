package com.linkit.trostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

@com.thoughtworks.xstream.annotations.XStreamAlias("Turno")
public class Shift extends AbstractPersistable{

    static final long serialVersionUID = 1L;

    private com.linkit.trostering.Timeslot timeslot;
    private com.linkit.trostering.Skill requiredSkill;

    public Shift() {
    }

    public com.linkit.trostering.Timeslot getTimeslot() {
        return this.timeslot;
    }

    public void setTimeslot( com.linkit.trostering.Timeslot timeslot ) {
        this.timeslot = timeslot;
    }

    public com.linkit.trostering.Skill getRequiredSkill() {
        return this.requiredSkill;
    }

    public void setRequiredSkill(
            com.linkit.trostering.Skill requiredSkill ) {
        this.requiredSkill = requiredSkill;
    }

    public Shift( com.linkit.trostering.Timeslot timeslot,
                  com.linkit.trostering.Skill requiredSkill ) {
        this.timeslot = timeslot;
        this.requiredSkill = requiredSkill;
    }

}