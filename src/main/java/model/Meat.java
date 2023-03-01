package model;

public class Meat extends Food {

    public Meat(int amount, double price) {
        super(amount, price);
        vegetarian = false;
    }
}




/*
Класс Meat — для мяса. Это класс с конструктором. Конструктор принимает два входных параметра — количество и цену.
И устанавливает для флага isVegetarian правильное значение.
 */