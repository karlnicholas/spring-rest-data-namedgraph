package sample.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.NamedAttributeNode;
import javax.persistence.NamedEntityGraph;
import javax.persistence.OneToOne;

    @Entity
    @NamedEntityGraph(name = "A.fetchB",attributeNodes=@NamedAttributeNode("b"))
    public class A implements Serializable {
        private static final long serialVersionUID = 1L;
        @Id Long id;
        @OneToOne(fetch = FetchType.LAZY) B b;
    // getters, setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public B getB() {
        return b;
    }
    public void setB(B b) {
        this.b = b;
    }
}

