import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FoProgram {

    public static int add(String numbers){
        int osszeg = 0;
        String[] szamokSzovegkent = numbers.split(",");
        int[] szamok = new int[szamokSzovegkent.length];
        for (int y = 0; y < szamokSzovegkent.length; y++) {
            szamok[y] = Integer.parseInt(szamokSzovegkent[y]);
        }
        int i = 0;
        while (i < szamok.length) {
            osszeg += szamok[i];
            i++;
        }
        return osszeg;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Szia!");
        Scanner sc;
        sc = new Scanner(System.in);
        String szam;
        szam = sc.nextLine();
        sc.close();
        if(!szam.isEmpty()){
            System.out.println(add(szam));
        }
        else
        {
            System.out.println("0");
        }


    }
}