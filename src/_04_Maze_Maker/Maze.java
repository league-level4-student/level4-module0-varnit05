package _04_Maze_Maker;
import java.awt.Graphics;
import java.lang.reflect.Array;

public class Maze {
	//1. Create a 2D array of cells. Don't initialize it.
	Cell[][] array2d;

	private int width;
	private int height;

	public Maze(int w, int h) {
		this.width = w;
		this.height = h;

		//2. Initialize the cells using the width and height variables
		array2d = new Cell[w][h];
		//3. Iterated through each cell and initialize it
		//   using i and j as the location
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
		array2d[i][j] = new Cell(j, j);
	}
		}
	}

	//4. This method iterates through the cells and draws them
	public void draw(Graphics g) {
		for(int i = 0; i < array2d.length; i++) {
			for(int j = 0; j < array2d[i].length; j++) {
				array2d[i][j].draw(g);
	}
		}
	}
	//4b. This method returns the selected cell.
	public Cell getCell(int x, int y){
		return array2d[x][y];
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
}
