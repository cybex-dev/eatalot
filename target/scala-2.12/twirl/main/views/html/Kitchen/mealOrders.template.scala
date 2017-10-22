
package views.html.Kitchen

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
/*1.2*/import java.util.List
/*3.2*/import helper._
/*4.2*/import models.Order.{Meal, MealOrder}
/*5.2*/import utility.Pair

object mealOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Pair[MealOrder, Meal]],String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(list: List[Pair[MealOrder, Meal]], status: String):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.53*/("""

"""),format.raw/*8.1*/("""<html>
    <table>
        <tr>
            <td>Description</td>
            <td>Type</td>
            <td>Order Quantity</td>
        </tr>

        """),_display_(/*16.10*/form(CSRF(controllers.Order.routes.KitchenController.updateOrderStatus(list.get(0).getObject1().getOrderId)))/*16.119*/ {_display_(Seq[Any](format.raw/*16.121*/("""
            """),_display_(/*17.14*/for(x <- 0 until list.size()) yield /*17.43*/ {_display_(Seq[Any](format.raw/*17.45*/("""
                """),format.raw/*18.17*/("""<tr>
                    <td>"""),_display_(/*19.26*/list/*19.30*/.get(x).getObject2().getDescription),format.raw/*19.65*/("""</td>
                    <td>"""),_display_(/*20.26*/list/*20.30*/.get(x).getObject2().getType),format.raw/*20.58*/("""</td>
                    <td>"""),_display_(/*21.26*/list/*21.30*/.get(x).getObject1().getOrderQty),format.raw/*21.62*/("""</td>
                </tr>
            """)))}),format.raw/*23.14*/("""
            """),_display_(/*24.14*/status/*24.20*/ match/*24.26*/{/*25.17*/case "pending" =>/*25.34*/ {_display_(Seq[Any](format.raw/*25.36*/("""
                    """),format.raw/*26.21*/("""<tr>
                        <td><button type="submit" name="action" value="process">Process</button></td>
                    </tr>
                """)))}/*30.17*/case "processing" =>/*30.37*/ {_display_(Seq[Any](format.raw/*30.39*/("""
                    """),format.raw/*31.21*/("""<tr>
                        <td><button type="submit" name="action" value="deliver">Ready to deliver</button></td>
                    </tr>
                """)))}/*35.17*/case _ =>/*35.26*/{_display_(Seq[Any](format.raw/*35.27*/("""

                """)))}}),format.raw/*38.14*/("""
            """),format.raw/*39.13*/("""<tr>
                <td><button type="submit" name="action" value="cancel">Cancel Order</button></td>
            </tr>
        """)))}),format.raw/*42.10*/("""
    """),format.raw/*43.5*/("""</table>
</html>"""))
      }
    }
  }

  def render(list:List[Pair[MealOrder, Meal]],status:String): play.twirl.api.HtmlFormat.Appendable = apply(list,status)

  def f:((List[Pair[MealOrder, Meal]],String) => play.twirl.api.HtmlFormat.Appendable) = (list,status) => apply(list,status)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 11:23:04 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Kitchen/mealOrders.scala.html
                  HASH: c283867ae5753fbf3222230df229a78ca27d937a
                  MATRIX: 659->1|688->25|711->42|756->81|1113->102|1259->153|1287->155|1465->306|1584->415|1625->417|1666->431|1711->460|1751->462|1796->479|1853->509|1866->513|1922->548|1980->579|1993->583|2042->611|2100->642|2113->646|2166->678|2238->719|2279->733|2294->739|2309->745|2319->763|2345->780|2385->782|2434->803|2603->970|2632->990|2672->992|2721->1013|2899->1189|2917->1198|2956->1199|3007->1232|3048->1245|3209->1375|3241->1380
                  LINES: 24->1|25->3|26->4|27->5|32->6|37->6|39->8|47->16|47->16|47->16|48->17|48->17|48->17|49->18|50->19|50->19|50->19|51->20|51->20|51->20|52->21|52->21|52->21|54->23|55->24|55->24|55->24|55->25|55->25|55->25|56->26|59->30|59->30|59->30|60->31|63->35|63->35|63->35|65->38|66->39|69->42|70->43
                  -- GENERATED --
              */
          