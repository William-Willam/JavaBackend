package POO.HerancaPolimorfismo.Heranca;

sealed abstract class Empregado permits Gerente {

    // atributos
    private String code;
    private String name;
    private String address;
    private String age;
    private double salary;

    // construtores
    public Empregado(String code, String name, String address, String age, double salary) {
        this.code = code;
        this.name = name;
        this.address = address;
        this.age = age;
        this.salary = salary;
    }

    public Empregado(){}

    // Getters e setters
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

}