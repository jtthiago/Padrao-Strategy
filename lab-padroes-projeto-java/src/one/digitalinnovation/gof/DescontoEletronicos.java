package one.digitalinnovation.gof;

public class DescontoEletronicos implements DescontoStrategy {
    public double calcularDesconto(double preco) {
        return preco * 0.05; // desconto de 5% para eletrônicos
    }
}
