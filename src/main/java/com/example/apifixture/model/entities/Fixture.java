package com.example.apifixture.model.entities;

import java.util.List;
import lombok.*;

@Getter
@Setter
public class Fixture {
  private Torneo torneo;
  private List<Equipo> equipos;
  private Jugador creador;
  private EstrategiaDeFixture estrategia;
}
