package com.map.assesment.contoller;


public class MapService 
{
	 public static void main(String[] args) {
		 
		   System.out.println("Inside Main class");
		  	MapGeneratorService mapGenerator = new MapGeneratorService();
	        mapGenerator.randomCities();
	        mapGenerator.printCities();

	        RoadConnectorService roadConnector = new RoadConnectorService();
	        roadConnector.connectCities(mapGenerator.getCitiesDataList());

	        GraphVisualizerService graphVisualizer = new GraphVisualizerService();
	        graphVisualizer.visualize(mapGenerator.getCitiesDataList(), roadConnector.getRoadsDataList());
	    }
}
