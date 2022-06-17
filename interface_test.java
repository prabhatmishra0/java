public class interface_test {
    interface I1 {
        public abstract void show();
    }

    interface I2 {
        public abstract void display();
    }

    interface I3 {
        public abstract void seen();
    }

    

    public static void main(String[] args) {

        class Test implements I1 , I2 , I3{

            public void show() {
                System.out.println("Interface Implements");
            }

            public void display() {
                System.out.println("Multiple Interface achieved");
            }
            
            public void seen() {
                System.out.println("seen show");
            }
        }

        Test t = new Test();
        t.show();
        t.display();
        t.seen();

    }
}
