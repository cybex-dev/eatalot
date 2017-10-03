
package views.html.ordering

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
/*2.2*/import utility.Pair
/*3.2*/import models.ordering.Meal
/*4.2*/import models.ordering.MealOrder
/*5.2*/import models.ordering.CustomerOrder
/*6.2*/import helper._

object cart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[util.List[Pair[MealOrder, Meal]],CustomerOrder,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(meals: util.List[Pair[MealOrder, Meal]], order: CustomerOrder):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*7.65*/("""

"""),format.raw/*9.1*/("""<!DOCTYPE html>

<html>
    <body>
        """),format.raw/*13.55*/("""
        """),_display_(/*14.10*/if(meals != null && meals.size() == 0)/*14.48*/{_display_(Seq[Any](format.raw/*14.49*/("""
            """),format.raw/*15.13*/("""<p><i>dust</i></p>
        """)))}/*16.10*/else/*16.14*/{_display_(Seq[Any](format.raw/*16.15*/("""
            """),_display_(/*17.14*/for(x <- 0 until meals.size()) yield /*17.44*/ {_display_(Seq[Any](format.raw/*17.46*/("""
                """),format.raw/*18.68*/("""
                """),format.raw/*19.49*/("""
                """),_display_(/*20.18*/form(CSRF(routes.OrderController.removeMealFromOrder(meals.get(x).getObject1.getMealId)))/*20.107*/ {_display_(Seq[Any](format.raw/*20.109*/("""
                    """),format.raw/*21.21*/("""<table>
                        <tr>
                            <td>Meal</td>
                            <td>Price</td>
                            <td>Status</td>
                        </tr>
                        <tr>
                            <td>"""),_display_(/*28.34*/meals/*28.39*/.get(x).getObject2.getDescription),format.raw/*28.72*/("""</td>
                            <td>"""),_display_(/*29.34*/meals/*29.39*/.get(x).getObject2.getCost),format.raw/*29.65*/("""</td>
                            <td>$$Status</td>
                        </tr>
                        <tr>
                            <td>$$Image</td>
                            <td>Quantity: """),_display_(/*34.44*/meals/*34.49*/.get(x).getObject1.getOrderQty),format.raw/*34.79*/("""</td>
                            <td><button type="submit" name="action" value="remove">Remove Meal</button></td>
                        </tr>
                    </table>
                """)))}),format.raw/*38.18*/("""
            """)))}),format.raw/*39.14*/("""
            """),format.raw/*40.13*/("""<button type="submit" name="action" value="submit">Submit Order</button>
        """)))}),format.raw/*41.10*/("""
    """),format.raw/*42.5*/("""</body>
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
<<<<<<< HEAD
                  DATE: Sun Sep 24 23:41:09 SAST 2017
=======
                  DATE: Tue Oct 03 04:34:57 SAST 2017
>>>>>>> Order-Management-Devel
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/ordering/cart.scala.html
                  HASH: a33a98af2226874730416170f14ea23d6208d525
                  MATRIX: 660->1|684->19|711->40|746->69|786->103|830->141|1189->158|1347->221|1375->223|1446->312|1483->322|1530->360|1569->361|1610->374|1657->402|1670->406|1709->407|1750->421|1796->451|1836->453|1881->521|1926->570|1971->588|2070->677|2111->679|2160->700|2445->958|2459->963|2513->996|2579->1035|2593->1040|2640->1066|2866->1265|2880->1270|2931->1300|3153->1491|3198->1505|3239->1518|3352->1600|3384->1605
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->7|39->7|41->9|45->13|46->14|46->14|46->14|47->15|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|52->20|52->20|52->20|53->21|60->28|60->28|60->28|61->29|61->29|61->29|66->34|66->34|66->34|70->38|71->39|72->40|73->41|74->42
                  -- GENERATED --
              */
          