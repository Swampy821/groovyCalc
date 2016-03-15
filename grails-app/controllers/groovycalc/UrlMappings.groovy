package groovycalc

class UrlMappings {

    static mappings = {
        "/add" ( controller: "add" ) { action = [ POST: "index" ] }
        "/subtract" ( controller: "subtract" ) { action = [ POST: "index" ] }
        "/multiply" ( controller: "multiply" ) { action = [ POST: "index" ] }
        "/divide" ( controller: "divide" ) { action = [ POST: "index" ] }
        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')
    }
}
