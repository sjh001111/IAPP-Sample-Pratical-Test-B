import java.util.*;

/**
 * class Sessions 
 */
public class Sessions extends Records
{
    public Sessions()
    {

    }

    public void sellTickets()
    {
        System.out.println("Sell Tickets");
        int id = In.readInt("\tSession id: ");
        Session session = find(id);
        if (session == null)
        {
            System.out.println("No matching session found");
        }
        else
        {
            session.sellTickets();
        }
    }

    public double cost()
    {
        double cost = 0;
        for(Record record: records)
        {   
            cost+= ((Session)record).cost(); 
        }
        return cost;
    }

    public Session find(int id)
    {   
        return (Session) super.find(id);    
    }

    public void add(Movie movie, Theatre theatre, String name, int time)
    {   
        if(theatre.vacant(time))
        {
            Session session = new Session(++id, name, movie, theatre);   
            double goldPrice = In.readDouble("\tEnter Prices for Gold Class Seats: ");
            double regularPrice = In.readDouble("\tEnter Prices for Regular Seats: ");

            double cost[] = {goldPrice, regularPrice};
            session.setPrices(cost);
            add(session);
            theatre.setBooked(time);
        }
        else
            System.out.println("Theatre not available for the selected time, session aborted");
    }

    public String name(int time)
    {
        String name = "";
        switch (time)
        {
            case 0: name = "9am"; break; 
            case 1: name = "12noon"; break; 
            case 2: name = "3pm"; break; 
            case 3: name = "6pm"; break; 
            default: name = "unknown";
        }
        return name;   
    }

    public double income()
    {
        double income = 0;
        for(Record record : records)
        {   
            income+= ((Session)record).income(); 
        }
        return income;
    }
}
