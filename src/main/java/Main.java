import model.Apple;
import model.Food;
import model.Meat;
import model.service.ShoppingCart;

import static model.constants.Colour.*;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple red = new Apple(10, 50, APPLE_RED);
        Apple green = new Apple(8, 60, APPLE_GREEN);

        Food[] array = new Food[3];
        ShoppingCart cart = new ShoppingCart(array);
        array[0] = meat;
        array[1] = red;
        array[2] = green;

        System.out.println("Общая сумма товаров в корзине без скидки: " + cart.getPrice() + " рублей.");
        System.out.println("Общая сумма товаров в корзине со скидкой: " + cart.getDiscount() + " рублей.");
        System.out.println("Общая сумма всех вегетарианских продуктов в корзине без скидки: " + cart.veganCount() + " рублей.");
    }
}


/*
В методе main реализуй следующую логику:
Инициализируй данные. Для этого создай объекты:
Мясо в количестве 5 кг по цене 100 рублей за кг;
Яблоки красные в количестве 10 кг по цене 50 рублей;
Яблоки зелёные в количестве 8 кг по цене 60 рублей.

Создай массив продуктов из этих элементов и проинициализируй корзину с помощью созданного массива.
 */