
package main;

/**
 *
 * @author luisn
 */
public class Delivery {
    
    private CestaCompras pedido;
    private String nomeCliente;
    private double valor;
    private int casa;
    private String rua,bairro,cidade,estado;
    
    public Delivery(CestaCompras pedido,String nomeCliente,double valor,String rua,int casa,String bairro,String cidade,String estado){
        this.pedido = pedido;
        this.nomeCliente = nomeCliente;
        this.valor= valor;
        this.rua = rua;
        this.casa = casa;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
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
        return "\nOs produtos do carrinho serão entregues para " + nomeCliente + " no endereço: \nRua " + rua +", casa "+ casa +
                ", bairro "+ bairro + ", em "+ cidade + " - "+ estado + "\nValor total: R$"+ valor;
    }
}
