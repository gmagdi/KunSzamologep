import java.util.Scanner;


public class FoProgram {
    //Eldönti, hogy üres volt-e a bemenő adat ha igen akkor kiír egy nullát ha nem akkor elvégzi az összeadást
    public static String eldontes(String szam){
        String vegeredmeny;
        if(!szam.isEmpty()){
            vegeredmeny = add(szam);
        }
        else {
            vegeredmeny="0";
        }
        return vegeredmeny;
    }

    // Elvégzi a számok összeadását vagy kiírja a negatív számokat amiket megadtunk neki
    public static String add(String numbers){
        int osszeg = 0;
        String hiba="";
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
            else {
                hiba+=" "+szamok[i];
            }
            i++;
        }
        String vissza;
        if(hiba!=""){
            vissza ="Negatives not allowed:"+hiba;
        }
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

        String vege = eldontes(szam);

        System.out.println(vege);



    }
}