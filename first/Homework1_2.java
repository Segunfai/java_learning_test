package first;

import java.util.Random;

public class Homework1_2 {
    public static void main(String[] args) {
        String[] knb = new String[] {"Камень", "Ножницы", "Бумага"};
        Random igra = new Random();
        int vyborVasya = igra.nextInt(knb.length);
        int vyborPetya = igra.nextInt(knb.length);
        String vasya = knb[vyborVasya];
        String petya = knb[vyborPetya];
        String nichya = "Ничья! Победила дружба!";
        String pobedaVasi = "Победил Вася!";
        String pobedaPeti = "Победил Петя!";
        System.out.println("Выбор игрока Вася: " + vasya);
        System.out.println("Выбор игрока Петя: " + petya);
        if (vasya.equals("Ножницы") && petya.equals("Бумага")) {
            System.out.println(pobedaVasi);
        } else if (vasya.equals("Бумага") && petya.equals("Ножницы")) {
            System.out.println(pobedaPeti);
        } else if (vasya.equals("Камень") && petya.equals("Ножницы")) {
            System.out.println(pobedaVasi);
        } else if (vasya.equals("Ножницы") && petya.equals("Камень")) {
            System.out.println(pobedaPeti);
        } else if (vasya.equals("Бумага") && petya.equals("Камень")) {
            System.out.println(pobedaVasi);
        } else if (vasya.equals("Камень") && petya.equals("Бумага")) {
            System.out.println(pobedaPeti);
        } else System.out.println(nichya);
    }
}

//Знаю, что можно сократить решение, но пока изучаю основы