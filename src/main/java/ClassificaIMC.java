public class ClassificaIMC {
    private static boolean ehMasculino(String sexo) {
        return sexo.toUpperCase().equals("M");
    }

    public static String classificar(IPessoa pessoa) {
        double imc = pessoa.calcularIMC();
        String sexo = pessoa.getSexo();

        if(imc < (ehMasculino(sexo) ? 20.7 : 19.1)) {
            return "abaixo do peso";
        } else if(imc < (ehMasculino(sexo) ? 26.4 : 25.8)) {
            return "no peso normal";
        } else if(imc < (ehMasculino(sexo) ? 27.8 : 27.3)) {
            return "marginalmente acima do peso";
        } else if(imc < (ehMasculino(sexo) ? 31.1 : 32.3)) {
            return "acima do peso ideal";
        } else {
            return "Obeso";
        }
    }
}
