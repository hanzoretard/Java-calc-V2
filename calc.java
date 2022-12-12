import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class calc {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = -1;
        int num2 = -1;
        String[] subStr;
        String delimeter = "\\ ";
        boolean check = false;

        System.out.print("Введите выражение: ");
        String num = String.valueOf(in.nextLine());

        subStr = num.split(delimeter);
        try {
            num1 = Integer.parseInt(subStr[0]);
            check = true;
        } catch (NumberFormatException e) {}
        try {
            num2 = Integer.parseInt(subStr[2]);
            check = true;
        } catch (NumberFormatException e) {}


        if ((((num1 != -1) && (num2 == -1)) || ((num1 == -1) && (num2 != -1))))
        {
            System.out.println("Введеные данные не являются верными");
            System.exit(0);
        }

        if (check == true && ((num1 < 1 || num1 > 10) || (num2 < 1 || num2 > 10)))
        {
            System.out.println("Введеные данные не являются верными");
            System.exit(0);
        }

        subStr = num.split(delimeter);
        if (check == false)
        switch(subStr[0]) {
            case "X": subStr[0] = "10"; break;
            case "IX": subStr[0] = "9"; break;
            case "VIII": subStr[0] = "8"; break;
            case "VII": subStr[0] = "7"; break;
            case "VI": subStr[0] = "6"; break;
            case "V": subStr[0] = "5"; break;
            case "IV": subStr[0] = "4"; break;
            case "III": subStr[0] = "3"; break;
            case "II": subStr[0] = "2"; break;
            case "I": subStr[0] = "1"; break;
            default: System.out.println("Введеные данные не являются верными");
                System.exit(0);
        }
        if (check == false)
        switch(subStr[2]) {
            case "X": subStr[2] = "10"; break;
            case "IX": subStr[2] = "9"; break;
            case "VIII": subStr[2] = "8"; break;
            case "VII": subStr[2] = "7"; break;
            case "VI": subStr[2] = "6"; break;
            case "V": subStr[2] = "5"; break;
            case "IV": subStr[2] = "4"; break;
            case "III": subStr[2] = "3"; break;
            case "II": subStr[2] = "2"; break;
            case "I": subStr[2] = "1"; break;
            default: System.out.println("Введеные данные не являются верными");
                System.exit(0);
        }
        try {
            num1 = Integer.parseInt(subStr[0]);
            num2 = Integer.parseInt(subStr[2]);
        } catch (NumberFormatException e) {
            System.err.println("Введеные данные не являются верными");
        }

        int x= 0;
        // производим операцию с ячейкой массива
        switch(subStr[1]) {
            case "+":
                x = (num1+num2);
                break;
            case "-":
                x = (num1-num2);
                break;
            case "*":
                x = (num1*num2);
                break;
            case "/":
                x = (num1/num2);
                break;


        }
        if (check == false){
            num = String.valueOf(Math.abs(x));
            char[] result = num.toCharArray();
            switch(result.length) {
                case 1:
                    num = String.valueOf(result[0]);
                    num = num.replace("9", "VIV");
                    num = num.replace("8", "VIII");
                    num = num.replace("7", "VII");
                    num = num.replace("6", "VI");
                    num = num.replace("5", "V");
                    num = num.replace("4", "IV");
                    num = num.replace("3", "III");
                    num = num.replace("2", "II");
                    num = num.replace("1", "I");
                    System.out.println(num);
                    System.exit(0);
                    break;
                case 2:
                    if (x >= 90) {
                        System.out.print("XC");
                        x -= 90;
                    } else if (x>= 50) {
                        System.out.print("L");
                        x -= 50;

                    } else if (x>=40){
                        System.out.print("XL");
                        x -= 40;
                    }


                    while (x>=10) {
                        System.out.print("X");
                        x -= 10;
                    }
                    switch(x) {
                        case 0: System.exit(0); break;
                        case 1: System.out.print("I"); break;
                        case 2: System.out.print("II"); break;
                        case 3: System.out.print("III"); break;
                        case 4: System.out.print("IV"); break;
                        case 5: System.out.print("V"); break;
                        case 6: System.out.print("VI"); break;
                        case 7: System.out.print("VII"); break;
                        case 8: System.out.print("VIII"); break;
                        case 9: System.out.print("IX"); break;
                    }

                    System.exit(0);

                    break;
                case 3:
                    System.out.println("C");
                    System.exit(0);
                    break;
            }


        } else
            System.out.println(x);
    }
}