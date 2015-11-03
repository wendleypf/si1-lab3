
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
object cadastrar extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[List[EstiloQueGosta],List[EstiloQueNaoGosta],List[Instrumento],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(estilosQueGosta: List[EstiloQueGosta])(estilosQueNaoGosta: List[EstiloQueNaoGosta])(instrumentos: List[Instrumento]):play.twirl.api.HtmlFormat.Appendable = {
      _display_ {

Seq[Any](format.raw/*1.119*/("""
"""),format.raw/*2.1*/("""<!DOCTYPE html>
<html lang="pt-br">
   <head>
      <meta http-equiv="content-type" content="text/html; charset=UTF-8">
      <meta charset="utf-8">
      <meta name="viewport" content="width=device-width, initial-scale=1.0">
      <meta name="author" content="Wendley Paulo de França">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*9.52*/routes/*9.58*/.Assets.at("stylesheets/bootstrap.css")),format.raw/*9.97*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*10.52*/routes/*10.58*/.Assets.at("stylesheets/bootstrap-responsive.css")),format.raw/*10.108*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*11.52*/routes/*11.58*/.Assets.at("stylesheets/multiple-select.css")),format.raw/*11.103*/("""">
      <link rel="stylesheet" media="screen" href=""""),_display_(/*12.52*/routes/*12.58*/.Assets.at("stylesheets/highslide.css")),format.raw/*12.97*/("""">
      <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
      <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
      <![endif]-->
      <link rel="shortcut icon" type="image/png" href=""""),_display_(/*17.57*/routes/*17.63*/.Assets.at("img/favicon.ico")),format.raw/*17.92*/("""">
      <script src=""""),_display_(/*18.21*/routes/*18.27*/.Assets.at("javascripts/highslide-with-html.js")),format.raw/*18.75*/(""""></script>
      <script type="text/javascript">
         hs.graphicsDir = '"""),_display_(/*20.29*/routes/*20.35*/.Assets.at("img/graphics/")),format.raw/*20.62*/("""';
         hs.outlineType = 'rounded-white';
      </script>
      <style type="text/css">
         body """),format.raw/*24.15*/("""{"""),format.raw/*24.16*/("""
         """),format.raw/*25.10*/("""padding-top: 5px;
         padding-bottom: 20px;
         """),format.raw/*27.10*/("""}"""),format.raw/*27.11*/("""
         """),format.raw/*28.10*/("""/* Custom container */
         .container-narrow """),format.raw/*29.28*/("""{"""),format.raw/*29.29*/("""
         """),format.raw/*30.10*/("""margin: 0 auto;
         max-width: 790px;
         """),format.raw/*32.10*/("""}"""),format.raw/*32.11*/("""
         """),format.raw/*33.10*/("""/* Supporting marketing content */
         .marketing """),format.raw/*34.21*/("""{"""),format.raw/*34.22*/("""
         """),format.raw/*35.10*/("""margin: 20px 0;
         """),format.raw/*36.10*/("""}"""),format.raw/*36.11*/("""
      """),format.raw/*37.7*/("""</style>
   </head>
   <body>
      <div class="container-narrow">
         <div class="row-fluid marketing">
            <h2>Cadastrar Anuncio</h2>
               <div class="span12">
                  <form class="form-horizontal" action=""""),_display_(/*44.58*/routes/*44.64*/.Application.novoAnuncio()),format.raw/*44.90*/("""" method="post" autocomplete="off">
                     <fieldset>
                        <legend><i class="icon-comment"></i> Detalhes do Anuncio</legend>
                        <div class="control-group">
                           <label class="control-label">Titulo :</label>
                           <div class="controls">
                              <input type="text" name="titulo" placeholder="Titulo da postagem" required autofocus>
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Descrição :</label>
                           <div class="controls">
                              <textarea rows="3" maxlength="100" name="descricao" placeholder="Descrição breve para seu anuncio" required></textarea>
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Palavra-Chave :</label>
                           <div class="controls">
                              <input type="password" name="palavra-chave">
                              <span class="help-block">Insira uma palavra chave para que voce posteriormente possa remover esse anuncio.</span>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <legend><i class="icon-user"></i> Detalhes do Anunciante</legend>
                        <div class="control-group">
                           <label class="control-label">Cidade : </label>
                           <div class="controls">
                              <input type="text" name="cidade" placeholder="Ex: Campina Grande" required>
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Bairro : </label>
                           <div class="controls">
                              <input type="text" name="bairro" placeholder="Ex: Alto Branco" required>
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Onde Tocar :</label>
                           <div class="controls">
                              <label class="radio  inline">
                              <input type="radio" name="ondeTocar" value="Em Banda"><b>Em Banda</b> 
                              </label>
                              <label class="radio  inline">
                              <input type="radio" name="ondeTocar" value="Ocasionalmente"><b>Ocasionalmente</b>
                              </label>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <legend><i class="icon-music"></i> Estilos e Instrumentos</legend>
                        <div class="control-group">
                           <label class="control-label">Instrumentos que toca :</label>
                           <div class="controls">
                              <select multiple="multiple" name="instrumentos" required>
                                 """),_display_(/*99.35*/for(instrumeto <- instrumentos) yield /*99.66*/{_display_(Seq[Any](format.raw/*99.67*/("""
                                 """),format.raw/*100.34*/("""<option value=""""),_display_(/*100.50*/instrumeto/*100.60*/.getId()),format.raw/*100.68*/(""""> """),_display_(/*100.72*/instrumeto/*100.82*/.getNome()),format.raw/*100.92*/("""</option>
                                 """)))}),format.raw/*101.35*/("""
                              """),format.raw/*102.31*/("""</select>
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Estilos que gosta :</label>
                           <div class="controls">
                              <select multiple="multiple" name="estilosQueGosta">
                                 """),_display_(/*109.35*/for(estiloQueGosta <- estilosQueGosta) yield /*109.73*/{_display_(Seq[Any](format.raw/*109.74*/("""
                                 """),format.raw/*110.34*/("""<option value=""""),_display_(/*110.50*/estiloQueGosta/*110.64*/.getId()),format.raw/*110.72*/(""""> """),_display_(/*110.76*/estiloQueGosta/*110.90*/.getNome()),format.raw/*110.100*/("""</option>
                                 """)))}),format.raw/*111.35*/("""
                              """),format.raw/*112.31*/("""</select>
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Estilos que não gosta :</label>
                           <div class="controls">
                              <select multiple="multiple" name="estilosQueNaoGosta">
                                 """),_display_(/*119.35*/for(estiloQueNaoGosta <- estilosQueNaoGosta) yield /*119.79*/{_display_(Seq[Any](format.raw/*119.80*/("""
                                 """),format.raw/*120.34*/("""<option value=""""),_display_(/*120.50*/estiloQueNaoGosta/*120.67*/.getId()),format.raw/*120.75*/(""""> """),_display_(/*120.79*/estiloQueNaoGosta/*120.96*/.getNome()),format.raw/*120.106*/("""</option>
                                 """)))}),format.raw/*121.35*/("""
                              """),format.raw/*122.31*/("""</select>
                           </div>
                        </div>
                     </fieldset>
                     <fieldset>
                        <legend><i class="icon-envelope"></i> Contato</legend>
                        <div class="control-group">
                           <label class="control-label">Email :</label>
                           <div class="controls">
                              <input type="email" name="email" placeholder="exemplo&#64;exemplo.com" pattern="[a-z0-9._%+-]+&#64;[a-z0-9.-]+\.[a-z]"""),format.raw/*131.148*/("""{"""),format.raw/*131.149*/("""2,4"""),format.raw/*131.152*/("""}"""),format.raw/*131.153*/("""$" required> 
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Facebook :</label>
                           <div class="controls">
                              <input type="url" name="facebook" pattern="http?://.+" required> 
                           </div>
                        </div>
                        <div class="control-group">
                           <label class="control-label">Telefone :</label>
                           <div class="controls">
                              <input type="tel" name="telefone" placeholder="(99) 9999-9999" required>
                           </div>
                        </div>
               </fieldset>
               <fieldset>
					<div class="control-group">
					   <div class="controls">
						<button type="reset" class="btn btn-danger">Limpar</button>
						<input type="submit" class="btn btn-success" value="Cadastrar">
					  </div>
					</div>
               </fieldset>
               </form>
            </div>
      </div>
      <script src=""""),_display_(/*158.21*/routes/*158.27*/.Assets.at("javascripts/jquery.js")),format.raw/*158.62*/(""""></script>
      <script src=""""),_display_(/*159.21*/routes/*159.27*/.Assets.at("javascripts/bootstrap-transition.js")),format.raw/*159.76*/(""""></script>
      <script src=""""),_display_(/*160.21*/routes/*160.27*/.Assets.at("javascripts/bootstrap-alert.js")),format.raw/*160.71*/(""""></script>
      <script src=""""),_display_(/*161.21*/routes/*161.27*/.Assets.at("javascripts/bootstrap-modal.js")),format.raw/*161.71*/(""""></script>
      <script src=""""),_display_(/*162.21*/routes/*162.27*/.Assets.at("javascripts/bootstrap-dropdown.js")),format.raw/*162.74*/(""""></script>
      <script src=""""),_display_(/*163.21*/routes/*163.27*/.Assets.at("javascripts/bootstrap-scrollspy.js")),format.raw/*163.75*/(""""></script>
      <script src=""""),_display_(/*164.21*/routes/*164.27*/.Assets.at("javascripts/bootstrap-tab.js")),format.raw/*164.69*/(""""></script>
      <script src=""""),_display_(/*165.21*/routes/*165.27*/.Assets.at("javascripts/bootstrap-tooltip.js")),format.raw/*165.73*/(""""></script>
      <script src=""""),_display_(/*166.21*/routes/*166.27*/.Assets.at("javascripts/bootstrap-popover.js")),format.raw/*166.73*/(""""></script>
      <script src=""""),_display_(/*167.21*/routes/*167.27*/.Assets.at("javascripts/bootstrap-button.js")),format.raw/*167.72*/(""""></script>
      <script src=""""),_display_(/*168.21*/routes/*168.27*/.Assets.at("javascripts/bootstrap-collapse.js")),format.raw/*168.74*/(""""></script>
      <script src=""""),_display_(/*169.21*/routes/*169.27*/.Assets.at("javascripts/bootstrap-carousel.js")),format.raw/*169.74*/(""""></script>
      <script src=""""),_display_(/*170.21*/routes/*170.27*/.Assets.at("javascripts/bootstrap-typeahead.js")),format.raw/*170.75*/(""""></script>
      <script src=""""),_display_(/*171.21*/routes/*171.27*/.Assets.at("javascripts/jquery.multiple.select.js")),format.raw/*171.78*/(""""></script>
      <script>
         $("select").multipleSelect("""),format.raw/*173.37*/("""{"""),format.raw/*173.38*/("""
             """),format.raw/*174.14*/("""filter: true
         """),format.raw/*175.10*/("""}"""),format.raw/*175.11*/(""");
      </script>
	</body>
</html>
"""))}
  }

  def render(estilosQueGosta:List[EstiloQueGosta],estilosQueNaoGosta:List[EstiloQueNaoGosta],instrumentos:List[Instrumento]): play.twirl.api.HtmlFormat.Appendable = apply(estilosQueGosta)(estilosQueNaoGosta)(instrumentos)

  def f:((List[EstiloQueGosta]) => (List[EstiloQueNaoGosta]) => (List[Instrumento]) => play.twirl.api.HtmlFormat.Appendable) = (estilosQueGosta) => (estilosQueNaoGosta) => (instrumentos) => apply(estilosQueGosta)(estilosQueNaoGosta)(instrumentos)

  def ref: this.type = this

}
              /*
                  -- GENERATED --
                  DATE: Tue Nov 03 01:05:27 BRT 2015
                  SOURCE: /home/wendleypf/workspace/si1-lab3/app/views/cadastrar.scala.html
                  HASH: 0959eb7fe6c32883d7e64f561719472d2d7b43a4
                  MATRIX: 783->1|989->118|1016->119|1380->457|1394->463|1453->502|1534->556|1549->562|1621->612|1702->666|1717->672|1784->717|1865->771|1880->777|1940->816|2213->1062|2228->1068|2278->1097|2328->1120|2343->1126|2412->1174|2517->1252|2532->1258|2580->1285|2714->1391|2743->1392|2781->1402|2867->1460|2896->1461|2934->1471|3012->1521|3041->1522|3079->1532|3159->1584|3188->1585|3226->1595|3309->1650|3338->1651|3376->1661|3429->1686|3458->1687|3492->1694|3761->1936|3776->1942|3823->1968|7192->5310|7239->5341|7278->5342|7341->5376|7385->5392|7405->5402|7435->5410|7467->5414|7487->5424|7519->5434|7595->5478|7655->5509|8060->5886|8115->5924|8155->5925|8218->5959|8262->5975|8286->5989|8316->5997|8348->6001|8372->6015|8405->6025|8481->6069|8541->6100|8953->6484|9014->6528|9054->6529|9117->6563|9161->6579|9188->6596|9218->6604|9250->6608|9277->6625|9310->6635|9386->6679|9446->6710|10016->7250|10047->7251|10080->7254|10111->7255|11282->8398|11298->8404|11355->8439|11415->8471|11431->8477|11502->8526|11562->8558|11578->8564|11644->8608|11704->8640|11720->8646|11786->8690|11846->8722|11862->8728|11931->8775|11991->8807|12007->8813|12077->8861|12137->8893|12153->8899|12217->8941|12277->8973|12293->8979|12361->9025|12421->9057|12437->9063|12505->9109|12565->9141|12581->9147|12648->9192|12708->9224|12724->9230|12793->9277|12853->9309|12869->9315|12938->9362|12998->9394|13014->9400|13084->9448|13144->9480|13160->9486|13233->9537|13325->9600|13355->9601|13398->9615|13449->9637|13479->9638
                  LINES: 26->1|29->1|30->2|37->9|37->9|37->9|38->10|38->10|38->10|39->11|39->11|39->11|40->12|40->12|40->12|45->17|45->17|45->17|46->18|46->18|46->18|48->20|48->20|48->20|52->24|52->24|53->25|55->27|55->27|56->28|57->29|57->29|58->30|60->32|60->32|61->33|62->34|62->34|63->35|64->36|64->36|65->37|72->44|72->44|72->44|127->99|127->99|127->99|128->100|128->100|128->100|128->100|128->100|128->100|128->100|129->101|130->102|137->109|137->109|137->109|138->110|138->110|138->110|138->110|138->110|138->110|138->110|139->111|140->112|147->119|147->119|147->119|148->120|148->120|148->120|148->120|148->120|148->120|148->120|149->121|150->122|159->131|159->131|159->131|159->131|186->158|186->158|186->158|187->159|187->159|187->159|188->160|188->160|188->160|189->161|189->161|189->161|190->162|190->162|190->162|191->163|191->163|191->163|192->164|192->164|192->164|193->165|193->165|193->165|194->166|194->166|194->166|195->167|195->167|195->167|196->168|196->168|196->168|197->169|197->169|197->169|198->170|198->170|198->170|199->171|199->171|199->171|201->173|201->173|202->174|203->175|203->175
                  -- GENERATED --
              */
          