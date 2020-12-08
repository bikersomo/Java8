package data;

import java.util.ArrayList;
import java.util.List;


public class Student {
    private String name;
    private int gradeLevel;
    private double gpa;
    private String gender;
    private int notebooks;
    
    
    


    /**
	 * @param notebooks the notebooks to set
	 */
	public void setNotebooks(int notebooks) {
		this.notebooks = notebooks;
	}


	public Student(String name, int gradeLevel, double gpa, String gender, int notebooks, List<String> activities) {
		super();
		this.name = name;
		this.gradeLevel = gradeLevel;
		this.gpa = gpa;
		this.gender = gender;
		this.notebooks = notebooks;
		this.activities = activities;
	}


	/**
	 * @return the notebooks
	 */
	public int getNotebooks() {
		return notebooks;
	}


	public Student(){

    }

   
    List<String> activities = new ArrayList<>();

    


    public Student(String name, int gradeLevel, double gpa, String gender, List<String> activities) {
        this.name = name;
        this.gradeLevel = gradeLevel;
        this.gpa = gpa;
        this.gender = gender;
        this.activities = activities;
    }
   
    public Student(String s) {
        this.name = s;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(int gradeLevel) {
        this.gradeLevel = gradeLevel;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public  List<String> getActivities() {
        return this.activities;
    }

    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void printListOfActivities(){

        System.out.println("List of Activities are : " + this.activities);
    }

    /* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Student [name=");
		builder.append(name);
		builder.append(", gradeLevel=");
		builder.append(gradeLevel);
		builder.append(", gpa=");
		builder.append(gpa);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", notebooks=");
		builder.append(notebooks);
		builder.append(", activities=");
		builder.append(activities);
		builder.append("]");
		return builder.toString();
	}


}
