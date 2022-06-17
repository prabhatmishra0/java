// class emp{
    // 1. this keyword is used to current class instance variable
    // 2. this keyword can be used to invoke current class method
    // private int i;

    // // getter 
    // public void set_empid(int i){
    //     this.i = i;
    // }

    // // setter
    // public int get_int(){
    //     return i;
    // }


    // 2. nd way 
    
// } 

public class this_uses {
    static class emp{
        void display(){
            System.out.println("hello");
        }
    
        void show(){
            display();
        }
    }
    public static void main(String[] args) {
        emp e1 = new emp();
        e1.show();
    }
}
