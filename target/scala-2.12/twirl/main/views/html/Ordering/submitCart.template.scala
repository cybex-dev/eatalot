
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
/*2.2*/import helper.form
/*3.2*/import helper.CSRF
/*4.2*/import models.User.Customer

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
                  DATE: Sat Oct 14 15:15:56 SAST 2017
                  SOURCE: /home/dylan/Documents/project/goaway/eatalot-master (backup)/Order-Management-Devel/app/views/Ordering/submitCart.scala.html
                  HASH: 99c643993a642267ac21e9449879cfc97b5c7f9f
                  MATRIX: 660->1|701->36|727->56|753->76|1106->105|1243->147|1271->149|1324->176|1397->241|1436->243|1477->256|1595->347|1609->352|1661->383|1758->453|1789->475|1828->476|1881->501|1980->581|1993->585|2032->586|2085->611|2195->690|2240->707|2315->755|2346->777|2385->778|2438->803|2517->855|2622->938|2668->965|2681->969|2720->970|2773->995|2852->1047|2866->1052|2918->1083|2976->1110|3021->1127|3150->1306|3199->1328|3274->1394|3313->1395|3366->1420|3589->1624|3602->1628|3641->1629|3694->1654|3857->1786|3906->1815|3959->1884|4012->1947|4065->2038|4114->2068|4163->2089|4518->2491|4571->2532|4624->2581|4677->2606|5128->3042|5185->3071|6030->3885|6062->3890
                  LINES: 24->1|25->2|26->3|27->4|32->5|37->5|39->7|41->9|41->9|41->9|42->10|45->13|45->13|45->13|48->16|48->16|48->16|49->17|51->19|51->19|51->19|52->20|54->22|55->23|57->25|57->25|57->25|58->26|59->27|59->27|60->28|60->28|60->28|61->29|62->30|62->30|62->30|63->31|64->32|68->36|69->37|69->37|69->37|70->38|74->42|74->42|74->42|75->43|78->46|79->47|80->48|81->49|82->50|83->51|84->52|92->60|93->61|94->62|95->63|106->74|107->75|126->94|127->95
                  -- GENERATED --
              */
          