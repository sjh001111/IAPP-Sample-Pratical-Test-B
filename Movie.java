public class Movie extends Record{
    private double cost;

    public Movie(int id, String name, double cost){
        super(id, name);
        this.cost = cost;
    }
    
    public int getCost(){
        return (int)cost;
    }

    public String toString(){
        return "Movie: " + id + " " + name + " cost: $" + cost;
    }
}