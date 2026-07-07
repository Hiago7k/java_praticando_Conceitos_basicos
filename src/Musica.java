public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    double avaliacao;
    int numAvaliacoes;


    public void ExibeFicha(){
        System.out.println("Ficha tecnica da musica");
        System.out.println("Titulo: " + titulo);
        System.out.println("artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    public void AvaliaMusica(double nota){
        avaliacao = avaliacao + nota;
        numAvaliacoes++;
    }

    public double ExibeMedia(){
        return avaliacao / numAvaliacoes;
    }
}
