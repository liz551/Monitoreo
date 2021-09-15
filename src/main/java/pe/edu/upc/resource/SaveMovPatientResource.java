package pe.edu.upc.resource;

import lombok.Data;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Data
public class SaveMovPatientResource {

    @NotNull
    private String name;

    @NotNull
    private String lastName;

    @NotNull
    private String email;

    @NotNull
    private String password;

    @NotNull
    private String dni;

    @NotNull
    private Date dateCreation;

    @NotNull
    private Date dateLocation;
}
