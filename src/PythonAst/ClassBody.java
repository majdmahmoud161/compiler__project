package PythonAst;

public class ClassBody {
//  : constructor_decl      #ConstructerDeclerLabel
//    | encapsulation         #EncapsulationLabel
//    | state                 #StateLabel
//    | decorator             #DecoratorLabel
//    ;
  ConstructorDecler constructorDecler;
  Encapsulation encapsulation;
  State state;
  Decorator decorator;

    public ConstructorDecler getConstructorDecler() {
        return constructorDecler;
    }

    public void setConstructorDecler(ConstructorDecler constructorDecler) {
        this.constructorDecler = constructorDecler;
    }

    public Encapsulation getEncapsulation() {
        return encapsulation;
    }

    public void setEncapsulation(Encapsulation encapsulation) {
        this.encapsulation = encapsulation;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public Decorator getDecorator() {
        return decorator;
    }

    public void setDecorator(Decorator decorator) {
        this.decorator = decorator;
    }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder("ClassBody { \n");

        if (constructorDecler != null) {
            builder.append("ConstructorDecler : ").append(constructorDecler).append("\n");
        }

        if (encapsulation != null) {
            builder.append("Encapsulation : ").append(encapsulation).append("\n");
        }

        if (state != null) {
            builder.append("State : ").append(state).append("\n");
        }

        if (decorator != null) {
            builder.append("Decorator : ").append(decorator).append("\n");
        }

        return builder.append(" }").toString();
    }
}
