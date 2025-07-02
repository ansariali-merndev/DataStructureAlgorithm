package OOPS;

public class OOPS1 {
    public static void main(String[] args) {
//        System.out.println("Hello World");

//        Student stu1 = new Student();
//        stu1.rno = 13;
//        stu1.name = "Alice";
//        stu1.marks = 78.3f;

//        System.out.println(stu1.rno);
//        System.out.println(stu1.name);
//        System.out.println(stu1.marks);

//        Student stu2 = stu1;
//        stu2.name = "random";
//
//        System.out.println(stu2.name);
//        System.out.println(stu1.name);

        Student s1 = new Student();
        s1.display();

        Student s2 = new Student(19, "Ali Ansari", 89.2f);
        s2.display();
        System.out.println(s2.TOTAL);

        Random random;
        for (int i = 0; i < 1000000000; i++) {
            random = new Random();
        }

    }

}

class Random {
    String name;
    Random() {
        System.out.println("Object Created");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Object destroyed");
    }
}

class Student {
    int rno;
    String name;
    float marks;
    final int TOTAL = 100;

    Student() {
        this.rno = 100;
        this.name = "Unknown Student";
        this.marks = 100.0f;
    }

    public Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }

    void display () {
        System.out.println("Roll no is: " + this.rno + " , " +
                "Your name is: " + this.name + " and You get: " + this.marks);
    }

    public static void main(String[] args) {
        System.out.println("Helloo class");
    }
}
