package com.cg.uas.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.cg.uas.entities.Applicant;
import com.cg.uas.entities.LogIn;
import com.cg.uas.exceptions.ApplicantNotFoundException;
import com.cg.uas.services.MacService;

@RestController
public class UniversityAdmissionSystemController {
	@Autowired
	private MacService macService;
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
            value = "/users",
            produces = "application/json",
            headers = "Accept=application/json"
    )
    @ResponseBody
	public List<LogIn> getAllusers(){
		return macService.getAllUsers();
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
    @GetMapping(
            value = "/applicant/{id}",
            produces = "application/json",
            headers = "Accept=application/json"
    )
	@ResponseBody
	public List<Applicant> getApplicantByCourseId(@PathVariable("id") Integer scheduledProgramId ){
		return macService.getApplicantsByCourseId(scheduledProgramId);
	}
	
	@CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(
            value = "/update/{id}",
            headers = "Accept=application/json",
            produces = "application/json"
    )
    @ResponseBody
    public Applicant updateStatus(@PathVariable("id") Integer applicantId, @RequestBody Applicant applicant) throws ApplicantNotFoundException {
		return macService.updateStatus(applicantId, applicant);
	}
	@CrossOrigin(origins = "http://localhost:4200")
    @PutMapping(
            value = "/schedule/{id}",
            headers = "Accept=application/json",
            produces = "application/json"
    )
    @ResponseBody
    public Applicant scheduleInterview(@PathVariable("id") Integer applicantId, @RequestBody Applicant applicant) throws ApplicantNotFoundException {
		return macService.sheduleInterview(applicantId, applicant);
	}
	
}
