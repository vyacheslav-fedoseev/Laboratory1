package bsu.rfe.java.group7.lab1.Fedoseev.varB6;

public class Apple extends Food {
    // Новое внутреннее поле данных РАЗМЕР
    private String size;

    public Apple(String size) {
// Вызвать конструктор предка, передав ему имя класса
        super("Яблоко");
// Инициализировать размер яблока
        this.size = size;
    }
    // Переопределить способ употребления яблока
    public void consume() {
        System.out.println(this + " съедено");
    }
    // Переопределить подсчёт каллорий
    public double calculateCalories() {
        if(this.size.equals("Горький"))
            return 90.0;
        else if(this.size.equals("Насыщенный"))
            return 75.0;
        else if(this.size.equals("Восточный"))
            return 60.0;
            else return 0.0;
    }
    // Селектор для доступа к полю данных РАЗМЕР
    public String getSize() { return size; }
    // Модификатор для изменения поля данных РАЗМЕР
    public void setSize(String size) {
        this.size = size;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение размеров (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Apple)) return false; // Шаг 2
            return size.equals(((Apple)arg0).size); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его размер
    public String toString() {
        return super.toString() + " размера '" + size.toUpperCase() + "'";
    }
}
