package Pacotes;

public class Produtos {
    String nome;
    int id_produto;
    String descricao;
    float preco_base;
    boolean estoque = true;

    public Produtos(int id_produto, String nome, String descricao, float preco_base, boolean estoque) {
        this.nome = nome;
        this.id_produto = id_produto;
        this.descricao =  descricao;
        this.preco_base = preco_base;
        this.estoque= estoque;
    }

    void Exibir_Detalhes(Produtos produto){
        System.out.println("--------- Informações do Produto ---------");
        System.out.println("Nome: " + produto.nome);
        System.out.println("Id: " + produto.id_produto);
        System.out.println("Descrição: " + produto.descricao);
        System.out.println("Preço: R$" + produto.preco_base);
        System.out.println("Estoque: " + Verificar_Disponibilidade(produto));
    }

    String Verificar_Disponibilidade(Produtos produto){
        if(produto.estoque){
            return "Disponível no Estoque";
        }else{
            return "Indisponível no Estoque";
        }

    }

    int calcular_preco_final(float preco_base){

    }
}
