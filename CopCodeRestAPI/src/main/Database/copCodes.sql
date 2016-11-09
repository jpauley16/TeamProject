
CREATE TABLE copCodes (
    id int PRIMARY KEY AUTO_INCREMENT,
    copCode VARCHAR(7) UNIQUE NOT NULL,
    codeString VARCHAR(40) NOT NULL
);

/* Police Scanner 10 Codes */
INSERT INTO copCodes (copCode, codeString)
VALUES ("10-0", "Caution");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-1", "Reception Poor");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-2", "Reception Good");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-3", "Stop Transmitting");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-4", "Message Received, Understood");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-5", "Relay Message");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-6", "Change Channel");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-7", "Out of Service");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-7A", "Out of Service, home");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-7B", "Out of Service, personal");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-8", "In Service");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-9", "Repeat Message");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-10", "Off Duty");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-10A", "Off duty, home");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-11", "Identity Frequency");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-12", "Visitor(s) Present");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-13", "Weather and Road Advice");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-14", "Citizen with Suspect");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-15", "Prisoner in Custody");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-16", "Pick Up Prisoner");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-17", "Request for Gasoline");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-18", "Equipment Exchange");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-19", "Return(ing) to Station");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-20", "Loction");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-21", "Telephone");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-21A", "Advice home I will return at:");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-22", "Disregard last assignment");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-23", "Stand by");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-24", "Request car-to-car transit");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-25", "Do you have contact with:");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-26", "Clear");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-27", "D.D.L Report");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-28", "Registration request");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-29", "Check for wants");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-29F", "Subject wanted, felony");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-29H", "Hazard potential from subject");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-29M", "Subject wanted, Misdemeanor");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-29V", "Vehicle wanted");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-30", "Doesn't conform to regulators");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-32", "Drowning");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-33", "Alarm sounding, audible");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-34", "Assist at Office");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-35", "Time check");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-36", "Confidential information");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-37", "Identify operator");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-39", "Can () come to the radio");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-40", "Is () available for phone call?");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-42", "Check the welfare of/at");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-43", "Call a doctor");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-45", "Condition of patient?");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-45A", "Good");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-45B", "Serious");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-45C", "Critical");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-45D", "Dead");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-49", "Proceed to:");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-50", "Under influence of drugs");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-51", "Drunk");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-52", "Resuscitator");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-53", "Man down");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-54", "Possible dead body");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-55", "Coroner case");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-56", "Suicide");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-56A", "Suicide attempt");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-57", "Missing person");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-59", "Security check");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-60", "Lock out");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-61", "Miscellaneous public service");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-62", "Meet a citizen");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-62A", "Take a report from a citizen");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-62B", "Civillian standby");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-63", "Prepare to copy");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-64", "Found property");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-66", "Suspicious person");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-67", "Person calling for help");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-68", "Telephone for police");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-70", "Prowler");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-71", "Shooting");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-72", "Gun involved");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-73", "How to you receive?");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-79", "Bomb threat");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-80", "Explosion");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-86", "Any radio traffic?");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-88", "Assume post");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91", "Animal");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91A", "Animal, stray");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91B", "Animal, noisy");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91C", "Animal, injured");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91D", "Animal, dead");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91E", "Animal, bite");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91G", "Animal, pickup");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91J", "Animal, pickup collect");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91L", "Animal, leash law violation");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-91V", "Animal, vicious");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-95", "Need ID tech unit");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-97", "Arrived at scene");

INSERT INTO copCodes (copCode, codeString)
VALUES ("10-98", "Available to assign");

