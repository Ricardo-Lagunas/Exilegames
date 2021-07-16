package Generation.Exilegames;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class
public class videojuegos {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer idvideojuegos;
    private String nombreVJ;
    private String sku;
    private String plataforma;
    private String descripcion;

    //Tenemos que crear Geters and Setters para obtener variables privadas


    public Integer getIdvideojuegos() {
        return idvideojuegos;
    }

    public void setIdvideojuegos(Integer idvideojuegos) {
        this.idvideojuegos = idvideojuegos;
    }

    public String getNombreVJ() {
        return nombreVJ;
    }

    public void setNombreVJ(String nombreVJ) {
        this.nombreVJ = nombreVJ;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public String getPlataforma(String plataforma) {
        return this.plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public String getDescripcion(String descripcion) {
        return this.descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}