package com.linkit.trostering;
import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.linkit.common.AbstractPersistable;

@com.thoughtworks.xstream.annotations.XStreamAlias("Squadra")
public class Team extends AbstractPersistable {

    static final long serialVersionUID = 1L;

    private java.lang.String name;
    private java.util.List<com.linkit.trostering.Skill> skillList;
    private java.util.List<com.linkit.trostering.Employee> employeeList;

    public java.lang.String getName() {
        return name;
    }

    public void setName( java.lang.String name ) {
        this.name = name;
    }
    
    public Team() {
    }

    public Team( java.lang.String name,
                     java.util.List<com.linkit.trostering.Skill> skillList,
                     java.util.List<com.linkit.trostering.Employee> employeeList) {
        this.name = name;
        this.skillList = skillList;
        this.employeeList = employeeList;
    }
    
    public java.util.List<com.linkit.trostering.Employee> getEmployeeList() {
        return this.employeeList;
    }
    
    public void setEmployeeList(
            java.util.List<com.linkit.trostering.Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public java.util.List<com.linkit.trostering.Skill> getSkillList() {
        return this.skillList;
    }

    public void setSkillList(java.util.List<com.linkit.trostering.Skill> skillList){
        this.skillList = skillList;
    }


}