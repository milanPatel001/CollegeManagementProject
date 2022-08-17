package com.mp.collegeManagement.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="exam")
public class Exam {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="exam_id")
	private int examId;
	
	@Column(name="course_id")
	private int courseId;
	
	@Column(name="student_id")
	private int studentId;
	
	@Column(name="total_marks")
	private float totalMarks;
	
	@Column(name="marks_scored")
	private float marksScored;

	public Exam(float totalMarks, float marksScored) {
		this.totalMarks = totalMarks;
		this.marksScored = marksScored;
	}

	public int getExamId() {
		return examId;
	}

	public void setExamId(int examId) {
		this.examId = examId;
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

	public float getTotalMarks() {
		return totalMarks;
	}

	public void setTotalMarks(float totalMarks) {
		this.totalMarks = totalMarks;
	}

	public float getMarksScored() {
		return marksScored;
	}

	public void setMarksScored(float marksScored) {
		this.marksScored = marksScored;
	}
	
	
}
