import java.util.Scanner;
import java.util.Random;


class Main {
  public static void main(String[] args) {
     int wskaznik;
    Random generator = new Random();
        double[] losowe=new double[10];
        
        for(int z=0;z<10;z++){
        wskaznik=generator.nextInt(2);
         
        if(wskaznik==1){
          losowe[z]=generator.nextDouble(50)*-1;
          System.out.println(losowe[z]);
        } else {
          losowe[z]=generator.nextDouble(50);
         System.out.println(losowe[z]);
        }}
        System.out.println();
        double najmniejsza=50;
        double najwieksza=0;
        for(int l=0;l<10;l++){
          if(losowe[l]<najmniejsza) najmniejsza=losowe[l];
          if(losowe[l]>najwieksza) najwieksza=losowe[l];
        }
        System.out.println("Najmniejsza: "+najmniejsza+"  Najwieksza: "+najwieksza);
        
  }
}