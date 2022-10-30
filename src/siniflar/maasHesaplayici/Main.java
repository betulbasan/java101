package siniflar.maasHesaplayici;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("ali",2000.0,45,1985);
        String string = e1.toString();
        System.out.println(string);
    }
}
