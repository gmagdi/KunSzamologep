import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FoProgram {

    public static void main(String[] args) throws Exception {
        System.out.println("Szia!");
        Scanner sc;
        sc = new Scanner(System.in);
        String szam;
        int osszeg = 0;
        szam = sc.nextLine();
        sc.close();
        String[] szamokSzovegkent = szam.split(",");
        int[] szamok = new int[szamokSzovegkent.length];
        for (int y = 0; y < szamokSzovegkent.length; y++) {
            szamok[y] = Integer.parseInt(szamokSzovegkent[y]);
        }
        int i = 0;
        while (i < szamok.length) {
            osszeg += szamok[i];
            i++;
        }
        System.out.print(osszeg);
    }
}