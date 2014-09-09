import java.awt.Graphics;
/**
 *
 * @author Jacob Hildebrand
 */
public class HexMap{
    
    private int hexSize, width, height;
      
    public HexMap (int HexSize, int MapWidth, int MapHeight){
               
        this.hexSize = HexSize;
        this.width = MapWidth;
        this.height = MapHeight;
        
        }
    
    public void drawHexMap(Graphics g){
        int x, y;
        int step = hexSize+(hexSize/2);
        
        
        for ( y = 0; y <= height;  y += hexSize){
            for ( x = 0; x <= (width-hexSize); x += step){
                int[] xPoints= new int[]{x, (x + (int)(hexSize / 4)), 
                    (x + (int)((hexSize / 4) + (int) (hexSize / 2))), (x + hexSize), 
                    (x + (int)((hexSize / 4)+(hexSize / 2))), (x + (int)(hexSize / 4))};
                int[] yPoints = new int[]{y + (int)(hexSize / 2), y, y, 
                    y + (int)(hexSize / 2), y + hexSize, y + hexSize};
                g.drawPolygon(xPoints, yPoints,6);
                
            }
        }
        
        for ( y=((int)(hexSize - (hexSize / 2))); y <= height; y += hexSize){
            for ( x=((int)(hexSize - (hexSize / 4))); x <= (width-hexSize); x += step){
                int[] xPoints= new int[]{x, (x + (int)(hexSize / 4)), 
                    (x + (int)((hexSize / 4) + (int) (hexSize / 2))), (x + hexSize), 
                    (x + (int)((hexSize / 4)+(hexSize / 2))), (x + (int)(hexSize / 4))};
                int[] yPoints = new int[]{y + (int)(hexSize / 2), y, y, 
                    y + (int)(hexSize / 2), y + hexSize, y + hexSize};
                g.drawPolygon(xPoints, yPoints,6);
            }
        }
    }

}