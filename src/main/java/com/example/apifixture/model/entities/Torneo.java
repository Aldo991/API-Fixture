package com.example.apifixture.model.entities;

import lombok.*;

@Getter
@Setter
public class Torneo {
  private String nombreTorneo;
  private Double duracionDePartidas;
  private Double duracionDeDescanso;
}
