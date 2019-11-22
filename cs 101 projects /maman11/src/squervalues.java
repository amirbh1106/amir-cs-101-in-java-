import java.util.Scanner;
public class squervalues {
        public static void main(String[] args) {
            Scanner reader = new Scanner(System.in);

//            System.out.println("hay please put down base value first and than hight");
            int firstinp = reader.nextInt();
            int secinp = reader.nextInt();
            int lestinp = reader.nextInt();
            double s = (firstinp + secinp + lestinp) /2.0;
            double resolt;

            if (firstinp > 0 && secinp > 0 && lestinp > 0){
                resolt = s * (s - firstinp ) * (s - secinp ) * (s - lestinp);
                    System.out.println("the answer is " + resolt);
            }else{
                System.out.println("sorry but i cant right now ");
            }
            System.out.println("the area of the triangel is ");
          }
}