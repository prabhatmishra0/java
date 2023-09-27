class emp{
    private int emp_id;

    // getter 
    public void set_empid(int emp){
        emp_id = emp;
    }

    // setter
    public int get_int(){
        return emp_id;
    }
}

public class encapsulation {
    public static void main(String[] args) {
        emp e = new emp();
        e.set_empid(401);
        System.out.println(e.get_int());
    }
}
