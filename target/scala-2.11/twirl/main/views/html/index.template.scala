
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
object index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,List[Anuncio],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(listAnuncio: List[Anuncio])(contador: Integer):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.64*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <meta charset="utf-8">
      <title>"""),_display_(/*7.15*/title),format.raw/*7.20*/("""</title>
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="author" content="Wendley Paulo de França">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*10.52*/routes/*10.58*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*10.97*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*11.52*/routes/*11.58*/.Assets.at("stylesheets/bootstrap-responsive.css")),format.raw/*11.108*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*12.52*/routes/*12.58*/.Assets.at("stylesheets/multiple-select.css")),format.raw/*12.103*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*13.52*/routes/*13.58*/.Assets.at("stylesheets/highslide.css")),format.raw/*13.97*/("""">
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
      <style type="text/css">
         body """),format.raw/*25.15*/("""{"""),format.raw/*25.16*/("""
         """),format.raw/*26.10*/("""padding-top: 20px;
         padding-bottom: 40px;
         """),format.raw/*28.10*/("""}"""),format.raw/*28.11*/("""
         """),format.raw/*29.10*/("""/* Custom container */
         .container-narrow """),format.raw/*30.28*/("""{"""),format.raw/*30.29*/("""
         """),format.raw/*31.10*/("""margin: 0 auto;
         max-width: 750px;
         """),format.raw/*33.10*/("""}"""),format.raw/*33.11*/("""
         """),format.raw/*34.10*/(""".container-narrow > hr """),format.raw/*34.33*/("""{"""),format.raw/*34.34*/("""
         """),format.raw/*35.10*/("""margin: 30px 0;
         """),format.raw/*36.10*/("""}"""),format.raw/*36.11*/("""
         """),format.raw/*37.10*/("""/* Main marketing message and sign up button */
         .jumbotron """),format.raw/*38.21*/("""{"""),format.raw/*38.22*/("""
         """),format.raw/*39.10*/("""margin: 60px 0;
         text-align: center;
         """),format.raw/*41.10*/("""}"""),format.raw/*41.11*/("""
         """),format.raw/*42.10*/(""".jumbotron h1 """),format.raw/*42.24*/("""{"""),format.raw/*42.25*/("""
         """),format.raw/*43.10*/("""font-size: 72px;
         line-height: 1;
         """),format.raw/*45.10*/("""}"""),format.raw/*45.11*/("""
         """),format.raw/*46.10*/(""".jumbotron .btn """),format.raw/*46.26*/("""{"""),format.raw/*46.27*/("""
         """),format.raw/*47.10*/("""font-size: 21px;
         padding: 14px 24px;
         """),format.raw/*49.10*/("""}"""),format.raw/*49.11*/("""
         """),format.raw/*50.10*/("""/* Supporting marketing content */
         .marketing """),format.raw/*51.21*/("""{"""),format.raw/*51.22*/("""
         """),format.raw/*52.10*/("""margin: 30px 0;
         """),format.raw/*53.10*/("""}"""),format.raw/*53.11*/("""
         """),format.raw/*54.10*/("""#navlist li"""),format.raw/*54.21*/("""{"""),format.raw/*54.22*/("""
         """),format.raw/*55.10*/("""display: inline;
         list-style-type: none;
         padding-right: 5px;
         """),format.raw/*58.10*/("""}"""),format.raw/*58.11*/("""
      """),format.raw/*59.7*/("""</style>
   </head>
   <body>
      <div class="container-narrow">
         <br/>
         <div class="masthead">
            <div class="row-fluid">
               <div class="span7">
                  <h2><b>&#9835;</b> Classified Musical</h2>
               </div>
               <div class="span4 offset1">
                  <br>
                  <a href=""""),_display_(/*71.29*/routes/*71.35*/.Application.getListasCadastrar()),format.raw/*71.68*/("""" onclick="return  hs.htmlExpand(this, """),format.raw/*71.107*/("""{"""),format.raw/*71.108*/(""" 
                     """),format.raw/*72.22*/("""objectType: 'iframe', width: 1310, height:700, 
                     creditsPosition: 'bottom left', headingText: 'Cadastrar Anuncio', 
                     wrapperClassName: 'titlebar' """),format.raw/*74.51*/("""}"""),format.raw/*74.52*/(""" """),format.raw/*74.53*/(""")" class="btn btn-success"><i class="icon-plus icon-white"></i> Novo Anuncio</a>
               </div>
            </div>
         </div>
         <hr>
         <div class="well">
            <br/>
            <div class="row-fluid">
               <form class="form-grup"  action=""""),_display_(/*82.50*/routes/*82.56*/.Application.pesquisarAnuncio()),format.raw/*82.87*/("""" method="post">
                  <div class="span10 offset2">
                     <div class="input-append">
                        <input class="span9" name="valuePesquisa" id="appendedInputButton" type="text" placeholder="Ex: pianista, violinista, cantor">
                        <button class="btn" type="submit"><i class="icon-search"></i></button>
                        <br>
                        <br>
                     </div>
                  </div>
                  <div class="span12">
                     <label class="radio inline">
                     	<input type="radio"  name="pesquisa" value="PalavraChave">Palavra-Chave
                     </label>
                     <label class="radio inline">
                     	<input type="radio" name="pesquisa" value="Instrumento">Instrumento
                     </label>
                     <label class="radio inline">
                     	<input type="radio" name="pesquisa" value="Estilo">Estilo Preferido
                     </label>
                     <label class="radio inline">
                     	<input type="radio"  name="pesquisa" value="Em Banda">Formar Banda
                     </label>
                     <label class="radio inline">
                     	<input type="radio"  name="pesquisa" value="Ocasionalmente">Tocar Ocasionalmente 
                     </label>
                  </div>
               </form>
            </div>
         </div>
         <hr>
			<div class="span8 offset2">
				<h4 class="text-success">&nbsp;&nbsp;&nbsp;&nbsp;  Anuncios Resolvidos: """),_display_(/*113.78*/contador),format.raw/*113.86*/("""</h4>
			</div>
			<br>
         <div class="row-fluid marketing">
            <div class="col-sm-6">
               """),_display_(/*118.17*/for(anuncio <- listAnuncio.reverse) yield /*118.52*/{_display_(Seq[Any](format.raw/*118.53*/("""	
               """),format.raw/*119.16*/("""<div class="row">
                  <div class="col-xs-12">
                     <h2 class="text-info">"""),_display_(/*121.45*/anuncio/*121.52*/.getTitulo()),format.raw/*121.64*/("""</h2>
                     <p class="muted">"""),_display_(/*122.40*/anuncio/*122.47*/.getDescricao()),format.raw/*122.62*/("""</p>
                     <p class="lead"><a href=""""),_display_(/*123.48*/routes/*123.54*/.Application.detalhesAnuncio(anuncio.getId())),format.raw/*123.99*/("""" class="btn btn-default"><i class="icon-plus"></i> Leia Mais</a></p>
                     <ul id="navlist">
                     <li class="offset10"><a href="#">"""),_display_(/*125.56*/anuncio/*125.63*/.getData()),format.raw/*125.73*/("""</a></li>
                  </div>
               </div>
               <hr>
               """)))}),format.raw/*129.17*/("""
            """),format.raw/*130.13*/("""</div>
         </div>
         <br>
         <hr>
         <div class="footer">
            <p>© Wendley Paulo 2015</p>
         </div>
      </div>
      <!-- /container -->
      <!-- Le javascript
         ================================================== -->
      <!-- Placed at the end of the document so the pages load faster -->
      <script src=""""),_display_(/*142.21*/routes/*142.27*/.Assets.at("javascripts/jquery.js")),format.raw/*142.62*/(""""></script>
      <script src=""""),_display_(/*143.21*/routes/*143.27*/.Assets.at("javascripts/bootstrap-alert.js")),format.raw/*143.71*/(""""></script>
   </body>
</html>
"""))}
  }

  def render(title:String,listAnuncio:List[Anuncio],contador:Integer): play.twirl.api.HtmlFormat.Appendable = apply(title)(listAnuncio)(contador)

  def f:((String) => (List[Anuncio]) => (Integer) => play.twirl.api.HtmlFormat.Appendable) = (title) => (listAnuncio) => (contador) => apply(title)(listAnuncio)(contador)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 03 01:05:27 BRT 2015
                  SOURCE: /home/wendleypf/workspace/si1-lab3/app/views/index.scala.html
                  HASH: 7ecba2d5a30ba849f96bed77ebd8b6ff9a960145
                  MATRIX: 745->1|895->63|922->64|1111->227|1136->232|1361->430|1376->436|1436->475|1517->529|1532->535|1604->585|1685->639|1700->645|1767->690|1848->744|1863->750|1923->789|2196->1035|2211->1041|2261->1070|2311->1093|2326->1099|2395->1147|2500->1225|2515->1231|2563->1258|2697->1364|2726->1365|2764->1375|2851->1434|2880->1435|2918->1445|2996->1495|3025->1496|3063->1506|3143->1558|3172->1559|3210->1569|3261->1592|3290->1593|3328->1603|3381->1628|3410->1629|3448->1639|3544->1707|3573->1708|3611->1718|3693->1772|3722->1773|3760->1783|3802->1797|3831->1798|3869->1808|3948->1859|3977->1860|4015->1870|4059->1886|4088->1887|4126->1897|4209->1952|4238->1953|4276->1963|4359->2018|4388->2019|4426->2029|4479->2054|4508->2055|4546->2065|4585->2076|4614->2077|4652->2087|4767->2174|4796->2175|4830->2182|5219->2544|5234->2550|5288->2583|5356->2622|5386->2623|5437->2646|5651->2832|5680->2833|5709->2834|6019->3117|6034->3123|6086->3154|7694->4734|7724->4742|7870->4860|7922->4895|7962->4896|8008->4913|8140->5017|8157->5024|8191->5036|8264->5081|8281->5088|8318->5103|8398->5155|8414->5161|8481->5206|8673->5370|8690->5377|8722->5387|8847->5480|8889->5493|9276->5852|9292->5858|9349->5893|9409->5925|9425->5931|9491->5975
                  LINES: 26->1|29->1|30->2|35->7|35->7|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|46->18|46->18|46->18|47->19|47->19|47->19|49->21|49->21|49->21|53->25|53->25|54->26|56->28|56->28|57->29|58->30|58->30|59->31|61->33|61->33|62->34|62->34|62->34|63->35|64->36|64->36|65->37|66->38|66->38|67->39|69->41|69->41|70->42|70->42|70->42|71->43|73->45|73->45|74->46|74->46|74->46|75->47|77->49|77->49|78->50|79->51|79->51|80->52|81->53|81->53|82->54|82->54|82->54|83->55|86->58|86->58|87->59|99->71|99->71|99->71|99->71|99->71|100->72|102->74|102->74|102->74|110->82|110->82|110->82|141->113|141->113|146->118|146->118|146->118|147->119|149->121|149->121|149->121|150->122|150->122|150->122|151->123|151->123|151->123|153->125|153->125|153->125|157->129|158->130|170->142|170->142|170->142|171->143|171->143|171->143
                  -- GENERATED --
              */
          