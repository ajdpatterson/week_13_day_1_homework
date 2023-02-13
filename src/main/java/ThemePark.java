import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;
import stalls.Stall;

import java.util.ArrayList;

public class ThemePark {
    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;
    private ArrayList<IReviewed> reviewed;
    private Visitor visitor;
    private Attraction attraction;

    public ThemePark(ArrayList<Attraction> attractions, ArrayList<Stall> stalls) {
        this.attractions = attractions;
        this.stalls = stalls;
        this.reviewed = new ArrayList<>();
    }

    public ArrayList<Attraction> getAttractions() {
        return attractions;
    }

    public ArrayList<Stall> getStalls() {
        return stalls;
    }

    public ArrayList<IReviewed> getAllReviewed(){
        for (Attraction attraction : attractions){
            reviewed.add(attraction);
        }
        for (Stall stall : stalls){
            reviewed.add(stall);
        }
        return reviewed;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addVisit();
        visitor.visitAttraction(attraction);
    }
}
