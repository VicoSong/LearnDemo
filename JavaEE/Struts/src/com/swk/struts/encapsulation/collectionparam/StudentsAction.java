package com.swk.struts.encapsulation.collectionparam;

import java.util.ArrayList;
import java.util.Collection;

import com.swk.struts.encapsulationparam.actionmodeldepart.entry.Student;

public class StudentsAction {
    private Collection<Student> students =new ArrayList<Student>();

    public Collection<Student> getStudents() {
        return students;
    }

    public void setStudents(Collection<Student> students) {
        this.students = students;
    }
    
    public String save()
    {
	for(Student s: students) {
	    System.out.println(s);
	}
	
	return "none";
    }
}
