public class Vehicle {
    // the Vehicle class has two fields
    private String make;
    private int milesPerGallon;

    // constructor
    public Vehicle() {
    }// end constructor
     // mutator/setter methods

    public void setMake(String m) {
        make = m;
    }// end method setMake

    public void setMilesPerGallon(int mpg) {
        milesPerGallon = mpg;
    }// end method setMilesPerGallon

    public String getMake() {
        return make;
    }// end method getMake

    public int getMilesPerGallon() {
        return milesPerGallon;
    }// end method getMilesPerGallon

    public static void main(String[] args) {
        Vehicle Innova = new Vehicle();

        Innova.setMake("Toyota");
        Innova.setMilesPerGallon(30);

        String make = Innova.getMake();
        int mpg = Innova.getMilesPerGallon();

        System.out.println("Merk Mobil : " + make);
        System.out.println("Jumlah Mobil : " + mpg);
    }
}