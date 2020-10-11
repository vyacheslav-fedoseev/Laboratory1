package bsu.rfe.java.group7.lab1.Fedoseev.varB6;

public class Coffee extends Food{
    // Новое внутреннее поле данных АРОМАТ
    private String aroma;

    public Coffee(String aroma) {
        super("Кофе");
        this.aroma = aroma;
    }
    // Переопределить способ употребления кофе
    public void consume() {
        System.out.println(this + " выпито");
    }
    // Переопределить подсчёт каллорий
    public double calculateCalories() {
        if(this.aroma.equals("Большое"))
            return 150.0;
        else if(this.aroma.equals("Среднее"))
            return 100.0;
        else if(this.aroma.equals("Маленькое"))
            return 50.0;
        else return 0.0;
    }
    // Селектор для доступа к полю данных АРОМАТ
    public String getAroma() {
        return aroma;
    }
    // Модификатор для изменения поля данных АРОМАТ
    public void setAroma(String aroma) {
        this.aroma = aroma;
    }
    // Переопределѐнная версия метода equals(), которая при сравнении
// учитывает не только поле name (Шаг 1), но и проверяет совместимость
// типов (Шаг 2) и совпадение аромата (Шаг 3)
    public boolean equals(Object arg0) {
        if (super.equals(arg0)) { // Шаг 1
            if (!(arg0 instanceof Coffee)) return false; // Шаг 2
            return aroma.equals(((Coffee)arg0).aroma); // Шаг 3
        } else
            return false;
    }
    // Переопределѐнная версия метода toString(), возвращающая не только
// название продукта, но и его аромат
    public String toString() {
        return super.toString() + " аромата '" + aroma.toUpperCase() + "'";
    }

}


/*

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

*/