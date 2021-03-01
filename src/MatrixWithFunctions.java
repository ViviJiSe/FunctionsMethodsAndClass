import java.io.PrintStream;
import java.util.Scanner;

public class MatrixWithFunctions {
    private static PrintStream out = new PrintStream(System.out);
    private static Scanner in = new Scanner(System.in);

    public static String getCharacterFor (int rowNumber, int columnNumber, int matrixSize){
        String result = "\t0";
        if ( (rowNumber == columnNumber || (rowNumber + columnNumber == matrixSize-1))){

            result = "\t1";
        }
        return result;
    }

    public static int requestNumberToUser(String message){
        out.print(message);
        return in.nextInt();
    }

    public static String drawMatrix(int size){
        String matrix = "";

        for ( int rows = 0; rows< size; ++rows){
            // Cada vez que este ciclo se ejecuta estamos cambiando de linea,
            // puesto que este bloque construye el contenido de la fila

            String row = "";

            for (int columns = 0; columns < size; ++columns){

                row += getCharacterFor( rows, columns, size);
            }
            matrix += row +"\n";
        }
        return matrix;
    }

    public static void main(String[] args) {

        out.println(drawMatrix(requestNumberToUser("Type the size of the matrix you want to draw: ")));
    }

    }