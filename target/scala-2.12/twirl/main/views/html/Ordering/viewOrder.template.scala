
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
/*1.2*/import java.util.List
/*3.2*/import models.Order.{Meal, MealOrder}
/*4.2*/import utility.Pair

object viewOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Pair[MealOrder, Meal]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(list: List[Pair[MealOrder, Meal]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.37*/("""

"""),format.raw/*7.1*/("""<html>
    <div class="center-wrapper">
        <table class="fill-wrapper">
            <tr class="bottom_row">
                <th class="space-cell-big">Description</th>
                <th>Quantity</th>
                <th>Cost</th>
            </tr>
            """),_display_(/*15.14*/for(x <- 0 until list.size()) yield /*15.43*/{_display_(Seq[Any](format.raw/*15.44*/("""
                """),format.raw/*16.17*/("""<tr class="bottom_row">
                    <td class="space-cell-small">"""),_display_(/*17.51*/list/*17.55*/.get(x).getObject2.getDescription),format.raw/*17.88*/("""</td>
                    <td>"""),_display_(/*18.26*/list/*18.30*/.get(x).getObject1.getOrderQty),format.raw/*18.60*/("""</td>
                    <td>"""),_display_(/*19.26*/list/*19.30*/.get(x).getObject2.getCost),format.raw/*19.56*/("""</td>
                </tr>
            """)))}),format.raw/*21.14*/("""
        """),format.raw/*22.9*/("""</table>
    </div>
</html>"""))
      }
    }
  }

  def render(list:List[Pair[MealOrder, Meal]]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[Pair[MealOrder, Meal]]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 15:01:05 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Ordering/viewOrder.scala.html
                  HASH: 4e6f82371a18ab7a205d3841675118c0b47c987d
                  MATRIX: 660->1|689->25|734->64|1083->85|1213->120|1241->122|1536->390|1581->419|1620->420|1665->437|1766->511|1779->515|1833->548|1891->579|1904->583|1955->613|2013->644|2026->648|2073->674|2145->715|2181->724
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|46->15|46->15|46->15|47->16|48->17|48->17|48->17|49->18|49->18|49->18|50->19|50->19|50->19|52->21|53->22
                  -- GENERATED --
              */
          