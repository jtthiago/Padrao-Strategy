package one.digitalinnovation.gof;

public class Produto {
    private String categoria;
    private double preco;
    private DescontoStrategy descontoStrategy;
    
    public Produto(String categoria, double preco) {
        this.categoria = categoria;
        this.preco = preco;
        
        if (categoria.equals("alimentos")) {
            descontoStrategy = new DescontoAlimentos();
        } else if (categoria.equals("eletronicos")) {
            descontoStrategy = new DescontoEletronicos();
        } else if (categoria.equals("roupas")) {
            descontoStrategy = new DescontoRoupas();
        }
    }
    
    public double calcularPrecoComDesconto() {
        return preco - descontoStrategy.calcularDesconto(preco);
    }
}
