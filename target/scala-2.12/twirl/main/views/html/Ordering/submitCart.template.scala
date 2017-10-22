
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
/*1.2*/import helper.{CSRF, form}
/*2.2*/import models.Order.CustomerOrder
/*3.2*/import models.User.Customer.Customer

object submitCart extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[CustomerOrder,Customer,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*5.2*/(order: CustomerOrder, customer: Customer):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*5.44*/("""

"""),format.raw/*7.1*/("""<html>
    <body>
        """),_display_(/*9.10*/form(CSRF(controllers.Order.routes.OrderController.submitCart()))/*9.75*/ {_display_(Seq[Any](format.raw/*9.77*/("""
            """),format.raw/*10.13*/("""<table>
                <tr>
                    <td>Cost:</td>
                    <td>R """),_display_(/*13.28*/order/*13.33*/.getPaymentObject().getAmount()),format.raw/*13.64*/("""</td>
                </tr>
                <tr>
                """),_display_(/*16.18*/if(customer.isStudent)/*16.40*/{_display_(Seq[Any](format.raw/*16.41*/("""
                    """),format.raw/*17.21*/("""<td>Discount:</td>
                    <td>%15.00</td>
                """)))}/*19.18*/else/*19.22*/{_display_(Seq[Any](format.raw/*19.23*/("""
                    """),format.raw/*20.21*/("""<td>Discount:</td>
                    <td>%0.00</td>
                """)))}),format.raw/*22.18*/("""
                """),format.raw/*23.17*/("""</tr>
                <tr>
                """),_display_(/*25.18*/if(customer.isStudent)/*25.40*/{_display_(Seq[Any](format.raw/*25.41*/("""
                    """),format.raw/*26.21*/("""<td>Total Cost:</td>
                    <td>R """),_display_(/*27.28*/(order.getPaymentObject().getAmount()- order.getPaymentObject().getAmount() * 0.15)),format.raw/*27.111*/("""</td>
                """)))}/*28.18*/else/*28.22*/{_display_(Seq[Any](format.raw/*28.23*/("""
                    """),format.raw/*29.21*/("""<td>Total Cost:</td>
                    <td>R """),_display_(/*30.28*/order/*30.33*/.getPaymentObject().getAmount()),format.raw/*30.64*/("""</td>
                """)))}),format.raw/*31.18*/("""
                """),format.raw/*32.17*/("""</tr>
                <tr>
                    <td>Select Payment Option:</td>

                    """),format.raw/*36.100*/("""
                    """),_display_(/*37.22*/if(customer.getBalanceNumeric >= order.getPaymentObject.getAmount)/*37.88*/{_display_(Seq[Any](format.raw/*37.89*/("""
                        """),format.raw/*38.25*/("""<td>
                            <label for="credit">Credit</label>
                            <input id="credit" type="radio" name="payment" value="credit">
                        </td>
                    """)))}/*42.22*/else/*42.26*/{_display_(Seq[Any](format.raw/*42.27*/("""
                        """),format.raw/*43.25*/("""<td>
                            <p>Insufficient balance for credit payment.</p>
                        </td>
                    """)))}),format.raw/*46.22*/("""
                    """),format.raw/*47.29*/("""
                    """),format.raw/*48.65*/("""
                    """),format.raw/*49.59*/("""
                    """),format.raw/*50.87*/("""
                    """),format.raw/*51.30*/("""
                    """),format.raw/*52.21*/("""<td>
                        <label for="cash">Cash</label>
                        <input id="cash" type="radio" name="payment" value="cash"/>
                    </td>
                </tr>
                <tr>
                    <td>Select data and time for delivery:</td>
                    <td>
                        """),format.raw/*60.101*/("""
                        """),format.raw/*61.41*/("""
                        """),format.raw/*62.49*/("""
                        """),format.raw/*63.25*/("""<label for="date">Date:</label>
                        <input id="date" type="date" name="date"/>
                    </td>
                    <td>
                        <label for="time">Time:</label>
                        <input id="time" type="time" name="time"/>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <p>
                            """),format.raw/*74.42*/("""
                                """),format.raw/*75.33*/("""Once you click submit,
                                your order status will
                                change to "Pending" where it
                                awaits approval of our staff.
                                Once approved it will enter
                                the "Processing" stage then
                                into "Delivering".
                                You will be notified of these
                                status changes and can check
                                up on them at any time.
                        </p>
                    </td>
                </tr>
                <tr>
                    <td colspan="3" style="float: right">
                        <button type="submit">Submit</button>
                    </td>
                </tr>
            </table>
        """)))}),format.raw/*94.10*/("""
    """),format.raw/*95.5*/("""</body>
</html>"""))
      }
    }
  }

  def render(order:CustomerOrder,customer:Customer): play.twirl.api.HtmlFormat.Appendable = apply(order,customer)

  def f:((CustomerOrder,Customer) => play.twirl.api.HtmlFormat.Appendable) = (order,customer) => apply(order,customer)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 18:57:42 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/Ordering/submitCart.scala.html
                  HASH: d0a785cfce97a5cd3911e0f4d7d858e137cc2f2b
                  MATRIX: 660->1|694->29|735->64|1097->103|1234->145|1262->147|1315->174|1388->239|1427->241|1468->254|1586->345|1600->350|1652->381|1745->447|1776->469|1815->470|1864->491|1955->563|1968->567|2007->568|2056->589|2158->660|2203->677|2274->721|2305->743|2344->744|2393->765|2468->813|2573->896|2615->919|2628->923|2667->924|2716->945|2791->993|2805->998|2857->1029|2911->1052|2956->1069|3085->1248|3134->1270|3209->1336|3248->1337|3301->1362|3530->1572|3543->1576|3582->1577|3635->1602|3798->1734|3847->1763|3896->1828|3945->1887|3994->1974|4043->2004|4092->2025|4447->2427|4500->2468|4553->2517|4606->2542|5069->2990|5130->3023|6008->3870|6040->3875
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|40->9|40->9|40->9|41->10|44->13|44->13|44->13|47->16|47->16|47->16|48->17|50->19|50->19|50->19|51->20|53->22|54->23|56->25|56->25|56->25|57->26|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|67->36|68->37|68->37|68->37|69->38|73->42|73->42|73->42|74->43|77->46|78->47|79->48|80->49|81->50|82->51|83->52|91->60|92->61|93->62|94->63|105->74|106->75|125->94|126->95
                  -- GENERATED --
              */
          