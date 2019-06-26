package main;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Catalogo {
    ArrayList<Produto> ctlg;
    
    public Catalogo() throws FileNotFoundException{
        ctlg = new ArrayList<Produto>();
        try {
            Produto p;
            String n[] = new String[20], aux[] = null, e = null;
            String a[] = new String[2];
            String g[] = new String[2];
            int numb = 0, quant = 0, pos = 0;
            double pr = 0;
            FileReader ler = new FileReader("armazem.txt");
            BufferedReader reader = new BufferedReader(ler);  
            String linha;
            int state = 0;
            while( (linha = reader.readLine()) != null ){
                switch (state) {
                    case 0:
                        numb = Integer.parseInt(linha);
                        state = 1;
                        break;
                    case 1:
                        if(!"$".equals(linha)){
                            n[pos] = linha;
                            pos++;
                        }else{
                            aux = new String[pos];
                            for(int i=0; i<pos; i++){
                                aux[i] = n[i];
                            }
                            pos=0;
                            state=2;
                        }   
                        break;
                    case 2:
                        a[0] = linha;
                        state = 3;
                        break;
                    case 3:
                        a[1] = linha;
                        state = 4;
                        break;
                    case 4:
                        g[0] = linha;
                        state = 5;
                        break;
                    case 5:
                        g[1] = linha;
                        state = 6;
                        break;
                    case 6:
                        quant = Integer.parseInt(linha);
                        state = 7;
                        break;
                    case 7:
                        e = linha;
                        state = 8;
                        break;
                    case 8:
                        pr = Double.parseDouble(linha);
                        state = 9;
                        p = new Produto(numb, aux, a, g, quant, e, pr);
                        ctlg.add(p);
                        state = 0;
                        break;
                }
            }
            ler.close();
            System.out.println("SUCESSO AO LER O ARQUIVO");
        }catch(IOException f) {
            System.out.println("\n\nERRO AO LER O ARQUIVO\n");
        }    
        
    }

    
    // PESQUISAR POR NOME, EDITORA OU AUTOR DE UM HQ
    protected ArrayList Pesquisar(String s){
        ArrayList pesquisa = new ArrayList();
        Produto aux;
        for(int i=0; i< ctlg.size(); i++){
            aux = ctlg.get(i);
            if(aux.getEditora().equalsIgnoreCase(s)){
                pesquisa.add(ctlg.get(i));
            }else if(aux.getAutor()[0].equalsIgnoreCase(s) || aux.getAutor()[1].equalsIgnoreCase(s)){
                pesquisa.add(ctlg.get(i));
            }else{
                for (String nome : aux.getNome()) {
                    if (nome.equalsIgnoreCase(s)) {
                        pesquisa.add(ctlg.get(i));
                        break;
                    }
                }
            }           
        }
        return pesquisa;
    }
    
    // FILTRAR O CATALOGO DA LOJA POR UM GENERO
    protected ArrayList Filtrar (int genero){
        ArrayList filtro = new ArrayList();
        Produto aux;
        switch(genero){            
            case 1: // AÇÃO
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Acao".equals(aux.getGenero()[0]) || "Acao".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
            case 2: // AVETURA
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Aventura".equals(aux.getGenero()[0]) || "Aventura".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
            case 3: // TERROR
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Terror".equals(aux.getGenero()[0]) || "Terror".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
            case 4: // SUSPENSE
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Suspense".equals(aux.getGenero()[0]) || "Suspense".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
            case 5: // INFANTIL
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Infantil".equals(aux.getGenero()[0]) || "Infantil".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
            case 6: // ROMANCE
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Romance".equals(aux.getGenero()[0]) || "Romance".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
            case 7: // FANTASIA
                for(int i=0; i< ctlg.size(); i++){
                    aux = ctlg.get(i);
                    if("Fantasia".equals(aux.getGenero()[0]) || "Fantasia".equals(aux.getGenero()[1])){
                        filtro.add(ctlg.get(i));
                    }
                }
                break;
        }
        return filtro;
    }
   
    // PRINTAR CATALOGO
    protected void printCatalogo(ArrayList al){
        Produto aux;
        for(int i=0; i < al.size(); i++){
            aux = (Produto)al.get(i);
            System.out.print("Nome: ");
            for (String nome : aux.getNome()) {
                System.out.print(nome + " ");
            }
            System.out.println("\nPreço: " + aux.getPreco());
            System.out.println("Numero do HQ: " + aux.getId());
            System.out.println("");
        }
    }    

}