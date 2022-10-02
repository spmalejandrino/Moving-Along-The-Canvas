import java.awt.*;

public class Triangle
{
    private int height;
    private int width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;
    private Canvas canvas;

    /**
     * Create a new triangle at the default position with the
     * default color and size.
     */
    public Triangle(Canvas canvas)
    {
        height = 30;
        width = 40;
        xPosition = 50;
        yPosition = 15;
        color = "green";
        isVisible = false;
        this.canvas = canvas;
    }

    /**
     * Make this triangle visible. If it was already visible, do nothing.
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
     * Make this triangle invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the rightmost vertex to the location defined by newXPosition and newYPosition
     * @param  newXPosition - new location for rightmost vertex of triangle
     * @param  newYPosition - new location for rightmost vertex of triangle
     */
    public void moveTo(int newXPosition, int newYPosition)
    {
       erase();
       yPosition = newYPosition;
       xPosition = newXPosition;
       draw();
   }

    /**
     * Move the rightmost vertex the distance defined by xDistance and yDistance
     * @param  xDistance -- how far to move right or left in the horizontal direction
     * @param  xDistance -- how far to move up or down in the vertical direction
     */
    public void moveDirection(int xDistance, int yDistance)
    {
       erase();
       yPosition += yDistance;
       xPosition += xDistance;
       draw();
   }

    /**
     * Change the size to the new size (in pixels) given by newHeight, newWidth. Values must be >= 0.
     */
    public void changeSize(int newHeight, int newWidth)
    {
        erase();
        height = newHeight;
        width = newWidth;
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
     * Draw the triangle with current specifications (color, size, coordinates of the
     * rightmost vertex) on the canvas.
     */
    private void draw()
    {
        if(isVisible) {
            Polygon myPoly = new Polygon();                     //Points in order drawn:
            myPoly.addPoint(xPosition, yPosition);                       //First
            myPoly.addPoint(xPosition - height,yPosition + (width/2));  //Second
            myPoly.addPoint(xPosition - height,yPosition - (width/2));  //Third
            canvas.draw(this, color, myPoly);
        }
    }

    /**
     * Remove all graphics from the canvas
     */
    public void erase()
    {
        if(isVisible) {
            canvas.erase(this);
        }
    }

    /**
     *@return width -- measure of the base of the triangle
     */
    public int getWidth()
    {
        return width;
    }

    /**
     *@return height -- measure of the height of the triangle
     */
    public int getHeight()
    {
        return height;
    }

    /**
     *@return xPosition -- the x coordinate of the vertex opposite the base
     */
    public int getXPosition()
    {
        return xPosition;
    }
    
    /**
     *@return yPosition -- the y coordinate of the vertex opposite the base
     */
    public int getYPosition()
    {
        return yPosition;
    }
}
