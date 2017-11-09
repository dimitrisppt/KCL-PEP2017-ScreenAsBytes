public class ScreenAsBytes {

    public static void setPixel(byte[] screen, int width, int x, int y) {
    	
    	int height = screen.length / (width / 8);
    	int bitPosition = 7- x%8;  	
    	
    	screen[(y*2) + (x%width/8)] |= (byte) Math.pow(2, bitPosition);

    	
    }

    public static void drawHorizontalLine(byte[] screen, int width, int startX, int endX, int y) {
    	
    	for (int i=startX; i <= endX; i++) {
    		setPixel(screen, width, i, y);
    	}
    }
    
    public static void drawVerticalLine(byte[] screen, int width, int x, int startY, int endY) {
    	
    	for (int i=startY; i <= endY; i++) {
    		setPixel(screen, width, x, i);
    	}
    }

}
