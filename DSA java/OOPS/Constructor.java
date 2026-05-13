
package OOPS;

public class Constructor {

    static class Student {
        // Defalt Constructor

        Student() {
            System.out.println("Nawed is the ");
        }

    }

    static class Pname {
        Pname() {
            System.out.println("My name is Nawed");
        }
    }

    // paraMeterized Constructor
    static class Infor {

        String name;
        int rollNo;

        public Infor(String name, int rollNo) {
            this.name = name;
            this.rollNo = rollNo;

        }

    }

    // Copy Constructor
    static class CopyCunst {
        String name;
        int no;

        public CopyCunst(String name, int no) {
            this.name = name;
            this.no = no;
        }

        public CopyCunst(CopyCunst obj2) {
            this.name = obj2.name;
            this.no = obj2.no;
        }

    }

    // Private Constructor

    static class PrivateConst {
        private PrivateConst() {
            System.out.println("Private constructor called");
        }

    }

    static class Outter {
        private Outter() {
            System.out.println("Outter constructor called");
        }

    }

    public static void main(String[] args) {
        Student Student1 = new Student();
        Pname nName = new Pname();
        Infor info1 = new Infor("Nawed", 1);
        System.out.println("Name of Infor1 " + info1.name + " Roll No is " + info1.rollNo);

        CopyCunst copies = new CopyCunst("Sara", 29);
        System.out.println("CopyConst " + copies.name + " Copies Const No " + copies.no);

        PrivateConst nPrivate = new PrivateConst();

        Outter otter = new Outter();

    }
}