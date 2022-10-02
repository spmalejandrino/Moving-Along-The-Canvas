/**
 * A class to handle the graphing of text
 * 
 * @author Computer Science Department
 * @version January 2008
 */

public class Label
{
    private String label;
    private int xCoord;
    private int yCoord;
    private String color;
    private boolean isVisible;
    private Canvas canvas;

    /**
     * Constructor for objects of class Label.  Place "invisible, blank" label at upper lefthand corner
     * of the canvas in black font.
     */
    public Label(Canvas canvas)
    {
        label = "";
        xCoord = 0;
        yCoord = 0;
        color = "black";
        isVisible = false;
        this.canvas = canvas;
    }

    /**
     * Constructor for objects of class Label.  Place "invisible" label specified by the first
     * parameter at the position specified by the second and third parameters of the canvas.
     */
    public Label(String label, int xCoord, int yCoord, Canvas canvas)
    {
        this.label = label;
        this.xCoord = xCoord;
        this.yCoord = yCoord;
        color = "black";
        isVisible = false;
        this.canvas = canvas;
    }
    
    /**
     * Make this label visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        if (!canvas.getVisible()){
            canvas.setVisible(true);
        }
        isVisible = true;
        draw();
    }
    
    /**
     * Make this label invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the label to the location defined by newXCoord and newYCoord
     * @param  newXCoord -- new x location for label
     * @param  newYCoord -- new y location for label
     */
    public void moveTo(int newXCoord, int newYCoord)
    {
       erase();
       yCoord = newYCoord;
       xCoord = newXCoord;
       draw();
   }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the label with current specifications (color, message and coordinates)
     * on the canvas.
     */
    private void draw()
    {
        if(isVisible) {
            canvas.drawString(this, color, label, xCoord, yCoord);
        }
    }

    /**
     * Remove the label from the canvas
     */
    public void erase()
    {
        if(isVisible) {
            canvas.erase(this);
        }
    }

    /**
     * Change the text of this label.
     */
    public void setText(String label)
    {
        this.label = label;
        draw();
    }
    
    /**
     * @returns xCoord -- the x coordinate of the label anchor.
     */
    public int getXCoord()
    {
        return xCoord;
    }
    
    /**
     * @returns yCoord -- the y coordinate of the label anchor.
     */
    public int getYCoord()
    {
        return yCoord;
    }
    
    /**
     * sets the y coordinate of the label anchor.
     * @param y -- the new y coordinate
     */
    public void setYCoord(int y)
    {
        this.yCoord = y;
    }
    
    /**
     * sets the y coordinate of the label anchor.
     * @param x -- the new x coordinate
     */
    public void setXCoord(int x)
    {
        this.xCoord = x;
    }
}
