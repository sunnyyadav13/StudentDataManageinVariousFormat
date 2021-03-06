package studentManageJSONpkg;

import java.io.IOException;


public class StudentC {
	int rollno;
	String name,section,grade;
	int physics_marks ,maths_marks,chemistry_marks,english_marks,computerScience_marks;
	int total;
	double percentage;
	
	
	
	//-----------------------Constructors-------------------
	public StudentC() {
		
	}
	
	public StudentC(int rollno, String name, String section, int physics_marks, int maths_marks,
			int chemistry_marks, int english_marks, int computerScience_marks) {
		
		this.rollno = rollno;
		this.name = name;
		this.section = section;
		this.physics_marks = physics_marks;
		this.maths_marks = maths_marks;
		this.chemistry_marks = chemistry_marks;
		this.english_marks = english_marks;
		this.computerScience_marks = computerScience_marks;
		
		int total= this.physics_marks+maths_marks+this.chemistry_marks+this.english_marks+this.computerScience_marks;
		double per=(total/500.0)*100;
//		System.out.println("per"+per);
		String grade;
		
		if (per>90) {	grade="A";	}
		else if(per<=90 && per>80) {grade="B"; }
		else if(per<=80 && per>70) {grade="C"; }
		else if(per<=70 && per>60) {grade="D"; }
		else if(per<=60 && per>50) {grade="E"; }
		else if(per<=50 && per>40) {grade="F"; }
		else if(per<=40 && per>30) {grade="G"; }
		else {
			grade="Fail";
		}
		
		this.total=total;
		this.percentage=per;
		this.grade=grade;
		
	}
	
	
	

	//-----------------------getter & setter-------------------




	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getSection() {
		return section;
	}


	public void setSection(String section) {
		this.section = section;
	}

	public int getPhysics_marks() {
		return physics_marks;
	}

	public void setPhysics_marks(int physics_marks) {
		this.physics_marks = physics_marks;
	}

	public int getMaths_marks() {
		return maths_marks;
	}

	public void setMaths_marks(int maths_marks) {
		this.maths_marks = maths_marks;
	}

	public int getChemistry_marks() {
		return chemistry_marks;
	}

	public void setChemistry_marks(int chemistry_marks) {
		this.chemistry_marks = chemistry_marks;
	}

	public int getEnglish_marks() {
		return english_marks;
	}

	public void setEnglish_marks(int english_marks) {
		this.english_marks = english_marks;
	}

	public int getComputerScience_marks() {
		return computerScience_marks;
	}

	public void setComputerScience_marks(int computerScience_marks) {
		this.computerScience_marks = computerScience_marks;
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
		
}


