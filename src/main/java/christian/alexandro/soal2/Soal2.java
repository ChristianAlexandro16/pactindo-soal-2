package christian.alexandro.soal2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Soal2 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int input = 0;

        while (input != 5) {
            System.out.println("Custom 1: ");
            System.out.println("Custom 2: ");
            System.out.println("Custom 3: ");
            System.out.println("Custom 4: ");
            System.out.println("Exit (5) ");
            System.out.print("Pilih menu: ");
            input = scan.nextInt();

            if (input == 1) {
                custom1();
            } else if (input == 2) {
                custom2();
            } else if (input == 3) {
                custom3();
            } else if (input == 4) {
                custom4();
            }
        }
    }

    public static void custom1() {
        Scanner scan = new Scanner(System.in);
        String result = "";
        boolean checkChar;
        System.out.println("Masukkan input text: ");
        String data = scan.nextLine();

        int jumlah = data.length();
        System.out.println(jumlah);

        for (int i = 0; i < jumlah; i++) {
            char testChar = data.charAt(i);
            if (testChar != ' ') {
                checkChar = Character.isLowerCase(testChar);

                if (checkChar) {
                    testChar = Character.toUpperCase(testChar);
                } else {
                    testChar = Character.toLowerCase(testChar);
                }

                result = result + testChar;
            } else {
                result = result + " ";
            }
        }
        System.out.println("Output: " + result);
        System.out.println();
    }

    public static void custom2() {
        Scanner scan = new Scanner(System.in);
        String result = "";
        System.out.println("Masukkan input text: ");
        String data = scan.nextLine();

        int jumlah = data.length();

        System.out.println(jumlah);

        for (int i = 0; i < jumlah; i++) {
            char testChar = Character.toLowerCase(data.charAt(i));
            String a = Character.toString(data.charAt(i));

            if (testChar != 'a' && testChar != 'e' && testChar != 'i' && testChar != 'o' && testChar != 'u') {
                result = result + data.charAt(i);
            }
        }

        System.out.println("Output: " + result);
        System.out.println();
    }

    public static void custom3() {
        Scanner scan = new Scanner(System.in);
        String result = "";
        int checkpoint = 0;
        System.out.println("Masukkan input text: ");
        String data = scan.nextLine();

        int jumlah = data.length();

        System.out.println(jumlah);

        for (int i = 0; i < jumlah; i++) {
            if (data.charAt(i) == ' ') {
                for (int j = i; j > checkpoint; j--) {
                    result = result + data.charAt(j - 1);
                }
                result = result + " ";
                checkpoint = i;
            }
        }

        System.out.println("Output: " + result);
        System.out.println();

    }

    public static void custom4() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Masukkan input text (abc, def, ghi, ...): ");
        String data = scan.nextLine();
        //List<String> dataList = new ArrayList<String>();
        String[] dataList = data.split(",");

        System.out.println(dataList.length);

        for (int i = 0; i < dataList.length; i++) {
            String checkData = "";
            for (int j = dataList[i].length() - 1; j >= 0; j--) {
                checkData = checkData + dataList[i].charAt(j);
            }
            if (dataList[i].equals(checkData)) {
                System.out.println(dataList[i] + " merupakan palindrom");
            } else {
                System.out.println(dataList[i] + " bukan palindrom");
            }
        }
    }
}
