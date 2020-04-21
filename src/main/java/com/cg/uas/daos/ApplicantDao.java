package com.cg.uas.daos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.cg.uas.entities.Applicant;

public interface ApplicantDao extends CrudRepository<Applicant,Integer> {
	public List<Applicant> getApplicantByScheduledProgramId(int scheduledProgramId);
}
