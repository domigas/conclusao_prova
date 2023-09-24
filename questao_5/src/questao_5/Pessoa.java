package questao_5;

public class Pessoa {
	    private String nome;
	    protected int idade;

	    public Pessoa(String nome, int idade) {
	        this.nome = nome;
	        this.idade = idade;
	    }

	    public String getNome() {
	        return nome;
	    }

	    public int getIdade() {
	        return idade;
	    }
	}
