package com.epam.lab.graph;


import com.sun.org.apache.regexp.internal.RE;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class GraphImpl implements Graph {

  private Set<Vertex> vertexSet;
  private Set<Edge> edgeSet;

  public GraphImpl(Set<Edge> edges, Set<Vertex> vertices) {
    this.vertexSet = vertices;
    this.edgeSet = edges;
  }

  public GraphImpl(Set<Edge> edges) {
    this.edgeSet = edges;
    vertexSet = new HashSet<Vertex>();
    edges.forEach(edge -> {
      vertexSet.add(edge.getStart());
      vertexSet.add(edge.getEnd());
    });
  }

  public void addEdge(Edge edge) {
    edgeSet.add(edge);
  }

  public boolean deleteEdge(Edge edge) {
    return edgeSet.remove(edge);
  }

  public void addVertex(Vertex vertex) {
    vertexSet.add(vertex);
  }

  public boolean deleteVertex(Vertex vertex) {
    return vertexSet.remove(vertex);
  }

  public int density() {
    int edgeSize = edgeSet.size();
    int vertexSize = vertexSet.size();
    return (2 * edgeSize) / (vertexSize * vertexSize - vertexSize);
  }

  public Set<Vertex> findNeighbors(Vertex vertex) {
    Set<Vertex> neighbors = new HashSet<>();
    edgeSet.forEach(edge -> {
      if (edge.getEnd().equals(vertex)) {
        neighbors.add(edge.getStart());
      } else if (edge.getStart().equals(vertex)) {
        neighbors.add(edge.getEnd());
      }
    });
    return neighbors;
  }

  public int deg(Vertex vertex) {
    return findNeighbors(vertex).size();
  }

  public Set<Vertex> findPath(Vertex start, Vertex end) {
//    Vertex node = start;
//    Queue<Vertex> queue = new LinkedList<>();

    return null;
  }

}
  
