package Poker;

import java.util.HashMap;

public class Deck
{
    static HashMap<Integer,String> createDeck()
    {
        HashMap<Integer,String> deck = new HashMap<>();

        String[] suits = new String[]{"Черва","Буби","Пика","Крести"};

        int count = 0;
        for (int i = 0; i < 4; i++)
        {
            String[] arr = suits(suits[i]);
            for (int j = 0; j < 13; j++)
            {
                deck.put(count,arr[j]);
                count++;
            }
        }
        return deck;
    }

    private static String[] suits(String mast)
    {
        String[] arr = new String[13];
        for (int i = 2; i <= 10; i++)
        {
            arr[i - 2] = i + " " + mast;
        }
        arr[9] = "Валет" + " " + mast;
        arr[10] = "Дама" + " " + mast;
        arr[11] = "Король" + " " + mast;
        arr[12] = "Туз" + " " + mast;
        return arr;
    }
}