/* Police Scanner Codes */
CREATE TABLE policeScannerCodes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    scannerCode VARCHAR(10) UNIQUE NOT NULL,
    scannerString VARCHAR(50) NOT NULL
);

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("187", "Homicide");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("207", "Kidnapping");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("207A", "Kidnapping attempt");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("211", "Robbery");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("211A", "Robbery alarm");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("211S", "Robbery alarm, silent");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("217", "Assault with intent to murder");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("240", "Assault");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("242", "Battery");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("245", "Assault with a deadly weapon");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("246", "Shooting at inhabited dwelling");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("261", "Rape");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("261A", "Attempted rape");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("273A", "Child neglect");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("273D", "Wife beating - Felony");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("288", "Lewd conduct");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("311", "Indecent exposure");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("314", "Indecent exposure");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("374B", "Illegal dumping");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("390", "Drunk");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("390D", "Drunk, unconscious");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("415", "Disturbance");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("417", "Person with a gun");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("417A", "Person with a knife");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("459", "Burglary");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("459A", "Burglar alarm");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("459S", "Burglar alarm, silent");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("470", "Forgery");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("480", "Hit and run - Felony");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("481", "Hit and run - Misdemeanor");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("484", "Petty theft");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("487", "Grand theft");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("488", "Petty theft");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("502", "Drunk driving");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("503", "Auto theft");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("504", "Tampering with a vehicle");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("505", "Reckless driving");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("507", "Public nuisance");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("510", "Speeding or racing vehicle");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("586", "Illegal parking");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("594", "Malicious mischief");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("595", "Runaway car");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("604", "Throwing missiles");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("647", "Lewd conduct");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("653M", "Threatening phone calls");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("Blue", "Bus/Cab in trouble");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("Red", "Varda alarm activated");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("Purple", "Gang activity");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("5150", "Mental case");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("10851", "Auto theft");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("10852", "Tampering with vehicle");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("20001", "Hit and run - Felony");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("20002", "Hit and run - Misdemeanor");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("20007", "Hit and run - Unattended");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("21958", "Drunk pedestrian on roadway");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("22350", "Speeding");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("22500", "Illegal parking");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23101", "Drunk driving - injuries");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23102", "Drunk driving");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23103", "Reckless driver");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23104", "Reckless driver");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23105", "Driver under narcotics");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23109", "Racing");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23110", "Person throwing objects at vehicle");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23151", "Drunk driving - injuries");

INSERT INTO policeScannerCodes (scannerCode, scannerString)
VALUES ("23152", "Drunk driver");

/* Police Scanner 1-37 Codes */
CREATE TABLE scanner137 (
    id INT PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(10) UNIQUE NOT NULL,
    codeString VARCHAR(30) NOT NULL
);

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-2", "Urgent - no light or siren");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-3", "Use lights and siren");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-4", "No further assistance needed");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-5", "Stackout");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-6", "Stay out of area");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-7", "Meal break");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-8", "Restroom break");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-9", "Summer uniform");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-10", "SWAT pre-call up");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-11", "SWAT call up");

INSERT INTO scanner137 (code, codeString)
VALUES ("1-37-37", "Subject/Property wanted");

/** Police Scanner 11 Codes */
CREATE TABLE scanner11 (
    id INT PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(10) UNIQUE NOT NULL,
    codeString VARCHAR(50) NOT NULL
);

INSERT INTO scanner11 (code, codeString)
VALUES ("11-10", "Take Report");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-24", "Abandoned Vehicle");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-25", "Traffic hazard");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-26", "Abandoned bicycle");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-27", "10-27 with driver held");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-28", "10-28 with driver held");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-40", "Advise if ambulance needed");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-41", "Ambulance needed");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-42", "No ambulance needed");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-44", "Deceased person (Coroner Req'd)");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-48", "Furnished transportation");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-51", "Escort");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-52", "Funeral detail");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-54", "Suspicious vehicle");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-55", "Officer being followed by auto");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-56", "11-55 with dangerous persons");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-57", "Unidentified auto at assignments");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-58", "Radio monitored, use phone");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-59", "Intensive attention: high hazard, business areas");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-60", "Attack in high hazard area");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-65", "Signal light out");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-66", "Defective signal light");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-78", "Aircraft accident");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-79", "Accident - Ambulance sent");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-80", "Accident - Major injuries");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-81", "Accient - Minoor injuries");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-82", "Accident - No injuries");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-83", "Accident - No detail");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-84", "Direct traffic");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-85", "Tow truck required");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-94", "Pedestrian Stop");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-95", "Routine traffic stop");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-96", "Checking suspicious vehicle");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-97", "Time/Security check on patrol");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-98", "Meet:");

INSERT INTO scanner11 (code, codeString)
VALUES ("11-99", "Officer needs help!");

/* Medical/Fire Status Codes */
CREATE TABLE medFireCodes (
    id INT PRIMARY KEY AUTO_INCREMENT,
    code VARCHAR(10) UNIQUE NOT NULL,
    codeString VARCHAR(50) NOT NULL
);

INSERT INTO medFireCodes (code, codeString)
VALUES ("Code10", "Critical Trauma Case");

INSERT INTO medFireCodes (code, codeString)
VALUES ("Code20", "Acute Trauma Case");

INSERT INTO medFireCodes (code, codeString)
VALUES ("Code30", "Trauma case");

INSERT INTO medFireCodes (code, codeString)
VALUES ("Code40", "Serious case (IV Started)");

INSERT INTO medFireCodes (code, codeString)
VALUES ("Code50", "Basic transport (not serious)");

INSERT INTO medFireCodes (code, codeString)
VALUES ("CodeN", "Newsworthy Event");