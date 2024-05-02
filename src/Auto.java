public class Auto implements Vehículo{
    @Override
    public void acelerar() {
        System.out.println("El automóvil acelera");
    }

    @Override
    public void frenar() {
        System.out.println("El automóvil frena");
    }
}
