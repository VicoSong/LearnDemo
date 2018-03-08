package com.swk.struts.encapsulationparam.modeldriven;

import com.opensymphony.xwork2.ModelDriven;
import com.swk.struts.encapsulationparam.actionmodeldepart.entry.Customer;

public class CustomerAction implements ModelDriven<Customer>{
    private Customer customer=new Customer();
    
    
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String save()
    {
	System.out.println(customer.toString());
	
	return "none";
    }
    
    @Override
    public Customer getModel() {
	
	return customer;
    }
    
}
