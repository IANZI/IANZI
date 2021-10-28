import java.util.*;

public class latihan1 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        String nilai = in.next();

        switch(nilai){
            case "A":
                System.out.println("Excellent");
                break;
            case "B":
                System.out.println("Good");
                break;
            case "C":
                System.out.println("Average");
                break;
            case "D":
                System.out.println("Fail");
                break;
            default:
                System.out.println("");

        }



    }

}
