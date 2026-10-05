class student{
    String name;
    String Depeatment;
    String Courese;
    public void study(){
        System.out.println("Student which Department study");
    }
}


public class Oops{
    public static void main(String args[]){
        student student1=new student();
        student1.name="Dilkhush kumar";
        student1.Depeatment="Computer Application";
        student1.Courese="BCA";
        student1.study();
    }

}