/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.plsql.proyectofinal.mbeans;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.inject.Named;
import javax.faces.view.ViewScoped;

/**
 *
 * @author andresfelipegarciaduran
 */
@Named(value = "generalBean")
@ViewScoped
public class GeneralBean {

    /**
     * Creates a new instance of NewJSFManagedBean
     */
    public GeneralBean() {
    }

    public void actionCargarBaseDatos(ActionEvent event) {
        crearMensajeGrowl("INICIO LA CARGA", FacesMessage.SEVERITY_INFO);
    }

    public void actionEliminarBaseDatos(ActionEvent event) {
        crearMensajeGrowl("ELIMINAR REPORTE", FacesMessage.SEVERITY_INFO);
    }

    public void actionGenerarReporte(ActionEvent event) {
        crearMensajeGrowl("GENERAR REPORTE", FacesMessage.SEVERITY_INFO);
    }

    private void crearMensajeGrowl(String mensaje, FacesMessage.Severity tipoMensaje) {
        FacesMessage message = new FacesMessage(tipoMensaje, mensaje, null);
        FacesContext.getCurrentInstance().addMessage(null, message);
    }

}
