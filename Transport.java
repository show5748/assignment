import java.util.UUID;

public class Transport {
    UUID number;
    int gas;
    int speed;
    int speedChange;
    int maxPassenger;
    int nowPassenger;
    String state;
    int changePassenger;
    int price;

    public Transport(UUID number, String state, int price, int gas, int speed, int speedChange
            ,int maxPassenger,int nowPassenger,int changePassenger) {
        this.number = number;
        this.gas = gas;
        this.speed = speed;
        this.speedChange = speedChange;
        this.maxPassenger = maxPassenger;
        this.nowPassenger = nowPassenger;
        this.changePassenger = changePassenger;
        this.state = state;
        this.price = price;
    }
}