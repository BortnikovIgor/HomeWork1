public class Main {
    public static void main(String[] args) {
        // 1. Создание переменных всех пройденных типов данных и их инициализация.
        byte byteVar = 10;
        short shortVar = 300;
        int intVar = 1000;
        long longVar = 10000L;
        float floatVar = 10.5f;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean booleanVar = true;
        String stringVar = "Пример строки";

        // Вывод значений переменных в консоль для проверки.
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("int: " + intVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + booleanVar);
        System.out.println("String: " + stringVar);

        // 2. Вызов метода, выводящего приветствие.
        sayHello("Игорь");

        // 3. Вызов метода, возвращающего true, если число отрицательное.
        int testNumber = -5;
        boolean isNeg = isNegative(testNumber);
        System.out.println("Число " + testNumber + " отрицательное? " + isNeg);

        // 4. Вызов метода, который печатает, положительное ли число.
        printSign(15);
        printSign(-15);
        printSign(0);

        // 5. Вызов метода, выводящего числа от 1000 до 0, кратные 3.
        printMultiplesOf3();
    }

    // Метод для пункта 2: Выводит приветствие с указанным именем.
    public static void sayHello(String name) {
        System.out.println("Привет, " + name + "!");
    }

    // Метод для пункта 3: Возвращает true, если переданное число отрицательное.
    public static boolean isNegative(int number) {
        return number < 0;
    }

    // Метод для пункта 4: Печатает, является ли число положительным, отрицательным или нулём.
    public static void printSign(int number) {
        if (number > 0) {
            System.out.println("Число " + number + " положительное.");
        } else if (number < 0) {
            System.out.println("Число " + number + " отрицательное.");
        } else {
            System.out.println("Число равно нулю.");
        }
    }

    // Метод для пункта 5: Выводит в консоль последовательность чисел от 1000 до 0, кратных 3.
    public static void printMultiplesOf3() {
        for (int i = 1000; i >= 0; i--) {
            if (i % 3 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println(); // Переход на новую строку после последовательности.
    }
}
