import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class ShortestPath {

	public ShortestPath() {
		
	}
	
	public ShortestPath(Graph matrix, Node startNode, Node endNode ) {
		
	Map <Node, int> totalCost = new Map<>();
	Map<Node, Node> prevNodes = new Map<>();
	MinPQ<Node> minPQ = new MinPQ<>();
	
	totalCosts.put(startNode, 0);
	minPQ.add(startNode);
	
	for (Node node : matrix.nodes()) {
		if (node != startNode) {
			totalCosts.put(node, INFINITY);
		}
	}
	
	while (!minPQ.isEmpty) {
		Node smallestNode = minPQ.deleteMin();
	}
	
	for (Node neighbor : smallestNode.neighbors()) {
		
		if (!visted.contains(neighbor)) {
			
			int altPath = totalCosts.get(smallestNode) + distance(smallestNode, neighbor);
			
			if (altPath < totalCosts.get(neighbor)) {
				
				totalCosts.put(neighbor, altPath);
				prevNodes.put(neighbor, smallestNode);
				
				minPQ.decreasePriority(neighbor, altPath);
			}
		}
	}
	
	List<Object> results = new List<>();
	results.add(totalCosts); 
	results.add(prevNodes);
	return results;
	}
	
}
