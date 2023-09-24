package questao_8;

public class Fotos implements Imprimivel {
 private String descricao;

 public Fotos(String descricao) {
     this.descricao = descricao;
 }

 public void imprimir() {
     System.out.println("Imprimindo foto: ");
     System.out.println("Descrição: " + descricao);
 }
}

