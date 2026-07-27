import java.util.Scanner; // Importa a biblioteca Scanner, permitindo assim, ler dados digitados pelo usuário.

class Principal {
    // Declara a classe principal do programa.

    static void main() {

        Scanner teclado = new Scanner(System.in); // Cria um objeto Scanner chamado "teclado" para ler os dados digitados.
        Calculadora calc = new Calculadora(); // Cria um objeto da classe Calculadora para utilizar os seus métodos.

        int opcao; // Declara a variável "opcao" do tipo inteiro e inicializa com 0.

        while (true) { // Enquanto a opção escolhida for diferente de 5, o menu continuará a ser exibido.

            System.out.println("\n========== CALCULADORA =========="); // Exibe o título da calculadora.
            System.out.println("1 - Somar"); // Exibe a opção de soma.
            System.out.println("2 - Subtrair"); // Exibe a opção de subtração.
            System.out.println("3 - Multiplicar"); // Exibe a opção de multiplicação.
            System.out.println("4 - Dividir"); // Exibe a opção de divisão.
            System.out.println("5 - Sair"); // Exibe a opção para encerrar o programa.

            System.out.print("Escolha uma opção do digito 1 até o 5: "); // Solicita que o usuário escolha uma opção.
            opcao = teclado.nextInt(); // Lê o número digitado e armazena na variável "opcao".

            if (opcao == 5) { // Verifica se o usuário escolheu a opção 5.
                break; // Encerra o laço while imediatamente.
            }

            System.out.print("Digite o primeiro número: "); // Solicita o primeiro número.
            double n1 = teclado.nextDouble(); // Lê o primeiro número decimal e armazena em n1.

            System.out.print("Digite o segundo número: "); // Solicita o segundo número.
            double n2 = teclado.nextDouble(); // Lê o segundo número decimal e armazena em n2.

            switch (opcao) { // Analisa o valor da variável "opcao".

                case 1: // Caso o usuário escolha a opção 1.
                    System.out.println("Resultado = " + calc.somar(n1, n2)); // Chama o método somar() e exibe o resultado.
                    break; // Encerra este caso do switch.

                case 2: // Caso o usuário escolha a opção 2.
                    System.out.println("Resultado = " + calc.subtrair(n1, n2)); // Chama o método subtrair() e exibe o resultado.
                    break; // Encerra este caso.

                case 3: // Caso o usuário escolha a opção 3.
                    System.out.println("Resultado = " + calc.multiplicar(n1, n2)); // Chama o método multiplicar() e exibe o resultado.
                    break; // Encerra este caso.

                case 4: // Caso o usuário escolha a opção 4.

                    try { // Tenta executar o código abaixo. Se ocorrer um erro, será tratado pelo catch.

                        System.out.println("Resultado = " + calc.dividir(n1, n2)); // Chama o método dividir() e exibe o resultado.

                    } catch (ArithmeticException e) { // Captura uma exceção do tipo ArithmeticException.

                        System.out.println(e.getMessage()); // Exibe a mensagem de erro.

                    }

                    break; // Encerra este caso do switch.

                default: // Executa caso nenhuma das opções anteriores seja escolhida.
                    System.out.println("Opção inválida."); // Informa que a opção digitada é inválida.

            } // Fim do switch.

        } // Fim do while.

        teclado.close(); // Fecha o Scanner e libera o recurso de leitura do teclado.

        System.out.println("Programa encerrado."); // Exibe a mensagem informando que o programa foi finalizado.

    } // Fim do método main.

} // Fim da classe Principal.al.