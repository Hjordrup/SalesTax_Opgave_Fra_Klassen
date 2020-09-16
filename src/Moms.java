import java.util.Scanner;


public class Moms {

    public static void main(String[] args) {

        System.out.println("Indtast Købspris for at beregne dansk og tysk moms");
        plusDanskMoms();





    }


 public static void plusDanskMoms(){
     Scanner input = new Scanner(System.in);
     double købsPris = input.nextDouble();

     double Moms = købsPris * 0.25;
     System.out.println("Dansk moms udgører DKK" + (int)(Moms*100)/100.0);
     plusTyskMoms(købsPris);
 }

    public static void plusTyskMoms(double købsPris){


        double Moms = købsPris * 0.16;
        System.out.println("Tysk moms udgører €" + (int)(Moms*100)/100.0);

    }


}
