/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete;

import java.beans.*;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author hernan
 */
public class Empresa implements Serializable {
    
    public static final String PROP_SAMPLE_PROPERTY = "sampleProperty";
    
    private String sampleProperty;
    
    private PropertyChangeSupport propertySupport;
   
    private ArrayList<Persona> arrayList = new ArrayList<>(listaEsclavos());
    
    public Empresa() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSampleProperty() {
        return sampleProperty;
    }
    
    public void setSampleProperty(String value) {
        String oldValue = sampleProperty;
        sampleProperty = value;
        propertySupport.firePropertyChange(PROP_SAMPLE_PROPERTY, oldValue, sampleProperty);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
    public ArrayList<Persona> listaEsclavos(){
        Persona esclavo00 = new Persona();
        Persona esclavo01 = new Persona();
        Persona esclavo02 = new Persona();
        arrayList.add(esclavo00);
        arrayList.add(esclavo01);
        arrayList.add(esclavo02);
        return arrayList;
    }

    public ArrayList<Persona> getArrayList() {
        return arrayList;
    }

    public void setArrayList(ArrayList<Persona> arrayList) {
        this.arrayList = arrayList;
    }
    
    
}
