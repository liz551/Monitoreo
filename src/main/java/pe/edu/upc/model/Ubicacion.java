package pe.edu.upc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@Entity
@Table(name ="ubicacion")
public class Ubicacion {
    @Id
    @Column(name = "patient_id")
    private int idUbicacion;


    @NotNull
    @Column(name = "latitud", nullable = false)
    private String latitud;

    @NotNull
    @Column(name = "longitud", nullable = false)
    private String longitud;

    @OneToOne
    @MapsId
    @JoinColumn(name = "patient_id")
    @JsonIgnore
    private MovPatient patient;

	public int getIdUbicacion() {
		return idUbicacion;
	}

	public void setIdUbicacion(int idUbicacion) {
		this.idUbicacion = idUbicacion;
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public MovPatient getPatient() {
		return patient;
	}

	public void setPatient(MovPatient patient) {
		this.patient = patient;
	}
    
    
    
}
