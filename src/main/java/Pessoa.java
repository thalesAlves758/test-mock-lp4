public class Pessoa implements IPessoa {
    private double altura;
    private double peso;
    private String sexo;

    public Pessoa(double altura, double peso, String sexo){
        if(!sexo.toUpperCase().equals("M") && !sexo.toUpperCase().equals("F")) {
            throw new IllegalArgumentException("Sexo inválido");
        }

        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
    }

    public String getSexo() {
        return this.sexo;
    }

    public double calcularIMC() {
        return this.peso/(this.altura*this.altura);
    }
}
