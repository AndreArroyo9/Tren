public class Tren {

    private Integer codigo_identificador;
    private Jefe jefe;
    private MaquinaTactora maquina;
    private Vagon vagones;

    public Tren(Integer codigo_identificador, Jefe jefe, MaquinaTactora maquina, Vagon vagones) {
        this.codigo_identificador = codigo_identificador;
        this.jefe = jefe;
        this.maquina = maquina;
        this.vagones = vagones;
    }

    public Integer getCodigo_identificador() {
        return codigo_identificador;
    }

    public void setCodigo_identificador(Integer codigo_identificador) {
        this.codigo_identificador = codigo_identificador;
    }

    public Jefe getJefe() {
        return jefe;
    }

    public void setJefe(Jefe jefe) {
        this.jefe = jefe;
    }

    public MaquinaTactora getMaquina() {
        return maquina;
    }

    public void setMaquina(MaquinaTactora maquina) {
        this.maquina = maquina;
    }

    public Vagon getVagones() {
        return vagones;
    }

    public void setVagones(Vagon vagones) {
        this.vagones = vagones;
    }

    @Override
    public String toString() {
        return "Tren:" + "codigo_identificador=" + codigo_identificador + ", jefe=" + jefe + ", maquina=" + maquina + ", vagones=" + vagones;
    }
}
