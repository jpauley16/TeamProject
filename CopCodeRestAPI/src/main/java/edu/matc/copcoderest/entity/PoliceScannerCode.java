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
@Table(name = "policeScannerCodes")
public class PoliceScannerCode {

    @Id
    @GeneratedValue(generator = "increment")
    @GenericGenerator(name = "increment", strategy = "increment")
    @Column(name = "id")
    private int policeScannerCodeId;

    @Column(name = "scannerCode")
    private String scannerCode;

    @Column(name = "scannerString")
    private String scannerString;

    /**
     * Instantiates a new PoliceScannerCode
     */
    public PoliceScannerCode() {

    }

    /**
     * Instantiates a new PoliceScannerCode
     *
     * @param policeScannerCodeId the policeScannerCodeId
     * @param scannerCode the scanner code
     * @param scannerString the scanner string
     */
    public PoliceScannerCode(int policeScannerCodeId, String scannerCode,
                                    String scannerString) {
        this.policeScannerCodeId = policeScannerCodeId;
        this.scannerCode = scannerCode;
        this.scannerString = scannerString;
    }

    /**
     * Gets the policeScannerCodeId
     *
     * @return the policeScannerCodeId
     */
    public int getPoliceScannerCodeId() {
        return policeScannerCodeId;
    }

    /**
     * Sets the policeScannerCodeId
     * @param policeScannerCodeId the policeScannerCodeId
     */
    public void setPoliceScannerCodeId(int policeScannerCodeId) {
        this.policeScannerCodeId = policeScannerCodeId;
    }

    /**
     * Gets the scanner code
     *
     * @return the scanner code
     */
    public String getScannerCode() {
        return scannerCode;
    }

    /**
     * Sets the scanner code
     *
     * @param scannerCode the scanner code
     */
    public void setScannerCode(String scannerCode) {
        this.scannerCode = scannerCode;
    }

    /**
     * Gets the scanner string
     *
     * @return the scanner string
     */
    public String getScannerString() {
        return scannerString;
    }

    /**
     * Sets the scanner string
     *
     * @param scannerString the scanner string
     */
    public void setScannerString(String scannerString) {
        this.scannerString = scannerString;
    }
}
