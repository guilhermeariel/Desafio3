package br;

public abstract class Usuario {
  //ATRIBUTOS
  private String senha;
  private String email;
  private String nome;

  //CONSTRUTOR
  public Usuario(String senha, String email, String nome) {
    this.senha = senha;
    this.email = email;
    this.nome = nome;
  }

  //GETTERS SETTERS
  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  //METODOS PUBLICOS
  public abstract boolean autenticar(String senha);
  public void exbirUsuario() {
    System.out.println("Nome: " + this.nome + "\nSenha: " + this.email);
  }



  }


