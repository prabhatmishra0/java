public class coustmizeexception {

    class underAgeException extends RuntimeException{
        // underAgeException(){
        //     super("you are under aged");
        // }

        underAgeException(String message){
            super(message);
        }
    }

    public static void main(String[] args)  
    {
        int age = 19;

        if(age < 18){
           try {
            // throw new underAgeException("you are under age");
        } catch (coustmizeexception.underAgeException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        } else {
            System.out.println("You Can Vote");
        }
    }
}
