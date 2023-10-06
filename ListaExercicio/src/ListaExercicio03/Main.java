import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Funcionario> listaFuncionarios = new ArrayList<>();

        // Criar objetos de funcionários e adicioná-los à lista
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setSalario(5000.0);
        gerente.setLogin("joao123");
        gerente.setSenha("minhasenha");
        listaFuncionarios.add(gerente);

        Telefonista telefonista = new Telefonista();
        telefonista.setNome("Maria");
        telefonista.setSalario(3000.0);
        telefonista.setCodigoEstacao("Estacao123");
        listaFuncionarios.add(telefonista);

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Ana");
        secretaria.setSalario(3500.0);
        secretaria.setNumeroRamal("Ramal456");
        listaFuncionarios.add(secretaria);

        // Consultar funcionários na lista
        System.out.println("Consultar funcionários na lista:");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome() + " Salário: " + funcionario.getSalario());
        }

        // Alterar um funcionário na lista
        System.out.println("\nAlterar um funcionário na lista:");
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario instanceof Gerente) {
                Gerente gerenteExistente = (Gerente) funcionario;
                if (gerenteExistente.getLogin().equals("joao123")) {
                    gerenteExistente.setSalario(5500.0);
                    System.out.println("Salário do Gerente alterado para 5500.0");
                }
            }
        }

        // Excluir um funcionário da lista
        System.out.println("\nExcluir um funcionário da lista:");
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario instanceof Secretaria) {
                Secretaria secretariaExistente = (Secretaria) funcionario;
                if (secretariaExistente.getNumeroRamal().equals("Ramal456")) {
                    listaFuncionarios.remove(secretariaExistente);
                    System.out.println("Secretaria removida da lista");
                    break; // Para evitar a ConcurrentModificationException
                }
            }
        }

        // Consultar funcionários após as operações
        System.out.println("\nConsultar funcionários após as operações:");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome() + " Salário: " + funcionario.getSalario());
        }
    }
}
