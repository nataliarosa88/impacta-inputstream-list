package impacta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import impacta.model.Aluno;

public class Saida {

    public static void main(String[] args) throws IOException {
        
    String fileName = "banco-de-dados-json.json";
    
    BufferedReader fr = new BufferedReader(new InputStreamReader(new FileInputStream(new File(fileName))));

    String stringLida = fr.readLine();
    
    Gson gson = new Gson();
    List<Aluno> alunos = gson.fromJson(stringLida , new TypeToken<List<Aluno>>(){}.getType());
    
    System.out.println(alunos);

    fr.close();
    }
}
