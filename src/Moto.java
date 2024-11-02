public class Moto extends Veiculo {

private boolean temSidecar;

public Moto(String modelo, String marca, int ano, boolean temSidecar) {
    super(ano, marca, modelo);
    this.temSidecar = temSidecar;
}

@Override
public void exibirDetalhes() {
    super.exibirDetalhes(); 
    System.out.println("Tem Sidecar: " + (temSidecar ? "Sim" : "Não"));
}

    public boolean getTemSidecar() {
        return temSidecar;
    }

    public void setTemSidecar(boolean temSidecar) {
        this.temSidecar = temSidecar;
    }
}
