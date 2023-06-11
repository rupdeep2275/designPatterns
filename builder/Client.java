public class Client {

    public static void main(String[] args) {

        Student student2 = Student.createBuilder()
                .setfName("Naman")
                .setPsp(80.0)
                .setWeight(80.0)
                .setAge(31)
                .build();

    }
}