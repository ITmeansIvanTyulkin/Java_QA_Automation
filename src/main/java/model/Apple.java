package model;

import static model.constants.Colour.APPLE_RED;
import static model.constants.Discount.*;

public class Apple extends Food {
    private String colour;

    public Apple(int amount, double price, String colour) {
        super(amount, price);
        this.colour = colour;
        vegetarian = true;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public double getDiscount() {
        if (colour.equals(APPLE_RED)) {
            return DISCOUNT_60;
        }
        return DISCOUNT_0;
    }
}



/*
Класс Apple — для яблок. У него есть ещё строковое поле colour — цвет яблок.
Конструктор принимает три параметра: количество, цену и цвет яблок — и устанавливает флаг isVegetarian.

Для красных яблок (colour равно "red") скидка должна быть равна 60%: соответствующий метод возвращает значение 60.
 */