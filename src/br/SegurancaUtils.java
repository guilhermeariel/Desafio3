package br;

public class SegurancaUtils {

  //CONSTRUTOR PRIVADO
  private SegurancaUtils() {
    throw new UnsupportedOperationException("Classe utilitária - não instanciar.");
  }

  //Valida senha 8 caracteres e 1 numero
  public static boolean validarSenha(String senha) {
    if (senha == null || senha.length() <= 8) {
      return false;
    }

    for(char c : senha.toCharArray()) {
      if (Character.isDigit(c)) {
        return true;
      }
    }
  return false;
  }




}
