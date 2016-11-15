##Step 1: Make a request

To make a request use the base url with one of the endpoint paths appended.  

`138.68.57.56:8080/copcodeapi/ctosservice/`

##JSON
|Endpoint|Description|
|--------|-----------|
| /json/ | Returns all emergency codes regardless of type |
| /json/copcode/ | Returns all Cop codes |
| /json/copcode/{param} | Returns Cop code specified by param (i.e. 10-10) |
| /json/medfirecode/ | Returns all Medical/Fire codes|
| /json/medfirecode/{param} | Returns Medical/Fire code specified by param (i.e. Code10) |
| /json/policescannercode/ | Returns all Police Scanner codes|
| /json/policescannercode/{param} | Returns Police Scanner code specified by param (i.e. 187) |
| /json/scanner11code/ | Returns all scanner11 codes|
| /json/scanner11code/{param} | Returns scanner11 code specified by param (i.e. 11-10) |
| /json/scanner137code/ | Returns all scanner137 codes|
| /json/scanner137code/{param} | Returns scanner137 code specified by param (i.e. 1-37-2) |

##XML
|Endpoint|Description|
|--------|-----------|
| /xml/ | Returns all emergency codes regardless of type |
| /xml/copcode/ | Returns all Cop codes |
| /xml/copcode/{param} | Returns Cop code specified by param (i.e. 10-10) |
| /xml/medfirecode/ | Returns all Medical/Fire codes|
| /xml/medfirecode/{param} | Returns Medical/Fire code specified by param (i.e. Code10) |
| /xml/policescannercode/ | Returns all Police Scanner codes|
| /xml/policescannercode/{param} | Returns Police Scanner code specified by param (i.e. 187) |
| /xml/scanner11code/ | Returns all scanner11 codes|
| /xml/scanner11code/{param} | Returns scanner11 code specified by param (i.e. 11-10) |
| /xml/scanner137code/ | Returns all scanner137 codes|
| /xml/scanner137code/{param} | Returns scanner137 code specified by param (i.e. 1-37-2) |


##Step 2: Get a Response

Responses are returned either JSON or XML, based on endpoint.

## Single line
`{"Results":[{`  
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code": "10-10",`    
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code Meaning": "Off Duty"`    
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`}]`     
`}`  

## Multi line
`{"Results":[{`  
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code": "10-62A",`     
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code Meaning": "Take a report from a citizen",`    
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code": "10-72",`   
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code Meaning": "Gun involved",`   
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code": "10-71",`   
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code Meaning": "Shooting",`   
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code": "10-30",`   
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`"Code Meaning": "Doesn't conform to regulators",`   
  &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;`....`




