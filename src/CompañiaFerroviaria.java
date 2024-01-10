import java.util.ArrayList;

public class CompañiaFerroviaria {

    private Integer codigo_compañia;
    private ArrayList<Tren> trenes;
    private ArrayList<Empleado> empleados;

    public CompañiaFerroviaria(Integer codigo_compañia) {
        this.codigo_compañia = codigo_compañia;
        trenes = new ArrayList<Tren>();
        empleados = new ArrayList<Empleado>();
    }

    public Integer getCodigo_compañia() {
        return codigo_compañia;
    }

    public void setCodigo_compañia(Integer codigo_compañia) {
        this.codigo_compañia = codigo_compañia;
    }

    @Override
    public String toString() {
        return "CompañiaFerroviaria: " + "codigo_compañia=" + codigo_compañia;
    }
}
