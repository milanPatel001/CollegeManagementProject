package com.mp.collegeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//courses taken by students
@Entity
@Table(name="course_to_student")
public class CTS {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="number")
	private int number;

	@Id
	@Column(name="course_id")
	private int courseId;
	
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="enrollment_status")
	private String enrollmentStatus;
	
	@Column(name="regular_time")
	private String regularTime;
	
	@Column(name="enrollment_date")
	private String enrollmentDate;
	
	
	public CTS(String enrollmentStatus, String regularTime, String enrollmentDate) {
		this.enrollmentStatus = enrollmentStatus;
		this.regularTime = regularTime;
		this.enrollmentDate = enrollmentDate;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudent_id() {
		return studentId;
	}

	public void setStudent_id(int studentId) {
		this.studentId = studentId;
	}

	public String getEnrollmentStatus() {
		return enrollmentStatus;
	}

	public void setEnrollmentStatus(String enrollmentStatus) {
		this.enrollmentStatus = enrollmentStatus;
	}

	public String getRegularTime() {
		return regularTime;
	}

	public void setRegularTime(String regularTime) {
		this.regularTime = regularTime;
	}

	public String getEnrollmentDate() {
		return enrollmentDate;
	}

	public void setEnrollmentDate(String enrollmentDate) {
		this.enrollmentDate = enrollmentDate;
	}
	
	
}
