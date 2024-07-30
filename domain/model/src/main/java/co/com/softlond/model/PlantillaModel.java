package co.com.softlond.model;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class PlantillaModel {
    private String nombre;
    private Date fecha;
    private String descripcion;
    private Date fechaActualizacion;
}