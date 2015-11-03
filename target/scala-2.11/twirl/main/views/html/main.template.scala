
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
object main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[String,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.32*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="pt-br">
    <head>
    	<meta http-equiv="content-type" content="text/html; charset=UTF-8">
      	<meta charset="utf-8">
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
      	<meta name="description" content="">
      	<meta name="author" content="Wendley Paulo de França">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap-responsive.css")),format.raw/*12.110*/("""">
        <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
      	<!--[if lt IE 9]>
      	<script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
      	<![endif]-->
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.59*/routes/*17.65*/.Assets.at("img/favicon.ico")),format.raw/*17.94*/("""">
         <style type="text/css">
	         body """),format.raw/*19.16*/("""{"""),format.raw/*19.17*/("""
	         """),format.raw/*20.11*/("""padding-top: 20px;
	         padding-bottom: 40px;
	         """),format.raw/*22.11*/("""}"""),format.raw/*22.12*/("""
	         """),format.raw/*23.11*/("""/* Custom container */
	         .container-narrow """),format.raw/*24.29*/("""{"""),format.raw/*24.30*/("""
	         """),format.raw/*25.11*/("""margin: 0 auto;
	         max-width: 750px;
	         """),format.raw/*27.11*/("""}"""),format.raw/*27.12*/("""
	         """),format.raw/*28.11*/(""".container-narrow > hr """),format.raw/*28.34*/("""{"""),format.raw/*28.35*/("""
	         """),format.raw/*29.11*/("""margin: 30px 0;
	         """),format.raw/*30.11*/("""}"""),format.raw/*30.12*/("""
	         """),format.raw/*31.11*/("""/* Main marketing message and sign up button */
	         .jumbotron """),format.raw/*32.22*/("""{"""),format.raw/*32.23*/("""
	         """),format.raw/*33.11*/("""margin: 60px 0;
	         text-align: center;
	         """),format.raw/*35.11*/("""}"""),format.raw/*35.12*/("""
	         """),format.raw/*36.11*/(""".jumbotron h1 """),format.raw/*36.25*/("""{"""),format.raw/*36.26*/("""
	         """),format.raw/*37.11*/("""font-size: 72px;
	         line-height: 1;
	         """),format.raw/*39.11*/("""}"""),format.raw/*39.12*/("""
	         """),format.raw/*40.11*/(""".jumbotron .btn """),format.raw/*40.27*/("""{"""),format.raw/*40.28*/("""
	         """),format.raw/*41.11*/("""font-size: 21px;
	         padding: 14px 24px;
	         """),format.raw/*43.11*/("""}"""),format.raw/*43.12*/("""
	         """),format.raw/*44.11*/("""/* Supporting marketing content */
	         .marketing """),format.raw/*45.22*/("""{"""),format.raw/*45.23*/("""
	         """),format.raw/*46.11*/("""margin: 30px 0;
	         """),format.raw/*47.11*/("""}"""),format.raw/*47.12*/("""
      """),format.raw/*48.7*/("""</style>
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
                  <br><a href="#myModal" class="btn btn-success" role="button" data-toggle="modal"><i class="icon-plus icon-white"></i> Novo Anuncio</a>
               </div>
            </div>
         </div>
         <hr>
         <div class="well">
	         <br/>
	         <div class="row-fluid">
	            <div class="span10 offset2">
	               <form class="form-grup">
	                  <div class="input-append">
	                     <input class="span7" id="appendedInputButton" type="text" placeholder="Ex: pianista, violinista, cantor">
	                     <button class="btn" type="button"><i class="icon-search"></i> Pesquisar</button>
	                     <br>
	                     <br>
	                  </div>
	                  <label class="checkbox inline">
	                  <input type="checkbox" id="inlineCheckbox1" value="option1"> Por palavra-chave
	                  </label>
	                  <label class="checkbox inline">
	                  <input type="checkbox" id="inlineCheckbox2" value="option2"> Por instrumento
	                  </label>
	                  <label class="checkbox inline">
	                  <input type="checkbox" id="inlineCheckbox3" value="option3"> Por estilo preferido
	                  </label>
	               </form>
	            </div>
	         </div>
         </div>
         <!-- Modal -->
         <div id="myModal" class="modal hide fade" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
            <div class="modal-header">
               <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
               <h3 id="myModalLabel">Cadastrar Anuncio</h3>
            </div>
            <div class="modal-body">
               <form class="form-horizontal">
                  <div class="control-group">
                     <label class="control-label" for="inputEmail">Email</label>
                     <div class="controls">
                        <input type="text" id="inputEmail" placeholder="Email">
                     </div>
                  </div>
                  <div class="control-group">
                     <label class="control-label" for="inputPassword">Senha</label>
                     <div class="controls">
                        <input type="password" id="inputPassword" placeholder="Senha">
                     </div>
                  </div>
                  <div class="control-group">
                     <div class="controls">
                        <label class="checkbox">
                        <input type="checkbox"> Lembre-se de mim
                        </label>
                        <button type="submit" class="btn">Entrar</button>
                     </div>
                  </div>
               </form>
            </div>
         </div>
         <div class="row-fluid marketing">
            <div class="span12">
                     <table class="table  table-hover">
                     <tr>
                        <td><a href="">Titulo</a>
                        <span class="pull-right">25/05/2015</span>
                        <p> This product was great in terms of quality. I woul…</p></td>
                     </tr>
                     <tr>
                        <td><a href="">Titulo</a>
                        <span class="pull-right">25/05/2015</span>
                        <p> This product was great in terms of quality. I woul…</p></td>
                     </tr>
                     <tr>
                        <td><a href="">Titulo</a>
                        <span class="pull-right">25/05/2015</span>
                        <p> This product was great in terms of quality. I woul…</p></td>
                     </tr>
                  </table>
               </div>
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
      <script src=""""),_display_(/*150.21*/routes/*150.27*/.Assets.at("javascripts/jquery.js")),format.raw/*150.62*/(""""></script>
      <script src=""""),_display_(/*151.21*/routes/*151.27*/.Assets.at("javascripts/bootstrap-transition.js")),format.raw/*151.76*/(""""></script>
      <script src=""""),_display_(/*152.21*/routes/*152.27*/.Assets.at("javascripts/bootstrap-alert.js")),format.raw/*152.71*/(""""></script>
      <script src=""""),_display_(/*153.21*/routes/*153.27*/.Assets.at("javascripts/bootstrap-modal.js")),format.raw/*153.71*/(""""></script>
      <script src=""""),_display_(/*154.21*/routes/*154.27*/.Assets.at("javascripts/bootstrap-dropdown.js")),format.raw/*154.74*/(""""></script>
      <script src=""""),_display_(/*155.21*/routes/*155.27*/.Assets.at("javascripts/bootstrap-scrollspy.js")),format.raw/*155.75*/(""""></script>
      <script src=""""),_display_(/*156.21*/routes/*156.27*/.Assets.at("javascripts/bootstrap-tab.js")),format.raw/*156.69*/(""""></script>
      <script src=""""),_display_(/*157.21*/routes/*157.27*/.Assets.at("javascripts/bootstrap-tooltip.js")),format.raw/*157.73*/(""""></script>
      <script src=""""),_display_(/*158.21*/routes/*158.27*/.Assets.at("javascripts/bootstrap-popover.js")),format.raw/*158.73*/(""""></script>
      <script src=""""),_display_(/*159.21*/routes/*159.27*/.Assets.at("javascripts/bootstrap-button.js")),format.raw/*159.72*/(""""></script>
      <script src=""""),_display_(/*160.21*/routes/*160.27*/.Assets.at("javascripts/bootstrap-collapse.js")),format.raw/*160.74*/(""""></script>
      <script src=""""),_display_(/*161.21*/routes/*161.27*/.Assets.at("javascripts/bootstrap-carousel.js")),format.raw/*161.74*/(""""></script>
      <script src=""""),_display_(/*162.21*/routes/*162.27*/.Assets.at("javascripts/bootstrap-typeahead.js")),format.raw/*162.75*/(""""></script>
    </body>
</html>
"""))}
  }

  def render(title:String,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title)(content)

  def f:((String) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 03 01:05:27 BRT 2015
                  SOURCE: /home/wendleypf/workspace/si1-lab3/app/views/main.scala.html
                  HASH: 6008db56703a15c8adc6c23eeacab13e6c6ed587
                  MATRIX: 727->1|845->31|872->32|1064->198|1089->203|1363->450|1378->456|1438->495|1521->551|1536->557|1608->607|1888->860|1903->866|1953->895|2032->946|2061->947|2100->958|2189->1019|2218->1020|2257->1031|2336->1082|2365->1083|2404->1094|2486->1148|2515->1149|2554->1160|2605->1183|2634->1184|2673->1195|2727->1221|2756->1222|2795->1233|2892->1302|2921->1303|2960->1314|3044->1370|3073->1371|3112->1382|3154->1396|3183->1397|3222->1408|3303->1461|3332->1462|3371->1473|3415->1489|3444->1490|3483->1501|3568->1558|3597->1559|3636->1570|3720->1626|3749->1627|3788->1638|3842->1664|3871->1665|3905->1672|8409->6148|8425->6154|8482->6189|8542->6221|8558->6227|8629->6276|8689->6308|8705->6314|8771->6358|8831->6390|8847->6396|8913->6440|8973->6472|8989->6478|9058->6525|9118->6557|9134->6563|9204->6611|9264->6643|9280->6649|9344->6691|9404->6723|9420->6729|9488->6775|9548->6807|9564->6813|9632->6859|9692->6891|9708->6897|9775->6942|9835->6974|9851->6980|9920->7027|9980->7059|9996->7065|10065->7112|10125->7144|10141->7150|10211->7198
                  LINES: 26->1|29->1|30->2|35->7|35->7|39->11|39->11|39->11|40->12|40->12|40->12|45->17|45->17|45->17|47->19|47->19|48->20|50->22|50->22|51->23|52->24|52->24|53->25|55->27|55->27|56->28|56->28|56->28|57->29|58->30|58->30|59->31|60->32|60->32|61->33|63->35|63->35|64->36|64->36|64->36|65->37|67->39|67->39|68->40|68->40|68->40|69->41|71->43|71->43|72->44|73->45|73->45|74->46|75->47|75->47|76->48|178->150|178->150|178->150|179->151|179->151|179->151|180->152|180->152|180->152|181->153|181->153|181->153|182->154|182->154|182->154|183->155|183->155|183->155|184->156|184->156|184->156|185->157|185->157|185->157|186->158|186->158|186->158|187->159|187->159|187->159|188->160|188->160|188->160|189->161|189->161|189->161|190->162|190->162|190->162
                  -- GENERATED --
              */
          