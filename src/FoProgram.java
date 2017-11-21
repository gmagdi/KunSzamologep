import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class FoProgram {

    public static String add(String numbers){
        int osszeg = 0;
        String hiba ="";
        String[] szamokSzovegkent = numbers.split("[+/%,~*_;:&]");
        int[] szamok = new int[szamokSzovegkent.length];
        for (int y = 0; y < szamokSzovegkent.length; y++) {
            szamok[y] = Integer.parseInt(szamokSzovegkent[y]);
        }
        int i = 0;
        while (i < szamok.length) {
            if(szamok[i]>=0){
            osszeg += szamok[i];
            }
            else
            {
                hiba+=" "+szamok[i];
            }
            i++;
        }
        String vissza;
        if(hiba!="")
            vissza ="Negatives not allowed:"+hiba;
        else{
            vissza = ""+osszeg;
        }
        return vissza;
    }
    public static void main(String[] args) throws Exception {
        System.out.println("Kérlek add meg az összeadandó számokat az alábbi karakterek egyikével elválasztva! +/%,~*_;:&");
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