public class Carro extends Veiculo {
    
    private int numeroDePortas;

    public Carro(int ano, String marca, String modelo, int numeroDePortas) {
        super(ano, marca, modelo);
        this.numeroDePortas = numeroDePortas;
    }

    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes(); // Chama o método da classe pai
        System.out.println("Número de Portas: " + numeroDePortas);
    }

    public int getNumeroDePortas() {
        return numeroDePortas;
    }

    public void setNumeroDePortas(int numeroDePortas) {
        this.numeroDePortas = numeroDePortas;
    }
    
}
