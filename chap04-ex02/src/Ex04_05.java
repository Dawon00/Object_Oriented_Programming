class Television1 {
     int channel;                          // 채널 번호
     int volume;                          // 볼륨
     boolean onOff;                     // 전원 상태
     void print() {
           System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
     }
     int getChannel() {
           return channel; //channel 을 반환합니다
     }
}
public class Ex04_05 {
     public static void main(String[] args) {
           Television1 myTv = new Television1();
           myTv.channel = 7;
           myTv.volume = 9;
           myTv.onOff = true;
           int ch = myTv.getChannel();
           System.out.println("현재 채널은 " + ch + "입니다.");
     }
}