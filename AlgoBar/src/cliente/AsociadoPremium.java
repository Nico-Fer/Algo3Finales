package cliente;

import salones.Salon;

public class AsociadoPremium implements Cliente{
    @Override
    public boolean reservarSala(Salon sala, int cantidadInvitados) {
        return sala.reservarSala(this, cantidadInvitados);
    }

    @Override
    public boolean reservarSalaCine(int cantidadInvitados) {
        return true;
    }

    @Override
    public boolean reservarSalaGastronomica(int cantidadInvitados) {
        return true;
    }

    @Override
    public boolean reservarSalaDeMusica(int cantidadInvitados) {
        return true;
    }
}
