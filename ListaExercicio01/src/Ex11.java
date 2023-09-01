/*private class Ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número da conta do cliente: ");
        int numeroConta = scanner.nextInt();

        System.out.print("Digite o saldo da conta: ");
        double saldo = scanner.nextDouble();

        System.out.print("Digite o débito da conta: ");
        double debito = scanner.nextDouble();

        System.out.print("Digite o crédito da conta: ");
        double credito = scanner.nextDouble();

        double saldoAtual = saldo - debito + credito;

        System.out.println("Saldo atual da conta: R$ " + saldoAtual);

        if (saldoAtual >= 0) {
            System.out.println("Saldo Positivo");
        } else {
            System.out.println("Saldo Negativo");
        }

        scanner.close();
    }
}

private class Ex12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade atual em estoque: ");
        int quantidadeAtual = scanner.nextInt();

        System.out.print("Digite a quantidade máxima em estoque: ");
        int quantidadeMaxima = scanner.nextInt();

        System.out.print("Digite a quantidade mínima em estoque: ");
        int quantidadeMinima = scanner.nextInt();

        double quantidadeMedia = (quantidadeMaxima + quantidadeMinima) / 2.0;

        System.out.println("Quantidade média em estoque: " + quantidadeMedia);

        if (quantidadeAtual >= quantidadeMedia) {
            System.out.println("Não efetuar compra");
        } else {
            System.out.println("Efetuar compra");
        }

        scanner.close();
    }
}

Ex13:
inicio 
    ler nome
    ler sexo
    ler altura
    
    se sexo = M entao
        peso_ideal = (72.7 * altura) - 58
    senao
        peso_ideal = (62.1 * altura) - 44.7
    fim_se
    
    escrever peso_ideal
fim

private class Ex14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor: ");
        double valor = scanner.nextDouble();

        if (valor > 0) {
            System.out.println("O valor é positivo.");
        } else if (valor < 0) {
            System.out.println("O valor é negativo.");
        } else {
            System.out.println("O valor é zero.");
        }

        scanner.close();
    }
}

private class Ex15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double maiorValor;

        if (valor1 > valor2 && valor1 > valor3) {
            maiorValor = valor1;
        } else if (valor2 > valor3) {
            maiorValor = valor2;
        } else {
            maiorValor = valor3;
        }

        System.out.println("O maior valor é: " + maiorValor);

        scanner.close();
    }
}

private class Ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double somaDosMaiores;

        if (valor1 > valor2 && valor1 > valor3) {
            somaDosMaiores = valor1 + Math.max(valor2, valor3);
        } else if (valor2 > valor3) {
            somaDosMaiores = valor2 + Math.max(valor1, valor3);
        } else {
            somaDosMaiores = valor3 + Math.max(valor1, valor2);
        }

        System.out.println("A soma dos dois maiores valores é: " + somaDosMaiores);

        scanner.close();
    }
}

private class Ex17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        double menor, meio, maior;

        if (valor1 < valor2 && valor1 < valor3) {
            menor = valor1;
            if (valor2 < valor3) {
                meio = valor2;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor2;
            }
        } else if (valor2 < valor3) {
            menor = valor2;
            if (valor1 < valor3) {
                meio = valor1;
                maior = valor3;
            } else {
                meio = valor3;
                maior = valor1;
            }
        } else {
            menor = valor3;
            if (valor1 < valor2) {
                meio = valor1;
                maior = valor2;
            } else {
                meio = valor2;
                maior = valor1;
            }
        }

        System.out.println("Valores em ordem crescente: " + menor + ", " + meio + ", " + maior);

        scanner.close();
    }
}

private class Ex18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}

private class Ex19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();

        System.out.print("Digite o número de gols marcados pelo primeiro time: ");
        int golsTime1 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        System.out.print("Digite o nome do segundo time: ");
        String time2 = scanner.nextLine();

        System.out.print("Digite o número de gols marcados pelo segundo time: ");
        int golsTime2 = scanner.nextInt();

        if (golsTime1 > golsTime2) {
            System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}

private class Ex20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        if (valor1 == valor2) {
            System.out.println("Números iguais");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        scanner.close();
    }
}

private class Ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        System.out.print("Digite o terceiro valor: ");
        double valor3 = scanner.nextDouble();

        if (valor1 < valor2 && valor1 < valor3) {
            if (valor2 < valor3) {
                System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);
            } else {
                System.out.println("Valores em ordem crescente: " + valor1 + ", " + valor3 + ", " + valor2);
            }
        } else if (valor2 < valor3) {
            if (valor1 < valor3) {
                System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor1 + ", " + valor3);
            } else {
                System.out.println("Valores em ordem crescente: " + valor2 + ", " + valor3 + ", " + valor1);
            }
        } else {
            if (valor1 < valor2) {
                System.out.println("Valores em ordem crescente: " + valor3 + ", " + valor1 + ", " + valor2);
            } else {
                System.out.println("Valores em ordem crescente: " + valor3 + ", " + valor2 + ", " + valor1);
            }
        }

        scanner.close();
    }
}

private class Ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor de A: ");
        double a = scanner.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = scanner.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("Os valores formam um triângulo.");
        } else {
            System.out.println("Os valores não formam um triângulo.");
        }

        scanner.close();
    }
}

private class Ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro time: ");
        String time1 = scanner.nextLine();

        System.out.print("Digite o número de gols marcados pelo primeiro time: ");
        int golsTime1 = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer de entrada

        System.out.print("Digite o nome do segundo time: ");
        String time2 = scanner.nextLine();

        System.out.print("Digite o número de gols marcados pelo segundo time: ");
        int golsTime2 = scanner.nextInt();

        if (golsTime1 > golsTime2) {
            System.out.println("Vencedor: " + time1);
        } else if (golsTime2 > golsTime1) {
            System.out.println("Vencedor: " + time2);
        } else {
            System.out.println("EMPATE");
        }

        scanner.close();
    }
}

private class Ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = scanner.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = scanner.nextDouble();

        if (valor1 == valor2) {
            System.out.println("Números iguais");
        } else if (valor1 > valor2) {
            System.out.println("Primeiro é maior");
        } else {
            System.out.println("Segundo é maior");
        }

        scanner.close();
    }
}

private class Ex27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a idade do primeiro homem: ");
        int idadeHomem1 = scanner.nextInt();

        System.out.print("Digite a idade do segundo homem: ");
        int idadeHomem2 = scanner.nextInt();

        System.out.print("Digite a idade da primeira mulher: ");
        int idadeMulher1 = scanner.nextInt();

        System.out.print("Digite a idade da segunda mulher: ");
        int idadeMulher2 = scanner.nextInt();

        int homemMaisVelho = Math.max(idadeHomem1, idadeHomem2);
        int homemMaisNovo = Math.min(idadeHomem1, idadeHomem2);
        int mulherMaisVelha = Math.max(idadeMulher1, idadeMulher2);
        int mulherMaisNova = Math.min(idadeMulher1, idadeMulher2);

        int somaIdades = homemMaisVelho + mulherMaisNova;
        int produtoIdades = homemMaisNovo * mulherMaisVelha;

        System.out.println("Soma das idades do homem mais velho com a mulher mais nova: " + somaIdades);
        System.out.println("Produto das idades do homem mais novo com a mulher mais velha: " + produtoIdades);

        scanner.close();
    }
}

private class Ex29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o código de usuário: ");
        int codigoUsuario = scanner.nextInt();

        if (codigoUsuario != 1234) {
            System.out.println("Usuário inválido!");
        } else {
            System.out.print("Digite a senha: ");
            int senha = scanner.nextInt();

            if (senha != 9999) {
                System.out.println("Senha incorreta.");
            } else {
                System.out.println("Acesso permitido.");
            }
        }

        scanner.close();
    }
}

public class Ex30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a descrição do produto: ");
        String descricao = scanner.nextLine();

        System.out.print("Digite a quantidade adquirida: ");
        int quantidade = scanner.nextInt();

        System.out.print("Digite o preço unitário: ");
        double precoUnitario = scanner.nextDouble();

        double total = quantidade * precoUnitario;
        double desconto = 0.0;

        if (quantidade <= 5) {
            desconto = total * 0.02;
        } else if (quantidade <= 10) {
            desconto = total * 0.03;
        } else {
            desconto = total * 0.05;
        }

        double totalAPagar = total - desconto;

        System.out.println("Total: R$" + total);
        System.out.println("Desconto: R$" + desconto);
        System.out.println("Total a pagar: R$" + totalAPagar);

        scanner.close();
    }
}

private class Ex31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota da primeira verificação (N1): ");
        double n1 = scanner.nextDouble();

        System.out.print("Digite a nota da segunda verificação (N2): ");
        double n2 = scanner.nextDouble();

        System.out.print("Digite a nota da terceira verificação (N3): ");
        double n3 = scanner.nextDouble();

        System.out.print("Digite a média dos exercícios: ");
        double mediaExercicios = scanner.nextDouble();

        double mediaAproveitamento = (n1 + n2 * 2 + n3 * 3 + mediaExercicios) / 7;

        System.out.println("Média de Aproveitamento: " + mediaAproveitamento);

        if (mediaAproveitamento >= 9.0) {
            System.out.println("Conceito: A");
        } else if (mediaAproveitamento >= 7.5) {
            System.out.println("Conceito: B");
        } else if (mediaAproveitamento >= 6.0) {
            System.out.println("Conceito: C");
        } else if (mediaAproveitamento >= 4.0) {
            System.out.println("Conceito: D");
        } else {
            System.out.println("Conceito: E");
        }

        scanner.close();
    }
}

private class Ex32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do empregado (código): ");
        int codigoEmpregado = scanner.nextInt();

        System.out.print("Digite o ano de nascimento do empregado: ");
        int anoNascimento = scanner.nextInt();

        System.out.print("Digite o ano de ingresso do empregado na empresa: ");
        int anoIngresso = scanner.nextInt();

        int anoAtual = Calendar.getInstance().get(Calendar.YEAR);
        int idade = anoAtual - anoNascimento;
        int tempoTrabalho = anoAtual - anoIngresso;

        if (idade >= 65 || tempoTrabalho >= 30 || (idade >= 60 && tempoTrabalho >= 25)) {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
            System.out.println("Requerer aposentadoria");
        } else {
            System.out.println("Idade: " + idade + " anos");
            System.out.println("Tempo de trabalho: " + tempoTrabalho + " anos");
            System.out.println("Não requerer aposentadoria");
        }

        scanner.close();
    }
}
*/