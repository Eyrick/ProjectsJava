package Pacotes;

public class Vestuario extends Produtos_Fisicos {
    String marca;
    String tamanho;
    String cor;
    String tecido;

    public Vestuario(int id_produto, String nome, String descricao, double preco_base, int quant_estoque, String marca, String tamanho, String cor, String tecido) {
        super(id_produto, nome, descricao, preco_base, quant_estoque);
        this.marca = marca;
        this.tamanho = tamanho;
        this.cor = cor;
        this.tecido = tecido;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Tamanho: " + tamanho);
        System.out.println("Cor: " + cor);
        System.out.println("Tecido: " + tecido);
    }
}
