class RacingCar extends Car{
    @Override
    public void accelate(){
        System.out.println("레이싱카 전용 엔진 사용");
    }    
    public static void stop(){
        System.out.println("레이싱카 전용 브레이크 사용");
    }
}
 