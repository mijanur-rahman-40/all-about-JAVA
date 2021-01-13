package ThisVsSuper_9___Constructor_Chaining;

/*
//-----------------------------------BAD-----------------------------------------------//
class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    public Rectangle() {
        this.x = 0;
        this.y = 0;
        this.width = 0;
        this.height = 0;
    }
    
    public Rectangle(int wight, int height) {
        this.x = 0;
        this.y = 0;
        this.width = wight;
        this.height = height;
    }

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
}

//---------------------------GOOD----------------------------------------------------//

class Rectangle {
    private int x;
    private int y;
    private int width;
    private int height;

    //1st constructor
    public Rectangle() {
        this(0, 0); //called 2nd constructor
    }
    
    //2nd constroctor
    public Rectangle(int wight, int height) {
        this(0, 0, wight, height) //called 3rd constructor
    }

    //3rd constructor
    public Rectangle(int x, int y, int width, int height) {
        //Initialize variable
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }
    
}

//------------SUPER-----------------------------------//
class Shape {
    private int x;
    private int y;

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Rectangle extends Shape {
    private int width;
    private int height;
    
    //1st construtor
    public Rectangle(int x, int y) {
        this(x, y, 0, 0); //called 2nd parameter
    }
    
    //2nd constructor
    public Readable(int x, int y, int width, int height) {
        super(x, y); //called constructor from parent (Shape)
        this.width = width;
        this.height = height;
    }
}
*/