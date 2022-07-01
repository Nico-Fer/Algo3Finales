package salones;

import cliente.Cliente;

public class SalonDeCine implements Salon {

    @Override
    public boolean reservarSala(Cliente cliente, int cantidadInvitados) {
        return cliente.reservarSalaCine(cantidadInvitados);
    }
}
