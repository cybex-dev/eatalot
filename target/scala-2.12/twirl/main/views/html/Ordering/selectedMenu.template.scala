
package views.html.Ordering

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import play.data._
import play.core.j.PlayFormsMagicForJava._

object selectedMenu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Int,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(menuType: Int):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.17*/("""

"""),format.raw/*3.1*/("""<div class="nav-menu-type-wrapper">
    """),_display_(/*4.6*/menuType/*4.14*/ match/*4.20*/{/*5.9*/case 0 =>/*5.18*/ {_display_(Seq[Any](format.raw/*5.20*/("""
            """),format.raw/*6.13*/("""<div class="nav-bar">
                <ul>
                    <li><a class="selected_menu" href=""""),_display_(/*8.57*/controllers/*8.68*/.Order.routes.OrderController.switchMenu(0)),format.raw/*8.111*/("""">Breakfast</a></li>
                    <li><a href=""""),_display_(/*9.35*/controllers/*9.46*/.Order.routes.OrderController.switchMenu(1)),format.raw/*9.89*/("""">Lunch</a></li>
                    <li><a href=""""),_display_(/*10.35*/controllers/*10.46*/.Order.routes.OrderController.switchMenu(2)),format.raw/*10.89*/("""">Dinner</a></li>
                    <li><a href=""""),_display_(/*11.35*/controllers/*11.46*/.Order.routes.OrderController.switchMenu(3)),format.raw/*11.89*/("""">Desert</a></li>
                    <li><a href=""""),_display_(/*12.35*/controllers/*12.46*/.Order.routes.OrderController.switchMenu(4)),format.raw/*12.89*/("""">Snacks</a></li>
                </ul>
            </div>
        """)))}/*16.9*/case 1 =>/*16.18*/ {_display_(Seq[Any](format.raw/*16.20*/("""
            """),format.raw/*17.13*/("""<div class="nav-bar">
                <ul>
                    <li><a href=""""),_display_(/*19.35*/controllers/*19.46*/.Order.routes.OrderController.switchMenu(0)),format.raw/*19.89*/("""">Breakfast</a></li>
                    <li><a class="selected_menu" href=""""),_display_(/*20.57*/controllers/*20.68*/.Order.routes.OrderController.switchMenu(1)),format.raw/*20.111*/("""">Lunch</a></li>
                    <li><a href=""""),_display_(/*21.35*/controllers/*21.46*/.Order.routes.OrderController.switchMenu(2)),format.raw/*21.89*/("""">Dinner</a></li>
                    <li><a href=""""),_display_(/*22.35*/controllers/*22.46*/.Order.routes.OrderController.switchMenu(3)),format.raw/*22.89*/("""">Desert</a></li>
                    <li><a href=""""),_display_(/*23.35*/controllers/*23.46*/.Order.routes.OrderController.switchMenu(4)),format.raw/*23.89*/("""">Snacks</a></li>
                </ul>
            </div>
        """)))}/*27.9*/case 2 =>/*27.18*/{_display_(Seq[Any](format.raw/*27.19*/("""
            """),format.raw/*28.13*/("""<div class="nav-bar">
                <ul>
                    <li><a href=""""),_display_(/*30.35*/controllers/*30.46*/.Order.routes.OrderController.switchMenu(0)),format.raw/*30.89*/("""">Breakfast</a></li>
                    <li><a href=""""),_display_(/*31.35*/controllers/*31.46*/.Order.routes.OrderController.switchMenu(1)),format.raw/*31.89*/("""">Lunch</a></li>
                    <li><a class="selected_menu" href=""""),_display_(/*32.57*/controllers/*32.68*/.Order.routes.OrderController.switchMenu(2)),format.raw/*32.111*/("""">Dinner</a></li>
                    <li><a href=""""),_display_(/*33.35*/controllers/*33.46*/.Order.routes.OrderController.switchMenu(3)),format.raw/*33.89*/("""">Desert</a></li>
                    <li><a href=""""),_display_(/*34.35*/controllers/*34.46*/.Order.routes.OrderController.switchMenu(4)),format.raw/*34.89*/("""">Snacks</a></li>
                </ul>
            </div>
        """)))}/*38.9*/case 3 =>/*38.18*/{_display_(Seq[Any](format.raw/*38.19*/("""
            """),format.raw/*39.13*/("""<div class="nav-bar">
                <ul>
                    <li><a href=""""),_display_(/*41.35*/controllers/*41.46*/.Order.routes.OrderController.switchMenu(0)),format.raw/*41.89*/("""">Breakfast</a></li>
                    <li><a href=""""),_display_(/*42.35*/controllers/*42.46*/.Order.routes.OrderController.switchMenu(1)),format.raw/*42.89*/("""">Lunch</a></li>
                    <li><a href=""""),_display_(/*43.35*/controllers/*43.46*/.Order.routes.OrderController.switchMenu(2)),format.raw/*43.89*/("""">Dinner</a></li>
                    <li><a class="selected_menu" href=""""),_display_(/*44.57*/controllers/*44.68*/.Order.routes.OrderController.switchMenu(3)),format.raw/*44.111*/("""">Desert</a></li>
                    <li><a href=""""),_display_(/*45.35*/controllers/*45.46*/.Order.routes.OrderController.switchMenu(4)),format.raw/*45.89*/("""">Snacks</a></li>
                </ul>
            </div>
        """)))}/*49.9*/case 4 =>/*49.18*/{_display_(Seq[Any](format.raw/*49.19*/("""
            """),format.raw/*50.13*/("""<div class="nav-bar">
                <ul>
                    <li><a href=""""),_display_(/*52.35*/controllers/*52.46*/.Order.routes.OrderController.switchMenu(0)),format.raw/*52.89*/("""">Breakfast</a></li>
                    <li><a href=""""),_display_(/*53.35*/controllers/*53.46*/.Order.routes.OrderController.switchMenu(1)),format.raw/*53.89*/("""">Lunch</a></li>
                    <li><a href=""""),_display_(/*54.35*/controllers/*54.46*/.Order.routes.OrderController.switchMenu(2)),format.raw/*54.89*/("""">Dinner</a></li>
                    <li><a href=""""),_display_(/*55.35*/controllers/*55.46*/.Order.routes.OrderController.switchMenu(3)),format.raw/*55.89*/("""">Desert</a></li>
                    <li><a class="selected_menu" href=""""),_display_(/*56.57*/controllers/*56.68*/.Order.routes.OrderController.switchMenu(4)),format.raw/*56.111*/("""">Snacks</a></li>
                </ul>
            </div>
        """)))}}),format.raw/*60.6*/("""
"""),format.raw/*61.1*/("""</div>"""))
      }
    }
  }

  def render(menuType:Int): play.twirl.api.HtmlFormat.Appendable = apply(menuType)

  def f:((Int) => play.twirl.api.HtmlFormat.Appendable) = (menuType) => apply(menuType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 04:28:36 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/selectedMenu.scala.html
                  HASH: cb25cd38bd82a30337fdaf80238fabbc8315a48b
                  MATRIX: 961->1|1071->16|1099->18|1165->59|1181->67|1195->73|1203->83|1220->92|1259->94|1299->107|1424->206|1443->217|1507->260|1588->315|1607->326|1670->369|1748->420|1768->431|1832->474|1911->526|1931->537|1995->580|2074->632|2094->643|2158->686|2244->763|2262->772|2302->774|2343->787|2447->864|2467->875|2531->918|2635->995|2655->1006|2720->1049|2798->1100|2818->1111|2882->1154|2961->1206|2981->1217|3045->1260|3124->1312|3144->1323|3208->1366|3294->1443|3312->1452|3351->1453|3392->1466|3496->1543|3516->1554|3580->1597|3662->1652|3682->1663|3746->1706|3846->1779|3866->1790|3931->1833|4010->1885|4030->1896|4094->1939|4173->1991|4193->2002|4257->2045|4343->2122|4361->2131|4400->2132|4441->2145|4545->2222|4565->2233|4629->2276|4711->2331|4731->2342|4795->2385|4873->2436|4893->2447|4957->2490|5058->2564|5078->2575|5143->2618|5222->2670|5242->2681|5306->2724|5392->2801|5410->2810|5449->2811|5490->2824|5594->2901|5614->2912|5678->2955|5760->3010|5780->3021|5844->3064|5922->3115|5942->3126|6006->3169|6085->3221|6105->3232|6169->3275|6270->3349|6290->3360|6355->3403|6454->3477|6482->3478
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|36->5|36->5|36->5|37->6|39->8|39->8|39->8|40->9|40->9|40->9|41->10|41->10|41->10|42->11|42->11|42->11|43->12|43->12|43->12|46->16|46->16|46->16|47->17|49->19|49->19|49->19|50->20|50->20|50->20|51->21|51->21|51->21|52->22|52->22|52->22|53->23|53->23|53->23|56->27|56->27|56->27|57->28|59->30|59->30|59->30|60->31|60->31|60->31|61->32|61->32|61->32|62->33|62->33|62->33|63->34|63->34|63->34|66->38|66->38|66->38|67->39|69->41|69->41|69->41|70->42|70->42|70->42|71->43|71->43|71->43|72->44|72->44|72->44|73->45|73->45|73->45|76->49|76->49|76->49|77->50|79->52|79->52|79->52|80->53|80->53|80->53|81->54|81->54|81->54|82->55|82->55|82->55|83->56|83->56|83->56|86->60|87->61
                  -- GENERATED --
              */
          