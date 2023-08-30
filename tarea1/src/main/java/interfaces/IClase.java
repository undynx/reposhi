package interfaces;

import java.util.Date;
import java.util.List;
import logica.Clase;
import datatypes.DtActividad;

public interface IClase {
	public void altaDictadoClase(String nombreClase, DtActividad actividadDeportiva, Date fechaClase, String nombreProfesor,
			String horaInicio, String urlClase, Date fechaRegistro);
	public void registroClase(String institucion, String actividadDeportiva, String clase, String nickname);
	public void rankingDictadoClase();
	public void consultarDictadoClase(Clase clase);
	public void agregarClase(Clase clase);
	public List<Clase> getRankingClases();
	public Clase buscarClase(String abuscar);
}
