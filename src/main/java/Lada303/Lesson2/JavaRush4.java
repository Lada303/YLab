package Lada303.Lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaRush4 {

    // Задачи на видимость переменных
    static class Cat {
        private static int catsCount = 0;

        private String name;
        private String fullName;

        //1
        public void setName(String name) {
            this.name = name;
        }

        //2
        public static void addNewCat() {
            catsCount++;
        }

        public static int getCatsCount() {
            return catsCount;
        }

        //3
        public static void setCatsCount(int n) {
            catsCount = n;
        }

        //4
        public void setFullName(String firstName, String secondName) {
            this.fullName = firstName + " " + secondName;
        }
    }

    public static void main(String[] args) {
        //5
        Cat cat1 = new Cat();
        Cat.addNewCat();
        Cat cat2 = new Cat();
        Cat.addNewCat();
        System.out.println("Cats count is " + Cat.catsCount);
        System.out.println("Cats count is " + Cat.getCatsCount());

        //Задания на условные операторы
        printMinFromTwoNum();
        printMaxFromFourNum();
        sortThreeNum();
        isEqualsName();
        isAge();

        //ЗАдания на цикл while
        task1();
        System.out.println();
        task2();
        System.out.println();
        task3();
        task4();
        task5();

        //Задания ан цикл for
        taskFor1();
        taskFor2();
        taskFor3();
        taskFor4();
        taskFor5();

        //Дополнительные задания
        taskHard1();
        avgFromThreeNum();
        sumNum();
        taskHard4();
    }
    //Задачи на условные операторы
    //1
    private static void printMinFromTwoNum() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter whole numbers only");
            return;
        }
        System.out.println(a < b ? a : b);
    }
    //2
    private static void printMaxFromFourNum() {
        Scanner sc = new Scanner(System.in);
        int max;
        try {
            max = sc.nextInt();
            for (int i = 0; i < 3; i++) {
                max = Math.max(max, sc.nextInt());
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter whole numbers only");
            return;
        }
        System.out.println(max);
    }
    //3
    private static void sortThreeNum() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter whole numbers only");
            return;
        }
        if (a >= b) {
            if (b >= c) {
                System.out.println("" + a + b + c);
            } else if (a >= c) {
                System.out.println("" + a + c + b);
            } else {
                System.out.println("" + c + a + b);
            }
        } else {
            if (c >= b) {
                System.out.println("" + c + b + a);
            } else if (a >= c) {
                System.out.println("" + b + a + c);
            } else {
                System.out.println("" + b + c + a);
            }
        }
    }
    //4
    private static void isEqualsName() {
        Scanner sc = new Scanner(System.in);
        String name1 = sc.nextLine();
        String name2 = sc.nextLine();
        if (name1.equalsIgnoreCase(name2)) {
            System.out.println("Имена идентичны");
        } else if (name1.length() == name2 .length()) {
            System.out.println("Длины имен равны");
        }
    }
    //5 и 6
    private static void isAge() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String age = sc.nextLine();
        try {
            if (Integer.parseInt(age) < 18) {
                System.out.println("подрасти еще");
            } else if (Integer.parseInt(age) > 20) {
                System.out.println("И 18-ти достаточно");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. The second argument must be a number");
        }
    }

    //задачи на циклы While
    //1
    private static void task1() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i++);
        }
    }
    //2
    private static void task2() {
        int i = 10;
        while (i >= 1) {
            System.out.print(i--);
        }
    }
    //3
    private static void task3() {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        while (n >= 1) {
            System.out.println(str);
            n--;
        }
    }
    //4
    private static void task4() {
        int i;
        int j = 10;
        while (j >= 1) {
            i = 10;
            while (i >= 1) {
                System.out.print("S");
                i--;
            }
            System.out.println();
            j--;
        }
    }
    //5
    private static void task5() {
        int i;
        int j = 1;
        while (j <= 10) {
            i = 1;
            while (i <= 10) {
                System.out.print(i * j + " ");
                i++;
            }
            System.out.println();
            j++;
        }
    }

    //Задачи на циклы for
    //1
    private static void taskFor1() {
        for (int i = 2; i <= 100; i = i + 2) {
            System.out.print(i + " ");
        }
    }
    //2
    private static void taskFor2() {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
    //3
    private static void taskFor3() {
         for (int i = 1; i <= 10; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(8);
            }
            System.out.println();
        }
    }
    //4
    private static void taskFor4() {
        for (int i = 0; i < 10; i++) {
            System.out.print(8);
        }
        System.out.println();
        for (int i = 0; i < 10; i++) {
            System.out.println(8);
        }
    }
    //5
    private static void taskFor5() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        for (int i = 0; i < 10; i++) {
              System.out.println(name + " любит меня!");
        }
    }

    //Доп задания
    //1
    private static void taskHard1() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Я никогда не буду работать за копейки");
        }
    }
    //2
    private static void avgFromThreeNum() {
        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        try {
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter whole numbers only");
            return;
        }
        if ((a <= b && b <= c) || (c <= b && b <= a)) {
            System.out.println(b);
            return;
        }
        if ((b <= c && c <= a) || (a <= c && c <= b)) {
            System.out.println(c);
            return;
        }
        if ((c <= a && a <= b) || (b <= a && a <= c)){
            System.out.println(a);
            return;
        }
    }
    //3
    private static void sumNum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int a = 0;
        while (a != -1) {
            a = sc.nextInt();
            sum += a;
        }
        System.out.println(sum);
    }
    //4
    private static void taskHard4() {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String strDate = sc.nextLine();
        String[] date = strDate.split(", ");
        System.out.println("Меня зовут " + name);
        if (date.length < 3) {
            System.out.println("Ошибка при вводе данных по дате рождения");
            return;
        }
        System.out.println("Я родился " + date[2] + "." + date[1] + "." + date[0]);
    }
}
