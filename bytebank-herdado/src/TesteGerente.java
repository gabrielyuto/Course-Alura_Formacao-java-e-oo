public class TesteGerente {

  public static void main(String[] args) {

    Gerente gerente = new Gerente();
    gerente.setNome("Gabriel Yuto");
    gerente.setCpf("123133-1");
    gerente.setSalario(2600.00);

    System.out.println(gerente.getNome());
    System.out.println(gerente.getBonificacao());

    gerente.setSenha(222);

    boolean autentica = gerente.autentica(222);

    System.out.println(autentica);

    double bonificacao = gerente.getBonificacao();

    System.out.println(bonificacao);
  }
}
