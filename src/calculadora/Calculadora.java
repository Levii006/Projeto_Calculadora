package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Utilizada no módulo de cálculos do aplicativo FinançApp.
 *
 * @author Levi da Silva Vitorio RA: 252190
 * @version 1.0
 */
public class Calculadora {

    /**
     * Realiza uma operação matemática entre dois números inteiros.
     *
     * @param a  primeiro operando
     * @param b  segundo operando
     * @param op operação a ser realizada (+, -, *, /)
     * @return resultado da operação como String (ou mensagem de erro)
     */
    public String calc(int a, int b, String op) {

        // Verifica se a operação é nula ou vazia
        if (op == null || op.trim().isEmpty()) {
            return "Erro: operação inválida!";
        }

        switch (op) {
            case "+":
                return String.valueOf(a + b);

            case "-":
                return String.valueOf(a - b);

            case "*":
                return String.valueOf(a * b);

            case "/":
                // Impede divisão por zero
                if (b == 0) {
                    return "Erro: divisão por zero não é permitida!";
                }
                // Retorna com casas decimais
                return String.valueOf((double) a / b);

            default:
                return "Erro: operação inválida!";
        }
    }
}