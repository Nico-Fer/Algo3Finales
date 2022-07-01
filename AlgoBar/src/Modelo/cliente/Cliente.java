package cliente;


import salones.Salon;

public interface Cliente {

    public boolean reservarSala(Salon sala, int cantidadInvitados);

    public boolean reservarSalaCine(int cantidadInvitados);
    public boolean reservarSalaGastronomica(int cantidadInvitados);
    public boolean reservarSalaDeMusica(int cantidadInvitados);

}
