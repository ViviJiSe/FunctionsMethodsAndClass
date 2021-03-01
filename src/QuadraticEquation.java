import java.io.PrintStream;
import java.util.Scanner;
import java.lang.Math;
import java.math.*;

public class QuadraticEquation {

    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    /*
    funcion de detalle 1
     */
    public static double computeSquareRootOf(double number){
        return Math.pow(number, 1.0/2.0);
    }

        /*
    funcion de detalle 2
     */
    public static double computeDiscriminantFor( double a, double b, double c){
        return Math.pow(b, 2) - 4*a*c;
    }

    public static double computeSquareRootForDiscriminant(double a, double b, double c){
        /*
    funcion coordinadora nos dicen de donde extraemos objetos basadas en las funciones detalle
     */
//        double discriminant = computeDiscriminantFor(a,b,c);
//        return computeSquareRootOf(discriminant);
        return computeSquareRootOf(computeDiscriminantFor(a, b, c));
    }

    public static String createDisplayMessageForDiscriminant(double a, double b, double c){
        return "Discriminant of a= " + a + " b= " + b + " c= " + c + "[Square Root of Discriminant]: "
                + computeSquareRootForDiscriminant(a,b,c);
    }

    public static String createRealRootDisplayMessage (double a, double b, double c){
        return "For a= " +a+ ", b= " +b+ ", c= " + c + "x0= " +
                computeRealRootCaseFor(a,b,c,  false) + "X1 = "+
                computeRealRootCaseFor(a, b,c, true);
    }

    public static double computeRealRootCaseFor(double a, double b, double c, boolean secondCase){
        double realRootResult = 0.0;
        if (!secondCase){
            realRootResult = (((-1)*b)-computeSquareRootForDiscriminant(a,b,c))/2*a;
        }
        else{
            realRootResult = (((-1)*b) + computeSquareRootForDiscriminant(a,b,c))/2*a;
        }
        return realRootResult;
    }


    public static void main(String[] args) {

        out.println( createRealRootDisplayMessage( 6, 11, -35));
        out.println( createRealRootDisplayMessage( 2, -4, -2));
        out.println( createRealRootDisplayMessage( -4, -7, 12));
        
    }
}
