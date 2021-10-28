import java.util.*;

public class latihan4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String kotaTujuan = in.nextLine();
        int penumpang = in.nextInt();
        int tiketJakarta = 145000;
        int tiketBogor = 200000;
        int tiketGarut = 75000;
        int tiketPurwakarta = 75000;
        int hargaTotal = 0;
        int diskon = 0;
        switch(kotaTujuan){
            case "Jakarta":
            System.out.println(penumpang*tiketJakarta);
            break;
            case "Bogor":
            hargaTotal = penumpang*tiketBogor;
                if(hargaTotal > 250000){
                    diskon = hargaTotal * 10/100;
                    hargaTotal = hargaTotal - diskon;
                }
            System.out.println(hargaTotal);
            break;
            case "Garut":
            System.out.println(penumpang*tiketGarut);
            break;
            case "Purwakarta":
            System.out.println(penumpang*tiketPurwakarta);
            break;
            default:
        }


    }
}
