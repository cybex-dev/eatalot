
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
    <table>
        <tr>
            <td>Description</td>
            <td>Quantity</td>
            <td>Cost</td>
        </tr>
        """),_display_(/*14.10*/for(x <- 0 until list.size()) yield /*14.39*/{_display_(Seq[Any](format.raw/*14.40*/("""
            """),format.raw/*15.13*/("""<tr>
                <td>"""),_display_(/*16.22*/list/*16.26*/.get(x).getObject2().getDescription()),format.raw/*16.63*/("""</td>
                <td>"""),_display_(/*17.22*/list/*17.26*/.get(x).getObject1().getOrderQty()),format.raw/*17.60*/("""</td>
                <td>"""),_display_(/*18.22*/list/*18.26*/.get(x).getObject2().getCost()),format.raw/*18.56*/("""</td>
            </tr>
        """)))}),format.raw/*20.10*/("""
    """),format.raw/*21.5*/("""</table>
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
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/viewOrder.scala.html
                  HASH: d60b96c3ee1c8110357b90b46d5d63dbd1e195fd
                  MATRIX: 660->1|689->25|734->64|1083->85|1213->120|1241->122|1412->266|1457->295|1496->296|1537->309|1590->335|1603->339|1661->376|1715->403|1728->407|1783->441|1837->468|1850->472|1901->502|1965->535|1997->540
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|49->18|49->18|49->18|51->20|52->21
                  -- GENERATED --
              */
          