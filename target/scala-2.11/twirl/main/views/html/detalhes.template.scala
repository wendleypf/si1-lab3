
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._

import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._

/**/
object detalhes extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Anuncio,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/(anuncio: Anuncio):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*3.20*/("""
"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="description" content="">
      <meta name="author" content="Wendley Paulo de França">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*12.52*/routes/*12.58*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*12.97*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*13.52*/routes/*13.58*/.Assets.at("stylesheets/bootstrap-responsive.css")),format.raw/*13.108*/("""">
      <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
      <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
      <![endif]-->
      <link rel="shortcut icon" type="image/png" href=""""),_display_(/*18.57*/routes/*18.63*/.Assets.at("img/favicon.ico")),format.raw/*18.92*/("""">
      <script src=""""),_display_(/*19.21*/routes/*19.27*/.Assets.at("javascripts/highslide-with-html.js")),format.raw/*19.75*/(""""></script>
      <script type="text/javascript">
         hs.graphicsDir = '"""),_display_(/*21.29*/routes/*21.35*/.Assets.at("img/graphics/")),format.raw/*21.62*/("""';
         hs.outlineType = 'rounded-white';
      </script>
      <script src="http://maps.google.com/maps?file=api&amp;v=2&amp;key=ABQIAAAAjU0EJWnWPMv7oQ-jjS7dYxSPW5CJgpdgO_s4yyMovOaVh_KvvhSfpvagV18eOyDWu7VytS6Bi1CWxw" type="text/javascript"></script>
      <script type="text/javascript">
         function VisualizarMaps(map) """),format.raw/*26.39*/("""{"""),format.raw/*26.40*/("""
         	"""),format.raw/*27.11*/("""var display = document.getElementById(map).style.display;
         	if (display == "none")
         		document.getElementById(map).style.display = 'block';
         	else
         		document.getElementById(map).style.display = 'none';
         """),format.raw/*32.10*/("""}"""),format.raw/*32.11*/("""
         
         """),format.raw/*34.10*/("""var map = null;
         var geocoder = null;
         
         function initialize() """),format.raw/*37.32*/("""{"""),format.raw/*37.33*/("""
         	"""),format.raw/*38.11*/("""if (GBrowserIsCompatible()) """),format.raw/*38.39*/("""{"""),format.raw/*38.40*/("""
         		"""),format.raw/*39.12*/("""map = new GMap2(document
         				.getElementById("map_canvas"));
         		map.setCenter(new GLatLng(37.4419,
         				-122.1419), 1);
         		map.setUIToDefault();
         		geocoder = new GClientGeocoder();
         	"""),format.raw/*45.11*/("""}"""),format.raw/*45.12*/("""
         """),format.raw/*46.10*/("""}"""),format.raw/*46.11*/("""
         
         """),format.raw/*48.10*/("""function showAddress(address) """),format.raw/*48.40*/("""{"""),format.raw/*48.41*/("""
         	"""),format.raw/*49.11*/("""if (geocoder) """),format.raw/*49.25*/("""{"""),format.raw/*49.26*/("""
         		"""),format.raw/*50.12*/("""geocoder
         				.getLatLng(
         						address,
         						function(point) """),format.raw/*53.32*/("""{"""),format.raw/*53.33*/("""
         							"""),format.raw/*54.17*/("""if (!point) """),format.raw/*54.29*/("""{"""),format.raw/*54.30*/("""
         								"""),format.raw/*55.18*/("""alert(address
         										+ " not found");
         							"""),format.raw/*57.17*/("""}"""),format.raw/*57.18*/(""" """),format.raw/*57.19*/("""else """),format.raw/*57.24*/("""{"""),format.raw/*57.25*/("""
         								"""),format.raw/*58.18*/("""map.setCenter(
         										point, 15);
         								var marker = new GMarker(
         										point,
         										"""),format.raw/*62.20*/("""{"""),format.raw/*62.21*/("""
         											"""),format.raw/*63.21*/("""draggable : true
         										"""),format.raw/*64.20*/("""}"""),format.raw/*64.21*/(""");
         								map
         										.addOverlay(marker);
         								GEvent
         										.addListener(
         												marker,
         												"dragend",
         												function() """),format.raw/*71.33*/("""{"""),format.raw/*71.34*/("""
         													"""),format.raw/*72.23*/("""marker
         															.openInfoWindowHtml(marker
         																	.getLatLng()
         																	.toUrlValue(
         																			6));
         												"""),format.raw/*77.22*/("""}"""),format.raw/*77.23*/(""");
         								GEvent
         										.addListener(
         												marker,
         												"click",
         												function() """),format.raw/*82.33*/("""{"""),format.raw/*82.34*/("""
         													"""),format.raw/*83.23*/("""marker
         															.openInfoWindowHtml(marker
         																	.getLatLng()
         																	.toUrlValue(
         																			6));
         												"""),format.raw/*88.22*/("""}"""),format.raw/*88.23*/(""");
         								GEvent.trigger(
         										marker,
         										"click");
         							"""),format.raw/*92.17*/("""}"""),format.raw/*92.18*/("""
         						"""),format.raw/*93.16*/("""}"""),format.raw/*93.17*/(""");
         	"""),format.raw/*94.11*/("""}"""),format.raw/*94.12*/("""
         """),format.raw/*95.10*/("""}"""),format.raw/*95.11*/("""
      """),format.raw/*96.7*/("""</script>
      <style type="text/css">
         body """),format.raw/*98.15*/("""{"""),format.raw/*98.16*/("""
         """),format.raw/*99.10*/("""padding-top: 5px;
         padding-bottom: 20px;
         """),format.raw/*101.10*/("""}"""),format.raw/*101.11*/("""
         """),format.raw/*102.10*/("""/* Custom container */
         .container-narrow """),format.raw/*103.28*/("""{"""),format.raw/*103.29*/("""
         """),format.raw/*104.10*/("""margin: 0 auto;
         max-width: 790px;
         """),format.raw/*106.10*/("""}"""),format.raw/*106.11*/("""
         """),format.raw/*107.10*/("""/* Supporting marketing content */
         .marketing """),format.raw/*108.21*/("""{"""),format.raw/*108.22*/("""
         """),format.raw/*109.10*/("""margin: 20px 0;
         """),format.raw/*110.10*/("""}"""),format.raw/*110.11*/("""
         """),format.raw/*111.10*/("""#navlist li"""),format.raw/*111.21*/("""{"""),format.raw/*111.22*/("""
         """),format.raw/*112.10*/("""display: inline;
         list-style-type: none;
         padding-right: 5px;
         """),format.raw/*115.10*/("""}"""),format.raw/*115.11*/("""
         """),format.raw/*116.10*/("""#map_canvas"""),format.raw/*116.21*/("""{"""),format.raw/*116.22*/("""
         """),format.raw/*117.10*/("""width: 500px; 
         height: 300px;
         display: none;
         """),format.raw/*120.10*/("""}"""),format.raw/*120.11*/("""
      """),format.raw/*121.7*/("""</style>
   </head>
   <body onload="initialize()" onunload="GUnload()">
      <div class="container-narrow">
         <br/>
         <div class="masthead">
            <div class="row-fluid">
               <div class="span7">
                  <h2><b>&#9835;</b> Classified Musical</h2>
               </div>
               <div class="span4 offset1">
                  <br>
                  <a href=""""),_display_(/*133.29*/routes/*133.35*/.Application.getListasCadastrar()),format.raw/*133.68*/("""" onclick="return  hs.htmlExpand(this, """),format.raw/*133.107*/("""{"""),format.raw/*133.108*/(""" 
                     """),format.raw/*134.22*/("""objectType: 'iframe', width: 1310, height:700, 
                     creditsPosition: 'bottom left', headingText: 'Cadastrar Anuncio', 
                     wrapperClassName: 'titlebar' """),format.raw/*136.51*/("""}"""),format.raw/*136.52*/(""" """),format.raw/*136.53*/(""")" class="btn btn-success"><i class="icon-plus icon-white"></i> Novo Anuncio</a>
               </div>
            </div>
         </div>
         <div class="row-fluid marketing">
            <div class="row">
               <div class="col-md-12">
                  <h1>"""),_display_(/*143.24*/anuncio/*143.31*/.getTitulo()),format.raw/*143.43*/("""</h1>
                  <hr>
                  <div class="row">
                     <div class="span3 offset1">
                        <p><i class="icon-time"></i> Publicado em """),_display_(/*147.68*/anuncio/*147.75*/.getData()),format.raw/*147.85*/("""</p>
                     </div>
                     <div class="span3 offset5">
                        <a href="#myModal" role="button" class="btn" data-toggle="modal">Finalizar Anuncio</a>
                     </div>
                  </div>
                  <hr>
                  <p class="lead">"""),_display_(/*154.36*/anuncio/*154.43*/.getDescricao()),format.raw/*154.58*/("""</p>
                  <br>
                  <p><strong>Minha Localização</strong></p>
                  <ul>
                     <li>
                        <b>Cidade: </b>"""),_display_(/*159.41*/anuncio/*159.48*/.getAnunciante().getCidade()),format.raw/*159.76*/("""
                     """),format.raw/*160.22*/("""</li>
                     <li>
                        <b>Bairro: </b>"""),_display_(/*162.41*/anuncio/*162.48*/.getAnunciante().getBairro()),format.raw/*162.76*/("""
                     """),format.raw/*163.22*/("""</li>
                  </ul>
                  <form action="#" onsubmit="showAddress(this.address.value); return false">
                     <p>
                        <input type="hidden" name="address" value=""""),_display_(/*167.69*/anuncio/*167.76*/.getAnunciante().getCidade()),format.raw/*167.104*/(""", """),_display_(/*167.107*/anuncio/*167.114*/.getAnunciante().getBairro()),format.raw/*167.142*/("""" />
                        <input type="submit"  class="btn"  onclick="VisualizarMaps('map_canvas')" value="Visualizar Localização" />
                     </p>
                     <div id="map_canvas" style="display: none"></div>
                  </form>
                  <br>
                  <p><strong>Onde tocar: </strong>"""),_display_(/*173.52*/anuncio/*173.59*/.getAnunciante().getOndeTocar()),format.raw/*173.90*/("""</p>
                  <br>
                  <p><strong>Instrumentos que sei tocar</strong></p>
                  <ul id="navlist">
                     """),_display_(/*177.23*/for(instrumento <- anuncio.getAnunciante().getListInstrumentos()) yield /*177.88*/{_display_(Seq[Any](format.raw/*177.89*/("""
                     """),format.raw/*178.22*/("""<li><span class="label label-info">#"""),_display_(/*178.59*/instrumento/*178.70*/.getNome()),format.raw/*178.80*/(""" """),format.raw/*178.81*/("""</span></li>
                     """)))}),format.raw/*179.23*/("""
                  """),format.raw/*180.19*/("""</ul>
                  <br>
                  <p><strong>Estilos que gosto</strong></p>
                  <ul id="navlist">
                     """),_display_(/*184.23*/for(estiloQueGosta <- anuncio.getAnunciante().getListEstilos() ) yield /*184.87*/{_display_(Seq[Any](format.raw/*184.88*/("""
                     """),format.raw/*185.22*/("""<li><span class="label label-success">#"""),_display_(/*185.62*/estiloQueGosta/*185.76*/.getNome()),format.raw/*185.86*/("""</span></li>
                     """)))}),format.raw/*186.23*/(""" 
                  """),format.raw/*187.19*/("""</ul>
                  <br>	
                  <p><strong>Estilos que não gosto</strong></p>
                  <ul id="navlist">
                     """),_display_(/*191.23*/for(estiloQueNaoGosta <- anuncio.getAnunciante().getListEstilosQueNaoGosta() ) yield /*191.101*/{_display_(Seq[Any](format.raw/*191.102*/("""
                     """),format.raw/*192.22*/("""<li><span class="label label-important">#"""),_display_(/*192.64*/estiloQueNaoGosta/*192.81*/.getNome()),format.raw/*192.91*/("""</span></li>
                     """)))}),format.raw/*193.23*/(""" 
                  """),format.raw/*194.19*/("""</ul>
                  <br>
                  <p><strong>Formas de contato</strong></p>
                  <ul class="unstyled">
                     <li><i class="icon-envelope"></i> Email: """),_display_(/*198.64*/anuncio/*198.71*/.getAnunciante().getContato().getEmail()),format.raw/*198.111*/("""</li>
                     <li><i class="icon-thumbs-up"></i> Facebook: """),_display_(/*199.68*/anuncio/*199.75*/.getAnunciante().getContato().getFacebook()),format.raw/*199.118*/("""</li>
                     <li><i class="icon-headphones"></i> Telefone: """),_display_(/*200.69*/anuncio/*200.76*/.getAnunciante().getContato().getTelefone()),format.raw/*200.119*/("""</li>
                  </ul>
               </div>
               <br />	
               <div class="row">
                  <div class="span10 offset1">
                     <h4>Faça uma pergunta !</h4>
                     <form role="form" action=""""),_display_(/*207.49*/routes/*207.55*/.Application.adcionarComentario(anuncio.getId())),format.raw/*207.103*/("""" method="post">
                        <div class="form-group">
                           <textarea class="form-control" name="pergunta" rows="4" cols="100"></textarea>
                        </div>
                        <button type="submit" class="btn btn-primary">Enviar pergunta</button>
                     </form>
                  </div>
               </div>
               <div class="row">
                  <div class="span10 offset1">
                     """),_display_(/*217.23*/for(conversa <- anuncio.getListComentarios()) yield /*217.68*/{_display_(Seq[Any](format.raw/*217.69*/("""
                     """),format.raw/*218.22*/("""<div class="well">
                        """),_display_(/*219.26*/if(conversa.getPergunta() != null)/*219.60*/ {_display_(Seq[Any](format.raw/*219.62*/("""
                        	"""),format.raw/*220.26*/("""<h5><i class="icon-comment"></i> """),_display_(/*220.60*/conversa/*220.68*/.getPergunta()),format.raw/*220.82*/("""</h5>
                        """),_display_(/*221.26*/if(conversa.getResposta == null)/*221.58*/ {_display_(Seq[Any](format.raw/*221.60*/("""
                        """),format.raw/*222.25*/("""<a id="botaoResponderPergunta"""),_display_(/*222.55*/anuncio/*222.62*/.getId()),format.raw/*222.70*/("""" href="" data-toggle="modal" data-target="#responderModal"""),_display_(/*222.129*/conversa/*222.137*/.getId()),format.raw/*222.145*/(""""
                           class="finalizarAnuncio">Responder</a>
                        <div class="modal fade" id="responderModal"""),_display_(/*224.68*/conversa/*224.76*/.getId()),format.raw/*224.84*/("""">
                           <div class="modal-dialog">
                              <div class="modal-content">
                                 <div class="modal-header">
                                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                                    <h4 class="modal-title">Resposta</h4>
                                 </div>
                                 <div class="modal-body">
                                    <form action=""""),_display_(/*232.52*/routes/*232.58*/.Application.responderPergunta(conversa.getId(), anuncio.getId())),format.raw/*232.123*/("""" method="POST">
                                       <div class="form-group">
                                          <label for="inputCodigo">Código</label>
                                          <input name="codigo" type="text" class="form-control" id="inputCodigo" placeholder="Código do seu anúncio"
                                             required pattern=".*\S+.*">
                                       </div>
                                       <div class="form-group">
                                          <label>Resposta</label>
                                          <input name="resposta" type="text" class="form-control" id="inputResposta" placeholder="Sua resposta"
                                             required pattern=".*\S+.*">
                                       </div>
                                       <button id="submitResponderPergunta" type="submit" class="btn btn-primary">Enviar</button>
                                    </form>
                                 </div>
                              </div>
                           </div>
                        </div>
                        """)))}),format.raw/*249.26*/("""
                        """)))}),format.raw/*250.26*/("""
                        """),_display_(/*251.26*/if(conversa.getResposta() != null)/*251.60*/ {_display_(Seq[Any](format.raw/*251.62*/("""
                        """),format.raw/*252.25*/("""<p><i class="icon-pencil"></i> """),_display_(/*252.57*/conversa/*252.65*/.getResposta()),format.raw/*252.79*/("""</p>
                        """)))}),format.raw/*253.26*/("""
                     """),format.raw/*254.22*/("""</div>
                     """)))}),format.raw/*255.23*/("""
                  """),format.raw/*256.19*/("""</div>
               </div>
            </div>
         </div>
         <hr>
         <!-- Modal -->
         <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-header">
               <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
               <h3 id="myModalLabel">Finalizar Anuncio</h3>
            </div>
            <div class="modal-body">
               <form class="form-horizontal" action=""""),_display_(/*268.55*/routes/*268.61*/.Application.deletarAnuncio(anuncio.getId())),format.raw/*268.105*/("""" method="post">
                  <div class="control-group">
                     <label class="control-label">Palavra-Chave :</label>
                     <div class="controls">
                        <input type="password" name="palavra-chave" required autofocus>
                     </div>
                  </div>
                  <div class="control-group">
                     <div class="controls">
                        <label class="radio inline">
                        <input type="radio"  name="resolvido" value="SIM" required>Resolvido
                        </label>
                        <label class="radio inline">
                        <input type="radio" name="resolvido" value="NAO" required>Não Resolvido
                        </label>
                     </div>
                  </div>
                  <div class="modal-footer">
                     <button class="btn" data-dismiss="modal" aria-hidden="true">Fechar</button>
                     <input type="submit" class="btn btn-warning" value="Finalizar">
                  </div>
               </form>
            </div>
         </div>
         <div class="footer">
            <p>© Wendley Paulo 2015</p>
         </div>
      </div>
      <script src=""""),_display_(/*296.21*/routes/*296.27*/.Assets.at("javascripts/jquery.js")),format.raw/*296.62*/(""""></script>
      <script src=""""),_display_(/*297.21*/routes/*297.27*/.Assets.at("javascripts/bootstrap-transition.js")),format.raw/*297.76*/(""""></script>
      <script src=""""),_display_(/*298.21*/routes/*298.27*/.Assets.at("javascripts/bootstrap-alert.js")),format.raw/*298.71*/(""""></script>
      <script src=""""),_display_(/*299.21*/routes/*299.27*/.Assets.at("javascripts/bootstrap-modal.js")),format.raw/*299.71*/(""""></script>
      <script src=""""),_display_(/*300.21*/routes/*300.27*/.Assets.at("javascripts/bootstrap-dropdown.js")),format.raw/*300.74*/(""""></script>
      <script src=""""),_display_(/*301.21*/routes/*301.27*/.Assets.at("javascripts/bootstrap-scrollspy.js")),format.raw/*301.75*/(""""></script>
      <script src=""""),_display_(/*302.21*/routes/*302.27*/.Assets.at("javascripts/bootstrap-tab.js")),format.raw/*302.69*/(""""></script>
      <script src=""""),_display_(/*303.21*/routes/*303.27*/.Assets.at("javascripts/bootstrap-tooltip.js")),format.raw/*303.73*/(""""></script>
      <script src=""""),_display_(/*304.21*/routes/*304.27*/.Assets.at("javascripts/bootstrap-popover.js")),format.raw/*304.73*/(""""></script>
      <script src=""""),_display_(/*305.21*/routes/*305.27*/.Assets.at("javascripts/bootstrap-button.js")),format.raw/*305.72*/(""""></script>
      <script src=""""),_display_(/*306.21*/routes/*306.27*/.Assets.at("javascripts/bootstrap-collapse.js")),format.raw/*306.74*/(""""></script>
      <script src=""""),_display_(/*307.21*/routes/*307.27*/.Assets.at("javascripts/bootstrap-carousel.js")),format.raw/*307.74*/(""""></script>
      <script src=""""),_display_(/*308.21*/routes/*308.27*/.Assets.at("javascripts/bootstrap-typeahead.js")),format.raw/*308.75*/(""""></script>
      <script src=""""),_display_(/*309.21*/routes/*309.27*/.Assets.at("javascripts/jquery.multiple.select.js")),format.raw/*309.78*/(""""></script>
      <script>
         $("select").multipleSelect("""),format.raw/*311.37*/("""{"""),format.raw/*311.38*/("""
         	"""),format.raw/*312.11*/("""filter : true
         """),format.raw/*313.10*/("""}"""),format.raw/*313.11*/(""");
      </script>
   </body>
</html>"""))}
  }

  def render(anuncio:Anuncio): play.twirl.api.HtmlFormat.Appendable = apply(anuncio)

  def f:((Anuncio) => play.twirl.api.HtmlFormat.Appendable) = (anuncio) => apply(anuncio)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 03 01:05:27 BRT 2015
                  SOURCE: /home/wendleypf/workspace/si1-lab3/app/views/detalhes.scala.html
                  HASH: 31318abdb72d00a2545330b75edfc0ee46d1b5e1
                  MATRIX: 727->3|833->21|860->22|1268->403|1283->409|1343->448|1424->502|1439->508|1511->558|1784->804|1799->810|1849->839|1899->862|1914->868|1983->916|2088->994|2103->1000|2151->1027|2510->1358|2539->1359|2578->1370|2850->1614|2879->1615|2927->1635|3042->1722|3071->1723|3110->1734|3166->1762|3195->1763|3235->1775|3496->2008|3525->2009|3563->2019|3592->2020|3640->2040|3698->2070|3727->2071|3766->2082|3808->2096|3837->2097|3877->2109|3994->2198|4023->2199|4068->2216|4108->2228|4137->2229|4183->2247|4277->2313|4306->2314|4335->2315|4368->2320|4397->2321|4443->2339|4605->2473|4634->2474|4683->2495|4747->2531|4776->2532|5018->2746|5047->2747|5098->2770|5316->2960|5345->2961|5524->3112|5553->3113|5604->3136|5822->3326|5851->3327|5987->3435|6016->3436|6060->3452|6089->3453|6130->3466|6159->3467|6197->3477|6226->3478|6260->3485|6342->3539|6371->3540|6409->3550|6496->3608|6526->3609|6565->3619|6644->3669|6674->3670|6713->3680|6794->3732|6824->3733|6863->3743|6947->3798|6977->3799|7016->3809|7070->3834|7100->3835|7139->3845|7179->3856|7209->3857|7248->3867|7364->3954|7394->3955|7433->3965|7473->3976|7503->3977|7542->3987|7643->4059|7673->4060|7708->4067|8141->4472|8157->4478|8212->4511|8281->4550|8312->4551|8364->4574|8579->4760|8609->4761|8639->4762|8940->5035|8957->5042|8991->5054|9200->5235|9217->5242|9249->5252|9581->5556|9598->5563|9635->5578|9840->5755|9857->5762|9907->5790|9958->5812|10058->5884|10075->5891|10125->5919|10176->5941|10420->6157|10437->6164|10488->6192|10520->6195|10538->6202|10589->6230|10951->6564|10968->6571|11021->6602|11204->6757|11286->6822|11326->6823|11377->6845|11442->6882|11463->6893|11495->6903|11525->6904|11592->6939|11640->6958|11815->7105|11896->7169|11936->7170|11987->7192|12055->7232|12079->7246|12111->7256|12178->7291|12227->7311|12407->7463|12503->7541|12544->7542|12595->7564|12665->7606|12692->7623|12724->7633|12791->7668|12840->7688|13060->7880|13077->7887|13140->7927|13241->8000|13258->8007|13324->8050|13426->8124|13443->8131|13509->8174|13790->8427|13806->8433|13877->8481|14381->8957|14443->9002|14483->9003|14534->9025|14606->9069|14650->9103|14691->9105|14746->9131|14808->9165|14826->9173|14862->9187|14921->9218|14963->9250|15004->9252|15058->9277|15116->9307|15133->9314|15163->9322|15251->9381|15270->9389|15301->9397|15464->9532|15482->9540|15512->9548|16099->10107|16115->10113|16203->10178|17400->11343|17458->11369|17512->11395|17556->11429|17597->11431|17651->11456|17711->11488|17729->11496|17765->11510|17827->11540|17878->11562|17939->11591|17987->11610|18558->12153|18574->12159|18641->12203|19924->13458|19940->13464|19997->13499|20057->13531|20073->13537|20144->13586|20204->13618|20220->13624|20286->13668|20346->13700|20362->13706|20428->13750|20488->13782|20504->13788|20573->13835|20633->13867|20649->13873|20719->13921|20779->13953|20795->13959|20859->14001|20919->14033|20935->14039|21003->14085|21063->14117|21079->14123|21147->14169|21207->14201|21223->14207|21290->14252|21350->14284|21366->14290|21435->14337|21495->14369|21511->14375|21580->14422|21640->14454|21656->14460|21726->14508|21786->14540|21802->14546|21875->14597|21967->14660|21997->14661|22037->14672|22089->14695|22119->14696
                  LINES: 26->3|29->3|30->4|38->12|38->12|38->12|39->13|39->13|39->13|44->18|44->18|44->18|45->19|45->19|45->19|47->21|47->21|47->21|52->26|52->26|53->27|58->32|58->32|60->34|63->37|63->37|64->38|64->38|64->38|65->39|71->45|71->45|72->46|72->46|74->48|74->48|74->48|75->49|75->49|75->49|76->50|79->53|79->53|80->54|80->54|80->54|81->55|83->57|83->57|83->57|83->57|83->57|84->58|88->62|88->62|89->63|90->64|90->64|97->71|97->71|98->72|103->77|103->77|108->82|108->82|109->83|114->88|114->88|118->92|118->92|119->93|119->93|120->94|120->94|121->95|121->95|122->96|124->98|124->98|125->99|127->101|127->101|128->102|129->103|129->103|130->104|132->106|132->106|133->107|134->108|134->108|135->109|136->110|136->110|137->111|137->111|137->111|138->112|141->115|141->115|142->116|142->116|142->116|143->117|146->120|146->120|147->121|159->133|159->133|159->133|159->133|159->133|160->134|162->136|162->136|162->136|169->143|169->143|169->143|173->147|173->147|173->147|180->154|180->154|180->154|185->159|185->159|185->159|186->160|188->162|188->162|188->162|189->163|193->167|193->167|193->167|193->167|193->167|193->167|199->173|199->173|199->173|203->177|203->177|203->177|204->178|204->178|204->178|204->178|204->178|205->179|206->180|210->184|210->184|210->184|211->185|211->185|211->185|211->185|212->186|213->187|217->191|217->191|217->191|218->192|218->192|218->192|218->192|219->193|220->194|224->198|224->198|224->198|225->199|225->199|225->199|226->200|226->200|226->200|233->207|233->207|233->207|243->217|243->217|243->217|244->218|245->219|245->219|245->219|246->220|246->220|246->220|246->220|247->221|247->221|247->221|248->222|248->222|248->222|248->222|248->222|248->222|248->222|250->224|250->224|250->224|258->232|258->232|258->232|275->249|276->250|277->251|277->251|277->251|278->252|278->252|278->252|278->252|279->253|280->254|281->255|282->256|294->268|294->268|294->268|322->296|322->296|322->296|323->297|323->297|323->297|324->298|324->298|324->298|325->299|325->299|325->299|326->300|326->300|326->300|327->301|327->301|327->301|328->302|328->302|328->302|329->303|329->303|329->303|330->304|330->304|330->304|331->305|331->305|331->305|332->306|332->306|332->306|333->307|333->307|333->307|334->308|334->308|334->308|335->309|335->309|335->309|337->311|337->311|338->312|339->313|339->313
                  -- GENERATED --
              */
          