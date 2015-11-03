// @SOURCE:/home/wendleypf/workspace/si1-lab3/conf/routes
// @HASH:91805ec80ab6e8fe8a809a251d0f9b55d1fda7f8
// @DATE:Tue Nov 03 01:05:26 BRT 2015

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString


// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {


// @LINE:15
def at(file:String): Call = {
   implicit val _rrc = new ReverseRouteContext(Map(("path", "/public")))
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                        

}
                          

// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def deletarAnuncio(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "deletar/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:11
def adcionarComentario(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "pergunta/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:7
def getListasCadastrar(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "cadastrar")
}
                        

// @LINE:8
def detalhesAnuncio(id:Long): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix + { _defaultPrefix } + "detalhes/" + implicitly[PathBindable[Long]].unbind("id", id))
}
                        

// @LINE:12
def responderPergunta(idConversa:Long, id:Long): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "resposta" + queryString(List(Some(implicitly[QueryStringBindable[Long]].unbind("idConversa", idConversa)), Some(implicitly[QueryStringBindable[Long]].unbind("id", id)))))
}
                        

// @LINE:16
def novoAnuncio(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "anuncio")
}
                        

// @LINE:10
def pesquisarAnuncio(): Call = {
   import ReverseRouteContext.empty
   Call("POST", _prefix + { _defaultPrefix } + "pesquisa")
}
                        

// @LINE:6
def index(): Call = {
   import ReverseRouteContext.empty
   Call("GET", _prefix)
}
                        

}
                          
}
                  


// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.javascript {
import ReverseRouteContext.empty

// @LINE:15
class ReverseAssets {


// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        

}
              

// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def deletarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.deletarAnuncio",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "deletar/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:11
def adcionarComentario : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adcionarComentario",
   """
      function(id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pergunta/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:7
def getListasCadastrar : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.getListasCadastrar",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "cadastrar"})
      }
   """
)
                        

// @LINE:8
def detalhesAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.detalhesAnuncio",
   """
      function(id) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "detalhes/" + (""" + implicitly[PathBindable[Long]].javascriptUnbind + """)("id", id)})
      }
   """
)
                        

// @LINE:12
def responderPergunta : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.responderPergunta",
   """
      function(idConversa,id) {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "resposta" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("idConversa", idConversa), (""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id)])})
      }
   """
)
                        

// @LINE:16
def novoAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.novoAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "anuncio"})
      }
   """
)
                        

// @LINE:10
def pesquisarAnuncio : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.pesquisarAnuncio",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "pesquisa"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        

}
              
}
        


// @LINE:16
// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {


// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      

}
                          

// @LINE:16
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:8
// @LINE:7
// @LINE:6
class ReverseApplication {


// @LINE:9
def deletarAnuncio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.deletarAnuncio(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deletarAnuncio", Seq(classOf[Long]), "POST", """""", _prefix + """deletar/$id<[^/]+>""")
)
                      

// @LINE:11
def adcionarComentario(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adcionarComentario(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adcionarComentario", Seq(classOf[Long]), "POST", """""", _prefix + """pergunta/$id<[^/]+>""")
)
                      

// @LINE:7
def getListasCadastrar(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.getListasCadastrar(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getListasCadastrar", Seq(), "GET", """""", _prefix + """cadastrar""")
)
                      

// @LINE:8
def detalhesAnuncio(id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.detalhesAnuncio(id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "detalhesAnuncio", Seq(classOf[Long]), "GET", """""", _prefix + """detalhes/$id<[^/]+>""")
)
                      

// @LINE:12
def responderPergunta(idConversa:Long, id:Long): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.responderPergunta(idConversa, id), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "responderPergunta", Seq(classOf[Long], classOf[Long]), "POST", """""", _prefix + """resposta""")
)
                      

// @LINE:16
def novoAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.novoAnuncio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "novoAnuncio", Seq(), "POST", """""", _prefix + """anuncio""")
)
                      

// @LINE:10
def pesquisarAnuncio(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.pesquisarAnuncio(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "pesquisarAnuncio", Seq(), "POST", """""", _prefix + """pesquisa""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      

}
                          
}
        
    