
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
/*3.2*/import helper._
/*4.2*/import models.Order.CustomerOrder

object createdOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[CustomerOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(list: List[CustomerOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.29*/("""

"""),format.raw/*7.1*/("""<html>
    <table>
        <tr>
            <td>Order Id</td>
            <td>Status</td>
        </tr>
        """),_display_(/*13.10*/for(x <- 0 until list.size()) yield /*13.39*/{_display_(Seq[Any](format.raw/*13.40*/("""
            """),_display_(/*14.14*/form(CSRF(controllers.Order.routes.OrderController.getViewOrder(list.get(x).getOrderId().toString)))/*14.114*/ {_display_(Seq[Any](format.raw/*14.116*/("""
                """),format.raw/*15.17*/("""<tr>
                    <td>"""),_display_(/*16.26*/list/*16.30*/.get(x).getOrderId),format.raw/*16.48*/("""</td>
                    <td>"""),_display_(/*17.26*/list/*17.30*/.get(x).getStatusId),format.raw/*17.49*/("""</td>
                    <td><button type="submit">View</button></td>
                </tr>

            """)))}),format.raw/*21.14*/("""
        """)))}),format.raw/*22.10*/("""
    """),format.raw/*23.5*/("""</table>
</html>"""))
      }
    }
  }

  def render(list:List[CustomerOrder]): play.twirl.api.HtmlFormat.Appendable = apply(list)

  def f:((List[CustomerOrder]) => play.twirl.api.HtmlFormat.Appendable) = (list) => apply(list)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/createdOrders.scala.html
                  HASH: b06589936d95bc2cfae016e859fb4e72069594cb
                  MATRIX: 660->1|689->25|712->42|1071->77|1193->104|1221->106|1361->219|1406->248|1445->249|1486->263|1596->363|1637->365|1682->382|1739->412|1752->416|1791->434|1849->465|1862->469|1902->488|2040->595|2081->605|2113->610
                  LINES: 24->1|25->3|26->4|31->5|36->5|38->7|44->13|44->13|44->13|45->14|45->14|45->14|46->15|47->16|47->16|47->16|48->17|48->17|48->17|52->21|53->22|54->23
                  -- GENERATED --
              */
          