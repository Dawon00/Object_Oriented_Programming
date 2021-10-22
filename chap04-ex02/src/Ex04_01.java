class Television {
     int channel;                          // 채널 번호
     int volume;                          // 볼륨
     boolean onOff;                     // 전원 상태
     void print() {
           System.out.println("채널은 " + channel + "이고 볼륨은 " + volume + "입니다.");
     }
}
public class Ex04_01 {
     public static void main(String[] args) {
    	 //객체1
           Television myTv = new Television();
           myTv.channel = 7;
           myTv.volume = 9;
           myTv.onOff = true;
           myTv.print();
         //객체2
           Television yourTv = new Television();
           yourTv.channel = 9;
           yourTv.volume = 12;
           yourTv.onOff = true;
           yourTv.print();
     }
}