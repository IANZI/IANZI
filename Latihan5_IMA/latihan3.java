import java.util.*;

public class latihan3 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        String tujuanKota = in.nextLine();
        int penumpang = in.nextInt();
        int tiketJakarta = 145000;
        int tiketBogor = 200000;
        int tiketGarut = 75000;
        int tiketPurwakarta = 75000;

        switch(tujuanKota){
            case "Jakarta":
            System.out.println(penumpang*tiketJakarta);
            break;
            case "Bogor":
            System.out.println(penumpang*tiketBogor);
            break;
            case "Garut":
            System.out.println(penumpang*tiketGarut);
            break;
            case "Purwakarta":
            System.out.println(penumpang*tiketPurwakarta);
            break;
            default:
            System.out.println("Kota tujuan tidak ditemukan");
        }



    }

}