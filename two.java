import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class two {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        String paasword1 = "Создайте пароль: ";
        System.out.println(paasword1);


        boolean rightpass = false;
        while (rightpass == false) {
            String password = data.nextLine();
            if (password.length() >= 8) {
                if ((Pattern.compile("[a-z]+").matcher(password).find()) == true) {
                    if ((Pattern.compile("[A-Z]+").matcher(password).find()) == true) {
                        if ((Pattern.compile("[а-я]+").matcher(password).find()) == false) {
                            if ((Pattern.compile("[А-Я]+").matcher(password).find()) == false) {
                                if ((Pattern.compile("[0-9]+").matcher(password).find()) == true) {
                                    if ((Pattern.compile("[`!@№$;%:^&?*()+=<>#.,/]").matcher(password).find()) == false) {
                                        boolean b = rightpass == true;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            if (rightpass = true){
                System.out.println("Пароль надёжен");
            } else {
                    System.out.println("Пароль ненадёжен. Повторите ввод");
                }
            }
        }
    }

