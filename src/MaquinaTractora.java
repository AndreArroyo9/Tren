public class MaquinaTractora {
    // Attributes
    private double potencia_max;
    private Operario conductor;
    // Constructor
    public MaquinaTractora(double potencia_max, Operario conductor){
        this.potencia_max = potencia_max;
        this.conductor = conductor;
    }
    // Getters and setters
    public double getPotencia_max(){
        return this.potencia_max;
    }
    public Operario getConductor(){
        return this.conductor;
    }
    public void setPotencia_max(double potencia_max){
        this.potencia_max = potencia_max;
    }
    public void setConductor(Operario conductor){
        this.conductor = conductor;
    }
}
