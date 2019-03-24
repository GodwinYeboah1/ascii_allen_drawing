package problemset2_2;

public class ProblemSet2_2 {
	
	public static void drawEar() {
		 	// ear section	 
	   	   	System.out.println("  /\\________________________/\\  ");
	   	 	System.out.println(" |__                       ___|");
	   	   	 
	}
	 public static void drawHead() {
		 	// head section	 
	   	   	System.out.println(" |                            |    ");
	   	   	System.out.println(" |      $               $     |    ");
	   	   	System.out.println(" |                            |    ");
	   	 	System.out.println(" |              *             |    ");
	   	 	System.out.println(" |                            |	");
	   	 	System.out.println(" \\              --            /     ");
	   	 	System.out.println("   \\_______________________/		");
	   	   	 
	 }
	
	
	 public static void drawLeg() {
		// leg section
   	   	System.out.println("    ||        ||        ||  ");
   	   	System.out.println("    ||        ||        ||   ");
   	   	System.out.println("   (||)      (||)      (||) ");
   	   	
     }
	 

	 
	 
    public static void main(String[] args) {
        //Use print statements to create your own beautiful original ASCII art.
        //Use comments to describe what your image is depicting.
    	
    	//calls the drawEar function and draws a alien ear
    	drawEar();
    	//calls the drawHead function and draws a alien Head
    	drawHead();
    	//calls the drawLeg function and draws a  alien legs
        drawLeg();
 
        
    } 	
}
