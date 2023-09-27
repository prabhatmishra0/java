public class Custructor_main_use {

    String name;
    int id;
    
    public Custructor_main_use(String name , int id){
        this.name = name;
        this.id = id;
        System.out.println(name);
        System.out.println(id);
    }
    public static void main(String[] args) {
        Custructor_main_use c1 = new Custructor_main_use("prabhat", 1);
        Custructor_main_use c2 = new Custructor_main_use("Harry", 2);
        System.out.println(c1);
        System.out.println(c2);

    }
}
