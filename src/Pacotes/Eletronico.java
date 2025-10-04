package Pacotes;

public class Eletronico extends Produtos_Fisicos{
    String marca;
    String modelo;
    int voltagem;
    int garantia_meses;

    public Eletronico(int id_produto, String nome, String descricao, double preco_base, int quant_estoque, String marca, String modelo, int voltagem, int garantia_meses) {
        super(id_produto, nome, descricao, preco_base, quant_estoque);
        this.marca = marca;
        this.modelo = modelo;
        this.voltagem = voltagem;
        this.garantia_meses = garantia_meses;
    }

    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.printf("Voltagem: %dV\n",voltagem);
        System.out.printf("Garantia: %d meses\n", garantia_meses);
    }

    @Override
    public void calcularPrecoFinal(double desconto){
        if (desconto>10){
            desconto = 10;
        }
        super.calcularPrecoFinal(desconto);
    }
}

