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
@Table(name = "scanner11")
public class Scanner11 {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int scanner11Id;

    @Column(name = "code")
    private String copCode;

    @Column(name = "codeString")
    private String codeString;

    /**
     * Instantiates a new Scanner11
     */
    public Scanner11() {

    }

    /**
     * Instantiates a new Scanner11
     *
     * @param scanner11Id   the scanner11Id
     * @param copCode       the cop code
     * @param codeString    the code string
     */
    public Scanner11(int scanner11Id, String copCode, String codeString) {
        this.scanner11Id = scanner11Id;
        this.copCode = copCode;
        this.codeString = codeString;
    }

    /**
     * Gets the scanner11Id
     *
     * @return the scanner11Id
     */
    public int getScanner11Id() {
        return scanner11Id;
    }

    /**
     * Sets the scanner11Id
     *
     * @param scanner11Id the scanner11Id
     */
    public void setScanner11Id(int scanner11Id) {
        this.scanner11Id = scanner11Id;
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
