package salones;

import cliente.Cliente;

public class SalonDeMusica implements Salon {
    @Override
    public boolean reservarSala(Cliente cliente, int cantidadInvitados) {
        return cliente.reservarSalaDeMusica(cantidadInvitados);
    }
}
