package ru.skypro;

public class Main {

    public static void main(String[] args) {
        task2();
    }

    public static void task1() {
      int sum = 0;
      int array[] = generateRandomArray();
        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void task2() {
        int array[] = generateRandomArray();
        int max = -1;
        int min = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i] > max) {
                max = array[i];
            }
             min = max;

            if (array[i] < min){
                min = array[i];
            }
        }

        System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");
    }

    public static void task3() {
        int sum = 0;
        int array[] = generateRandomArray();
        for (int i : array) {
            sum += i;
        }
        System.out.println("Средняя сумма трат за месяц составила " + sum / array.length + " рублей");
    }

    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--) {
            System.out.print(reverseFullName[i]);
        }
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
