
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import cliente.*;
import salones.*;

public class AlgoBarPruebas {

    @Test
    public void test01NoSocioNoPuedeReservarSalaDeCine(){
        Cliente cliente = new NoSocio();
        Salon salon = new SalonDeCine();
        assertEquals(cliente.reservarSala(salon,0), false);
    }

    @Test
    public void test02NoSocioNoPuedeReservarSalaDeMusica(){
        Cliente cliente = new NoSocio();
        Salon salon = new SalonDeMusica();
        assertEquals(cliente.reservarSala(salon,0), false);
    }

    @Test
    public void test03NoSocioPuedeReservarSalaGastronomica(){
        Cliente cliente = new NoSocio();
        Salon salon = new SalonGastronomico();
        assertEquals(cliente.reservarSala(salon,0), true);
    }

    @Test
    public void test04SocioCon7InvitadosPuedeReservarSalaDeCine(){
        Cliente cliente = new Asociado();
        Salon salon = new SalonDeCine();
        assertEquals(cliente.reservarSala(salon,7), true);
    }

    @Test
    public void test05SocioConMenosDe7InvitadosNoPuedeReservarSalaDeCine(){
        Cliente cliente = new Asociado();
        Salon salon = new SalonDeCine();
        assertEquals(cliente.reservarSala(salon,4), false);
    }

    @Test
    public void test06SocioPuedeReservarSalaDeMusica(){
        Cliente cliente = new Asociado();
        Salon salon = new SalonDeMusica();
        assertEquals(cliente.reservarSala(salon,0), true);
    }

    @Test
    public void test07SocioPuedeReservarSalaGastronomica(){
        Cliente cliente = new Asociado();
        Salon salon = new SalonGastronomico();
        assertEquals(cliente.reservarSala(salon,4), true);
    }

    @Test
    public void test08SocioPremiumPuedeReservarSalaDeCine(){
        Cliente cliente = new AsociadoPremium();
        Salon salon = new SalonDeCine();
        assertEquals(cliente.reservarSala(salon,0), true);
    }

    @Test
    public void test09SocioPremiumPuedeReservarSalaDeMusica(){
        Cliente cliente = new AsociadoPremium();
        Salon salon = new SalonDeMusica();
        assertEquals(cliente.reservarSala(salon,0), true);
    }

    @Test
    public void test10SocioPremiumPuedeReservarSalGastronomica(){
        Cliente cliente = new AsociadoPremium();
        Salon salon = new SalonGastronomico();
        assertEquals(cliente.reservarSala(salon,0), true);
    }

}
