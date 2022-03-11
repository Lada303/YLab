package Lada303.Lesson2;

import javax.xml.crypto.Data;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class JavaRush5 {
    //Задачи на создание своих классов и объектов
    static class Cat{
        String name;
        int age;
        int weight;
        int strength;

        public boolean fight(Cat that) {
            return this.age * this.strength / this.weight > that.age * that.strength / that.weight;
        }
    }

    static class Dog {
        private String name;
        private int age;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        Cat cat1 = new Cat();
        cat1.name = "bars";
        cat1.age = 3;
        cat1.weight = 5;
        cat1.strength = 10;
        Cat cat2 = new Cat();
        cat2.name = "lars";
        cat2.age = 3;
        cat2.weight = 5;
        cat2.strength = 9;
        Cat cat3 = new Cat();
        cat3.name = "mars";
        cat3.age = 4;
        cat3.weight = 5;
        cat3.strength = 10;

        System.out.println(cat1.fight(cat2));
        System.out.println(cat2.fight(cat1));
        System.out.println(cat2.fight(cat3));
        System.out.println(cat3.fight(cat2));
        System.out.println(cat1.fight(cat3));
        System.out.println(cat3.fight(cat1));

    }

    // Дополнительные задания
    //4
    private static void currentDate() {
        SimpleDateFormat format = new SimpleDateFormat("dd MM yyyy");
        System.out.println(format.format(new Date()));
    }

    //5
    private static void sumNum() {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        String str;
        while (true) {
            str = sc.nextLine();
            try {
               int a = Integer.parseInt(str);
               sum += a;
            } catch (NumberFormatException e) {
                if (str.equalsIgnoreCase("сумма")) {
                    System.out.println(sum);
                    return;
                } else {
                    System.out.println("веедите число или слово сумма, чтобы получить результат");
                }
            }
        }
    }

}

//Задания по инициализации объектов
//1
class Friend{
    private String name;
    private int age;
    private char gender;

    public void initialize(String name) {
        this.name = name;
        this.age = 18;
        this.gender = '0';
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = '0';
    }

    public void initialize(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
//2
class Cat2{
    String name;
    int age;
    int weight;
    String color;
    String address;

    public void initialize(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.color = "some";
    }

    public void initialize(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "some";
    }

    public void initialize(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "some";
    }

    public void initialize(int weight, String color) {
        this.age = 1;
        this.weight = 3;
        this.color = color;
    }

    public void initialize(int weight, String color, String address) {
        this.age = 1;
        this.weight = 3;
        this.color = color;
        this.address = address;
    }
}
//3
class Dog2{
    String name;
    int growth;
    String color;

    public void initialize(String name) {
        this.name = name;
        this.color = "some";
    }

    public void initialize (String name, int growth){
        this.name = name;
        this.growth = growth;
        this.color = "some";
    }

    public void initialize (String name, int growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
}
//4
class Circle{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public void initialize (int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = 1;
        this.color = "black";
    }

    public void initialize (int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = "black";
    }

    public void initialize (int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
//5
class Rectangle{
    private int top;
    private int left;
    private int width;
    private int height;

    public void initialize (int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void initialize (int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void initialize (int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void initialize (Rectangle that){
        this.top = that.top;
        this.left = that.left;
        this.width = that.width;
        this.height = that.height;
    }
}

//Задачи на конструкторы
//1
class Friend3{
    private String name;
    private int age;
    private char gender;

    public void Friend3(String name) {
        this.name = name;
        this.age = 18;
        this.gender = '0';
    }

    public void Friend3(String name, int age) {
        this.name = name;
        this.age = age;
        this.gender = '0';
    }

    public Friend3(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
}
//2
class Cat3{
    String name;
    int age;
    int weight;
    String color;
    String address;

    public void Cat3(String name) {
        this.name = name;
        this.age = 1;
        this.weight = 3;
        this.color = "some";
    }

    public void Cat3(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "some";
    }

    public void Cat3(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 3;
        this.color = "some";
    }

    public void Cat3(int weight, String color) {
        this.age = 1;
        this.weight = 3;
        this.color = color;
    }

    public void Cat3(int weight, String color, String address) {
        this.age = 1;
        this.weight = 3;
        this.color = color;
        this.address = address;
    }
}
//3
class Dog3{
    String name;
    int growth;
    String color;

    public void Dog3(String name) {
        this.name = name;
        this.color = "some";
    }

    public void Dog3(String name, int growth){
        this.name = name;
        this.growth = growth;
        this.color = "some";
    }

    public void Dog3(String name, int growth, String color){
        this.name = name;
        this.growth = growth;
        this.color = color;
    }
}
//4
class Circle3{
    private int centerX;
    private int centerY;
    private int radius;
    private int width;
    private String color;

    public void Circle3(int centerX, int centerY, int radius){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = 1;
        this.color = "black";
    }

    public void Circle3(int centerX, int centerY, int radius, int width){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = "black";
    }

    public void Circle3(int centerX, int centerY, int radius, int width, String color){
        this.centerX = centerX;
        this.centerY = centerY;
        this.radius = radius;
        this.width = width;
        this.color = color;
    }
}
//5
class Rectangle3{
    private int top;
    private int left;
    private int width;
    private int height;

    public void Rectangle3(int top, int left){
        this.top = top;
        this.left = left;
        this.width = 0;
        this.height = 0;
    }

    public void Rectangle3(int top, int left, int width){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }

    public void Rectangle3(int top, int left, int width, int height){
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;
    }

    public void Rectangle3(Rectangle3 that){
        this.top = that.top;
        this.left = that.left;
        this.width = that.width;
        this.height = that.height;
    }
}


