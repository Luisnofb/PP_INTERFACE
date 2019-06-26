
package main;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        String res="s";
        String estado="menu";
        Scanner ent = new Scanner(System.in);
        Loja s2 = new Loja();
        do{
            int cont=0;
            int op;
            switch (estado) {
                case "menu":
                    do{
                        System.out.println("LOJA DE HQ");
                        System.out.println("[1]Catalogo");
                        System.out.println("[2]Procurar");
                        System.out.println("[3]Carrinho");
                        System.out.println("[4]Delivery");
                        System.out.println("[5]Sair");
                        System.out.print("comando: ");
                        op = ent.nextInt();
                        switch (op) {
                            case 1:
                                estado="catalogo";
                                cont++;
                                break;
                            case 2:
                                estado="especifico";
                                cont++;
                                break;
                            case 3:
                                estado="carrinho";
                                cont++;
                                break;
                            case 4:
                                estado="delivery";
                                cont++;
                                break;
                            case 5:
                                estado="sair";
                                cont++;
                                break;
                            default:
                                System.out.println("INVALIDO");
                        }
                    }while(cont!=1);
                    break;
                case "catalogo":
                    {
                        String teste;
                        int id;
                        System.out.println("\t EM ESTOQUE");
                        s2.armazem();
                        System.out.println("Exibir detalhes de algum produto?(s|n) ");
                        teste=ent.next();
                        if(teste.equalsIgnoreCase("s")){
                            System.out.println("Numero do produto: ");
                            id = ent.nextInt();
                            if(id>=1 || id<=25  ){
                                s2.detalhes(id);
                            }else{
                                System.out.println("Hq não econtrado.");
                            }
                        }   
                        System.out.println("\nIr ao menu ?(s|n)");
                        teste=ent.next();
                        if(teste.equalsIgnoreCase("s")){
                            estado="menu";
                        }else{
                            res="n";
                        }
                        break;
                    }
                case "especifico":
                    {
                        int tip;
                        ArrayList <Produto> objt;
                        System.out.println("Procurar por nome/autor/editora [1]");
                        System.out.println("procurar por genero [2]");
                        tip = ent.nextInt();
                        if(tip==1){
                            System.out.print("nome: ");
                            String param = ent.next();
                            objt = s2.getCatalogo().Pesquisar(param);
                            s2.result(objt);
                        }else if(tip==2){
                            System.out.print("generos:\n ");
                            System.out.println("[1]ACÃO\n [2]AVENTURA\n [3]TERROR\n [4]SUSPENSE\n [5]INFANTIL\n [6]ROMANCE\n [7]FANTASIA ");
                            int gen = ent.nextInt();
                            if(gen>=1 || gen<=7){
                               objt = s2.getCatalogo().Filtrar(gen);
                                s2.result(objt);  
                            }else{
                                System.out.println("Invalido.");
                            }
                        }       
                        System.out.println("Exibir detalhes de algum produto?(s|n) ");
                        String teste = ent.next();
                        if(teste.equalsIgnoreCase("s")){
                            System.out.println("Numero do produto: ");
                            int id = ent.nextInt();
                            if(id>=1 || id<=25  ){
                                s2.detalhes(id);
                            }else{
                                System.out.println("Hq não econtrado.");
                            }
                        } 
                        System.out.println("Adicionar alguma HQ ?(s|n)");
                        String key = ent.next();
                        if("s".equalsIgnoreCase(key)){
                            System.out.println("Numero do produto: ");
                            int id = ent.nextInt();
                            System.out.println("Quantidade do produto: ");
                            int qtd = ent.nextInt();
                            boolean foi = s2.CarAdd(id, qtd);
                            if(foi){
                                System.out.println("Produto inserido.");
                            }
                        }
                        System.out.println("\nIr ao menu ?(s|n)");
                        teste=ent.next();
                        if(teste.equalsIgnoreCase("s")){
                            estado="menu";
                        }else{
                            res="n";
                        } 
                        break;
                    }
                case "carrinho":
                    System.out.println("\tCarrinho");
                    System.out.println("[1]Adicionar");
                    System.out.println("[2]Remover");
                    System.out.println("[3]Modificar quantidade");
                    System.out.println("[4]Mostrar");
                    System.out.print("Comando: ");
                    int x= ent.nextInt();
                    switch(x){
                        case 1:
                            System.out.println("Numero do produto: ");
                            int id = ent.nextInt();
                            System.out.println("Quantidade do produto: ");
                            int qtd = ent.nextInt();
                            boolean foi = s2.CarAdd(id, qtd);
                            if(foi){
                                System.out.println("Produto inserido.");
                            }
                            break;
                        case 2:
                            System.out.println("Numero do produto: ");
                            int id2 = ent.nextInt();
                            boolean foi2 = s2.CarRemove(id2);
                            if(foi2){
                                System.out.println("Produto removido.");
                            }
                            break;
                        case 3:
                            s2.getCesta().printCesta();
                            System.out.println("Numero do produto: ");
                            int id3 = ent.nextInt();
                            System.out.println("Informe o nova quantidade do produto: ");
                            int qtd3= ent.nextInt();
                            boolean foi3 = s2.CarModQtd(id3, qtd3);
                            if(foi3){
                                System.out.println("Quantidade alterada.");
                            }
                            break;
                        case 4:
                            if(s2.getCesta().getItens().size()>0){
                                double valor = s2.conta();
                                s2.NaCesta();
                                System.out.println("Valor total: "+valor);
                            }else{
                                System.out.println("Carrinho vazio.");
                            }
                            
                            break;
                        default :
                            System.out.println("Erro");
                            break;    
                    }   
                    System.out.println("\nIr ao menu ?(s|n)");
                    String teste = ent.next();
                    if(teste.equalsIgnoreCase("s")){
                        estado="menu";
                    }else{
                        res="n";
                    } 
                    break;
                case "delivery":
                    System.out.println("Informe seu nome: ");
                    String nome = ent.next();
                    System.out.println("Informe seu endereço");
                    System.out.print("Numero da Rua: ");
                    int rua= ent.nextInt();
                    System.out.print("Numero da Casa: ");
                    int casa= ent.nextInt();
                    System.out.print("Numero da Quadra: ");
                    int quadra = ent.nextInt();
                    System.out.print("Nome do Bairro:");
                    String bairro= ent.next();
                    System.out.print("Nome da Cidade:");
                    String cidade = ent.next();
                    double div=s2.conta();
                    Delivery entrega = new Delivery(s2.getCesta(),nome,div,rua,casa,quadra,bairro,cidade);
                    System.out.println(entrega);
                    s2.abaixoEstoque();
                    System.out.println("\nIr ao menu ?(s|n)");
                    String testes = ent.next();
                    if(testes.equalsIgnoreCase("s")){
                         estado="menu";
                    }else{
                        res="n";
                    } 
                    break;
                case "sair":
                    res="n";
                    break;
                default:
                    break;      
            }
            
        }while(res.equals("s"));
    }
}
    

