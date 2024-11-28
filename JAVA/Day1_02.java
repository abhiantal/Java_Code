//Construtor
class Student{
    String name;
    int age;
    
    public void printInfo(){
        System.out.println(this.age);
        System.out.println(this.name);
    } 
    // Student (){
    //     System.out.println("Constructor called");
    // }

    // Student (String name, int age ){
    //      this.name = name;
    //      this.age = age;
    // }

    Student (Student s2){
        this.name = s2.name;
        this.age = s2.age;
   }  
   Student(){

   }
}

public class Day1_02 {
    public static void main(String[] args) {
        // Student s1 = new Student();
        // s1.name = "Abhi";
        // s1.age = 20;
        //s1.printInfo();
         
        // Student s2 = new Student("Abhi Antal", 25);
        // s2.printInfo();

        Student s1 = new Student();
        s1.name = "Abhi kumar";
        s1.age = 21;
         
        Student s2 = new Student(s1);
        s2.printInfo();
    }  
}
