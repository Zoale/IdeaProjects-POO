public class Main {
    public static void main(String[] args) {
        Persona pedro = new Persona();
        pedro.darNombre("Pedro Hernandez");
        System.out.println(pedro.saludar());

        for (int i = 0; i < 25; i++) {
            pedro.cumplirAnios();
        }
        System.out.println("Pedro tiene" + pedro.decirEdad() + "a;os de edad.");
        pedro.caminar();
    }
}