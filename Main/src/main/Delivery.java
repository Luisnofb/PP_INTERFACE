
package main;

/**
 *
 * @author luisn
 */
public class Delivery {
    
    private CestaCompras pedido;
    private String nomeCliente;
    private double valor;
    private int rua,casa,quadra;
    private String bairro,cidade;
    
    public Delivery(CestaCompras pedido,String nomeCliente,double valor,int rua,int casa,int quadra,String bairro,String cidade){
        this.pedido = pedido;
        this.nomeCliente = nomeCliente;
        this.valor= valor;
        this.rua = rua;
        this.casa = casa;
        this.quadra = quadra;
        this.bairro = bairro;
        this.cidade = cidade;
    }
    
    protected void show(){
        pedido.printCesta();
    }
    
    /**
     *
     * @return
     */
    @Override
    public String toString(){
        return "Os produtos do carrinho serão entregues para " + nomeCliente + " no Endereço: \nRua: " + rua +" Casa: "+ casa +" Quadra: "
                + quadra +"\nno Bairro: "+ bairro + " em "+ cidade + "\nValor total:"+ valor +" $";
    }
}
