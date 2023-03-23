package one.digitalinnovation.gof;

public class DescontoRoupas implements DescontoStrategy {
    public double calcularDesconto(double preco) {
        if (preco > 100) {
            return 20; // desconto fixo de R$20 para roupas acima de R$100
        } else {
            return preco * 0.1; // desconto de 10% para roupas abaixo de R$100
        }
    }
}