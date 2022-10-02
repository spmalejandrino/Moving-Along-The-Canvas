/**
 * This Driver class creates two objects, allowing the user to start the Circle 
 * object moving ten times to the right of the canvas, as long as it doesn't disappear 
 * from the right of the canvas or to remove the objects from the canvas.
 * 
 * @author Computer Science Department
 */

public class Driver {
    private Canvas myCanvas;

    private Circle ball;
    private Triangle rocket;
    private Label label;

    /**
     * Constructor for the Driver class. Driver creates and makes visible a Circle object 
     * close to the center of the canvas, a Triangle object near (but not covering up) 
     * the ball and a Label object close to the center and top of the canvas.
     */
    public Driver()
    {
        myCanvas = new Canvas("Lab 4, shapes-1");

        ball = new Circle(myCanvas); 
        ball.moveTo(myCanvas.getWidth()/2, myCanvas.getHeight()/2);
        ball.makeVisible();

        rocket = new Triangle(myCanvas); 
        rocket.moveTo(myCanvas.getWidth()/2, myCanvas.getHeight()/2);
        rocket.makeVisible();

        label = new Label("This is fun",myCanvas.getWidth()/2 - 40, 15, myCanvas);
        label.makeVisible();
        

    }

    /**
     * As long as the ball object does not glide off the right side of the canvas, 
     * move the ball ten times "over three pixels to the right".  
     */
    public void start()
    {
        while (ball.getXPosition() < myCanvas.getWidth()) {
            ball.moveDirection(3,3);
            myCanvas.wait(50);
        }
        while (rocket.getYPosition() > 0) {
            rocket.moveDirection(0, -3);
            myCanvas.wait(50);
        }
    }

    /**
     * Remove the rocket and ball from the canvas
     */
    public void exit()
    {
        rocket.erase();
        ball.erase();
        myCanvas.setVisible(false);
    }
    
    public void bounceBall() {
        int i = ball.getYPosition();
        
        while (ball.getYPosition() < myCanvas.getHeight()) {
            ball.moveDirection(1,3);
            myCanvas.wait(50);
        }
        
        while ((i < ball.getYPosition()) && (ball.getXPosition() < myCanvas.getWidth())) {
            ball.moveDirection(1, -3);
            myCanvas.wait(50);
        }
    }
}