public class MyShape {
    protected int xPosition;
    protected int yPosition;
    protected boolean isVisible;
    protected String color;
    private int height;
    private int width;

    public MyShape(int xPosition, int yPosition, String color) {
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.isVisible = false;
        this.color = color;
        this.height = 60;
        this.width = 70;
    }

    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    public void moveRight()
    {
        moveHorizontal(20);
    }

    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    public void moveUp()
    {
        moveVertical(-20);
    }

    public void moveDown()
    {
        moveVertical(20);
    }

    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0)
        {
            delta = -1;
            distance = -distance;
        }
        else
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            xPosition += delta;
            draw();
        }
    }

    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0)
        {
            delta = -1;
            distance = -distance;
        }
        else
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            yPosition += delta;
            draw();
        }
    }

    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }

    public void draw() {

    }

}
