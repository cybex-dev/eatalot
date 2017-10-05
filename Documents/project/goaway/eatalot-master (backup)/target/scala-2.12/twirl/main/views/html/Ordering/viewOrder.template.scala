
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
/*2.2*/import models.Order.Meal
/*3.2*/import models.Order.MealOrder
/*4.2*/import utility.Pair
/*5.2*/import helper._

object viewOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[Pair[MealOrder, Meal]],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(list: List[Pair[MealOrder, Meal]]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*6.37*/("""

"""),format.raw/*8.1*/("""<html>
    <table>
        <tr>
            <td>Description</td>
            <td>Quantity</td>
            <td>Cost</td>
        </tr>
        """),_display_(/*15.10*/for(x <- 0 until list.size()) yield /*15.39*/{_display_(Seq[Any](format.raw/*15.40*/("""
            """),format.raw/*16.13*/("""<tr>
                <td>"""),_display_(/*17.22*/list/*17.26*/.get(x).getObject2().getDescription()),format.raw/*17.63*/("""</td>
                <td>"""),_display_(/*18.22*/list/*18.26*/.get(x).getObject1().getOrderQty()),format.raw/*18.60*/("""</td>
                <td>"""),_display_(/*19.22*/list/*19.26*/.get(x).getObject2().getCost()),format.raw/*19.56*/("""</td>
            </tr>
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</table>
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
                  DATE: Thu Oct 05 23:12:56 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master/app/views/Ordering/viewOrder.scala.html
                  HASH: 352490fe8dfb60b1681e36a910011769d085eb47
                  MATRIX: 660->1|689->24|721->50|758->81|785->102|1130->119|1260->154|1288->156|1459->300|1504->329|1543->330|1584->343|1637->369|1650->373|1708->410|1762->437|1775->441|1830->475|1884->502|1897->506|1948->536|2012->569|2044->574
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->6|38->6|40->8|47->15|47->15|47->15|48->16|49->17|49->17|49->17|50->18|50->18|50->18|51->19|51->19|51->19|53->21|54->22
                  -- GENERATED --
              */
          