package calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas.
 * Utilizada no módulo de cálculos do aplicativo FinançApp.
 *
 * @author Levi da Silva Vitorio RA: 252190
 * @version 1.1
 */
public class Calculadora {

    private static final String ERRO_OPERACAO_INVALIDA = "Erro: operação inválida!";
    private static final String ERRO_DIVISAO_POR_ZERO = "Erro: divisão por zero não é permitida!";

    /**
     * Realiza uma operação matemática entre dois números inteiros.
     *
     * @param primeiroOperando  primeiro número da operação
     * @param segundoOperando   segundo número da operação
     * @param operador          operação a ser realizada (+, -, *, /)
     * @return resultado da operação como String (ou mensagem de erro)
     */
    public String calc(int primeiroOperando, int segundoOperando, String operador) {

        if (operacaoInvalida(operador)) {
            return ERRO_OPERACAO_INVALIDA;
        }

        return executarOperacao(primeiroOperando, segundoOperando, operador.trim());
    }

    /**
     * Verifica se o operador informado é nulo, vazio ou inválido.
     *
     * @param operador operador a ser validado
     * @return true se a operação for inválida
     */
    private boolean operacaoInvalida(String operador) {
        return operador == null || operador.trim().isEmpty();
    }

    /**
     * Executa a operação matemática de acordo com o operador informado.
     *
     * @param primeiroOperando  primeiro número
     * @param segundoOperando   segundo número
     * @param operador          operador já validado e sem espaços
     * @return resultado da operação ou mensagem de erro
     */
    private String executarOperacao(int primeiroOperando, int segundoOperando, String operador) {

        switch (operador) {
            case "+":
                return somar(primeiroOperando, segundoOperando);
            case "-":
                return subtrair(primeiroOperando, segundoOperando);
            case "*":
                return multiplicar(primeiroOperando, segundoOperando);
            case "/":
                return dividir(primeiroOperando, segundoOperando);
            default:
                return ERRO_OPERACAO_INVALIDA;
        }
    }

    /**
     * Realiza a soma de dois números.
     */
    private String somar(int a, int b) {
        return String.valueOf(a + b);
    }

    /**
     * Realiza a subtração de dois números.
     */
    private String subtrair(int a, int b) {
        return String.valueOf(a - b);
    }

    /**
     * Realiza a multiplicação de dois números.
     */
    private String multiplicar(int a, int b) {
        return String.valueOf(a * b);
    }

    /**
     * Realiza a divisão de dois números, tratando divisão por zero.
     */
    private String dividir(int a, int b) {
        if (b == 0) {
            return ERRO_DIVISAO_POR_ZERO;
        }
        return String.valueOf((double) a / b);
    }
}