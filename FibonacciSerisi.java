import java.util.Scanner;

public class FibonacciSerisi {

    public static void main(String[] args) {
        // 9 Elemanlı Fibonacci Serisi : 0 1 1 2 3 5 8 13 21 34

        Scanner input = new Scanner(System.in);
        
        int deger = 10;
        int sayi1 = 0;
        int sayi2 = 1;
        int toplam;

        System.out.println(deger + " Sayısının Fibonacci Serisi :");

        for(int i = 1; i <= deger; i++){
            System.out.print(sayi1 + " , ");

            toplam = sayi1+sayi2;
            sayi1 = sayi2;
            sayi2 = toplam;
        }

    }
}
