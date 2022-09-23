public class TesteFuncionario {

  public static void main(String[] args) {

    Gerente gerente = new Gerente();
    gerente.setNome("Gabriel Yuto");
    gerente.setCpf("123133-1");
    gerente.setSalario(2600.00);

    System.out.println(gerente.getNome());
    System.out.println(gerente.getBonificacao());


  }
}
