package Poker;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class StartPoker
{
    static Scanner scanner = new Scanner(System.in);

    public static void pokerStart()
    {
        int amount_persons;

        System.out.print("Введите колличество игроков: ");
        amount_persons = scanner.nextInt();

        String[] rank = new String[]{
                "2","3","4","5","6","7","8","9","10",
                "Валет","Дама","Король","Туз"};

        String[] suits = new String[]{
                "Черва","Буби","Пика","Крести"};

        int length_deck = rank.length * suits.length;
        String[] deck = new String[length_deck];

        for (int i = 0; i < rank.length; i++)
        {
            for (int j = 0; j < suits.length; j++)
            {
                deck[length_deck - 1] = rank[i] + " " + suits[j];
                length_deck--;
            }
        }
        Collections.shuffle(Arrays.asList(deck));
        int count = 0;
        while (count < amount_persons * 5)
        {
            System.out.println("Карты игрока №" + (count / 5 + 1) + ": ");
            for (int j = 1; j <= 5; j++)
            {
                System.out.print(deck[count] + "    ");
                count++;
            }
            System.out.println();
        }
    }
}
