class student{
    String name;
    int id;
    String course;
    public void printinfo(){
        System.out.println(this.name);
        System.out.println(this.id);
        System.out.println(this.course);
    }

}


public class StudentClass {
    public static void main(String args[]){
        student student1=new student();
        student1.name="john";
        student1.id=417;
        student1.course="BCA";
        student1.printinfo();



    }
    
}
