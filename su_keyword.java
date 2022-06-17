class a {
    int i = 40;
}

public class su_keyword extends a{
    int i = 30;
    void show(int i) {
        // System.out.println(i);

        // 2nd way doing this
        // System.out.println(this.i);

        // 3rd way doing this 
        System.out.println(super.i);
    }

    public static void main(String[] args) {
        su_keyword su = new su_keyword();
        su.show(45);

    }
}
