package oops;

import javax.sound.midi.Soundbank;

// Compile time Polymorphism example 

class familymembers{
    String name;
    int age;

    public void printinfo(String name){
        System.out.println(name);
    }
    public void printinfo(int age){
        System.out.println(age);
    }
    public void printinfo(String name , int age){
        System.out.println("My name is " + name + "." + "My age is " + age);
    }
}
public class polymorphism {
    public static void main(String[] args){
        familymembers f1 = new familymembers();
        f1.name = "Prabhat Mishra";
        f1.age = 22;
        // f1.printinfo(f1.a);
        // f1.printinfo(f1.n);
        f1.printinfo(f1.name, f1.age);
    }
}
