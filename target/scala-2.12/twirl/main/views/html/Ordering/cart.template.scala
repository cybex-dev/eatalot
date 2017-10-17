
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
/*4.2*/import models.Order.{CustomerOrder, Meal, MealOrder}
/*5.2*/import utility.Pair

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Pair[MealOrder, Meal]],CustomerOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(meals: util.List[Pair[MealOrder, Meal]], order: CustomerOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.65*/("""

"""),format.raw/*8.1*/("""<!DOCTYPE html>

<html>
    <body>
        """),format.raw/*12.55*/("""
        """),_display_(/*13.10*/if(meals != null && meals.size() == 0)/*13.48*/{_display_(Seq[Any](format.raw/*13.49*/("""
            """),format.raw/*14.13*/("""<p><i>dust</i></p>
        """)))}/*15.10*/else/*15.14*/{_display_(Seq[Any](format.raw/*15.15*/("""
            """),format.raw/*16.13*/("""<table>
                """),_display_(/*17.18*/for(x <- 0 until meals.size()) yield /*17.48*/ {_display_(Seq[Any](format.raw/*17.50*/("""
                    """),_display_(/*18.22*/form(CSRF(controllers.Order.routes.OrderController.removeMealFromOrder(meals.get(x).getObject1.getMealId)))/*18.129*/ {_display_(Seq[Any](format.raw/*18.131*/("""
                        """),format.raw/*19.25*/("""<tr>
                            <td>Meal</td>
                            <td>Price</td>
                            <td>Status</td>
                        </tr>
                        <tr>
                            <td>"""),_display_(/*25.34*/meals/*25.39*/.get(x).getObject2.getDescription),format.raw/*25.72*/("""</td>
                            <td>"""),_display_(/*26.34*/meals/*26.39*/.get(x).getObject2.getCost),format.raw/*26.65*/("""</td>
                            <td>$$Status</td>
                        </tr>
                        <tr>
                            <td>$$Image</td>
                            <td>Quantity: """),_display_(/*31.44*/meals/*31.49*/.get(x).getObject1.getOrderQty),format.raw/*31.79*/("""</td>
                            <td><button type="submit" name="action" value="remove">Remove Meal</button></td>
                        </tr>
                    """)))}),format.raw/*34.22*/("""
                """)))}),format.raw/*35.18*/("""
            """),format.raw/*36.13*/("""</table>
            <a href=""""),_display_(/*37.23*/controllers/*37.34*/.Order.routes.OrderController.getSubmitPage()),format.raw/*37.79*/("""">Submit Cart</a>
        """)))}),format.raw/*38.10*/("""
    """),format.raw/*39.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(meals:util.List[Pair[MealOrder, Meal]],order:CustomerOrder): play.twirl.api.HtmlFormat.Appendable = apply(meals,order)

  def f:((util.List[Pair[MealOrder, Meal]],CustomerOrder) => play.twirl.api.HtmlFormat.Appendable) = (meals,order) => apply(meals,order)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/cart.scala.html
                  HASH: dc9bcbf6409855fcab23ddc76cab488c80c43c36
                  MATRIX: 660->1|684->20|707->37|767->91|1130->112|1288->175|1316->177|1387->266|1424->276|1471->314|1510->315|1551->328|1598->356|1611->360|1650->361|1691->374|1743->399|1789->429|1829->431|1878->453|1995->560|2036->562|2089->587|2342->813|2356->818|2410->851|2476->890|2490->895|2537->921|2763->1120|2777->1125|2828->1155|3025->1321|3074->1339|3115->1352|3173->1383|3193->1394|3259->1439|3317->1466|3349->1471
                  LINES: 24->1|25->3|26->4|27->5|32->6|37->6|39->8|43->12|44->13|44->13|44->13|45->14|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|56->25|56->25|56->25|57->26|57->26|57->26|62->31|62->31|62->31|65->34|66->35|67->36|68->37|68->37|68->37|69->38|70->39
                  -- GENERATED --
              */
          