package attestationOne;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Person {
    //Объявляем характеристики человека
    private final String name;
    private int money;
    private final List<Products> products;

    //Объявляем конструктор
    public Person (String name, int money) {
        //Проверка на пустое значение и меньше 3 символов
        if (name == null || name.isEmpty() || name.length() < 3) {
            //Как и в случае с классом Products, выводим ошибку, чтобы объект не создавался
            throw new IllegalArgumentException("Имя не может быть пустым и должно содержать не меньше 3х символов!");
        }
        //Проверка на отрицательное количество денег
        if (money<0) throw new IllegalArgumentException("Количество денег не может быть отрицательным!");
        //Инициализация полей и пустого списка покупок
        this.name = name;
        this.money = money;
        this.products = new ArrayList<>();

    }

    //Генерируем геттеры
    public String getName() {
        return name;
    }

    public int getMoney() {
        return money;
    }

    public List<Products> getProducts() {
        return products;
    }

    @Override
    public String toString() {
        return name + " = " + money + " руб.)";
    }
}
