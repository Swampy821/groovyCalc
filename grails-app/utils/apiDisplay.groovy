package groovycalc
import grails.converters.JSON

class ApiDisplay {

	String result
	Date timestamp = new Date() 
	int id = timestamp.getTime()

	String render() {
		return new JSON( this ).toString()
	}

}