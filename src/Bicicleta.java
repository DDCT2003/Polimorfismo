public class Bicicleta  implements Vehículo{
    @Override
    public void acelerar() {
        System.out.println("La bicicleta acelera pedaleando");
    }

    @Override
    public void frenar() {
        System.out.println("La bicicleta frena con las manos");
    }
}
