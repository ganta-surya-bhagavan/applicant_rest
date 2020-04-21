package com.cg.uas.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="applicant")
public class Applicant {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="Applicant_id", updatable=false, nullable=false)
	private int ApplicationId;
	@Column(name="full_name")
	private String fullName;
	@Column(name="date_of_birth")
	private String dateOfBirth;
	@Column(name="highest_qualification")
	private String highestQualification;
	@Column(name="marks_obtained")
	private float marksObtained;
	@Column(name="goals")
	private String goals;
	@Column(name="email_id")
	private String emailId;
	@Column(name="Scheduled_program_id")
	private int scheduledProgramId;
	@Column(name="status")
	private String status;
	@Column(name="Date_of_interveiw")
	private String DateOfInterview;
	public Applicant() {
		super();
	}
	public Applicant(String fullName, String dateOfBirth, String highestQualification, float marksObtained,
			String goals, String emailId, int scheduledProgramId) {
		super();
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.highestQualification = highestQualification;
		this.marksObtained = marksObtained;
		this.goals = goals;
		this.emailId = emailId;
		this.scheduledProgramId = scheduledProgramId;
	}
	public Applicant(int applicationId, String fullName, String dateOfBirth, String highestQualification,
			float marksObtained, String goals, String emailId, int scheduledProgramId, String status,
			String dateOfInterview) {
		super();
		ApplicationId = applicationId;
		this.fullName = fullName;
		this.dateOfBirth = dateOfBirth;
		this.highestQualification = highestQualification;
		this.marksObtained = marksObtained;
		this.goals = goals;
		this.emailId = emailId;
		this.scheduledProgramId = scheduledProgramId;
		this.status = status;
		DateOfInterview = dateOfInterview;
	}
	public int getApplicationId() {
		return ApplicationId;
	}
	public void setApplicationId(int applicationId) {
		ApplicationId = applicationId;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getHighestQualification() {
		return highestQualification;
	}
	public void setHighestQualification(String highestQualification) {
		this.highestQualification = highestQualification;
	}
	public float getMarksObtained() {
		return marksObtained;
	}
	public void setMarksObtained(float marksObtained) {
		this.marksObtained = marksObtained;
	}
	public String getGoals() {
		return goals;
	}
	public void setGoals(String goals) {
		this.goals = goals;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public int getScheduledProgramId() {
		return scheduledProgramId;
	}
	public void setScheduledProgramId(int scheduledProgramId) {
		this.scheduledProgramId = scheduledProgramId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateOfInterview() {
		return DateOfInterview;
	}
	public void setDateOfInterview(String dateOfInterview) {
		DateOfInterview = dateOfInterview;
	}
	@Override
	public String toString() {
		return "Applicant [ApplicationId=" + ApplicationId + ", fullName=" + fullName + ", dateOfBirth=" + dateOfBirth
				+ ", highestQualification=" + highestQualification + ", marksObtained=" + marksObtained + ", goals="
				+ goals + ", emailId=" + emailId + ", ScheduledProgramId=" + scheduledProgramId + ", status=" + status
				+ ", DateOfInterview=" + DateOfInterview + "]";
	}
	
}
