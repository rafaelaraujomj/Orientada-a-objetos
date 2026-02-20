public class Carro {
    private String marca;
    private String modelo;
    private int ano;
    private boolean ligado; // Novo atributo para controlar o estado

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.ligado = false; // O carro começa desligado por padrão
    }

    public void ligar() {
        if (!ligado) {
            ligado = true;
            System.out.println("O carro foi ligado agora.");
        } else {
            System.out.println("O carro já estava ligado.");
        }
    }

    public void desligar() {
        if (ligado) {
            ligado = false;
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    public void acelerar() {
        if (ligado) {
            System.out.println("Vrummm! O carro está acelerando.");
        } else {
            System.out.println("Não é possível acelerar: o carro está desligado.");
        }
    }

    // Exemplo de Getter (opcional, mas recomendado)
    public String getModelo() {
        return modelo;
    }

    public static void main(String[] args) {
        Carro carro = new Carro("BYD", "Seal", 2025);
        
        carro.acelerar(); // Vai avisar que está desligado
        carro.ligar();
        carro.acelerar(); // Agora funciona
        carro.desligar();
    }
}