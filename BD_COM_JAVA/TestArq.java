package BD_COM_JAVA;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class TestArq {
    public static void main(String[] args) throws FileNotFoundException {

        String local = "BD_COM_JAVA/sla.txt";
        File arquivo = new File(local);

        Scanner input = new Scanner(arquivo);

        PrintStream ps = new PrintStream("BD_COM_JAVA/sla2.txt");
        while(input.hasNextLine()){
            ps.println(input.nextLine());
        }




        input.close();
    }
}
