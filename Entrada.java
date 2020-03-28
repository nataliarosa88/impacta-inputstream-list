
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

public class Entrada {

    public static void main(String[] args) throws IOException {

        String fileName = "banco-de-dados-texto.dat";

        try (OutputStream fis = new FileOutputStream(fileName);
                ObjectOutputStream out = new ObjectOutputStream(fis)) {

            List<Aluno> alunos = new ArrayList<>();
            alunos.add(new Aluno("Natalia", 5429000));
            alunos.add(new Aluno("Mikaela", 5271000));
            alunos.add(new Aluno("Raquel", 4225000));

            out.writeObject(alunos);
        }
    }
}