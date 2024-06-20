import BusesBuho.cliente;
import BusesBuho.ruta;
import BusesBuho.ticket;
import BusesBuho.Servicios;

public class Main {
    public static void main(String[] args) {

        // Adrian Ramos
        cliente pasajero1 = new cliente();
        ruta r1 = new ruta(pasajero1);
        ticket t1 = new ticket(pasajero1);
        Servicios s1 = new Servicios(pasajero1);

        pasajero1.setNombre("Adrian Ramos");

        r1.seleccionDeRuta();
        t1.seleccionCategoria();
        t1.precioTicket();
        s1.selecciondeServicio();

        pasajero1.mostrarDatosCliente();

        // Josue Guerra
        cliente pasajero2 = new cliente();
        ruta r2 = new ruta(pasajero2);
        ticket t2 = new ticket(pasajero2);
        Servicios s2 = new Servicios(pasajero2);

        pasajero2.setNombre("Josue Guerra");

        r2.seleccionDeRuta();
        t2.seleccionCategoria();
        t2.precioTicket();
        s2.selecciondeServicio();

        pasajero2.mostrarDatosCliente();

        // Carlos Perez

        cliente pasajero3 = new cliente();
        ruta r3 = new ruta(pasajero3);
        ticket t3 = new ticket(pasajero3);
        Servicios s3 = new Servicios(pasajero3);

        pasajero3.setNombre("Carlos Perez");

        r3.seleccionDeRuta();
        t3.seleccionCategoria();
        t3.precioTicket();
        s3.selecciondeServicio();

        pasajero3.mostrarDatosCliente();
    }
}