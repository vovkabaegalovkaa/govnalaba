import java.util.ArrayList;

public class DataBase {
    static ArrayList <Factory> factories = new ArrayList<Factory>();

    static public String getRez(Factory factory){
        if(factory.mark() > 0)
            return "Предприятие имеет положительный рост: " + factory.mark() + "%";
        else
            return "Предприятие имеет отрицательный рост: " + factory.mark() + "%";
    }
    static public void add(Factory factory){
        factories.add(factory);
    }


}
