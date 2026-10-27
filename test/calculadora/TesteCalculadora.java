package calculadora;

/**
 * Classe responsável por testar as funcionalidades da Calculadora.
 * Demonstra entradas utilizadas, resultado esperado e resultado obtido.
 *
 * @author Levi da Silva Vitorio RA: 252190
 * @version 1.0
 */
public class TesteCalculadora {

    public static void main(String[] args) {

        Calculadora calc = new Calculadora();

        System.out.println("========== TESTES DA CALCULADORA ==========\n");

        // ===== TESTE 1: SOMA =====
        System.out.println("--- Teste de Soma ---");
        int a1 = 10, b1 = 5;
        String op1 = "+";
        String esperado1 = "15";
        String obtido1 = calc.calc(a1, b1, op1);

        System.out.println("Entrada utilizada : " + a1 + " " + op1 + " " + b1);
        System.out.println("Resultado esperado: " + esperado1);
        System.out.println("Resultado obtido  : " + obtido1);
        System.out.println("Status            : " + (esperado1.equals(obtido1) ? "PASSOU" : "FALHOU"));
        System.out.println();

        // ===== TESTE 2: SUBTRAÇÃO =====
        System.out.println("--- Teste de Subtração ---");
        int a2 = 10, b2 = 5;
        String op2 = "-";
        String esperado2 = "5";
        String obtido2 = calc.calc(a2, b2, op2);

        System.out.println("Entrada utilizada : " + a2 + " " + op2 + " " + b2);
        System.out.println("Resultado esperado: " + esperado2);
        System.out.println("Resultado obtido  : " + obtido2);
        System.out.println("Status            : " + (esperado2.equals(obtido2) ? "PASSOU" : "FALHOU"));
        System.out.println();

        // ===== TESTE 3: MULTIPLICAÇÃO =====
        System.out.println("--- Teste de Multiplicação ---");
        int a3 = 10, b3 = 5;
        String op3 = "*";
        String esperado3 = "50";
        String obtido3 = calc.calc(a3, b3, op3);

        System.out.println("Entrada utilizada : " + a3 + " " + op3 + " " + b3);
        System.out.println("Resultado esperado: " + esperado3);
        System.out.println("Resultado obtido  : " + obtido3);
        System.out.println("Status            : " + (esperado3.equals(obtido3) ? "PASSOU" : "FALHOU"));
        System.out.println();

        // ===== TESTE 4: DIVISÃO =====
        System.out.println("--- Teste de Divisão ---");
        int a4 = 10, b4 = 5;
        String op4 = "/";
        String esperado4 = "2.0";
        String obtido4 = calc.calc(a4, b4, op4);

        System.out.println("Entrada utilizada : " + a4 + " " + op4 + " " + b4);
        System.out.println("Resultado esperado: " + esperado4);
        System.out.println("Resultado obtido  : " + obtido4);
        System.out.println("Status            : " + (esperado4.equals(obtido4) ? "PASSOU" : "FALHOU"));
        System.out.println();

        // ===== TESTE 5: DIVISÃO POR ZERO =====
        System.out.println("--- Teste de Divisão por Zero ---");
        int a5 = 10, b5 = 0;
        String op5 = "/";
        String esperado5 = "Erro: divisão por zero não é permitida!";
        String obtido5 = calc.calc(a5, b5, op5);

        System.out.println("Entrada utilizada : " + a5 + " " + op5 + " " + b5);
        System.out.println("Resultado esperado: " + esperado5);
        System.out.println("Resultado obtido  : " + obtido5);
        System.out.println("Status            : " + (esperado5.equals(obtido5) ? "PASSOU" : "FALHOU"));
        System.out.println();

        // ===== TESTE 6: OPERAÇÃO INVÁLIDA =====
        System.out.println("--- Teste de Operação Inválida ---");
        int a6 = 10, b6 = 5;
        String op6 = "%";
        String esperado6 = "Erro: operação inválida!";
        String obtido6 = calc.calc(a6, b6, op6);

        System.out.println("Entrada utilizada : " + a6 + " " + op6 + " " + b6);
        System.out.println("Resultado esperado: " + esperado6);
        System.out.println("Resultado obtido  : " + obtido6);
        System.out.println("Status            : " + (esperado6.equals(obtido6) ? "PASSOU" : "FALHOU"));
        System.out.println();

        System.out.println("========== FIM DOS TESTES ==========");
    }
}