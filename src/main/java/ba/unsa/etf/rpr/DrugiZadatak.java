package ba.unsa.etf.rpr;
import java.util.Scanner;

public class DrugiZadatak {
    public static int SumaCifara (int x){
        int sumaCifara=0;
        while(x!=0){
            sumaCifara += x%10;
            x/= 10;
        }
        return sumaCifara;
    }

    public static void main(String[] args) {
        int n;
        System.out.println("Unesite n");
        Scanner ulaz = new Scanner(System.in);
        n = ulaz.nextInt();
        for (int i=1; i<=n; i++) {
            if(i % SumaCifara(i) == 0) {
                System.out.println(i);
            }
        }
    }
}