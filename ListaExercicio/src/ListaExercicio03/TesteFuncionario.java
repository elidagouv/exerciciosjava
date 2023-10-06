public class TesteFuncionarios {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        gerente.setNome("João");
        gerente.setSalario(5000.0);
        gerente.setLogin("joao123");
        gerente.setSenha("senha123");

        Telefonista telefonista = new Telefonista();
        telefonista.setNome("Maria");
        telefonista.setSalario(2500.0);
        telefonista.setCodigoEstacao("EST001");

        Secretaria secretaria = new Secretaria();
        secretaria.setNome("Ana");
        secretaria.setSalario(3000.0);
        secretaria.setNumeroRamal("RAM001");

        // Exemplo de uso dos objetos
        System.out.println("Gerente: " + gerente.getNome() + ", Salário: " + gerente.getSalario());
        System.out.println("Telefonista: " + telefonista.getNome() + ", Salário: " + telefonista.getSalario());
        System.out.println("Secretaria: " + secretaria.getNome() + ", Salário: " + secretaria.getSalario());
    }
}
