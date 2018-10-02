package com.linkit.team_rostering;

@org.optaplanner.core.api.domain.entity.PlanningEntity
public class ShiftAssignment implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    private com.linkit.team_rostering.Shift shift;
    @org.optaplanner.core.api.domain.variable.PlanningVariable(valueRangeProviderRefs = { "teamRange" })
    private com.linkit.team_rostering.Team team;

    public ShiftAssignment() {
    }

    public com.linkit.team_rostering.Shift getShift() {
        return this.shift;
    }

    public void setShift( com.linkit.team_rostering.Shift shift ) {
        this.shift = shift;
    }

    public com.linkit.team_rostering.Team getTeam() {
        return this.team;
    }

    public void setTeam( com.linkit.team_rostering.Team team ) {
        this.team = team;
    }

    public ShiftAssignment( com.linkit.team_rostering.Shift shift,
                            com.linkit.team_rostering.Team team ) {
        this.shift = shift;
        this.team = team;
    }

}