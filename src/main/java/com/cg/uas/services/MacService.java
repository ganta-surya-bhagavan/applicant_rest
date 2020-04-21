package com.cg.uas.services;

import java.util.List;

import com.cg.uas.entities.Applicant;
import com.cg.uas.entities.LogIn;
import com.cg.uas.exceptions.ApplicantNotFoundException;
public interface MacService {
	public List<LogIn> getAllUsers();
	public List<Applicant> getApplicantsByCourseId(int scheduledProgramId);
	public Applicant sheduleInterview(int applicantId,Applicant applicant) throws ApplicantNotFoundException;
	public Applicant updateStatus(int applicantId,Applicant applicant) throws ApplicantNotFoundException;
}

