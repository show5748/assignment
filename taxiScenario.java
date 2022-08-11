import java.util.UUID;

public class taxiScenario extends Taxi{
    public taxiScenario(UUID number, String state, int price, int gas, int speed, int speedChange, int maxPassenger, int nowPassenger, int changePassenger, String destination, int distance, int minDistance, int distancePrice, int totalPrice) {
        super(number, state, price, gas, speed, speedChange, maxPassenger, nowPassenger, changePassenger, destination, distance, minDistance, distancePrice, totalPrice);
    }

    public void tScenario(){
        System.out.println("<택시 2대 생성>");
        Taxi taxi1 = new Taxi(UUID.randomUUID(), "일반", 0, 100, 0,0,4,0,0,null,1,3000,1000,0);
        Taxi taxi2 = new Taxi(UUID.randomUUID(), "일반", 0, 100, 0,0,4,0,0,null,1,3000,1000,0);
        Taxi[] taxis = {taxi1,taxi2};
        for(Taxi taxi: taxis){
            System.out.println("택시번호: "+taxi.number+" /현재상태: "+ taxi.state+" /기름: "+ taxi.gas+" /현재 승객: "+ taxi.nowPassenger);
        }
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<택시 1대 운행 시작>");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<승객 2명 탑승>");
        taxi1.changePassenger(2,"서울역",2);
        System.out.println("현재 상태는 "+taxi1.state);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<기름 -80 설정>");
        taxi1.changeGas(-80);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<요금 결제>");
        taxi1.payment();
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("현재 기름 "+taxi1.gas);
        System.out.println("누적 요금 "+taxi1.totalPrice);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<승객 5명 탑승>");
        taxi1.changePassenger(5,null,0);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<승객 3명 탑승>");
        taxi1.changePassenger(3,"구로디지털단지역",12);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<기름 -20 설정>");
        taxi1.changeGas(-20);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<요금 결제>");
        taxi1.payment();
    }
}
