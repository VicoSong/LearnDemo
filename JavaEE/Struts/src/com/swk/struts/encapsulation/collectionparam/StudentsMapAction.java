package com.swk.struts.encapsulation.collectionparam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sun.org.apache.bcel.internal.generic.NEW;
import com.swk.struts.encapsulationparam.actionmodeldepart.entry.Student;

public class StudentsMapAction {
    private Map<String, Student> studentsMap = new HashMap<String, Student>();

  
    
    public Map<String, Student> getStudentsMap() {
        return studentsMap;
    }



    public void setStudentsMap(Map<String, Student> studentsMap) {
        this.studentsMap = studentsMap;
    }



    public String save()
    {

	for (Map.Entry<String, Student> student : studentsMap.entrySet() ) {
	    System.out.println(student.getKey()+"::"+student.getValue());
	}
	
	
	return "none";
    }
}
