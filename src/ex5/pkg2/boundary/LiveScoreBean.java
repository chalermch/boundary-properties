/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5.pkg2.boundary;

import java.beans.*;
import java.io.Serializable;

/**
 *
 * @author Admin
 */
public class LiveScoreBean implements Serializable {
    
    public static final String SOME_DATA_PROPERTY = "Thai 0-0 UAE";
    
    private String someData;
    
    private PropertyChangeSupport propertySupport;
    
    public LiveScoreBean() {
        propertySupport = new PropertyChangeSupport(this);
    }
    
    public String getSomeData() {
        return someData;
    }
    
    public void setScoreLine(String value) {
        String oldValue = someData;
        someData = value;
        propertySupport.firePropertyChange(SOME_DATA_PROPERTY, oldValue, someData);
    }
    
    public void addPropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.addPropertyChangeListener(listener);
    }
    
    public void removePropertyChangeListener(PropertyChangeListener listener) {
        propertySupport.removePropertyChangeListener(listener);
    }
    
}
