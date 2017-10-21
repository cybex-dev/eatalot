
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
/*3.2*/import helper._
/*4.2*/import models.Order.Meal
/*5.2*/import controllers.Application.AppTags

object menu extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Meal],Integer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(meals: util.List[Meal], menuType: Integer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.45*/("""

"""),format.raw/*8.1*/("""<!DOCTYPE html>
<html>
    <head>
        <link href=""""),_display_(/*11.22*/routes/*11.28*/.Assets.versioned("stylesheets/mobile.css")),format.raw/*11.71*/("""" rel="stylesheet" />
        <meta name="viewport" content="width=device-width">
    </head>
    <body>
        """),format.raw/*15.79*/("""
        """),_display_(/*16.10*/header()),format.raw/*16.18*/("""
        """),_display_(/*17.10*/selectedMenu(menuType: Integer)),format.raw/*17.41*/("""
        """),_display_(/*18.10*/if(meals.size() == 0)/*18.31*/{_display_(Seq[Any](format.raw/*18.32*/("""
            """),format.raw/*19.13*/("""<p>List is empty</p>
        """)))}/*20.11*/else/*20.16*/{_display_(Seq[Any](format.raw/*20.17*/("""
            """),format.raw/*21.13*/("""<table>
                <tr class="bottom_row">
                    <td><h3>Meal</h3></td>
                    <td><h3>Price</h3></td>
                    """),format.raw/*25.40*/("""
                """),format.raw/*26.17*/("""</tr>
            """),_display_(/*27.14*/for(x <- 0 until meals.size) yield /*27.42*/ {_display_(Seq[Any](format.raw/*27.44*/("""
                """),_display_(/*28.18*/form(CSRF(controllers.Order.routes.OrderController.addMealToOrder(meals.get(x).getMealId())))/*28.111*/ {_display_(Seq[Any](format.raw/*28.113*/("""
                    """),format.raw/*29.21*/("""<tr>
                        <td>"""),_display_(/*30.30*/meals/*30.35*/.get(x).getDescription()),format.raw/*30.59*/("""</td>
                        <td>"""),_display_(/*31.30*/meals/*31.35*/.get(x).getCost()),format.raw/*31.52*/("""</td>
                        """),format.raw/*32.46*/("""
                    """),format.raw/*33.21*/("""</tr>
                    <tr class="bottom_row">
                        <td><img class="image" src=""""),_display_(/*35.54*/routes/*35.60*/.Assets.versioned("images/menu/" + meals.get(x).getImage)),format.raw/*35.117*/(""""/></td>
                        """),format.raw/*36.38*/("""
                        """),format.raw/*37.25*/("""<td colspan="2"><button type="submit">Add to order</button></td>
                    </tr>
                """)))}),format.raw/*39.18*/("""
            """)))}),format.raw/*40.14*/("""
            """),format.raw/*41.13*/("""</table>
        """)))}),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</body>
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
                  DATE: Sun Oct 22 04:28:36 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/menu.scala.html
                  HASH: fe00a95ee49af6322224666d93d961a652063c63
                  MATRIX: 660->1|684->20|707->37|739->63|1098->103|1236->146|1264->148|1346->203|1361->209|1425->252|1566->435|1603->445|1632->453|1669->463|1721->494|1758->504|1788->525|1827->526|1868->539|1917->570|1930->575|1969->576|2010->589|2193->763|2238->780|2284->799|2328->827|2368->829|2413->847|2516->940|2557->942|2606->963|2667->997|2681->1002|2726->1026|2788->1061|2802->1066|2840->1083|2898->1134|2947->1155|3077->1258|3092->1264|3171->1321|3232->1367|3285->1392|3424->1500|3469->1514|3510->1527|3559->1545|3591->1550
                  LINES: 24->1|25->3|26->4|27->5|32->6|37->6|39->8|42->11|42->11|42->11|46->15|47->16|47->16|48->17|48->17|49->18|49->18|49->18|50->19|51->20|51->20|51->20|52->21|56->25|57->26|58->27|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|62->31|62->31|63->32|64->33|66->35|66->35|66->35|67->36|68->37|70->39|71->40|72->41|73->42|74->43
                  -- GENERATED --
              */
          