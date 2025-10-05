package Pacotes;

public class Livro extends Produtos_Fisicos {
    String autor;
    String editora;
    int numeroPaginas;
    double pesoGramas;

    public Livro(int id_produto, String nome, String descricao, double preco_base, int quant_estoque, String autor, String editora, int numeroPaginas, double pesoGramas) {
        super(id_produto, nome, descricao, preco_base, quant_estoque);
        this.autor = autor;
        this.editora = editora;
        this.numeroPaginas = numeroPaginas;
        this.pesoGramas = pesoGramas;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Autor: "+autor);
        System.out.println("Editora: "+editora);
        System.out.println("Quantidade de Páginas: "+numeroPaginas);
        System.out.printf("Peso: %.0fg\n", pesoGramas);
    }
}