package main;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Loja {
    private Catalogo catalogo;
    private CestaCompras cesta;
    
    public Loja() throws FileNotFoundException{
        catalogo = new Catalogo();
        cesta = new CestaCompras();
    }
    
    //MÉTODOS GETTER
    
    protected Catalogo getCatalogo(){
        return catalogo;
    } 
    
    protected CestaCompras getCesta(){
        return cesta;
    } 
    
    
    //////////METODOS CATALOGO///////////////
    
    //Lista tudo que temos em estoque.
    protected void armazem(){
            ArrayList print = catalogo.ctlg;
            catalogo.printCatalogo(print);
    }
    //lista os elementos  de uma pesquisa por array.
    protected void result(ArrayList l){
        catalogo.printCatalogo(l);
    }
    
    //mostra todos os detalhes de um elemento por id.
    protected void detalhes(int id ){
        Produto aux;
        for(int i=0;i< catalogo.ctlg.size();i++){
            aux = (Produto)catalogo.ctlg.get(i);
            if(aux.getId()==id){
                aux.printProduto(aux);
            }
        }
    }

    
    ////////////METODOS CARRINHO///////////////
    
    protected boolean CarAdd(int id,int qtd){
        Produto aux;
        ItemCesta item;
        boolean tst;
        for(int i=0;i< catalogo.ctlg.size();i++){
            aux = (Produto)catalogo.ctlg.get(i);
            if(aux.getId() == id){
                item = new ItemCesta(aux,qtd);
                tst=cesta.add(item,aux);
                return tst;
            }
        }
        return false;
    }
    
    protected boolean CarRemove(int id){
        ItemCesta aux;
        for(int i=0;i<cesta.getItens().size();i++){
            aux=(ItemCesta)cesta.getItens().get(i);
            if(aux.getId() == id){
                cesta.remover(aux);
                return true;
            }
        }
        return false;
    }
    
    protected boolean CarModQtd(int id ,int n){
        ItemCesta aux;
        Produto prod = null;
        for(int j=0;j<catalogo.ctlg.size();j++){
            prod=(Produto)catalogo.ctlg.get(j);
            if(prod.getId()==id){
                break;
            }
        }
        for(int i=0;i<cesta.getItens().size();i++){
            if(cesta.getItens().get(i).getId() == id){
               if(n<= prod.getQuant() && n> 0){
                   cesta.getItens().get(i).setQtdPedida(n);
                   return true;
               }
            }
        }
        return false;
        
    }
    
    protected void NaCesta(){
        if(cesta != null){
            cesta.printCesta();
        }else{
            System.out.println("Cesta vazia");
        }
    }
    ///////////monetário//////////
    protected double conta(){
        double valor=0;
        ItemCesta aux;
        for(int i=0; i<cesta.getItens().size(); i++){
            aux = cesta.getItens().get(i);
            valor += aux.getPreco()*aux.getQtdPedida(); 
        }
        return valor;
    }
    
    protected void abaixoEstoque(){
        cesta.efetuarCompra(catalogo.ctlg);
        cesta = new CestaCompras();
    }
    
}