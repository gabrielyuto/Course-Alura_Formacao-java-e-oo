public class TesteReferencia {

  public static void main(String[] args) {

//    Funcionario funcionario = new Funcionario();
//    funcionario.setSalario(2000.0);

    Gerente gerente = new Gerente();
    gerente.setSalario(5000.0);

    EditorVideo editorVideo = new EditorVideo();
    editorVideo.setSalario(2000.0);

    Designer designer = new Designer();
    designer.setSalario(2000.0);

    ControleBonificacao controle = new ControleBonificacao();
//    controle.registra(funcionario);
    controle.registra(gerente);
    controle.registra(editorVideo);
    controle.registra(designer);

    System.out.println(controle.getSoma());
  }
}
