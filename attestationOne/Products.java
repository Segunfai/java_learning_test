package attestationOne;

import java.util.Objects;

public class Products {
    //Объявляем характеристики
    private String naimenovanie;
    private int cost;
    //Объявляем конструктор
    public Products (String naimenovanie, int cost) {
        //Проверяем названия на пустоту и деньги на отрицательное значение
        if (naimenovanie == null || naimenovanie.isEmpty()) {
            //Используем именно эту конструкцию для того, чтобы объект не создавался, а не просто вывод сообщения в консоль
            throw new IllegalArgumentException("Название продукта не может быть пустым!");
        }
        if (cost < 0) {
            throw new IllegalArgumentException("Цена продукта не может быть отрицательной!");
        }
        this.naimenovanie = naimenovanie;
        this.cost = cost;
    }
    //Генерируем геттеры
    public String getNaimenovanie() {
        return naimenovanie;
    }

    public int getCost() {
        return cost;
    }

    //Переопределяем все в строку
    @Override
    public String toString() {
        return naimenovanie + " = " + cost + " руб.)";
    }
    //Сравниваем значения
    @Override
    public boolean equals(Object obj) {
        //Если один и тот объект, то истина
        if (this == obj) return true;
        //Проверка на null и объект другого класса
        if (obj == null || getClass() != obj.getClass()) return false;
        //Приведение к типу конструктора Products
        Products product = (Products) obj;
        //Финальное сравнение на стоимость и наименование
        return cost == product.cost && Objects.equals(naimenovanie, product.naimenovanie);
    }
    // Генерируем хеш-код на основе полей
    @Override
    public int hashCode() {
        return Objects.hash(naimenovanie, cost);
    }
}
