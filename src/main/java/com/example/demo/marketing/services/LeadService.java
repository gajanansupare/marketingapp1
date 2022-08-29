package com.example.demo.marketing.services;

import java.util.List;

import com.example.demo.marketing.entites.Lead;

//import from util package
public interface LeadService {
	public void saveLead(Lead lead);
    public List<Lead> listLeads();
	public void deleteLeadById(long id);
	public Lead getOneLead(long id);

}
