import java.util.Arrays;
import java.util.Scanner;

/**
 * Istifadeci evvelce massivin uzunlugunu teyin edir
 * Daha sonra Scanner vasitesiyle ora ededler daxil edir
 */
public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Massiv uzunlugu ne qeder olsun?");
        int length = scanner.nextInt();
        System.out.println("------------------");
        System.out.println("Uzunlugu " + length + " olan massiv yaradilacaq");
        int[] arr = createArray(length);
        System.out.println("Uzunlugu " + length + " olan massiv: " + Arrays.toString(arr));

    }

    public static int[] createArray(int length) {
        int[] arr = new int[length];
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ededleri massive daxil edin : Daxil ede bileceyiniz maksimum eded sayi => " + length);
        for (int i = 0; i < length; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }
}
