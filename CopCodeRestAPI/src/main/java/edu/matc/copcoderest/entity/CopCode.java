package edu.matc.copcoderest.entity;

import javax.persistence.Entity;

import com.sun.javafx.beans.IDProperty;
import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;

import java.util.*;
import javax.persistence.*;

/**
 * Created by Craig Wilson and Jeff Pauley on 11/10/16.
 */
@Entity
@Table(name = "copCodes")
public class CopCode {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int scanner10Id;

    @Column(name = "copCode")
    private String copCode;

    @Column(name = "codeString")
    private String codeString;

    /**
     * Instantiates a new CopCode.
     */
    public CopCode() {

    }

    /**
     * Instantiates a new CopCode.
     *
     * @param scanner10Id   the scanner10 id
     * @param copCode       the cop code
     * @param codeString    the code string
     */
    public CopCode(int scanner10Id, String copCode, String codeString) {
        this.scanner10Id = scanner10Id;
        this.copCode = copCode;
        this.codeString = codeString;
    }

    /**
     * Gets the scanner10 id
     *
     * @return the scanner10 id
     */
    public int getScanner10Id() {
        return scanner10Id;
    }

    /**
     * Sets the scanner10 id
     *
     * @param scanner10Id the scanner10 id
     */
    public void setScanner10Id(int scanner10Id) {
        this.scanner10Id = scanner10Id;
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
    public void setCopCode(String copCode) {
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
