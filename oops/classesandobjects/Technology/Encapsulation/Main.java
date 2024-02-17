package oops.classesandobjects.Technology.Encapsulation;
public class Main{
    public static void main(String[] args){
        Student s = new Student();
        s.setName("Amar"); s.setRoll(102117004); s.setMobile(8948663599L);
        s.getDetails();
        System.out.println("Thank You!!");
    }
}

class Student{
    private String name;
    private int roll;
    private long mobile;

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }
    
    public void getDetails(){
        System.out.println("-------:Student Details:-------");
        System.out.println("Name: "+ name);
        System.out.println("Mobile: "+ mobile);
        System.out.println("Roll No; "+ roll);

    }

}
