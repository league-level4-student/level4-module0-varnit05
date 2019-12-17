package _04_Maze_Maker;

import java.util.ArrayList;
import java.util.Random;
import java.util.Stack;


public class MazeMaker{
	
	private static int width;
	private static int height;
	
	private static Maze maze;
	
	private static Random randGen = new Random();
	private static Stack<Cell> uncheckedCells = new Stack<Cell>();
	
	
	public static Maze generateMaze(int w, int h){
		width = w;
		height = h;
		maze = new Maze(width, height);
		
		//4. select a random cell to start
		Random r1 = new Random();
		Random r2 = new Random();
		r1.nextInt(width);
		r2.nextInt(height);
		Cell c = new Cell(width, height);
		
		//5. call selectNextPath method with the randomly selected cell
		selectNextPath(c);
		
		return maze;
	}

	//6. Complete the selectNextPathMethod
	private static void selectNextPath(Cell currentCell) {
		//A. mark cell as visited
	currentCell.hasBeenVisited();
		//B. Get an ArrayList of unvisited neighbors using the current cell and the method below
	ArrayList<Cell> x = getUnvisitedNeighbors(currentCell);
		//C. if has unvisited neighbors,
	//C1. select one at random.
		if (x.size()>0) {
			Random r = new Random();
			Cell cell  = x.get(r.nextInt(x.size()-1));
			uncheckedCells.push(cell);
			
			cell.equals(currentCell);
			cell.hasBeenVisited();
				selectNextPath(currentCell);
		}
		else {
			if (uncheckedCells.isEmpty())  {
				Random r = new Random();
				Cell y  = x.get(r.nextInt(x.size()-1));
				 y = uncheckedCells.pop();
					selectNextPath(currentCell);
			}
		}
		}
			
		
		
	
				
			//C2. push it to the stack
			//C3. remove the wall between the two cells  
			//C4. make the new cell the current cell and mark it as visited
		
			//C5. call the selectNextPath method with the current cell
			
			
		//D. if all neighbors are visited
		
			//D1. if the stack is not empty
			
				// D1a. pop a cell from the stack
		
				// D1b. make that the current cell
		
				// D1c. call the selectNextPath method with the current cell
				
			
		
		
	

	//7. Complete the remove walls method.
	//   This method will check if c1 and c2 are adjacent.
	//   If they are, the walls between them are removed.
	private static void removeWalls(Cell c1, Cell c2 ) {
		
	}
	
	//8. Complete the getUnvisitedNeighbors method
	//   Any unvisited neighbor of the passed in cell gets added
	//   to the ArrayList
	private static ArrayList<Cell> getUnvisitedNeighbors(Cell c) {
		return null;
	}
}
