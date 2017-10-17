
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
                    """),_display_(/*16.22*/if(customer.isStudent)/*16.44*/{_display_(Seq[Any](format.raw/*16.45*/("""
                        """),format.raw/*17.25*/("""<td>Discount:</td>
                        <td>%15.00</td>
                    """)))}/*19.22*/else/*19.26*/{_display_(Seq[Any](format.raw/*19.27*/("""
                        """),format.raw/*20.25*/("""<td>Discount:</td>
                        <td>%0.00</td>
                    """)))}),format.raw/*22.22*/("""
                """),format.raw/*23.17*/("""</tr>
                <tr>
                    """),_display_(/*25.22*/if(customer.isStudent)/*25.44*/{_display_(Seq[Any](format.raw/*25.45*/("""
                        """),format.raw/*26.25*/("""<td>Total Cost:</td>
                        <td>R """),_display_(/*27.32*/(order.getPaymentObject().getAmount()- order.getPaymentObject().getAmount() * 0.15)),format.raw/*27.115*/("""</td>
                    """)))}/*28.22*/else/*28.26*/{_display_(Seq[Any](format.raw/*28.27*/("""
                        """),format.raw/*29.25*/("""<td>Total Cost:</td>
                        <td>R """),_display_(/*30.32*/order/*30.37*/.getPaymentObject().getAmount()),format.raw/*30.68*/("""</td>
                    """)))}),format.raw/*31.22*/("""
                """),format.raw/*32.17*/("""</tr>
                <tr>
                    <td>Select Payment Option:</td>

                    """),format.raw/*36.100*/("""
                    """),_display_(/*37.22*/if(customer.getBalanceNumeric >= order.getPaymentObject.getAmount)/*37.88*/{_display_(Seq[Any](format.raw/*37.89*/("""
                        """),format.raw/*38.25*/("""<td>
                            <label for="credit"></label>
                            <input id="credit" type="radio" name="payment" value="credit">
                        </td>
                    """)))}/*42.22*/else/*42.26*/{_display_(Seq[Any](format.raw/*42.27*/("""
                        """),format.raw/*43.25*/("""<td>
                            <p>Insufficient balance for credit payment.</p>
                        </td>
                    """)))}),format.raw/*46.22*/("""
                    """),format.raw/*47.29*/("""
                        """),format.raw/*48.69*/("""
                        """),format.raw/*49.63*/("""
                        """),format.raw/*50.91*/("""
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
                    <td>
                        <p>
                            """),format.raw/*74.42*/("""
                            """),format.raw/*75.29*/("""Once you click submit,<br>
                            your order status will<br>
                            change to "Pending" where it<br>
                            awaits approval of our staff.<br>
                            Once approved it will enter<br>
                            the "Processing" stage then<br>
                            into "Delivering".<br>
                            You will be notified of these<br>
                            status changes and can check<br>
                            up on them at any time.
                        </p>
                    </td>
                </tr>
                <tr>
                    <td>
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
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/submitCart.scala.html
                  HASH: a05b0b30448e935a9207f788c7b4f331dd9e39e4
                  MATRIX: 660->1|694->29|735->64|1097->103|1234->145|1262->147|1315->174|1388->239|1427->241|1468->254|1586->345|1600->350|1652->381|1749->451|1780->473|1819->474|1872->499|1971->579|1984->583|2023->584|2076->609|2186->688|2231->705|2306->753|2337->775|2376->776|2429->801|2508->853|2613->936|2659->963|2672->967|2711->968|2764->993|2843->1045|2857->1050|2909->1081|2967->1108|3012->1125|3141->1304|3190->1326|3265->1392|3304->1393|3357->1418|3580->1622|3593->1626|3632->1627|3685->1652|3848->1784|3897->1813|3950->1882|4003->1945|4056->2036|4105->2066|4154->2087|4509->2489|4562->2530|4615->2579|4668->2604|5119->3040|5176->3069|6021->3883|6053->3888
                  LINES: 24->1|25->2|26->3|31->5|36->5|38->7|40->9|40->9|40->9|41->10|44->13|44->13|44->13|47->16|47->16|47->16|48->17|50->19|50->19|50->19|51->20|53->22|54->23|56->25|56->25|56->25|57->26|58->27|58->27|59->28|59->28|59->28|60->29|61->30|61->30|61->30|62->31|63->32|67->36|68->37|68->37|68->37|69->38|73->42|73->42|73->42|74->43|77->46|78->47|79->48|80->49|81->50|82->51|83->52|91->60|92->61|93->62|94->63|105->74|106->75|125->94|126->95
                  -- GENERATED --
              */
          