package model;

import static model.constants.Discount.DISCOUNT_0;

public interface Discountable {
    public default double getDiscount() {
        return DISCOUNT_0;
    }
}





/*
Интерфейс Discountable c единственным методом getDiscount.
Он возвращает размер скидки — вещественное число.

Все классы, реализующие этот интерфейс, возвращают значение 0 в методе getDiscount, если в задании не указано иное.
 */