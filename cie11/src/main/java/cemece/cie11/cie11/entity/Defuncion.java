package cemece.cie11.cie11.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class Defuncion {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    //datos del fallecido
    @Column(nullable = false)
    private int folio;
    @Column
    private String nombre;
    @Column
    private String apPaterno;
    @Column
    private String apMaterno;
    @Column
    private int edad;
    @Column
    private String claveEdad;
    @Column
    private String fechaDefuncion;
    @Column
    private String tipoDefuncion;

    //Parte 1 de causas de defunción
    @Column
    private String causaA;
    @Column
    private int tiempoA;
    @Column
    private String claveTiempoA;
    @Column
    private String codigoCIE11A;
    @Column
    private String descripcionA;

    @Column
    private String causaB;
    @Column
    private int tiempoB;
    @Column
    private String claveTiempoB;
    @Column
    private String codigoCIE11B;
    @Column
    private String descripcionB;

    @Column
    private String causaC;
    @Column
    private int tiempoC;
    @Column
    private String claveTiempoC;
    @Column
    private String codigoCIE11C;
    @Column
    private String descripcionC;

    @Column
    private String causaD;
    @Column
    private int tiempoD;
    @Column
    private String claveTiempoD;
    @Column
    private String codigoCIE11D;
    @Column
    private String descripcionD;


    //Parte 2 de causas de defunción
    @Column
    private String causaParteDos;
    @Column
    private int tiempoParteDos;
    @Column
    private String claveTiempoParteDos;
    @Column
    private String codigoCIE11ParteDos;
    @Column
    private String descripcionParteDos;


    //Causa Básica de Defunción
    @Column
    private String cie11CBD;
    @Column
    private String descripcionCBD;



 //FOLIO
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }


    //FOLIO
    public int getFolio() {
        return folio;
    }
    public void setFolio(int folio) {
        this.folio = folio;
    }


    //NOMBRE
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    //APELLIDO PATERNO
    public String getApPaterno() {
        return apPaterno;
    }
    public void setApPaterno(String apPaterno) {
        this.apPaterno = apPaterno;
    }

    //APELLIDO MATERNO
    public String getApMaterno() {
        return apMaterno;
    }
    public void setApMaterno(String apMaterno) {
        this.apMaterno = apMaterno;
    }


    //EDAD
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }


    //CLAVE DE LA EDAD
    public String getClaveEdad() {
        return claveEdad;
    }
    public void setClaveEdad(String claveEdad) {
        this.claveEdad = claveEdad;
    }


    //FECHA DE DEFUNCIÓN
    public String getFechaDefuncion() {
        return fechaDefuncion;
    }
    public void setFechaDefuncion(String fechaDefuncion) {
        this.fechaDefuncion = fechaDefuncion;
    }


    //TIPO DE DEFUNCIÓN
    public String getTipoDefuncion() {
        return tipoDefuncion;
    }
    public void setTipoDefuncion(String tipoDefuncion) {
        this.tipoDefuncion = tipoDefuncion;
    }


    //PARTE 1 DE LAS CAUSAS DE DEFUNCIÓN

    //CAUSA A
    public String getCausaA() {
        return causaA;
    }
    public void setCausaA(String causaA) {
        this.causaA = causaA;
    }


    //TIEMPO DE LA CAUSA A
    public int getTiempoA() {
        return tiempoA;
    }
    public void setTiempoA(int tiempoA) {
        this.tiempoA = tiempoA;
    }


    //CLAVE DEL TIEMPO DE LA CAUSA A
    public String getClaveTiempoA() {
        return claveTiempoA;
    }
    public void setClaveTiempoA(String claveTiempoA) {
        this.claveTiempoA = claveTiempoA;
    }


    //CÓDIGO CIE-11 CAUSA A
    public String getCodigoCIE11A() {
        return codigoCIE11A;
    }
    public void setCodigoCIE11A(String codigoCIE11A) {
        this.codigoCIE11A = codigoCIE11A;
    }

    //DESCRIPCIÓN CÓDIGO CIE-11 A
    public String getDescripcionA() {
        return descripcionA;
    }
    public void setDescripcionA(String descripcionA) {
        this.descripcionA = descripcionA;
    }



    //CAUSA B
    public String getCausaB() {
        return causaB;
    }
    public void setCausaB(String causaB) {
        this.causaB = causaB;
    }


    //TIEMPO DE LA CAUSA B
    public int getTiempoB() {
        return tiempoB;
    }
    public void setTiempoB(int tiempoB) {
        this.tiempoB = tiempoB;
    }


    //CLAVE DEL TIEMPO DE LA CAUSA B
    public String getClaveTiempoB() {
        return claveTiempoB;
    }
    public void setClaveTiempoB(String claveTiempoB) {
        this.claveTiempoB = claveTiempoB;
    }


    //CÓDIGO CIE-11 CAUSA B
    public String getCodigoCIE11B() {
        return codigoCIE11B;
    }
    public void setCodigoCIE11B(String codigoCIE11B) {
        this.codigoCIE11B = codigoCIE11B;
    }


    //DESCRIPCIÓN CÓDIGO CIE-11 B
    public String getDescripcionB() {
        return descripcionB;
    }
    public void setDescripcionB(String descripcionB) {
        this.descripcionB = descripcionB;
    }




    //CAUSA C
    public String getCausaC() {
        return causaC;
    }
    public void setCausaC(String causaC) {
        this.causaC = causaC;
    }


    //TIEMPO CAUSA C
    public int getTiempoC() {
        return tiempoC;
    }
    public void setTiempoC(int tiempoC) {
        this.tiempoC = tiempoC;
    }


    //CLAVE DEL TIEMPO DE LA CAUSA C
    public String getClaveTiempoC() {
        return claveTiempoC;
    }
    public void setClaveTiempoC(String claveTiempoC) {
        this.claveTiempoC = claveTiempoC;
    }


    //CÓDIGO CIE-11 CAUSA C
    public String getCodigoCIE11C() {
        return codigoCIE11C;
    }
    public void setCodigoCIE11C(String codigoCIE11C) {
        this.codigoCIE11C = codigoCIE11C;
    }


    //DESCRIPCIÓN CÓDIGO CIE-11 C
    public String getDescripcionC() {
        return descripcionC;
    }
    public void setDescripcionC(String descripcionC) {
        this.descripcionC = descripcionC;
    }



    //CAUSA D
    public String getCausaD() {
        return causaD;
    }
    public void setCausaD(String causaD) {
        this.causaD = causaD;
    }


    //TIEMPO CAUSA D
    public int getTiempoD() {
        return tiempoD;
    }
    public void setTiempoD(int tiempoD) {
        this.tiempoD = tiempoD;
    }


    //CLAVE DEL TIEMPO DE LA CAUSA D
    public String getClaveTiempoD() {
        return claveTiempoD;
    }
    public void setClaveTiempoD(String claveTiempoD) {
        this.claveTiempoD = claveTiempoD;
    }


    //CÓDIGO CIE-11 DE LA CAUSA D
    public String getCodigoCIE11D() {
        return codigoCIE11D;
    }
    public void setCodigoCIE11D(String codigoCIE11D) {
        this.codigoCIE11D = codigoCIE11D;
    }


    //DESCRIPCIÓN CÓDIGO CIE-11 D
    public String getDescripcionD() {
        return descripcionD;
    }
    public void setDescripcionD(String descripcionD) {
        this.descripcionD = descripcionD;
    }



    //CAUSA PARTE 2
    public String getCausaParteDos() {
        return causaParteDos;
    }
    public void setCausaParteDos(String causaParteDos) {
        this.causaParteDos = causaParteDos;
    }


    //TIEMPO CAUSA PARTE 2
    public int getTiempoParteDos() {
        return tiempoParteDos;
    }
    public void setTiempoParteDos(int tiempoParteDos) {
        this.tiempoParteDos = tiempoParteDos;
    }


    //CLAVE DEL TIEMPO DE LA CAUSA PARTE 2
    public String getClaveTiempoParteDos() {
        return claveTiempoParteDos;
    }
    public void setClaveTiempoParteDos(String claveTiempoParteDos) {
        this.claveTiempoParteDos = claveTiempoParteDos;
    }


    //CÓDIGO DE LA CIE-11 CAUSA PARTE 2
    public String getCodigoCIE11ParteDos() {
        return codigoCIE11ParteDos;
    }
    public void setCodigoCIE11ParteDos(String codigoCIE11ParteDos) {
        this.codigoCIE11ParteDos = codigoCIE11ParteDos;
    }


    //DESCRIPCIÓN CÓDIGO CIE-11 PARTE DOS
    public String getDescripcionParteDos() {
        return descripcionParteDos;
    }
    public void setDescripcionParteDos(String descripcionParteDos) {
        this.descripcionParteDos = descripcionParteDos;
    }




    //CÓDIGO CIE-11  DE LA CAUSA BÁSICA DE DEFUNCIÓN
    public String getCie11CBD() {
        return cie11CBD;
    }
    public void setCie11CBD(String cie11cbd) {
        cie11CBD = cie11cbd;
    }


    //DESCRIPCIÓN DE LA CAUSAS BÁSICA DE DEFUNCIÓN
    public String getDescripcionCBD() {
        return descripcionCBD;
    }
    public void setDescripcionCBD(String descripcionCBD) {
        this.descripcionCBD = descripcionCBD;
    }

}
