package modelo.util;

import java.util.Optional;

public class Cpf {
    private final String cpf;

    public static Optional<Cpf> getInstance(String cpf){
        if(!validar(cpf)) return Optional.empty();
        return Optional.of(new Cpf(cpf));
    }

    private Cpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return this.cpf;
    }

    private static boolean validar(String cpf) {
        // Verifica se contém apenas números, pontos e hífens
        if (!cpf.matches("[0-9.-]+")) {
            return false;
        }

        // Remove apenas pontos e hífens
        cpf = cpf.replaceAll("[.-]", "");

        // Verifica se tem 11 dígitos
        if (cpf.length() != 11) {
            return false;
        }

        // Verifica se todos os dígitos são iguais (ex: 111.111.111-11)
        if (cpf.matches("(\\d)\\1{10}")) {
            return false;
        }

        // Calcula o primeiro dígito verificador
        int soma = 0;
        for (int i = 0; i < 9; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (10 - i);
        }
        int primeiroDigito = 11 - (soma % 11);
        if (primeiroDigito >= 10) {
            primeiroDigito = 0;
        }

        // Verifica o primeiro dígito
        if (Character.getNumericValue(cpf.charAt(9)) != primeiroDigito) {
            return false;
        }

        // Calcula o segundo dígito verificador
        soma = 0;
        for (int i = 0; i < 10; i++) {
            soma += Character.getNumericValue(cpf.charAt(i)) * (11 - i);
        }
        int segundoDigito = 11 - (soma % 11);
        if (segundoDigito >= 10) {
            segundoDigito = 0;
        }

        // Verifica o segundo dígito
        return Character.getNumericValue(cpf.charAt(10)) == segundoDigito;
    }
}
