package com.map.assesment.contoller;

import java.util.List;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import com.map.assesment.bean.City;
import com.map.assesment.bean.Road;

public class GraphVisualizerService {

	private Graph graph = new SingleGraph("Random Map");

	public void visualize(List<City> cities, List<Road> roads) {
		for (City city : cities) {
			graph.addNode(city.getCityName()).setAttribute("ui.label", city.getCityName());
		}

		for (Road road : roads) {
			//String id = road.getCity1().getCityName() + "-" + road.getCity2().getCityName();
			/*
			 * graph.addEdge(id, road.getCity1().getCityName(),
			 * road.getCity2().getCityName()).setAttribute("ui.label", road.getLanes() +
			 * " lanes");
			 */
			String city1Name = road.getCity1().getCityName();
		    String city2Name = road.getCity2().getCityName();
		    String id = city1Name + "-" + city2Name;

			if (graph.getNode(city1Name) != null && graph.getNode(city2Name) != null) {
		        graph.addEdge(id, city1Name, city2Name).setAttribute("ui.label", road.getLanes() + " lanes");
		    } else {
		        System.err.println("Edge creation failed: One or both nodes do not exist. Edge ID: " + id);
		    }
			
		}

		graph.display();
	}

}
