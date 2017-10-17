package com.epam.lab.graph;


import java.util.Set;

public interface Graph {
  void addEdge(Edge edge);
  boolean deleteEdge(Edge edge);
  void addVertex(Vertex vertex);
  boolean deleteVertex(Vertex vertex);
  int density();
  Set<Vertex> findNeighbors(Vertex vertex);
  int deg(Vertex vertex);
  Set<Vertex> findPath(Vertex start, Vertex end);
}
