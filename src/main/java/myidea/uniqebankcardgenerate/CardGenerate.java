package myidea.uniqebankcardgenerate;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CardGenerate {
    public static String generateUniqeBankCardNumber(){
        List<String> cardList = new ArrayList<>();
        Random random = new Random();
        String firstEightNumber = "41697388";
        String resultNumber;
        Integer num9 = random.nextInt(0,9);
        Integer num10 = random.nextInt(0,9);
        Integer num11 = random.nextInt(0,9);
        Integer num12 = random.nextInt(0,9);
        Integer num13 = random.nextInt(0,9);
        Integer num14 = random.nextInt(0,9);
        Integer num15 = random.nextInt(0,9);
        Integer num16 = random.nextInt(0,9);

        String strNum9 = num9.toString();
        String strNum10 = num10.toString();

        for (int i = 9; i <17; i++) {
            resultNumber = firstEightNumber +strNum9;
        }




        return null;
    }
}
