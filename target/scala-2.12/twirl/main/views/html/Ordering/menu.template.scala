
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
/*1.2*/import java.util
/*2.2*/import helper._
/*3.2*/import models.Order.Meal
/*4.2*/import views.html.Ordering.selectedMenu
/*5.2*/import controllers.Application.AppTags

object menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Meal],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(meals: util.List[Meal], menuType: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.45*/("""

"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html>
    <body>
        """),format.raw/*11.79*/("""
        """),_display_(/*12.10*/selectedMenu/*12.22*/.render(menuType)),format.raw/*12.39*/("""
        """),_display_(/*13.10*/if(meals.size() == 0)/*13.31*/{_display_(Seq[Any](format.raw/*13.32*/("""
            """),format.raw/*14.13*/("""<p>List is empty</p>
        """)))}/*15.11*/else/*15.16*/{_display_(Seq[Any](format.raw/*15.17*/("""
            """),format.raw/*16.13*/("""<table>
                <tr class="bottom_row">
                    <td><h3>Meal</h3></td>
                    <td><h3>Price</h3></td>
                    """),format.raw/*20.40*/("""
                """),format.raw/*21.17*/("""</tr>
                """),_display_(/*22.18*/for(x <- 0 until meals.size) yield /*22.46*/ {_display_(Seq[Any](format.raw/*22.48*/("""
                    """),_display_(/*23.22*/form(CSRF(controllers.Order.routes.OrderController.addMealToOrder(meals.get(x).getMealId())))/*23.115*/ {_display_(Seq[Any](format.raw/*23.117*/("""
                        """),format.raw/*24.25*/("""<tr>
                            <td>"""),_display_(/*25.34*/meals/*25.39*/.get(x).getDescription()),format.raw/*25.63*/("""</td>
                            <td>"""),_display_(/*26.34*/meals/*26.39*/.get(x).getCost()),format.raw/*26.56*/("""</td>
                            """),format.raw/*27.50*/("""
                        """),format.raw/*28.25*/("""</tr>
                        <tr class="bottom_row">
                            <td><img class="image" src=""""),_display_(/*30.58*/routes/*30.64*/.Assets.versioned("images/menu/" + meals.get(x).getImage)),format.raw/*30.121*/(""""/></td>
                            """),format.raw/*31.42*/("""
                            """),format.raw/*32.29*/("""<td colspan="2"><button type="submit">Add to order</button></td>
                        </tr>
                    """)))}),format.raw/*34.22*/("""
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</table>
        """)))}),format.raw/*37.10*/("""
    """),format.raw/*38.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(meals:util.List[Meal],menuType:Integer): play.twirl.api.HtmlFormat.Appendable = apply(meals,menuType)

  def f:((util.List[Meal],Integer) => play.twirl.api.HtmlFormat.Appendable) = (meals,menuType) => apply(meals,menuType)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 12:05:34 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Ordering/menu.scala.html
                  HASH: e711e7441013a56e9f6f85bfa7e4faffb2deeac7
                  MATRIX: 660->1|684->19|707->36|739->62|786->103|1145->143|1283->186|1311->188|1381->300|1418->310|1439->322|1477->339|1514->349|1544->370|1583->371|1624->384|1673->415|1686->420|1725->421|1766->434|1949->608|1994->625|2044->648|2088->676|2128->678|2177->700|2280->793|2321->795|2374->820|2439->858|2453->863|2498->887|2564->926|2578->931|2616->948|2678->1003|2731->1028|2869->1139|2884->1145|2963->1202|3028->1252|3085->1281|3232->1397|3281->1415|3322->1428|3371->1446|3403->1451
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|38->6|40->8|43->11|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|52->20|53->21|54->22|54->22|54->22|55->23|55->23|55->23|56->24|57->25|57->25|57->25|58->26|58->26|58->26|59->27|60->28|62->30|62->30|62->30|63->31|64->32|66->34|67->35|68->36|69->37|70->38
                  -- GENERATED --
              */
          