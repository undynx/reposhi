package datatypes;

import java.util.Date;

public class DtUsuario {
    private String nickname;
    private String nombre;
    private String apellido;
    private String correoElectronico;
    private Date fechaNacimiento;

    public DtUsuario(String nickname, String nombre, String apellido, String correoElectronico, Date fechaNacimiento) {
        this.nickname = nickname;
        this.nombre = nombre;
        this.apellido = apellido;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNickname() {
        return nickname;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

}
