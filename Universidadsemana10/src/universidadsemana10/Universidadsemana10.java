
package universidadsemana10;


public class Universidadsemana10 {
    
public Facultad() {
}

public Facultad(String id, String nombreFacultad, char pabellon, Carrera[] carreras, String decana) {
    this.id = id;
    this.nombreFacultad = nombreFacultad;
    this.pabellon = pabellon;
    this.carreras = carreras;
    this.decanal = decana;
}



public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getNombreFacultad() {
    return nombreFacultad;
}

public void setNombreFacultad(String nombreFacultad) {
    this.nombreFacultad = nombreFacultad;
}

public char getPabellon() {
    return pabellon;
}

public void setPabellon(char pabellon) {
    this.pabellon = pabellon;
}

public Carrera[] getCarreras() {
    return carreras;
}

public void setCarreras(Carrera[] carreras) {
    this.carreras = carreras;
}

public String getDecana() {
    return decana;
}

public void setDecana(String decana) {
    this.decanal = decana;
}
    
public Carrera() {
}

public Carrera(String id, String nombreCarrera, Curso[] cursos, int ciclos, String modalidad) {
    this.id = id;
    this.nombreCarrera = nombreCarrera;
    this.cursos = cursos;
    this.ciclos = ciclos;
    this.modalidad = modalidad;
}


public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getNombreCarrera() {
    return nombreCarrera;
}

public void setNombreCarrera(String nombreCarrera) {
    this.nombreCarrera = nombreCarrera;
}

public Curso[] getCursos() {
    return cursos;
}

public void setCursos(Curso[] cursos) {
    this.cursos = cursos;
}

public int getCiclos() {
    return ciclos;
}

public void setCiclos(int ciclos) {
    this.ciclos = ciclos;
}

public String getModalidad() {
    return modalidad;
}

public void setModalidad(String modalidad) {
    this.modalidad = modalidad;
}

public Curso() {
}

public Curso(String bloque, String formatoDictado, Persona[] personas, String aula, Horario horario, Carrera carrera) {
    this.bloque = bloque;
    this.formatoDictado = formatoDictado;
    this.personas = personas;
    this.aula = aula;
    this.horario = horario;
    this.carrera = carrera;
}



public String getBloque() {
    return bloque;
}

public void setBloque(String bloque) {
    this.bloque = bloque;
}

public String getFormatoDictado() {
    return formatoDictado;
}

public void setFormatoDictado(String formatoDictado) {
    this.formatoDictado = formatoDictado;
}

public Persona[] getPersonas() {
    return personas;
}

public void setPersonas(Persona[] personas) {
    this.personas = personas;
}

public String getAula() {
    return aula;
}

public void setAula(String aula) {
    this.aula = aula;
}

public Horario getHorario() {
    return horario;
}

public void setHorario(Horario horario) {
    this.horario = horario;
}

public Carrera getCarrera() {
    return carrera;
}

public void setCarrera(Carrera carrera) {
    this.carrera = carrera;
}

