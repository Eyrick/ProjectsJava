import Pacotes.Ebook;
import Pacotes.Eletronico;
import Pacotes.Livro;
import Pacotes.Vestuario;

public class Main {

    public static void main(String[] args) {
        Eletronico notebook120020 = new Eletronico(120020, "Notebook Nitro V5", "Acer Nitro V5, 1tb SSD, 16gb de ram", 5500,  50, "Acer", "Nitro V15", 240, 6);
        notebook120020.exibirDetalhes();
        notebook120020.verificarDisponibilidade();
        notebook120020.calcularPrecoFinal(20);

        Ebook cronicasDeNarnia = new Ebook(132092, "As Crônicas de Narnia", "Histórias sobre o país escondido de Nárnia", 50, "Ada Lovelace", "UFC", "pdf", 5.50);
        cronicasDeNarnia.exibirDetalhes();
        cronicasDeNarnia.verificarDisponibilidade();
        cronicasDeNarnia.calcularPrecoFinal(20);

        Livro HarryPotter1 = new Livro(195021, "Harry Potter e a Pedra Filosofal", "Primeiro do 7 livros da saga de Harry Potter", 80,  0, "Ada Lovelace", "UFC", 555, 800);
        HarryPotter1.exibirDetalhes();
        HarryPotter1.verificarDisponibilidade();
        HarryPotter1.calcularPrecoFinal(20);

        Vestuario Vestido1 = new Vestuario(202020, "Vestido Canelado", "Vestido Canelado Longo", 149.99, 5, "Gucci","G","Preto", "Algodão");
        Vestido1.exibirDetalhes();
        Vestido1.verificarDisponibilidade();
        Vestido1.calcularPrecoFinal(25);
    }
}
