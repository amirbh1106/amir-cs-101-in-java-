import java.util.Scanner;
public class Congruent {
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("input x and then y of the vertex of the triangle");
        System.out.println("input the first vertex");
        int vertex1x = scan.nextInt();
        int vertex1y = scan.nextInt();
        System.out.println("input the secend vertex");
        int vertex2x = scan.nextInt();
        int vertex2y = scan.nextInt();
        System.out.println("input the third vertex");
        int vertex3x = scan.nextInt();
        int vertex3y = scan.nextInt();
        System.out.println("input x and then y of the vertex of the secend triangle");
        System.out.println("input the first vertex");
        int vertex4x = scan.nextInt();
        int vertex4y = scan.nextInt();
        System.out.println("input the secend vertex");
        int vertex5x = scan.nextInt();
        int vertex5y = scan.nextInt();
        System.out.println("input the third vertex");
        int vertex6x = scan.nextInt();
        int vertex6y = scan.nextInt();
        System.out.println("the first triangle is " + "(" + "x" + vertex1x + "," + "y" + vertex1y + ")" + "(" + "x" + vertex2x + "," + "y" + vertex2y + ")" + "(" + "x" + vertex3x + "," + "y" + vertex3y + ")" );
        int length1 = (int) Math.sqrt(Math.pow(vertex2x - vertex1x, 2) + Math.pow(vertex2y - vertex1y, 2)); //distance
        int length2 = (int) Math.sqrt(Math.pow(vertex3x - vertex2x, 2) + Math.pow(vertex3y - vertex2y, 2));//distance
        int length3 = (int) Math.sqrt(Math.pow(vertex1x - vertex3x, 2) + Math.pow(vertex1y - vertex3y, 2));//distance

        System.out.println("the lengths are " + length1 + " " + length2 + " " +length3);

        int length4 =  (int) Math.sqrt(Math.pow(vertex5x - vertex4x, 2) + Math.pow(vertex5y - vertex4y, 2)); //distance
        int length5 =  (int) Math.sqrt(Math.pow(vertex6x - vertex5x, 2) + Math.pow(vertex6y - vertex5y, 2)); //distance
        int length6 = (int) Math.sqrt(Math.pow(vertex4x - vertex6x, 2) + Math.pow(vertex4y - vertex6y, 2)); //distance


        System.out.println("the secend triangle is " + "(" + "x" + vertex4x + "," + "y" + vertex4y + ")" + "(" + "x" + vertex5x + "," + "y" + vertex5y + ")" + "(" + "x" + vertex6x + "," + "y" + vertex6y + ")" );
//        System.out.println("the lengths are " + length4 + " " + length5 + " " +length6); //debug

        System.out.println(length1 +""+ length2 + "" + length3 + "" + length4 + "" + length5 + "" + length6);


        if(length1 == length4 && length2 == length5 && length3 == length6){
            System.out.println("the triangles are congruent");
        }else{
            if(length2 == length5 && length1 == length6 && length3 == length4){
                System.out.println("the triangles are congruent");
            }else{
                System.out.println("the triangles are not congruent");
            }
        }



    }
}
