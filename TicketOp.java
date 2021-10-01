package TicketPack;

public interface TicketOp {
    String generatePNR();
    Double calcPassengerFare();
    void addPassenger(String name,int age,char gender);
    double calculateTotalTicketPrice();
    StringBuilder generateTicket();
    void writeTicket();

}
