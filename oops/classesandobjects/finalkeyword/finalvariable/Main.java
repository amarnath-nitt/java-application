package oops.classesandobjects.finalkeyword.finalvariable;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method
        final Student s1 = new Student("Amarnath", 25);
        Student s2 = new Student("Rajesh Kumar", 45);
        System.out.println("Student1: "+ s1);
        System.out.println(s2);

        s1.setName("Vinay Kumar");
        System.out.println("Student1: "+ s1);


    }

}
