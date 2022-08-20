import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class File {
    public static void main(String[] args) {
        try {
            copiarFicheros(new FileInputStream("/archivoacopiar"), new FileInputStream("/archivoacopiado"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    static void copiarFicheros(InputStream fileIn, InputStream fileOut){
        try {
            InputStream in = new FileInputStream(fileIn.toString());
            byte []datos = in.readAllBytes();
            in.close();
            PrintStream out = new PrintStream(new FileOutputStream(fileOut.toString()));
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
