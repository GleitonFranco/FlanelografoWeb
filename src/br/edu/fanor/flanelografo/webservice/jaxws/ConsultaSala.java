
package br.edu.fanor.flanelografo.webservice.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "consultaSala", namespace = "http://localhost:8180/flanelografo")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "consultaSala", namespace = "http://localhost:8180/flanelografo")
public class ConsultaSala {

    @XmlElement(name = "curso", namespace = "")
    private String curso;

    /**
     * 
     * @return
     *     returns String
     */
    public String getCurso() {
        return this.curso;
    }

    /**
     * 
     * @param curso
     *     the value for the curso property
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

}
