import javax.swing.*;
import java.util.UUID;

//Bus는 Transport의 자식 클래스
public class Bus extends Transport {

    public Bus(UUID number, String state, int price, int gas, int speed, int speedChange, int maxPassenger, int nowPassenger, int changePassenger) {
        super(number, state, price, gas, speed, speedChange, maxPassenger, nowPassenger, changePassenger);
    }
    public void changePassenger(int x){
        if (x>30){
//            jOptionpane.showMessageDialog : 메세지 상자 팝업으로 보여주기
            JOptionPane.showMessageDialog(null, "최대 승객 수 초과", "걷기반 11조 과제", JOptionPane.ERROR_MESSAGE);
        } else {
            this.maxPassenger = 30;     // 최대 인원 수
            this.price = 1000;          // 요금
            this.nowPassenger = x;      // 버스시나리오에서 설정한 탑승 인원
            this.maxPassenger -= x;     // 버스시나리오에서 설정한 탑승 가능 인원
            if (nowPassenger > 0){      // 손님 받은 후 요금 확인
                price *= x;
            }
        }
    }

//    throws : 메소드에서 잠재적으로 어떤 Exception이 발생할 수 있는지 명시하는 키워드.
//    InterruptedException : 스레드를 종료하기 위한 메커니즘 (딜레이를 사용하기 위해서 쓴다?)
    public void changeGas(int x){
        if (gas+x <= 10){      // 기름(초기 100) + 버스시나리오에서 설정한 기름 x를 더한 값이 10이하면
            this.gas += x;     // 총 기름은 gas + x
            this.state = "차고지행";
            System.out.println("현재 기름 "+gas);
            System.out.println("현재 상태 "+state);
            JOptionPane.showMessageDialog(null, "주유 필요", "걷기반 11조 과제", JOptionPane.ERROR_MESSAGE);
        } else {     // 총 기름이 10이하가 아니라면
            this.gas += x;    // 기름은 gas+x
        }
    }
    public void changeState(int x){
//        버스 시나리오에서 changeState에 넣어준 값에 따라 다른 운행 값이 출력.
        if (x == 1) {
            this.state = "운행";
        } else if (x == 2) {
            this.state = "운행중";
        } else if (x == 3) {
            this.state = "차고지행";
        }
    }
}

