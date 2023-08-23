import java.util.Random;

public class Carro {
    Random random = new Random();
    private String cor;
    private String marca;
    private double velocidade;
    private int ano;

    public Carro(String cor, String marca, int ano){
        setCor(cor);
        setMarca(marca);
        this.velocidade = 0;
        setAno(ano);
    }
    public void setCor(String cor){
        this.cor = cor;
    }
    public String getCor(){
        return cor;
    }
    public void setMarca(String marca){
        this.marca = marca;
    }
    public String getMarca(){
        return marca;
    }
    public void Aceleracao(double a, int t){
        velocidade += a * t;
    }
    public double getVelocidade(){
        return velocidade;
    }
    public void setAno(int ano){
        this.ano = ano;
    }
    public int getAno(){
        return ano;
    }

    public String toString(){
        return String.format("cor %s, modelo %s, velocidade %f, ano %d,",
                getCor(),
                getMarca(),
                getVelocidade(),
                getAno());
    }
}