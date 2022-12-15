import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class lbsecondONE {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        System.out.println("Введите дату день/месяц/год");
        String day = data.nextLine();
        Pattern p = Pattern.compile("([0-9][0-9]\\/[0-9][0-9]\\/[0-9][0-9][0-9][0-9])");
        Matcher m = p.matcher(day);
        if (m.find()) {
            Pattern p1 = Pattern.compile("(0[1-9]\\1[0-9]\\2[0-9]\\3[0-1])/(0[1-9]\\1[0-2])/([0-9][0-9][0-9][0-9])");
            Matcher m1 = p1.matcher(day);
            if (m1.find()) {
                System.out.println("Веденное выражение является датой");
            } else{
                System.out.println("Введенное выражение не является датой");
                }
        } else {
            System.out.println("Введенное выражение не соответствует заданному формату даты dd/mm/yyyy");
        }
    }
}