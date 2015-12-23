package hello.mapper;

import org.immutables.value.Value;

/**
 * Created by joeyang on 12/23/15.
 */
public class Person {
    private Integer ID;
    private String NAME;

    public Integer getID() {
        return ID;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }
}


