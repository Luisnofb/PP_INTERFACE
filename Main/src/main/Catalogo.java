
package main;
import java.util.ArrayList;

public class Catalogo {
    ArrayList<Produto> ctlg;
    
    public Catalogo(){
        ctlg = new ArrayList<Produto>();

        String n[], a[], g[];      // nome , autor, genero
        Produto p;
        
        // PRODUTO 1
        n = new String[]{"Superman","-","Grandes","Astros"}; 
        a = new String[]{"Morrison","Grant"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(1, n, a, g, 23, "DC", 59.90);
        ctlg.add(p);

        // PRODUTO 2
        n = new String[]{"Batman","-","A","Piada","Mortal"}; 
        a = new String[]{"Moore","Alan"}; 
        g = new String[]{"Suspense","Terror"};
        p = new Produto(2, n, a, g, 54, "DC", 24.50);
        ctlg.add(p);

        // PRODUTO 3
        n = new String[]{"Demolidor","-","A","Queda","de","Murdock"}; 
        a = new String[]{"Miller","Frank"}; 
        g = new String[]{"Acao","Suspense"};
        p = new Produto(3, n, a, g, 15, "Marvel", 45.90);
        ctlg.add(p);

        // PRODUTO 4
        n = new String[]{"Batman","-","O","Cavaleiro","das","Trevas"}; 
        a = new String[]{"Miller","Frank"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(4, n, a, g, 61, "DC", 94.00);
        ctlg.add(p);

        // PRODUTO 5
        n = new String[]{"Pantera","Negra","-","Uma","Nação","Sob","Nossos","Pés"}; 
        a = new String[]{"Coates","Ta-Nehisi"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(5, n, a, g, 52, "Marvel", 20.23);
        ctlg.add(p);

        // PRODUTO 6
        n = new String[]{"Chico","Bento","-","Arvorada"}; 
        a = new String[]{"Sousa","Mauricio"}; 
        g = new String[]{"Aventura","Infantil"};
        p = new Produto(6, n, a, g, 92, "Mauricio de Sousa", 24.90);
        ctlg.add(p);

        // PRODUTO 7
        n = new String[]{"Capitã","Marvel", "-","Mais","Alto",",","Mais","Longe",",","Mais","Rápido","e","Mais"}; 
        a = new String[]{"Deconnick","Sue"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(7, n, a, g, 83, "Marvel", 29.88);
        ctlg.add(p);

        // PRODUTO 8
        n = new String[]{"Homem","Aranha","-","A","Última","Caçada","de","Kraven"}; 
        a = new String[]{"Matteis","Jonh"}; 
        g = new String[]{"Aventura","Romance"};
        p = new Produto(8, n, a, g, 22, "Marvel", 48.00);
        ctlg.add(p);

        // PRODUTO 9
        n = new String[]{"Oblivion","Song","-","Canção","do","Silêncio"}; 
        a = new String[]{"Kirkman","Robert"}; 
        g = new String[]{"Aventura","Fantasia"};
        p = new Produto(9, n, a, g, 46, "Intrinseca", 29.99);
        ctlg.add(p);

        // PRODUTO 10
        n = new String[]{"Thor","-","Vikings "}; 
        a = new String[]{"Ennis ","Garth"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(10, n, a, g, 37, "Marvel", 23.90);
        ctlg.add(p);

        // PRODUTO 11
        n = new String[]{"Flash","-","Seguindo","em","Frente"}; 
        a = new String[]{"Manapul","Francis"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(11, n, a, g, 64, "DC", 23.32);
        ctlg.add(p);

        // PRODUTO 12
        n = new String[]{"Maus"}; 
        a = new String[]{"Spiegelgman","Art"}; 
        g = new String[]{"Suspense","Fantasia"};
        p = new Produto(12, n, a, g, 9, "Pantheon", 62.90);
        ctlg.add(p);

        // PRODUTO 13
        n = new String[]{"O","Incrivel","Hulk","-","Planeta","Hulk"}; 
        a = new String[]{"Pak","Greg"}; 
        g = new String[]{"Acao","Romance"};
        p = new Produto(13, n, a, g, 18, "Marvel", 77.90);
        ctlg.add(p);

        // PRODUTO 14
        n = new String[]{"Aquaman","-","As","Profundezas"};
        a = new String[]{"Johns","Geoff"}; 
        g = new String[]{"Aventura","Romance"};
        p = new Produto(14, n, a, g, 89, "DC", 26.90);
        ctlg.add(p);

        // PRODUTO 15
        n = new String[]{"Absolute","Sandman"}; 
        a = new String[]{"Gaiman","Neil"}; 
        g = new String[]{"Suspense","Terror"};
        p = new Produto(15, n, a, g, 15, "Vertigo", 113.10);  
        ctlg.add(p);

        // PRODUTO 16
        n = new String[]{"A","Saga","do","Monstro","do","Pântano"}; 
        a = new String[]{"Moore","Alan"}; 
        g = new String[]{"Suspense","Terror"};
        p = new Produto(16, n, a, g, 26, "Vertigo", 59.99);
        ctlg.add(p);

        // PRODUTO 17
        n = new String[]{"Watchmen"}; 
        a = new String[]{"Moore","Alan"}; 
        g = new String[]{"Acao","Suspense"};
        p = new Produto(17, n, a, g, 2, "Vertigo", 110.00);
        ctlg.add(p);

        // PRODUTO 18
        n = new String[]{"Bone","-","O","vale","ou","equinócio","vernal"}; 
        a = new String[]{"Smith","Jeff"}; 
        g = new String[]{"Fantasia","Aventura"};
        p = new Produto(18, n, a, g, 35, "Todavia", 62.32);
        ctlg.add(p);

        // PRODUTO 19
        n = new String[]{"Ms","Marvel","-","Nada","Normal"}; 
        a = new String[]{"Wilson","Willow"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(19, n, a, g, 11, "Marvel", 89.99);
        ctlg.add(p);

        // PRODUTO 20
        n = new String[]{"Reino","do","Amanha"}; 
        a = new String[]{"Waid","Mark"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(20, n, a, g, 27, "DC", 74.40);
        ctlg.add(p);

         // PRODUTO 21
        n = new String[]{"Guerras","Secretas"}; 
        a = new String[]{"Shooter","Jim"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(21, n, a, g, 74, "Marvel", 101.00);
        ctlg.add(p);

        // PRODUTO 22
        n = new String[]{"Mulher","Maravilha","-","Sangue"}; 
        a = new String[]{"Azzarello","Brian"}; 
        g = new String[]{"Acao","Aventura"};
        p = new Produto(22, n, a, g, 42, "DC", 30.00);
        ctlg.add(p);

        // PRODUTO 23
        n = new String[]{"Black","Hammer","-","Origens","Secretas"}; 
        a = new String[]{"Lemire","Jeff"}; 
        g = new String[]{"Acao","Fantasia"};
        p = new Produto(23, n, a, g, 101, "Intriseca", 26.59);
        ctlg.add(p);

        // PRODUTO 24
        n = new String[]{"Tio","Patinhas","e","Pato","Donald"}; 
        a = new String[]{"Rosa","Don"}; 
        g = new String[]{"Infantil","Aventura "};
        p = new Produto(24, n, a, g, 93, "Abril", 47.90);
        ctlg.add(p);

        // PRODUTO 25
        n = new String[]{"Boa","Noite","Punpun"}; 
        a = new String[]{"Asano","Inio"}; 
        g = new String[]{"Aventura","Suspense"};
        p = new Produto(25, n, a, g, 49, "JBC", 37.70);
        ctlg.add(p);
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
