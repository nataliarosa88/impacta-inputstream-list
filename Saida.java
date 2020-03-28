import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.List;

public class Saida {

	@SuppressWarnings("unchecked")
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        
        String fileName = "banco-de-dados-texto.dat";
        
        try (InputStream fis = new FileInputStream(fileName);
                ObjectInputStream oin = new ObjectInputStream(fis)) {
            
            List<Aluno> alunos = (List<Aluno>) oin.readObject();
            
            alunos.forEach(System.out::println);
        }
    }
}
