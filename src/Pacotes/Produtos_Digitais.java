package Pacotes;

public class Produtos_Digitais extends Produtos {
    int quant_estoque;

    public Produtos_Digitais(int id_produto, String nome, String descricao, double preco_base){
        super(id_produto, nome, descricao, preco_base);
        quant_estoque = 100;
    }

    @Override
    public void verificarDisponibilidade(){
        if(quant_estoque>0){
            System.out.println("Disponível no Estoque");
        }else{
            System.out.println("Indisponível no Estoque");
        }

    }
}
