package impacta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

import impacta.model.Aluno;

import java.io.PrintWriter;

public class Entrada {

    public static void main(String[] args) throws IOException {

        String fileName = "banco-de-dados-json.json";

    	PrintWriter pw = new PrintWriter(fileName);
        List<Aluno> alunos = new ArrayList<>();
        alunos.add(new Aluno("Natalia", 5429000));
        alunos.add(new Aluno("Mikaela", 5271000));
        alunos.add(new Aluno("Raquel", 4225000));

        Gson gson = new Gson();
    	String jsonString = gson.toJson(alunos);
    	
    	pw.println(jsonString);
    	pw.close();
   }
}