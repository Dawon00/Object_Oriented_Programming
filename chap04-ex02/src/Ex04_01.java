class Television {
     int channel;                          // ä?? ??ȣ
     int volume;                          // ????
     boolean onOff;                     // ???? ????
     void print() {
           System.out.println("ä???? " + channel + "?̰? ?????? " + volume + "?Դϴ?.");
     }
}
public class Ex04_01 {
     public static void main(String[] args) {
    	 //??ü1
           Television myTv = new Television();
           myTv.channel = 7;
           myTv.volume = 9;
           myTv.onOff = true;
           myTv.print();
         //??ü2
           Television yourTv = new Television();
           yourTv.channel = 9;
           yourTv.volume = 12;
           yourTv.onOff = true;
           yourTv.print();
     }
}