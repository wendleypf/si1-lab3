// @SOURCE:/home/wendleypf/workspace/si1-lab3/conf/routes
// @HASH:91805ec80ab6e8fe8a809a251d0f9b55d1fda7f8
// @DATE:Tue Nov 03 01:05:26 BRT 2015


import scala.language.reflectiveCalls
import play.core._
import play.core.Router._
import play.core.Router.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._
import _root_.controllers.Assets.Asset
import _root_.play.libs.F

import Router.queryString

object Routes extends Router.Routes {

import ReverseRouteContext.empty

private var _prefix = "/"

def setPrefix(prefix: String): Unit = {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
private[this] lazy val controllers_Application_index0_invoker = createInvoker(
controllers.Application.index(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
        

// @LINE:7
private[this] lazy val controllers_Application_getListasCadastrar1_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("cadastrar"))))
private[this] lazy val controllers_Application_getListasCadastrar1_invoker = createInvoker(
controllers.Application.getListasCadastrar(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "getListasCadastrar", Nil,"GET", """""", Routes.prefix + """cadastrar"""))
        

// @LINE:8
private[this] lazy val controllers_Application_detalhesAnuncio2_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("detalhes/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_detalhesAnuncio2_invoker = createInvoker(
controllers.Application.detalhesAnuncio(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "detalhesAnuncio", Seq(classOf[Long]),"GET", """""", Routes.prefix + """detalhes/$id<[^/]+>"""))
        

// @LINE:9
private[this] lazy val controllers_Application_deletarAnuncio3_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("deletar/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_deletarAnuncio3_invoker = createInvoker(
controllers.Application.deletarAnuncio(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "deletarAnuncio", Seq(classOf[Long]),"POST", """""", Routes.prefix + """deletar/$id<[^/]+>"""))
        

// @LINE:10
private[this] lazy val controllers_Application_pesquisarAnuncio4_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pesquisa"))))
private[this] lazy val controllers_Application_pesquisarAnuncio4_invoker = createInvoker(
controllers.Application.pesquisarAnuncio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "pesquisarAnuncio", Nil,"POST", """""", Routes.prefix + """pesquisa"""))
        

// @LINE:11
private[this] lazy val controllers_Application_adcionarComentario5_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("pergunta/"),DynamicPart("id", """[^/]+""",true))))
private[this] lazy val controllers_Application_adcionarComentario5_invoker = createInvoker(
controllers.Application.adcionarComentario(fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "adcionarComentario", Seq(classOf[Long]),"POST", """""", Routes.prefix + """pergunta/$id<[^/]+>"""))
        

// @LINE:12
private[this] lazy val controllers_Application_responderPergunta6_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("resposta"))))
private[this] lazy val controllers_Application_responderPergunta6_invoker = createInvoker(
controllers.Application.responderPergunta(fakeValue[Long], fakeValue[Long]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "responderPergunta", Seq(classOf[Long], classOf[Long]),"POST", """""", Routes.prefix + """resposta"""))
        

// @LINE:15
private[this] lazy val controllers_Assets_at7_route = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
private[this] lazy val controllers_Assets_at7_invoker = createInvoker(
controllers.Assets.at(fakeValue[String], fakeValue[String]),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
        

// @LINE:16
private[this] lazy val controllers_Application_novoAnuncio8_route = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("anuncio"))))
private[this] lazy val controllers_Application_novoAnuncio8_invoker = createInvoker(
controllers.Application.novoAnuncio(),
HandlerDef(this.getClass.getClassLoader, "", "controllers.Application", "novoAnuncio", Nil,"POST", """""", Routes.prefix + """anuncio"""))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """cadastrar""","""controllers.Application.getListasCadastrar()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """detalhes/$id<[^/]+>""","""controllers.Application.detalhesAnuncio(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """deletar/$id<[^/]+>""","""controllers.Application.deletarAnuncio(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pesquisa""","""controllers.Application.pesquisarAnuncio()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """pergunta/$id<[^/]+>""","""controllers.Application.adcionarComentario(id:Long)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """resposta""","""controllers.Application.responderPergunta(idConversa:Long, id:Long)"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """anuncio""","""controllers.Application.novoAnuncio()""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]]
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0_route(params) => {
   call { 
        controllers_Application_index0_invoker.call(controllers.Application.index())
   }
}
        

// @LINE:7
case controllers_Application_getListasCadastrar1_route(params) => {
   call { 
        controllers_Application_getListasCadastrar1_invoker.call(controllers.Application.getListasCadastrar())
   }
}
        

// @LINE:8
case controllers_Application_detalhesAnuncio2_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_detalhesAnuncio2_invoker.call(controllers.Application.detalhesAnuncio(id))
   }
}
        

// @LINE:9
case controllers_Application_deletarAnuncio3_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_deletarAnuncio3_invoker.call(controllers.Application.deletarAnuncio(id))
   }
}
        

// @LINE:10
case controllers_Application_pesquisarAnuncio4_route(params) => {
   call { 
        controllers_Application_pesquisarAnuncio4_invoker.call(controllers.Application.pesquisarAnuncio())
   }
}
        

// @LINE:11
case controllers_Application_adcionarComentario5_route(params) => {
   call(params.fromPath[Long]("id", None)) { (id) =>
        controllers_Application_adcionarComentario5_invoker.call(controllers.Application.adcionarComentario(id))
   }
}
        

// @LINE:12
case controllers_Application_responderPergunta6_route(params) => {
   call(params.fromQuery[Long]("idConversa", None), params.fromQuery[Long]("id", None)) { (idConversa, id) =>
        controllers_Application_responderPergunta6_invoker.call(controllers.Application.responderPergunta(idConversa, id))
   }
}
        

// @LINE:15
case controllers_Assets_at7_route(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at7_invoker.call(controllers.Assets.at(path, file))
   }
}
        

// @LINE:16
case controllers_Application_novoAnuncio8_route(params) => {
   call { 
        controllers_Application_novoAnuncio8_invoker.call(controllers.Application.novoAnuncio())
   }
}
        
}

}
     