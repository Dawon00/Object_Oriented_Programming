
public class Overriding {
    public static void main(String[] args) {
        Car myCar = new RacingCar();
        myCar.accelate();//일반 메서드
        myCar.stop();//클래스 메서드, 업캐스팅이 되어 슈퍼클래스에서 호출됨
    }
}