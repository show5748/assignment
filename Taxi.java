import javax.swing.*;
import java.util.UUID;



public class Taxi extends Transport {
    String destination;
    int distance;
    int minDistance;
    int distancePrice;
    int totalPrice;

    public Taxi(UUID number, String state, int price, int gas, int speed, int speedChange, int maxPassenger, int nowPassenger, int changePassenger, String destination, int distance, int minDistance, int distancePrice, int totalPrice) {
        super(number, state, price, gas, speed, speedChange, maxPassenger, nowPassenger, changePassenger);
        this.destination = destination;
        this.distance = distance;          // 목적지까지 걸리는 km
        this.minDistance = minDistance;    // 기본요금 3000원
        this.distancePrice = distancePrice;    // 거리 당 요금 1000원
        this.totalPrice = totalPrice;
    }

    public void changePassenger(int a,String b,int c) {
        //2 서울역 2
        if (a>4){     // 택시 시나리오에서 설정한 탑승 인원이 5보다 작다면 최대 승객 수 초과
            JOptionPane.showMessageDialog(null, "최대 승객 수 초과", "걷기반 11조 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            this.price = 0;
            this.maxPassenger = 4;     // 1회 최대 탑승 인원
            this.nowPassenger = a;     // 택시 시나리오에서 설정한 탑승한 인원
            this.maxPassenger -= a;    // 탑승 가능한 인원 수
            this.destination = b;      // 택시 시나리오에서 설정한 목적지
            this.distance = c;         // 택시 시나리오에서 설정한 목적지 도달하는데 걸리는 km

                if (nowPassenger > 0){   // 탑승한 인원이 1명 이상이라면
                    price = minDistance + (distancePrice * (distance-1));   // 기본요금 + (거리 당 요금 * (걸리는 km -1)), 1km까지 기본요금
                    state = "운행중";
                    System.out.println("현재 승객 "+nowPassenger+"명");
                    System.out.println("잔여 탑승가능 승객 "+maxPassenger+"명");
                    System.out.println("기본 요금은 "+minDistance+"원");
                    System.out.println("목적지는 "+destination);
                    System.out.println("목적지까지 거리는 "+distance+"km");
                    System.out.println("지불하실 요금은 "+price+"원");
                }
            }
        }
    public void changeGas(int x){
        if (gas+x <= 10){   // 가스+택시 시나리오에서 설정한 가스 합이 10이하인 경우
            this.gas += x;
            this.state = "운행 불가";
        } else {
            this.gas += x;
        }
    }
    public void payment(){
        if (gas <= 0){
            totalPrice += price;
            this.state = "운행 불가";
            System.out.println("현재 기름 "+gas);
            System.out.println("현재 상태 "+state);
            System.out.println("누적 요금 "+totalPrice);
            JOptionPane.showMessageDialog(null, "주유 필요", "걷기반 11조 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            totalPrice += price;
            this.price = 0;
            this.state = "일반";
        }
    }
}

