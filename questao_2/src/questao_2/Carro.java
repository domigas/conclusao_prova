package questao_2;

interface Móvel {
 void mover();
}
class Carro implements Móvel {
 public void mover() {
     System.out.println("Carro se movendo");
 }
}

