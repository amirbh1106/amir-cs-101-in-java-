import java.util.Scanner;
public class Triangle {
        public static void main(String[] args) {
            Scanner Reader = new Scanner(System.in);

            System.out.println("this program calculates the area and the perimeter of a given triangle"); // ui
            System.out.println("please enter the three lengths of the tringel sides"); // ui
            int firstinp = 0;   //  inputs
            int secinp = 0;
            int lestinp = 0;

            try{
                firstinp = Reader.nextInt();
                secinp = Reader.nextInt();
                lestinp = Reader.nextInt();
            } catch(Exception e){
                System.out.println("int please");
                System.exit(1);
            }
            
                    
            double s = (firstinp + secinp + lestinp) /2.0; // calc s and put it in double
            


            if (firstinp > 0 && secinp > 0 && lestinp > 0){
                double result = s * (s - firstinp ) * (s - secinp ) * (s - lestinp);
                        if(Double.isNaN(result)) {
                            System.out.println("sorry but i cant right now ");
                        }else{

                            System.out.println("the area of the triangel is " + s);
                            System.out.println("the perimeter of the triangle " + Math.sqrt(result));

                        }


            }else{
                System.out.println("sorry but i cant right now ");
            }

          }
}