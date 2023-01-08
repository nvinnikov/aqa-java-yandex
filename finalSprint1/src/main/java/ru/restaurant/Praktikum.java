package ru.restaurant;

public class Praktikum {

    public static void main(String[] args) {
        Restaurant restaurant = new Restaurant();
        restaurant.showMenu();
        restaurant.cook("Салат из груш и лисичек");
        restaurant.checkPears();

        // вызови три написанных ранее метода
    }

}