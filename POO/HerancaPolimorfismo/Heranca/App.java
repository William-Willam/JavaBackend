package POO.HerancaPolimorfismo.Heranca;

public class App {
  public static void main(String[] args) {
    Gerente gerente = new Gerente();
    
    gerente.setLogin("Gerente001");
    gerente.setPassword("123456");
    gerente.setName("William");

    System.out.println(gerente.getName());
    System.out.println(gerente.getLogin());
    System.out.println(gerente.getPassword());
  }
}
