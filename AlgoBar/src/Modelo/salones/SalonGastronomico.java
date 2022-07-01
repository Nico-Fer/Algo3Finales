package salones;

import cliente.Cliente;

public class SalonGastronomico implements Salon {
    @Override
    public boolean reservarSala(Cliente cliente, int cantidadInvitados) {
        return cliente.reservarSalaGastronomica(cantidadInvitados);
    }
}
