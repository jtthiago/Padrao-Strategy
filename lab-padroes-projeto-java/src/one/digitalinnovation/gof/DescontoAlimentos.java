package one.digitalinnovation.gof;

public class DescontoAlimentos implements DescontoStrategy {
    public double calcularDesconto(double preco) {
        return preco * 0.1; // desconto de 10% para alimentos
    }
}