package Polymorphism_6;

class Movie {
    private String name;

    public Movie(String name) {
        this.name = name;
    }
    
    public String plot() {
        //System.out.println("LOL");
        return "No ploat here";
    }

    public String getName() {
        return name;
    }
}

class Jaws extends Movie {
    public Jaws() {
      super("Jaws");
    }
    
    public String plot() {
        return "A sherk eats a lot of pepole";
    }
}
  
class IndependentDay extends Movie {

    public IndependentDay() {
        super("Indenpendent Day");
    }

    @Override
    public String plot() {
        return "Allins tring to take over planet earth";
    }
    
}

class MazeRunner extends Movie {
    public MazeRunner() {
        super("Maze runner");
    }

    @Override
    public String plot() {
        return "Kids try and escape a maze";
    }
    
}

class StarWars extends Movie {
    public StarWars() {
        super("Star Wars");
    }

    @Override
    public String plot() {
        return "Imparial forces try to take over the universe";
    }   
}

class Forgetable extends Movie {
    public Forgetable() {
        super("Forgetable");
    }
}

public class Main {
    
    public static void main(String[] args) {
        for(int i = 1; i < 11; i++) {
            Movie movie = randomMovie();
            System.out.println("Movie #" + i + " : " + movie.getName() + 
                               "\n" + "Ploat: " + movie.plot() + "\n");
        }
    }
    
    public static Movie randomMovie() {
        int randomNumber = (int) (Math.random()* 5) + 1;
        System.out.println("Randon number genareted was: " + randomNumber);
        switch(randomNumber) {
            case 1:
                return new Jaws();
                
            case 2:
                return new IndependentDay();
                
            case 3:
                return new MazeRunner();
                
            case 4:
                return new StarWars();
                
            case 5:
                return new Forgetable();
        }
        return null;
    }
}
