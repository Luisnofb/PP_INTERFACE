package main;

public class ItemCesta {
    private int id;
    private String nome[];
    private int qtdPedida;
    private double preco;

    public ItemCesta(Produto produto, int qtdPedida) {
        //toda vez que um produto novo for adicionado à cesta, ele precisa antes ser transformado em ItemCesta
        //(chamar construtor).
        this.id = produto.getId();
        this.nome = produto.getNome();
        this.qtdPedida = qtdPedida;
        this.preco = produto.getPreco();
    }
    
    //MÉTODOS GETTER

    protected int getId() {
        return id;
    }

    protected String[] getNome() {
        return nome;
    }

    protected int getQtdPedida() {
        return qtdPedida;
    }

    protected double getPreco() {
        return preco;
    }

    //MÉTODOS SETTER
    
    protected void setQtdPedida(int qtdPedida) {
        this.qtdPedida = qtdPedida;
    }

    protected void setPreco(double preco) {
        this.preco = preco;
    }
}