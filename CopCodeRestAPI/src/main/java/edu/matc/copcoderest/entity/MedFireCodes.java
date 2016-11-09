package edu.matc.copcoderest.entity;

import javax.persistence.Entity;

import com.sun.javafx.beans.IDProperty;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;

import java.util.*;
import javax.persistence.*;
/**
 * Created by craigwilson on 11/8/16.
 */
@Entity
@Table(name = "medFireCodes")
public class MedFireCodes {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int medFireCodeId;

    @Column(name = "code")
    private String copCode;

    @Column(name = "codeString")
    private String codeString;

    /**
     * Instantiates a new MedFireCodes
     */
    public MedFireCodes() {

    }

    /**
     * Instantiates a new MedFireCodes
     *
     * @param medFireCodeId     the medFireCodeId
     * @param copCode           the cop code
     * @param codeString        the code string
     */
    public MedFireCodes(int medFireCodeId, String copCode, String codeString) {
        this.medFireCodeId = medFireCodeId;
        this.copCode = copCode;
        this.codeString = codeString;
    }

    /**
     * Gets the medFireCodeId
     *
     * @return the medFireCodeId
     */
    public int getMedFireCodeId() {
        return medFireCodeId;
    }

    /**
     * Sets the medFireCodeId
     *
     * @param medFireCodeId the medFireCodeId
     */
    public void setMedFireCodeId(int medFireCodeId) {
        this.medFireCodeId = medFireCodeId;
    }

    /**
     * Gets the cop code
     *
     * @return the cop code
     */
    public String getCopCode() {
        return copCode;
    }

    /**
     * Sets the cop code
     *
     * @param copCode the cop code
     */
    private void setCopCode(String copCode) {
        this.copCode = copCode;
    }

    /**
     * Gets the code string
     *
     * @return the code string
     */
    public String getCodeString() {
        return codeString;
    }

    /**
     * Sets the code string
     *
     * @param codeString the code string
     */
    public void setCodeString(String codeString) {
        this.codeString = codeString;
    }



}
