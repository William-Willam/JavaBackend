package Exercicio.atividade1;

public class MeiaEntrada extends Ingresso{

    public MeiaEntrada(Double valor, String nomeFilme, boolean dublado) {
        super(valor, nomeFilme, dublado);
    }
    
    // criei sem querer
    public MeiaEntrada() {
    }

    @Override
    public double ValorReal(){
        return getValor()/2;
    }
    
}
