package PrototypeAndRegistry;

public class Student implements Prototype<Student>{
    private String name;
    private int age;
    private int psp;
    private String batchName;
    private String instructorName;
    private int batchAgPSP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPsp() {
        return psp;
    }

    public void setPsp(int psp) {
        this.psp = psp;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getInstructorName() {
        return instructorName;
    }

    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    public int getBatchAgPSP() {
        return batchAgPSP;
    }

    public void setBatchAgPSP(int batchAgPSP) {
        this.batchAgPSP = batchAgPSP;
    }

    public Student(){

    }
    public Student(Student s){
        this.name = s.name;
        this.age = s.age;
        this.psp = s.psp;
        this.batchName = s.batchName;
        this.instructorName = s.instructorName;
        this.batchAgPSP = s.batchAgPSP;
    }

    public Student clone(){
        Student copy = new Student(this);
        return copy;
    }
}
