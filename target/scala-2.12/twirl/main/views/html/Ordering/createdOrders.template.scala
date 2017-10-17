
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
/*1.2*/import models.Order.CustomerOrder
/*2.2*/import java.util.List
/*3.2*/import helper._

object createdOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[CustomerOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(list: List[CustomerOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*4.29*/("""

"""),format.raw/*6.1*/("""<html>
    <table>
        <tr>
            <td>Order Id</td>
            <td>Status</td>
        </tr>
        """),_display_(/*12.10*/for(x <- 0 until list.size()) yield /*12.39*/{_display_(Seq[Any](format.raw/*12.40*/("""
            """),_display_(/*13.14*/form(CSRF(controllers.Order.routes.OrderController.getViewOrder(list.get(x).getOrderId().toString)))/*13.114*/ {_display_(Seq[Any](format.raw/*13.116*/("""
                """),format.raw/*14.17*/("""<tr>
                    <td>"""),_display_(/*15.26*/list/*15.30*/.get(x).getOrderId),format.raw/*15.48*/("""</td>
                    <td>"""),_display_(/*16.26*/list/*16.30*/.get(x).getStatusId),format.raw/*16.49*/("""</td>
                    <td><button type="submit">View</button></td>
                </tr>

            """)))}),format.raw/*20.14*/("""
        """)))}),format.raw/*21.10*/("""
    """),format.raw/*22.5*/("""</table>
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
                  DATE: Sat Oct 07 12:53:16 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Ordering/createdOrders.scala.html
                  HASH: 86239d5c49f1671abaed503c4cbcf230ce1c0eb9
                  MATRIX: 660->1|701->36|730->59|1071->76|1193->103|1221->105|1361->218|1406->247|1445->248|1486->262|1596->362|1637->364|1682->381|1739->411|1752->415|1791->433|1849->464|1862->468|1902->487|2040->594|2081->604|2113->609
                  LINES: 24->1|25->2|26->3|31->4|36->4|38->6|44->12|44->12|44->12|45->13|45->13|45->13|46->14|47->15|47->15|47->15|48->16|48->16|48->16|52->20|53->21|54->22
                  -- GENERATED --
              */
          