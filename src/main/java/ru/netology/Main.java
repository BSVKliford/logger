package ru.netology;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getInstance();
        Scanner scanner = new Scanner(System.in);
        logger.log("Запускаем программу");
        logger.log("Просим пользователя ввести входные данные для списка");
        System.out.print("Введите размер списка: ");
        int k = scanner.nextInt();
        System.out.print("Введите верхнюю границу для значений: ");
        int maxV = scanner.nextInt();
        logger.log("Создаём и наполняем список");
        List<Integer> source = new ArrayList<>();
        int value;
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Вот случайный список");
        while (k > 0) {
            value = random.nextInt(maxV + 1);
            source.add(value);
            stringBuilder.append(" " + value);
            k--;
        }
        String resultSB = stringBuilder.toString();
        System.out.println(resultSB);
        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.print("Введите порог для фильтра: ");
        int p = scanner.nextInt();
        logger.log("Запускаем фильтрацию ");
        Filter filter = new Filter(p);
        List<Integer> result = filter.filterOut(source);
        logger.log("Выводим результат на экран ");
        stringBuilder = new StringBuilder();
        stringBuilder.append("Отфильтрованный список:");
        for (int valueResult : result) {
            stringBuilder.append(" " + valueResult);
        }
        resultSB = stringBuilder.toString();
        System.out.println(resultSB);
        logger.log("Завершаем программу ");
    }
}