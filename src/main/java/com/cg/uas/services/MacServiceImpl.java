package com.cg.uas.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.uas.daos.ApplicantDao;
import com.cg.uas.daos.LogInDao;
import com.cg.uas.entities.Applicant;
import com.cg.uas.entities.LogIn;
import com.cg.uas.exceptions.ApplicantNotFoundException;
@Service
public class MacServiceImpl implements MacService {
	@Autowired
	private ApplicantDao applicantDao;
	@Autowired
	private LogInDao logInDao;
	@Override
	public List<LogIn> getAllUsers() {
		List<LogIn> userList = (List<LogIn>)logInDao.findAll();
		return userList;
	}

	@Override
	public List<Applicant> getApplicantsByCourseId(int scheduledProgramId) {
		List<Applicant> applicantList = (List<Applicant>)applicantDao.getApplicantByScheduledProgramId(scheduledProgramId);
		return applicantList;
	}

	@Override
	public Applicant sheduleInterview(int applicantId,Applicant applicant) throws ApplicantNotFoundException {
		Applicant oldApplicant = getApplicantById(applicantId);
		applicant.setApplicationId(oldApplicant.getApplicationId());
		return applicantDao.save(applicant);
	}

	@Override
	public Applicant updateStatus(int applicantId,Applicant applicant) throws ApplicantNotFoundException {
		Applicant oldApplicant = getApplicantById(applicantId);
		applicant.setApplicationId(oldApplicant.getApplicationId());
		return applicantDao.save(applicant);
	}
	public Applicant getApplicantById(int applicantId) throws ApplicantNotFoundException {
		Optional<Applicant> applicant = applicantDao.findById(applicantId);
		if(!applicant.isPresent()) {
			throw new ApplicantNotFoundException("Applicant with "+applicantId+" not found");
		}
		return applicant.get();
	}

}
