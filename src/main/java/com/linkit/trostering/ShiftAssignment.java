package com.linkit.trostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

@org.optaplanner.core.api.domain.entity.PlanningEntity
@com.thoughtworks.xstream.annotations.XStreamAlias("AssegnazioneTurno")
public class ShiftAssignment extends AbstractPersistable {

    static final long serialVersionUID = 1L;

    private com.linkit.trostering.Shift shift;
    @org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = { "teamRange" })
    private com.linkit.trostering.Team team;

    public ShiftAssignment() {
    }

    public com.linkit.trostering.Shift getShift() {
        return this.shift;
    }

    public void setShift( com.linkit.trostering.Shift shift ) {
        this.shift = shift;
    }

    public com.linkit.trostering.Team getTeam() {
        return this.team;
    }

    public void setTeam( com.linkit.trostering.Team team ) {
        this.team = team;
    }

    public ShiftAssignment( com.linkit.trostering.Shift shift,
                            com.linkit.trostering.Team team ) {
        this.shift = shift;
        this.team = team;
    }

}