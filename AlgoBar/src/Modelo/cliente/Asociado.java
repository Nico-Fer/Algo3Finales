package cliente;

import salones.Salon;

public class Asociado implements Cliente {

    private int cantidadMinimaInivtados = 7;

    @Override
    public boolean reservarSala(Salon sala, int cantidadInvitados) {
        return sala.reservarSala(this, cantidadInvitados);
    }

    @Override
    public boolean reservarSalaCine(int cantidadInvitados) {
        if(cantidadInvitados >= cantidadMinimaInivtados){
            return true;
        }

        return false;
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
