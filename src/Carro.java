public class Carro {
    String modelo;
    int ano;
    String cor;

    public void ExibeInfo(){
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
    }

    public int CalcIdade(){
        return 2026 - ano;
    }
}
