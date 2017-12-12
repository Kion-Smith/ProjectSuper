package Graphics;
//pixel manipulation class
public class Screen 
{
	private int width,height; //size of screen
	public int[] pixels; //array for pixels on screen, single array because its faster than using a 2d array
	
	public Screen(int w,int h)
	{
		width = w;
		height =h;
		
		pixels = new int[width * height]; // all pixels on the screen
	}
	
	public void render()
	{
		for(int i =0;i<height;i++) // going to loop through the cols
		{
			for(int j = 0;j<width;j++) //looping through the row at the col
			{
				pixels[j + i* width] =  0xffff00ff; // because this is single dimension array so looks for position needs to offset by the width
			}
		}
	}
}
