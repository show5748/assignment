import java.util.UUID;

//busScenario는 Bus의 자식클래스
public class busScenario extends Bus{
    public busScenario(UUID number, String state,int price ,int gas, int speed, int speedChange, int maxPassenger, int nowPassenger, int changePassenger) {
        super(number, state,price, gas, speed, speedChange, maxPassenger, nowPassenger, changePassenger);
    }

    public void bScenario(){
        System.out.println("<버스 2대 생성>");
        Bus bus1 = new Bus(UUID.randomUUID(), "운행", 1000, 100, 0, 0,30,0,0);
        Bus bus2 = new Bus(UUID.randomUUID(), "운행", 1000, 100, 0, 0,30,0,0);
        Bus[] buses = {bus1,bus2};
        for(Bus bus: buses){
            System.out.println("버스번호: "+bus.number+" /현재상태: "+ bus.state+" /기름: "+ bus.gas+" /현재 승객: "+ bus.nowPassenger);
        }
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<버스 1대 운행 시작>");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<승객 2명 탑승>");
        bus1.changePassenger(2);
        System.out.println("현재 승객 "+bus1.nowPassenger+"명");
        System.out.println("요금은 "+bus1.price+"원");
        System.out.println("잔여 탑승가능 승객 "+bus1.maxPassenger+"명");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<기름 -50 설정>");
        bus1.changeGas(-50);
        System.out.println("현재 기름 "+bus1.gas);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<현재 상태 차고지행 변경>");
        bus1.changeState(3);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<기름 +10 설정>");
        bus1.changeGas(10);
        System.out.println("현재 상태 "+bus1.state);
        System.out.println("현재 기름 "+bus1.gas);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<현재 상태 운행중 변경>");
        bus1.changeState(2);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<승객 45명 탑승>");
        bus1.changePassenger(45);
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<승객 5명 탑승>");
        bus1.changePassenger(5);
        System.out.println("현재 승객 "+bus1.nowPassenger+"명");
        System.out.println("요금은 "+bus1.price+"원");
        System.out.println("잔여 탑승가능 승객 "+bus1.maxPassenger+"명");
        System.out.println("- - - - - - - - - - - - - - - - -");
        System.out.println("<기름 -55 설정>");
        bus1.changeGas(-55);
    }

}
