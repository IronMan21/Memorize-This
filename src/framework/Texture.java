package framework;

import java.awt.image.BufferedImage;

public class Texture {

	SpriteSheet ps;
	private BufferedImage char_sheet = null;
	
	public BufferedImage[] bots = new BufferedImage[1];
	
	public Texture(){
		BufferedImageLoader loader = new BufferedImageLoader();
		
		try{
			char_sheet = loader.loadImage("/42_box.png");
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
		ps = new SpriteSheet(char_sheet);
		
		getTextures();
	}
	
	private void getTextures(){
		bots[0] = ps.grabImage(1, 1, 40, 40);

		
		
//		int col = 1;
//		int row = 1;
//		for(int i = 0; i < bots.length; i++){ // bot images
//			if(col == 1 && row == 1) 
//				col++;
//			bots[i] = ps.grabImage(col, row, 40, 40);
//			col++;
//			if(col == 5){
//				row++;
//				col = 1;
//			}
//			if(col == 4 && row == 5)
//				break;
//		}
		
	}
	
}
