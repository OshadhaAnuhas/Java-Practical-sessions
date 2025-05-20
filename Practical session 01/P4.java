class One {
    int a, b;

    One() {
        a = 10;
        b = 0;
    }

    One(int x, int y) {
        a = x;
        b = y;
    }

    void display() {
        System.out.println("From class One a = " + a);
        System.out.println("From class One b = " + b);
    }
}

class Two {
    int a, c;

    Two() {
        a = 0;
        c = 0;
    }

    Two(int x, int y) {
        a = x;
        c = y;
    }

    void display() {
        System.out.println("From class Two a = " + a);
        System.out.println("From class Two c = " + c);
    }
}

public class P4 {
    public static void main(String[] args) {
        One obj1 = new One();
        obj1.display();

        One obj2 = new One(10, 100);
        obj2.display();

        Two obj3 = new Two();
        obj3.display();

        Two obj4 = new Two(20, 30);
        obj4.display();
    }
}
