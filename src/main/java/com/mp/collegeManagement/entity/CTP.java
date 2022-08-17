package com.mp.collegeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

//courses taught by professors
@Entity
@Table(name="course_to_professor")
public class CTP {
	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="number")
	private int number;

	@Id
	@Column(name="course_id")
	private int courseId;
	
	@Id
	@Column(name="professor_id")
	private int professorId;

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public int getProfessorId() {
		return professorId;
	}

	public void setProfessorId(int professorId) {
		this.professorId = professorId;
	}
	
    
}
