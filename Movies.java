public class Movies extends Records{
    public void add(){
        String name = In.readString("\tEnter Movie Name: ");
        double cost = In.readDouble("\tEnter Movie Cost: ");
        records.add(new Movie(++id, name, cost));
    }
    
    public Movie find(int id){
        return (Movie) super.find(id);
    }
    
    public String toString(){
        String result = "";
        for(Record movie : records)
            result += movie.toString() + "\n";
        return result;
    }
}