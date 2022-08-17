package com.mp.collegeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="grade")
public class Grade {
	@Column(name="serial_number")
	private int serialNumber;
	
	@Id
	@Column(name="course_id")
	private int courseId;
	
	@Id
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="current_grade")
	private char currentGrade;
	
	public Grade(char grade) {
		this.currentGrade = grade;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public char getGrade() {
		return currentGrade;
	}

	public void setGrade(char grade) {
		this.currentGrade = grade;
	}
	
	
}
