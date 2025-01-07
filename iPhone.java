package DesafioClassesiPhone;

public class iPhone implements ReprodutorMusical, NavegadorDeInternet, AparelhoTelefonico {
    public void ligar() {
        System.out.println("Ligando.");
    }
    public void atender() {
        System.out.println("Chamada Atendida.");
    }
    public void iniciarCorreioDeVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    public void exibirPagina() {
        System.out.println("Exibindo Pagina.");
    }
    public void atualizarPagina() {
        System.out.println("Atualizando Pagina. ");
    }
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova pagina. ");
    }

    public void selecionarMusica() {
        System.out.println("Selecionando Musica.");
    }

    public void pausarMusica() {
        System.out.println("Pausando Musica.");
    }
    public void tocarMusica() {
        System.out.println("Tocando Musica.");
    }
}
