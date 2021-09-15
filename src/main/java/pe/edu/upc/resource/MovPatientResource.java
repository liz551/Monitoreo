package pe.edu.upc.resource;

import lombok.Data;

import java.util.Date;

@Data
public class MovPatientResource {

    private int id;
    private String name;
    private String lastName;
    private String email;
    private String password;
    private String dni;
    private String resetPasswordToken;
    private Date dateCreation;
    private Date dateLocation;
}
