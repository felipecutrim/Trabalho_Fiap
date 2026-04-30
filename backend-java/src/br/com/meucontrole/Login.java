package br.com.meucontrole;

public class Login {
    private String username;
    private String password;

    public Login() {

    }
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }
    public void realizarLogin() {
        System.out.println("Executando método realizarLogin()");
    }
}
