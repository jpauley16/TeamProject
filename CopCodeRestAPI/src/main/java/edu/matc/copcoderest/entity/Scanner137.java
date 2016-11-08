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
@Table(name = "scanner137")
public class Scanner137 {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int scanner137Id;

    @Column(name = "code")
    private String copCode;

    @Column(name = "codeString")
    private String codeString;

    /**
     * Instantiates a new Scanner137
     */
    public Scanner137() {

    }

    /**
     * Instantiates a new Scanner137
     *
     * @param scanner137Id  the scanner137 id
     * @param copCode       the cop code
     * @param codeString    the code string
     */
    public Scanner137(int scanner137Id, String copCode, String codeString) {
        this.scanner137Id = scanner137Id;
        this.copCode = copCode;
        this.codeString = codeString;
    }

    /**
     * Gets the scanner137 id
     *
     * @return the scanner137 id
     */
    private int getScanner137Id() {
        return scanner137Id;
    }

    /**
     * Sets the scanner137 id
     * @param scanner137Id the scanner137 id
     */
    private void setScanner137Id(int scanner137Id) {
        this.scanner137Id = scanner137Id;
    }

    /**
     * Gets the cop code
     *
     * @return the cop code
     */
    private String getCopCode() {
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
    private String getCodeString() {
        return codeString;
    }

    /**
     * Sets the code string
     *
     * @param codeString the code string
     */
    private void setCodeString(String codeString) {
        this.codeString = codeString;
    }
}
