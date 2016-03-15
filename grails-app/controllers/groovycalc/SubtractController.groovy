package groovycalc

class SubtractController {

    def index() { 
    	float number1 = request.getParameter("number1").toFloat().round(2)
    	float number2 = request.getParameter("number2").toFloat().round(2)	
    	float result = number1 - number2

    	ApiDisplay display = new ApiDisplay();

    	display.result = result

    	render (text: display.render(), contentType: "text/json")
    }
}
