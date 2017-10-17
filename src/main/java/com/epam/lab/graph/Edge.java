package com.epam.lab.graph;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Edge {
  private Vertex start;
  private Vertex end;
}
