package br;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

  public static void main(String[] args) {
    Administrador adm = new Administrador("123","jubileu@jubis.com", "Jubileu");

    //Tentando acessar atributos
    System.out.println("\n--- Testando acesso direto aos atributos ---");
    System.out.println("Nome: " + adm.getNome());

    //Testando autenticação
    System.out.println("\n--- Testando autenticação ---");
    boolean autenticado = adm.autenticar("123");
    System.out.println("Autenticado? " + autenticado);

    //Testando redefinicao de senha
    System.out.println("\n--- Testando senha ---");
    adm.redefinirSenha("123", "123");

    //Usuario
    System.out.println("\n--- Exibindo usuário ---");
    adm.exbirUsuario();

    System.out.println("\n--- Testando SegurancaUtils ---");
    System.out.println("Senha 'abc123' é forte? " + SegurancaUtils.validarSenha("aqweasda15"));
    System.out.println("Senha 'abasdas564ac' é forte? " + SegurancaUtils.validarSenha("abasdas564ac"));


  }
}