package Example.Time;

import java.sql.Date;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) {
        long t1 = System.currentTimeMillis(); // hàm trả về thời gian hiện tại dưới dạng mili giây
        for (int i = 0; i < 100; i++) {
            //System.out.println("TEST");
        }
        long t2 = System.currentTimeMillis(); // hàm trả về thời gian hiện tại dưới dạng mili giây

        System.out.println("ttrước khi chạy for: " + t1);
        System.out.println("sau khi chạy for: " + t2);
        System.out.println("thời gian: " + (t2 - t1) + "milli second");
        System.out.println("thời gian: " + (t2 - t1)/1000 + "second");


        //Time Unit: chuyển đổi đơn vị
        System.out.println("3000 năm = " + TimeUnit.DAYS.toHours(3000 * 365) + "h"); // từ năm sang giờ
        System.out.println("25h = " + TimeUnit.HOURS.toSeconds(25) + "s"); // từ giờ sang giây

        //Date
        Date date = new Date(System.currentTimeMillis()); // lấy số giay hiện tại để truyền vào class
        //phải cộng 1 vào month vì month bắt đầu từ 0 -> 11
        // phải cộng 1900 vào year vì máy tính tính thời gian từ 1900.
        System.out.println(date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900));

        //Calendar
        Calendar d = new GregorianCalendar();
        //vẫn phải cộng thêm 1 vào month
        System.out.println(d.get(Calendar.DATE) + "/" +( d.get(Calendar.MONTH) + 1) + "/" + d.get(Calendar.YEAR));

        d.add(Calendar.HOUR, 30); // 30 giờ tiếp theo
        System.out.println(d.get(Calendar.DATE) + "/" +( d.get(Calendar.MONTH) + 1) + "/" + d.get(Calendar.YEAR));


    }
}
