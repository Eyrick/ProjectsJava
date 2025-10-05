package Pacotes;

public class Ebook extends Produtos_Digitais{
    String autor;
    String editora;
    String formato_de_arquivo;
    double tamanho_MB;

    public Ebook(int id_produto, String nome, String descricao, double preco_base, String autor, String editora, String formato_de_arquivo, double tamanho_MB){
        super(id_produto, nome, descricao, preco_base);
        this.autor = autor;
        this.editora = editora;
        this.formato_de_arquivo = formato_de_arquivo;
        this.tamanho_MB = tamanho_MB;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Autor: "+autor);
        System.out.println("Editora: "+editora);
        System.out.println("Formato: "+formato_de_arquivo);
        System.out.printf("Tamanho: %.2fmb\n", tamanho_MB);
    }
}
