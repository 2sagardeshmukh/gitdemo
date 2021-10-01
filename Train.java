package TrainPack;

public class Train {

    private int trainNo;
    private String trainName;
    private String Source;
    private String Destination;
    private double ticketPrice;

    public Train(int trainNo, String trainName, String source, String destination, double ticketPrice) {
        this.trainNo = trainNo;
        this.trainName = trainName;
        Source = source;
        Destination = destination;
        this.ticketPrice = ticketPrice;
    }

    public int getTrainNo() {
        return trainNo;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getSource() {
        return Source;
    }

    public String getDestination() {
        return Destination;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    public void setTrainNo(int trainNo) {
        this.trainNo = trainNo;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public void setSource(String source) {
        Source = source;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainNo=" + trainNo +
                ", trainName='" + trainName + '\'' +
                ", Source='" + Source + '\'' +
                ", Destination='" + Destination + '\'' +
                ", ticketPrice=" + ticketPrice +
                '}';
    }
}
