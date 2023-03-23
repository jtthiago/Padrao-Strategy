package one.digitalinnovation.gof;

public class Main {
    public static void main(String[] args) {
        Produto alimento = new Produto("alimentos", 50);
        double precoComDesconto = alimento.calcularPrecoComDesconto();
        System.out.println("Preço do alimento com desconto: " + precoComDesconto);

        Produto eletronico = new Produto("eletronicos", 1000);
        precoComDesconto = eletronico.calcularPrecoComDesconto();
        System.out.println("Preço do eletrônico com desconto: " + precoComDesconto);

        Produto roupa = new Produto("roupas", 80);
        precoComDesconto = roupa.calcularPrecoComDesconto();
        System.out.println("Preço da roupa com desconto: " + precoComDesconto);
    }
}