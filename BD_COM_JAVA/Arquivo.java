package BD_COM_JAVA;

import java.io.*;
import java.nio.Buffer;
import java.rmi.server.ExportException;

public class Arquivo {


    public void leitura(String local){
        try{
            InputStream i = new FileInputStream(local); //input stream traalho com bytes
            //arquivos o fileinputstrem
            InputStreamReader ir = new InputStreamReader(i); //transformo o tipo de dado para caracter
            BufferedReader br = new BufferedReader(ir) ; //salvando no buffer
            String s = br.readLine(); //abrindo para leitura
            while (s != null) {
                System.out.println(s);
                s = br.readLine();
        }
            br.close();
        }catch (IOException e){}
        System.out.println("ERRO");
        }

    public void escrita(String arq, String palavra){
        try{
            OutputStream o = new FileOutputStream(arq);
            OutputStreamWriter ow = new OutputStreamWriter(o);
            BufferedWriter bw = new BufferedWriter(ow);
            bw.write(palavra);
            bw.close();
        }catch (IOException e){
            System.out.println("ERRO!");
        }
    }

    public static void main(String[] args) {
        String local = "BD_COM_JAVA/sla.txt";

    }
}
