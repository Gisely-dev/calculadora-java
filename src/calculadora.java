class Calculadora { // Declara a classe pública chamada Calculadora, responsável por realizar as operações matemáticas.

    public double somar(double a, double b) { // Método público que recebe dois números do tipo double e retorna a soma.
        return a + b; // Retorna o resultado da soma entre os valores "a" e "b".
    } // Fim do método somar.

    public double subtrair(double a, double b) { // Método público que recebe dois números e retorna a subtração.
        return a - b; // Retorna o resultado da subtração de "a" menos "b".
    } // Fim do método subtrair.

    public double multiplicar(double a, double b) { // Método público que recebe dois números e retorna a multiplicação.
        return a * b; // Retorna o resultado da multiplicação entre "a" e "b".
    } // Fim do método multiplicar.

    public double dividir(double a, double b) { // Método público que recebe dois números e retorna a divisão.

        if (b == 0) { // Verifica se o divisor (b) é igual a zero.
            throw new ArithmeticException("Não é possível dividir por zero."); // Lança uma exceção informando que a divisão por zero não é permitida.
        } // Fim da estrutura if.

        return a / b; // Retorna o resultado da divisão de "a" por "b", caso o divisor seja diferente de zero.
    } // Fim do método dividir.

} // Fim da classe Calculadora.