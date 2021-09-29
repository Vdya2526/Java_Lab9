package lab9;


import java.text.SimpleDateFormat;
import java.util.Date;

public class Program3 {

	public static void main(String[] args) {
		 //today's date in Java
        Date today = new Date();
        System.out.println("Today's Date is : " + today);

        //formatting date in Java using SimpleDateFormat
        SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd-MM-yyyy");
        String date = DATE_FORMAT.format(today);
        System.out.println("Today in dd-MM-yyyy format : " + date);

        SimpleDateFormat DATE_FORMAT1 = new SimpleDateFormat("yyyy-mm-dd");
        String date1 = DATE_FORMAT1.format(today);
        System.out.println("Today in dd-MM-yyyy format : " + date1);

	}

}
