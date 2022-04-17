import java.util.Scanner;
public class Courseclass{

    public static void main(String[] args) {
        /**    Course ds=new Course("DataStructure");
            ds.addStudent("ram1");
            ds.addStudent("ram2");
            ds.addStudent("ram4");
            ds.addStudent("ram5");
            ds.addStudent("ram3");
            ds.getStudents();
            System.err.println();
            System.out.println(ds.getNumberOfStudents());
            System.err.println(ds.getcourseName());
            ds.dropStudent("ram1");
            ds.getStudents();*/
            new A();
            new B();
            int z=9;
         System.err.println(++z+" "+z++);
        StackOfIntegers q1= new StackOfIntegers(10);
       // System.out.println(q1.empty());
       new Person().printPerson();
        new Student().printPerson();
        for (int i = 0; i < 10; i++)
         q1.push(i);
        
         while (!q1.empty())
         System.out.print(q1.pop() + " ");
         new Person().printPerson();
        new Student().printPerson();

            
        }

    }
    class A {
        int i = 7;
        public A() {
         setI(20);
         System.out.println("i from A is " + i);
         }
        public void setI(int i) {
        this.i = 2 * i;
         }
        }
        class B extends A {
        public B() {
         System.out.println("i from B is " + i);
         }
        public void setI(int i) {
        this.i = 3 * i;
         }
        }
    class Aa extends Bb {
        public Aa(int a){
            System.err.println("a inviked");


        }
    }
    class Bb {
        public Bb(){
            System.err.println("b inviked");


        }
    }
        class Student extends Person {
         @Override
        public String getInfo() {
        return "Student";
         }
        }
        class Person {
        public String getInfo() {
        return "Person";
         }
        public void printPerson() {
         System.out.println(getInfo());
         }
        }

class Course{
    /**
Course
-courseName: String    
-students: String[]
-numberOfStudents: int
+Course(courseName: String)
+getCourseName(): String
+addStudent(student: String): void
+dropStudent(student: String): void
+getStudents(): String[]
+getNumberOfStudents(): int
 */
    private String courseName;
    private String[] students= new String[100];
    private int noOfStudents=0;
    Course(String coursename){
        courseName= coursename;

    }
    public String getcourseName(){
        return courseName;
    }
    public void addStudent(String Studentname){
        students[noOfStudents]=Studentname;
        noOfStudents++;
    }
    public void dropStudent(String Studentname){
      for(int j=0;j<noOfStudents;j++)
         {  if (students[j].equals(Studentname) )
            students[j] = null;}
    }
    public int getNumberOfStudents() {
        return noOfStudents;
        
    }
    public void getStudents() {
          
        for(int i=0 ;i<noOfStudents;i++)
             System.err.print(students[i]+", ");
            
        
    }

}
class StackOfIntegers{
    /**StackOfIntegers
-elements: int[]
-size: int
+StackOfIntegers()
+StackOfIntegers(capacity: int)
+empty(): boolean
+peek(): int
+push(value: int): void
+pop(): int
+getSize(): int */
private int size=10;

private int[] elements=new int[size];
int top=-1;
StackOfIntegers(int capacity){
    elements = new int[capacity];

}
public boolean empty() {
    if (top==-1)
        return true;
    else 
       return false;

    
}
public int peek(){
    return elements[top];
}
public void push(int e){
    if(top==-1){
        top=0;
        System.err.println(elements[top]);
        elements[top]=e;
        top++;
    }
    else if(top>size-1){
        System.out.println("full");
        System.exit(1);
    }
    else if(top !=-1 && top<size){
        elements[top]=e;
        top++;
    }

}
public int pop(){
      return elements[--top];
   

}
public int getsize(){
    return size;
}
}

