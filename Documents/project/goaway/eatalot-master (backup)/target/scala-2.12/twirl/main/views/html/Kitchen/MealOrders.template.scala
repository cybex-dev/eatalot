
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
/*1.2*/import models.Order.MealOrder
/*2.2*/import models.Order.Meal
/*3.2*/import utility.Pair
/*4.2*/import java.util.List
/*5.2*/import helper._

object MealOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[Pair[MealOrder, Meal]],String,play.twirl.api.HtmlFormat.Appendable] {

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
                  DATE: Mon Oct 02 20:36:43 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Kitchen/mealOrders.scala.html
                  HASH: f59c3f40b6cc21de94cb7d1ab813b15bc3cf7191
                  MATRIX: 659->1|696->32|728->58|755->79|784->102|1137->119|1283->170|1311->172|1489->323|1608->432|1649->434|1690->448|1735->477|1775->479|1820->496|1877->526|1890->530|1946->565|2004->596|2017->600|2066->628|2124->659|2137->663|2190->695|2262->736|2303->750|2318->756|2333->762|2343->780|2369->797|2409->799|2458->820|2627->987|2656->1007|2696->1009|2745->1030|2923->1206|2941->1215|2980->1216|3031->1249|3072->1262|3233->1392|3265->1397
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|38->6|40->8|48->16|48->16|48->16|49->17|49->17|49->17|50->18|51->19|51->19|51->19|52->20|52->20|52->20|53->21|53->21|53->21|55->23|56->24|56->24|56->24|56->25|56->25|56->25|57->26|60->30|60->30|60->30|61->31|64->35|64->35|64->35|66->38|67->39|70->42|71->43
                  -- GENERATED --
              */
          