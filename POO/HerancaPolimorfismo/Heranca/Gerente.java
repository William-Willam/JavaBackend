package POO.HerancaPolimorfismo.Heranca;

public non-sealed class Gerente extends Empregado {

    private String login;
    private String password;
    private double commission;

    // construtores
    public Gerente(String code, String name, String address, String age, double salary, String login, String password,
            double commission) {
        super(code, name, address, age, salary);
        this.login = login;
        this.password = password;
        this.commission = commission;
    }

    public Gerente() {
    }

    // Getters e setters
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

}