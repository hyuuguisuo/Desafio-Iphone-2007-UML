import funções.AparelhoTelefonico;
import funções.NavegadorInternet;
import funções.ReprodutorMusica;

public class Iphone implements ReprodutorMusica, NavegadorInternet, AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
       System.out.println("Ligando para o número  "+numero+"  ! \n* som de chamada figurativo *");
    }

    @Override
    public void atender() {
        System.out.println("Agora você está em uma ligação!");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o Correio de voz...");
        System.out.println("Correio de voz inciado");
        
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo os conteúdos da página:  '"+url+"'  .");

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Uma nova aba foi criada");
    }

    @Override
    public void atualizarPagina() {
       System.out.println("Atualizando a página...");
       System.out.println("Página atualizada.");

    }

    @Override
    public void tocar() {
        System.out.println("Tocando a música.");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("> Selecionando a música  "+musica+"  .");
    
    }

}
