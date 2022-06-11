package multithreading;



class Ticketbooking {
    int totalseat = 10;
    
    synchronized void booktic(int seats){
        if(totalseat >= seats){
            System.out.println("Seat confirmed" + " " + seats);
            totalseat = totalseat - seats;
            System.out.println("left seats = " + totalseat);
        }else{
            System.out.println("Seats are not avilable");
            System.out.println("Avilable seats : " + " " + totalseat);
        }
    }
}

// class threa extends Thread{
//     Ticketbooking t = new Ticketbooking();
//     int seats;
//     synchronized public void run(){
//         t.booktic(seats);
//     }
// }
 
class busticketbooking extends Thread{
    static Ticketbooking b;
    int seats;
    public void run(){
        b.booktic(seats);
    }

    public static void main(String[] args) {
        b = new Ticketbooking();
        busticketbooking t = new busticketbooking();
        t.seats = 7;
        t.start();
        
        busticketbooking a = new busticketbooking();
        a.seats = 6;
        a.start();
        
    }
}
 