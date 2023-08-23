public class TesteCarro {
    public static void main(String[] args){

        Carro carro1 = new Carro("amarelo","ford",2003);
        Carro carro2 = new Carro("vermelho","jeep",2023);

        carro1.Aceleracao(10,2);
        carro1.Aceleracao(5,2);
        System.out.print(carro1);


    }
}
