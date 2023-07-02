package PrototypeAndRegistry;

public class MeritStudent extends Student{
    private int scholarship;

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public MeritStudent(){

    }
    public MeritStudent(MeritStudent s){
        super(s);
        this.scholarship = s.scholarship;
    }

    @Override
    public Student clone(){
        MeritStudent copy = new MeritStudent(this);
        return copy;
    }
}