public class Carro {
    // Atributos privados
    private String marca;
    private String modelo;
    private int ano;
    private String cor;
    private double velocidadeAtual;

    // Construtor
    public Carro(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        this.velocidadeAtual = 0; // Velocidade inicial definida como 0
    }

    // Getters e Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getVelocidadeAtual() {
        return velocidadeAtual;
    }

    // Método Acelerar
    public void acelerar(double valorAceleracao) {
        velocidadeAtual += valorAceleracao;
    }

    // Método Frear
    public void frear(double valorFrenagem) {
        velocidadeAtual = Math.max(0, velocidadeAtual - valorFrenagem); // A velocidade não pode ser negativa
    }

    // Método ExibirInformacoes
    public void exibirInformacoes() {
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Cor: " + cor);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
    }

    // Método de troca de marchas.
    public void trocarMarcha(int marcha) {
        System.out.println("Marcha trocada para " + marcha);
    }

    // Método para abastecer:
    public void abastecer(double litros) {
        System.out.println(litros + " litros abastecidos.");
    }

    // Método para calcular o consumo:
    public double calcularConsumo(double distancia) {
        return distancia / 10; // Exemplo de consumo básico
    }

    // Exemplo de teste
    public static void main(String[] args) {
        Carro carro = new Carro("Toyota", "Corolla", 2020, "Prata");
        carro.exibirInformacoes(); // Exibir informações iniciais

        carro.acelerar(50); // Acelerar em 50 km/h
        carro.exibirInformacoes(); // Exibir informações após acelerar

        carro.frear(20); // Frear em 20 km/h
        carro.exibirInformacoes(); // Exibir informações após frear

        carro.trocarMarcha(2); // troca de marcha
    }
}
