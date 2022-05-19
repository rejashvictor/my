/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author rejash.victorpaul
 */
public class DatePattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ParseException {
        
        String userSearchFormat = "19-05-2022 17:17:00.561 ";
        List<String> dateFormat = new ArrayList<String>();
        dateFormat.add("dd-MM-yy");
        dateFormat.add("dd-MM-yyyy");
        dateFormat.add("MM-dd-yyyy");
        dateFormat.add("yyyy-MM-dd");
        dateFormat.add("yyyy-MM-dd HH:mm:ss");
        dateFormat.add("yyyy-MM-dd HH:mm:ss.SSS");
        dateFormat.add("yyyy-MM-dd HH:mm:ss.SSSZ");
        dateFormat.add("EEEEE MMMMM yyyy HH:mm:ss.SSSZ");
        dateFormat.add("yyyy.MM.dd G 'at'HH:mm:ss z");
        dateFormat.add("EEE, MMM d, ''yy");
        dateFormat.add("h:mm a");
        dateFormat.add("hh 'o''clock' a,zzzz");
        dateFormat.add("K:mm a,z");
        dateFormat.add("yyyyy.MMMMM.dd GG hh:mm aaa");
        dateFormat.add("EEE, d MMM yyyy HH:mm:ss.SSSZ");
        dateFormat.add("yyMMddHHmmssZ");
        dateFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
        dateFormat.add("yyyy-MM-dd'T'HH:mm:ss.SSSXXX");

//        for (int i = 0; i < dateFormat.size(); i++) {
//            SimpleDateFormat sdf = new SimpleDateFormat(dateFormat.get(i));
//            Date currentDate = new Date();
//            String current = sdf.format(currentDate);
//            System.out.println(current);
////            Date curDate = sdf.parse(current);
////            System.out.println(curDate);
//        }
        for (int j = 0; j < dateFormat.size(); j++) {
            System.out.println(new SimpleDateFormat(dateFormat.get(j)).parse(userSearchFormat));
        }
    }
}
