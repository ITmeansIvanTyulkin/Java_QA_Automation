package model.service;

import model.Food;

import static model.constants.Colour.*;
import static model.constants.Discount.*;

public class ShoppingCart {

    private Food[] foods;

    public ShoppingCart(Food[] array) {
        foods = array;
    }

    // Вывожу общую сумму товаров в корзине без скидки.
    public double getPrice() {
        double sum = 0.0;
        for (Food prod : foods) {
            sum += prod.getPrice() * prod.getAmount();
        }
        return sum;
    }

    // Вывожу общую сумму товаров в корзине со скидкой.
    public double getDiscount() {
        double sum = 0.0;
        for (int i = 0; i < foods.length; i++) {
            sum += foods[i].getAmount() * (foods[i].getPrice() - foods[i].getPrice() * foods[i].getDiscount() / 100);
        }
        return sum;
    }

    // Вывожу общую сумму всех вегетарианских продуктов в корзине без скидки.
    public double veganCount() {
        double sum = 0.0; // сумма для яблок
        for (int i = 0; i < foods.length; i++) {
            if (foods[i].isVegetarian()) {
                sum += foods[i].getPrice() * foods[i].getAmount();
            }
        }
        return sum;
    }
}


/*
Пакет service. В нём создай класс для корзины — ShoppingCart. Добавь в него поле — массив элементов из объектов типа Food.
Понадобится конструктор с одним параметром — массивом элементов Food. С его помощью ты создашь объект корзины.

В классе ShoppingCart реализуй методы для работы с корзиной:
получить общую сумму товаров в корзине без скидки,
получить общую сумму товаров в корзине со скидкой,
получить общую сумму всех вегетарианских продуктов в корзине без скидки.

Все переменные класса должны быть недоступны извне, если не указано иное. Доступ к ним реализуй через известные тебе методы:
создавай только те, которые действительно нужны для реализации описанной функциональности.
 */