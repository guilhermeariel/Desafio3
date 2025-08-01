package br;

public class Administrador extends Usuario {

  public Administrador(String senha, String email, String nome) {
    super(senha, email, nome);
  }

  @Override
  // A classe filha precisa implementar a logica do metodo {}
  public boolean autenticar(String senha) {
  // Compara a senha fornecida com a senha do atributo
    return senha.equals(super.getSenha());
  }

  public void redefinirSenha(String senhaAtual, String novaSenha) {
    if (super.getSenha().equals(senhaAtual)) {
      super.setSenha(novaSenha);
      System.out.println("Senha redefinida com sucesso!");
    } else {
      System.out.println("Senha incorreta!");
    }
  }

}
