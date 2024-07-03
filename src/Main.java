public class Main {
    public static void main(String[] args) {
        System.out.println("Привет, куратор!");

        System.out.println("Задача 1");
        for (int a = 1; a <= 10; a++) {
            System.out.println(a);
        }

        System.out.println("Задача 2");
        for (int b = 10; b >= 1; b--) {
            System.out.println(b);
        }

        System.out.println("Задача 3");
        for (int c = 0; c <= 17; c++) {
            if (c % 2 == 0) {
                System.out.println(c);
            }
        }

        System.out.println("Задача 4");
        for (int d = 10; d >= -10; d--) {
            System.out.println(d);
        }

        System.out.println("Задача 5");
        for (int year = 1904; year <= 2096; year++) {
            if (year % 4 == 0) {
                System.out.println(year + " год является високосным.");
            }
        }

        System.out.println("Задача 6");
        for (int n = 7; n <= 98; n = n + 7) {
            System.out.println(n);
        }

        System.out.println("Задача 7");
        for (int m = 1; m <= 512; m = m + m) {
            System.out.println(m);
        }

        System.out.println("Задача 8");
        int stash = 29900;
        int total = 0;
        for (int mnth = 1; mnth <= 12; mnth++) {
            total = total + stash;
            System.out.println("Месяц " + mnth + ", сумма накоплений равна " + total + " рублей.");
        }

        System.out.println("Задача 9");
        int inBank = 29900;
        int Total = 0;
        for (int month = 1; month <= 12; month++) {
            inBank = inBank + inBank / 100 * 12;
            Total = Total + inBank;
            System.out.println("Месяц " + month + ", сумма накоплений равна " + Total + " рублей.");
        }

        System.out.println("Задача 10");
        int result;
        for (int nm = 1; nm <= 10; nm++) {
            result = nm * 2;
            System.out.println("2 * " + nm + " = " + result);
        }
    }
}