package com.swk.struts.encapsulationparam.actionmodeldepart.action;


import com.swk.struts.encapsulationparam.actionmodeldepart.entry.Student;

public class StudentAction {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }
    
    public String save()
    {
	System.out.println(student);
	
	return "none";
    }
}
