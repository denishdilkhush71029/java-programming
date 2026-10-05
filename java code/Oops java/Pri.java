class college{
    String Student_name;
    String Student_id;
    String Student_Course;
    public void printinfo(){
        System.out.println(this.Student_name);
        System.out.println(this.Student_id);
        System.out.println(this.Student_Course);
    }


}

public class Pri{
    public static void main(String args[]){
        college student1=new college();
        student1.Student_name="Dilkhush";
        student1.Student_id="MRT25UGBCA125";
        student1.Student_Course="BCA";
        student1.printinfo();
    }

}