
import java.io.Serializable;

public class Aluno implements Serializable {
    
    static final long serialVersionUID = 1L;
    
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }
    
    public String getName() {
        return nome;
    }

    public void setName(String nome) {
        this.nome = nome;
    }

	public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    @Override
	public String toString() {
		return "Aluno [nome=" + nome + ", matricula=" + matricula + "]";
	}
}