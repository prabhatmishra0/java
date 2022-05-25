package basicjava;


class first 
{
    public static void main(String args[])
    {
        // string 

        // concatenate
        String fname = "Prabhat";
        String lname = "Mishra";

        System.out.println(fname + lname);

        // length  { it's function will count the length with white space}
        System.out.println(fname.length());

        // charAt() : variable_name.charAt(indexno.) {here index no. starting with 0}
        System.out.println(fname.charAt(0));

        //replace 
        String rname = fname.replace('r','R');
        System.out.println(rname);

        // in java string is an imutable (change nhi ho sakti h) ⭐⭐

        // substring { you give index no. to find the string on that no.}

        String name = fname + lname;

        System.out.println(name.substring(2,7));


        // constants ⭐⭐
        int age = 30;
        age = 31;
        age = 32;
        System.out.println(age);

        // if you fix a value in variable
        final float pi = 3.14f;
        System.out.println(pi);
        


        
        
    }
} 