package com.example.apifixture.model.entities;

import java.util.List;
import lombok.*;

@Getter
@Setter
public class Equipo {
  private List<Jugador> jugadores;
  private String nombreEquipo;
  private int nroMaxJugadores;
  private int nroMinJugadores;

}
