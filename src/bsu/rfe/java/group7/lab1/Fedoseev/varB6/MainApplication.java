// Объявление класса частью пакета
package bsu.rfe.java.group7.lab1.Fedoseev.varB6;

public class MainApplication {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {

        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        //Разнообразие продуктов
        final int variety = 3;
        //Счётчик для количества продуктов, где:
        //count[0] - Apple
        //count[1] - Cheese
        //count[2] - Coffee
        int[] count = new int[variety];
        //обнуляем этот массив
        for(int i = 0; i < variety; ++i){
            count[i] = 0;
        }

        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
                count[0]++;
            } else
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
                count[1]++;
            } else

            if (parts[0].equals("Coffee")) {
// У кофе – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Coffee(parts[1]);
                count[2]++;
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
        System.out.println("Употреблено в количестве:");
        System.out.println("Яблоко: " + count[0] + "\nСыр: " + count[1] + "\nКофе: " + count[2]);
        System.out.println("Всего хорошего!");
    }
}

