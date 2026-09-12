 import java.io.*;
class Student{ int rollno;
int marks1,marks2;
void getdata(int x,int y,int z){ rollno=x;
marks1=y; marks2=z;
}
void showdata(){ System.out.println("Rollno is:"+rollno); System.out.println("Marks1 is:"+marks1); 
System.out.println("Marks2 is:"+marks2);
}
}
interface Sports{
int sportwt=6; void put();
}
class Result extends Student implements Sports{ int total;
public void put(){ System.out.println("Sportwt is:"+sportwt);
}
void showresult(){
total = marks1+marks2+sportwt; showdata();
put();
System.out.println("Total Marks is:"+total);
}
}
class Multiple{
public static void main(String args[]){ Result s1=new Result(); s1.getdata(01,78,80);
s1.showresult();
}
}