package pe.edu.upc.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
@Entity
@Table(name ="ritmo_cardiaco")
public class RitmoCardiaco {

    @Id
    @Column(name = "patient_id")
    private int idRitmo;

    @NotNull
    @Column(name = "ritmo_cardiaco", length = 15, nullable = false)
    private int ritmoCardiaco;

    @NotNull
    @Column(name = "fecha", length = 15, nullable = false)
    private Date fecha;


    @OneToOne
    @MapsId
    @JoinColumn(name = "patient_id")
    @JsonIgnore
    private MovPatient patient;


	public int getIdRitmo() {
		return idRitmo;
	}


	public void setIdRitmo(int idRitmo) {
		this.idRitmo = idRitmo;
	}


	public int getRitmoCardiaco() {
		return ritmoCardiaco;
	}


	public void setRitmoCardiaco(int ritmoCardiaco) {
		this.ritmoCardiaco = ritmoCardiaco;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}


	public MovPatient getPatient() {
		return patient;
	}


	public void setPatient(MovPatient patient) {
		this.patient = patient;
	}
    

}
