package com.linkit.team_rostering;

import org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore;

@org.optaplanner.core.api.domain.solution.PlanningSolution(autoDiscoverMemberType = org.optaplanner.core.api.domain.autodiscover.AutoDiscoverMemberType.FIELD)
@javax.xml.bind.annotation.XmlRootElement
@javax.xml.bind.annotation.XmlAccessorType(javax.xml.bind.annotation.XmlAccessType.FIELD)
public class TeamRoster implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.optaplanner.core.api.domain.valuerange.ValueRangeProvider(id = "teamRange")
	private java.util.List<com.linkit.team_rostering.Team> teamList;
	private java.util.List<com.linkit.team_rostering.Employee> employeeList;
	private java.util.List<com.linkit.team_rostering.Shift> shiftList;
	private java.util.List<com.linkit.team_rostering.Skill> skillList;
	private java.util.List<com.linkit.team_rostering.Timeslot> timeslotList;
	private java.util.List<com.linkit.team_rostering.DayOffRequest> dayOffRequestList;
	private java.util.List<com.linkit.team_rostering.ShiftAssignment> shiftAssignmentList;

	@javax.annotation.Generated(value = {"org.optaplanner.workbench.screens.domaineditor.client.widgets.planner.PlannerDataObjectEditor"})
	@javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter(value = org.optaplanner.persistence.jaxb.api.score.buildin.hardsoft.HardSoftScoreJaxbXmlAdapter.class)
	@org.kie.api.definition.type.Label(value = "Generated Planner score field")
	@org.optaplanner.core.api.domain.solution.PlanningScore
	private org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score;

	public TeamRoster() {
	}

	public java.util.List<com.linkit.team_rostering.Team> getTeamList() {
		return this.teamList;
	}

	public void setTeamList(
			java.util.List<com.linkit.team_rostering.Team> teamList) {
		this.teamList = teamList;
	}

	public java.util.List<com.linkit.team_rostering.Employee> getEmployeeList() {
		return this.employeeList;
	}

	public void setEmployeeList(
			java.util.List<com.linkit.team_rostering.Employee> employeeList) {
		this.employeeList = employeeList;
	}

	public java.util.List<com.linkit.team_rostering.Shift> getShiftList() {
		return this.shiftList;
	}

	public void setShiftList(
			java.util.List<com.linkit.team_rostering.Shift> shiftList) {
		this.shiftList = shiftList;
	}

	public java.util.List<com.linkit.team_rostering.Skill> getSkillList() {
		return this.skillList;
	}

	public void setSkillList(
			java.util.List<com.linkit.team_rostering.Skill> skillList) {
		this.skillList = skillList;
	}

	public java.util.List<com.linkit.team_rostering.Timeslot> getTimeslotList() {
		return this.timeslotList;
	}

	public void setTimeslotList(
			java.util.List<com.linkit.team_rostering.Timeslot> timeslotList) {
		this.timeslotList = timeslotList;
	}

	public java.util.List<com.linkit.team_rostering.ShiftAssignment> getShiftAssignmentList() {
		return this.shiftAssignmentList;
	}

	public void setShiftAssignmentList(
			java.util.List<com.linkit.team_rostering.ShiftAssignment> shiftAssignmentList) {
		this.shiftAssignmentList = shiftAssignmentList;
	}

	public java.util.List<com.linkit.team_rostering.DayOffRequest> getDayOffRequestList() {
		return this.dayOffRequestList;
	}

	public void setDayOffRequestList(
			java.util.List<com.linkit.team_rostering.DayOffRequest> dayOffRequestList) {
		this.dayOffRequestList = dayOffRequestList;
	}

	public org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore getScore() {
		return this.score;
	}

	public void setScore(
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
		this.score = score;
	}

	public TeamRoster(
			java.util.List<com.linkit.team_rostering.Team> teamList,
			java.util.List<com.linkit.team_rostering.Employee> employeeList,
			java.util.List<com.linkit.team_rostering.Shift> shiftList,
			java.util.List<com.linkit.team_rostering.Skill> skillList,
			java.util.List<com.linkit.team_rostering.Timeslot> timeslotList,
			java.util.List<com.linkit.team_rostering.DayOffRequest> dayOffRequestList,
			java.util.List<com.linkit.team_rostering.ShiftAssignment> shiftAssignmentList,
			org.optaplanner.core.api.score.buildin.hardsoft.HardSoftScore score) {
		this.teamList = teamList;
		this.employeeList = employeeList;
		this.shiftList = shiftList;
		this.skillList = skillList;
		this.timeslotList = timeslotList;
		this.dayOffRequestList = dayOffRequestList;
		this.shiftAssignmentList = shiftAssignmentList;
		this.score = score;
	}

}