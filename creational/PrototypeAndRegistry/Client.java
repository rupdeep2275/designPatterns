package PrototypeAndRegistry;

public class Client {
    public static void main(String[] args) {
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry); //this will be done by spring boot actually

        Student abdul = registry.get("may2022Batch").clone();
        abdul.setName("Abdul Rizwan");
        abdul.setAge(28);
        abdul.setPsp(90);

        Student shlok = registry.get("may2022Batch").clone();
        shlok.setName("Shlok Telang");
        shlok.setAge(25);
        shlok.setPsp(95);

        MeritStudent rupdeep = new MeritStudent();
        rupdeep.setName("Rupdeep Dey");
        rupdeep.setAge(24);
        rupdeep.setPsp(100);
        rupdeep.setScholarship(10000);
    }
    private static void fillRegistry(StudentRegistry registry){
        Student may22Batch = new Student();
        may22Batch.setBatchName("May22 Beginner");
        may22Batch.setBatchAgPSP(70);
        may22Batch.setInstructorName("Sumeet Malik");
        registry.register("may2022Batch", may22Batch);

        MeritStudent may22MeritBatch = new MeritStudent();
        may22MeritBatch.setBatchName("May22 Beginner");
        may22MeritBatch.setBatchAgPSP(90);
        may22MeritBatch.setInstructorName("Sumeet Malik");
        registry.register("mayBatchIntelligentStudent", may22MeritBatch);
    }
}