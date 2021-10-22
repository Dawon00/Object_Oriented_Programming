class Television2 {
     int channel;                          // 채널 번호
     int volume;                          // 볼륨
     boolean onOff;                     // 전원 상태
     void print() {
           System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
     }
     int getChannel() {
           return channel;
     }
     void setChannel(int ch) {
           channel = ch;
     }
}
public class Ex04_08 {
     public static void main(String[] args) {
           Television2 myTv = new Television2();
           myTv.setChannel(11);
           int ch = myTv.getChannel();
           System.out.println("현재 채널은 " + ch + "입니다.");
     }
}