package PythonAst;

import java.util.ArrayList;

public class Program {

    ArrayList<State> states = new ArrayList<>();


    public ArrayList<State> getStates() {
        return states;
    }

    public void setStates(ArrayList<State> states) {
        this.states = states;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("State { \n");
        if(!states.isEmpty()){
            builder.append("state : " +" " + states);
        }
        return builder + " }";
    }
}
