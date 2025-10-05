package Pacotes;


public abstract class Produtos {
    String nome;
    int id_produto;
    String descricao;
    double preco_base;
    int quant_estoque;

    public Produtos(int id_produto, String nome, String descricao, double preco_base) {
        this.nome = nome;
        this.id_produto = id_produto;
        this.descricao =  descricao;
        this.preco_base = preco_base;
        System.out.println("Produto Criado");
    }

    void exibirDetalhes(){
        System.out.println("\n--------- Informações do Produto ---------");
        System.out.println("Nome: " + nome);
        System.out.println("Id: " + id_produto);
        System.out.println("Descrição: " + descricao);
        System.out.printf("Preço Normal: R$%.2f\n",preco_base);
    }

    public void verificarDisponibilidade(){
        if(quant_estoque>0){
            System.out.println("Disponível no Estoque");
        }else{
            System.out.println("Indisponível no Estoque");
        }

    }

    public void calcularPrecoFinal(double desconto){
        double valor_final = preco_base - (preco_base / 100 * desconto);
        System.out.printf("O preco com desconto é R$%.2f\n",valor_final);
    }
}
