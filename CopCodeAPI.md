##Step 1: Make a request

To make a request use the base url with one of the endpoint paths appended.  

`138.68.57.56:8080/copcodeapi/ctosservice/`

##JSON
|Endpoint|Description|
|--------|-----------|
| /json/ | Returns all emergency codes regardless of type |
| /json/medfirecode/ | Returns all Medical/Fire codes|
| /json/medfirecode/{param} | Returns Medical/Fire code specified by param (i.e. Code10) |
| /json/policescannercode/ | Returns all Police Scanner codes|
| /json/policescannercode/{param} | Returns Police Scanner code specified by param (i.e. 187) |
| /json/scanner10code/ | Returns all Cop codes |
| /json/scanner10code/{param} | Returns Cop code specified by param (i.e. 10-10) |
| /json/scanner11code/ | Returns all scanner11 codes|
| /json/scanner11code/{param} | Returns scanner11 code specified by param (i.e. 11-10) |
| /json/scanner137code/ | Returns all scanner137 codes|
| /json/scanner137code/{param} | Returns scanner137 code specified by param (i.e. 1-37-2) |

##XML
|Endpoint|Description|
|--------|-----------|
| /xml/ | Returns all emergency codes regardless of type |
| /xml/medfirecode/ | Returns all Medical/Fire codes|
| /xml/medfirecode/{param} | Returns Medical/Fire code specified by param (i.e. Code10) |
| /xml/policescannercode/ | Returns all Police Scanner codes|
| /xml/policescannercode/{param} | Returns Police Scanner code specified by param (i.e. 187) |
| /xml/scanner10code/ | Returns all Cop codes |
| /xml/scanner10code/{param} | Returns Cop code specified by param (i.e. 10-10) |
| /xml/scanner11code/ | Returns all scanner11 codes|
| /xml/scanner11code/{param} | Returns scanner11 code specified by param (i.e. 11-10) |
| /xml/scanner137code/ | Returns all scanner137 codes|
| /xml/scanner137code/{param} | Returns scanner137 code specified by param (i.e. 1-37-2) |


##Step 2: Get a Response

Responses are returned either JSON or XML, based on endpoint.

## Single code (JSON)
##### @GET /json/scanner10code/10-10
```json
{"Results":[{  
	"Code": "10-10",    
	"Code Meaning": "Off Duty"    
	}]     
}
```

## Collection of codes (JSON)
##### @GET /json/scanner10code/
```json
{"Results":[{
	"Code": "10-62A",
	"Code Meaning": "Take a report from a citizen",
	"Code": "10-72",
	"Code Meaning": "Gun involved",
	"Code": "10-71",
	"Code Meaning": "Shooting",  
	"Code": "10-30",
	"Code Meaning": "Doesn't conform to regulators",  
  	....
	}]
}
```
	
## Single code (XML)
##### @GET /xml/scanner10code/10-10
```xml
<ctosservice> 
    <code>10-10</code>
    <codeMeaning>Off Duty</codeMeaning>  
</ctosservice>
```


## Collection of codes (xml)
##### @GET /xml/scanner10code/
```xml
<ctosservice>
    <code>10-62A</code>
    <codeMeaning>Take a report from a citizen</codeMeaning>
    <code>10-72</code>
    <codeMeaning>Gun involved</codeMeaning>
    ...
</ctosservice>
```


