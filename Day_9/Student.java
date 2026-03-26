package Day_9;
// class Student{
//     int id;
//     String name;
//     public static void main(String[] args){
//         Student s=new Student();
//         s.id=101;
//         s.name="Mithun";
//         System.out.println(s.id);
//         System.out.println(s.name);   
//     }
// }

class Student{
    int id;
    Student (int a){
        id=a;
    }
    public static void main(String[] args){
        Student s=new Student(10);
        System.out.println(s.id);
    }
}