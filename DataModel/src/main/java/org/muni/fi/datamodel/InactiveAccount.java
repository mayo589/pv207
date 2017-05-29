package org.muni.fi.datamodel;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
public class InactiveAccount implements java.io.Serializable {

    static final long serialVersionUID = 1L;

    @javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "INACTIVEACCOUNT_ID_GENERATOR")
    @javax.persistence.Id
    @javax.persistence.SequenceGenerator(name = "INACTIVEACCOUNT_ID_GENERATOR", sequenceName = "INACTIVEACCOUNT_ID_SEQ")
    private java.lang.Long id;

    public InactiveAccount() {
    }
    
    public InactiveAccount(java.lang.Long id) {
        this.id = id;
    }

    public java.lang.Long getId() {
        return this.id;
    }
    
    public void setId(java.lang.Long id) {
        this.id = id;
    }

}