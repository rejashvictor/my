/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
* Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simpledateformat;

import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author pavithran subramanian - pavithran.subramanian@solverminds.com
 */
public class DateFormatMatcher {

    /**
     * @param args the command line arguments
     */
    static List<String> dateFormat = new ArrayList<String>();

    public static void main(String[] args) {
        String userSearchFormat = "20.05.2022";
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
        dateFormat.add("YYMMDD");
        dateFormat.add("MMDDYY");
        dateFormat.add("YYYYMMDD");
        dateFormat.add("DDMMYYYY");
        dateFormat.add("MMDDYYYY");
        dateFormat.add("DDMMYY");
        dateFormat.add("YYMMMDD");
        dateFormat.add("DDMMMYY");
        dateFormat.add("MMMDDYY");
        dateFormat.add("YYYYMMMDD");
        dateFormat.add("DDMMMYYYY");
        dateFormat.add("MMMDDYYYY");
        dateFormat.add("YYDDD");
        dateFormat.add("DDDYY");
        dateFormat.add("YYYYDDD");
        dateFormat.add("DDDYYYY");
        dateFormat.add("YY/MM/DD");
        dateFormat.add("DD/MM/YY");
        dateFormat.add("MM/DD/YY");
        dateFormat.add("YYYY/MM/DD");
        dateFormat.add("DD/MM/YYYY");
        dateFormat.add("MM/DD/YYYY");
        dateFormat.add("YY/MMM/DD");
        dateFormat.add("DD/MMM/YY");
        dateFormat.add("MMM/DD/YY");
        dateFormat.add("YYYY/MMM/DD");
        dateFormat.add("DD/MMM/YYYY");
        dateFormat.add("MMM/DD/YYYY");
        dateFormat.add("YY/DDD");
        dateFormat.add("DDD/YY");
        dateFormat.add("YYYY/DDD");
        dateFormat.add("DDD/YYYY");
        dateFormat.add("MONTH");
        dateFormat.add("DAY");
        dateFormat.add("HHMM");
        dateFormat.add("HHMMSS");
        dateFormat.add("HH:MM");
        dateFormat.add("HH:MM:SS");
        dateFormat.add("YYYYMMDDTHH MMSS.mmmZ");
        dateFormat.add("YYYYMMDDZ");
        dateFormat.add("MM/DD/YY HH:MM:SS");
        dateFormat.add("YYMMDD HHMMSS");
        dateFormat.add("YYYY-MMDDTHH: MM:SS");
        dateFormat.add("YYYY-MM-DD");
        dateFormat.add("YYYY-MM");
        dateFormat.add("YYYY");
        dateFormat.add("--MM-DD");
        dateFormat.add("---DD");
        dateFormat.add("dd.MM.yyyy");
        String format = dateFormatMatcher(userSearchFormat);
        System.out.println("Correct format :|: " + format);
    }

    public static String dateFormatMatcher(String inputDate) {
        String returnFormat = new String();
        for (String format : dateFormat) {
            try {
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern(format);
                formatter.parse(inputDate);
                returnFormat = format;
                break;
            } catch (Exception ex) {
//                System.out.println("Not matching");
            }
        }
        return returnFormat;
    }

}
