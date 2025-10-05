package Pacotes;

public class Produtos_Fisicos extends Produtos{
    int quant_estoque;

    public Produtos_Fisicos(int id_produto, String nome, String descricao, double preco_base, int quant_estoque){
        super(id_produto, nome, descricao, preco_base);
        this.quant_estoque = quant_estoque;
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

