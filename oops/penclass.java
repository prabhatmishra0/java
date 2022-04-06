package oops;

class employee{
    String name;
    int salary;
    int age;
    String post;

    public void print_empname(){
        System.out.println(this.name);
        System.out.println(this.salary);
    }

    employee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
}



public class penclass {

    
    public static void main(String[] args){
        employee e1 = new employee("prabhat", 23);
        e1.name = "Prabhat Mishra";
        e1.salary = 45;
        e1.print_empname();
    } 
}


// syntax of java classes

// class class_name{
    // data_type name;
    // data_type name;

    // public void print(){
    //     System.out.println(this.name);
    // }
// }