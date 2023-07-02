public class Student {
    private int age;
    private String fName;
    private String lName;
    private String gender;
    private double psp;
    private double weight;


    private Student(Builder builder) {
        this.age = builder.age;
        this.fName = builder.fName;
        this.lName = builder.lName;
        this.gender = builder.gender;
        this.psp = builder.psp;
        this.weight = builder.weight;
    }

    public static Builder createBuilder() {
        return new Builder();
    }

    public static class Builder {

        private int age;
        private String fName;
        private String lName;
        private String gender;
        private double psp;
        private double weight;

        private boolean validate() {
            if (fName.length() + lName.length() <= 5) {
                return false;
            }
            return true;
        }

        public Student build() {
//            if(!validate()) {
//                throw new InvalidAttributesException();
//            }
            return new Student(this);
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setfName(String fName) {
            this.fName = fName;
            return this;
        }

        public Builder setlName(String lName) {
            this.lName = lName;
            return this;
        }

        public Builder setGender(String gender) {
            this.gender = gender;
            return this;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Builder setWeight(double weight) {
            this.weight = weight;
            return this;
        }
    }
}