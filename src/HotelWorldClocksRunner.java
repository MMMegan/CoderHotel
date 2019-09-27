import sun.awt.im.SimpleInputMethodWindow;

import java.util.Scanner;

public class HotelWorldClocksRunner {
    public static void main(String[] args){
        UtcTime utcTime = new UtcTime();
        utcTime.attach("BeiJing",new CityClock(8));
        utcTime.attach("London",new CityClock(0));
        utcTime.attach("Moscow",new CityClock(4));
        utcTime.attach("Sydney",new CityClock(10));
        utcTime.attach("NewYork",new CityClock(-5));
        PhoneClock phoneClock = new PhoneClock(8);
        phoneClock.setUtcTime(utcTime);

        phoneClock.setLocalTime(8);
        utcTime.printTimeOfAllClocks();

        while(true) {
            Scanner input = new Scanner(System.in);
            System.out.println("请矫正当前当地时间为：");
            int localtime = input.nextInt();//输入矫正后的当地时间

            if(localtime>24||localtime<0){
                System.out.println("时间超出24小时制啦，默认不需要矫正,请参考上述时间哦");//超出0-24默认无需修改
                continue;
            }
            System.out.println("所有时钟时间更新为：");

            phoneClock.setLocalTime(localtime);

            utcTime.printTimeOfAllClocks();
        }
    }
}
