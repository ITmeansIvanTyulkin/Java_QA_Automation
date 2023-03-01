package model;

public abstract class Food implements Discountable {
    protected int amount;
    protected double price;
    protected boolean vegetarian;

    public Food(int amount, double price) {
        this.amount = amount;
        this.price = price;
    }

    public int getAmount() {
        return amount;
    }

    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}



/*
Класс Food — абстрактный класс с полями:

amount — количество продукта в килограммах (целое число);
price — цена за единицу (вещественное число);
isVegetarian — флаг, который показывает, вегетарианский ли продукт.
Поля должны быть доступны только из классов-потомков.
 */