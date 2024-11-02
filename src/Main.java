public class Main {
    public static void main(String[] args) {
        
       Carro meuCarro = new  Carro(2020, "X6", "BMW"  , 4);
        System.out.println("Detalhes do Carro:");
        meuCarro.exibirDetalhes();

        System.out.println();
        
        Moto minhaMoto = new Moto("Yamaha", "Fluo 125 ABS", 2021, false);
        System.out.println("Detalhes da Moto:");
        minhaMoto.exibirDetalhes();
    }
}
