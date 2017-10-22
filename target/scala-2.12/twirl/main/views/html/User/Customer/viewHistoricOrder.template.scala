
package views.html.User.Customer

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
/*1.2*/import Global.Static.masterpage
/*2.2*/import controllers.Application.AppTags
/*3.2*/import helper.{CSRF, form}
/*4.2*/import models.Order.OrderItemDetail
/*5.2*/import utility.DateInterpreterStatic

object viewHistoricOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[OrderItemDetail,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(orderDetails: OrderItemDetail):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/bodyContent/*9.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.17*/("""
    """),format.raw/*10.5*/("""<h1>Order details</h1>
    <br/>
    <div class="split-pane">
        <div class="left container input-container">
            <label># Order</label>
            <label>Amount</label>
            <label>Cash Payment</label>
            <label>Deliverer</label>
            <label># Payment</label>
            <label>Status</label>
            <label>Scheduled</label>
            <label>Date</label>
            <label>Time</label>
            <label>Total</label>
        </div>

        <div class="right container input-container">
            <label>"""),_display_(/*27.21*/orderDetails/*27.33*/.orderId),format.raw/*27.41*/("""</label>
            <label>"""),_display_(/*28.21*/String/*28.27*/.valueOf(orderDetails.amount)),format.raw/*28.56*/("""</label>
            <label>"""),_display_(/*29.21*/if(orderDetails.payment.isCash)/*29.52*/ {_display_(Seq[Any](format.raw/*29.54*/(""""Yes"""")))}/*29.61*/else/*29.66*/{_display_(Seq[Any](format.raw/*29.67*/(""""No"""")))}),format.raw/*29.72*/("""</label>
            <label>"""),_display_(/*30.21*/orderDetails/*30.33*/.delivererName),format.raw/*30.47*/("""</label>
            <label><a href=""""),_display_(/*31.30*/controllers/*31.41*/.User.routes.CustomerController.viewPayment(orderDetails.payment.getPaymentId)),format.raw/*31.119*/("""">
                "#"""),_display_(/*32.20*/orderDetails/*32.32*/.payment.getPaymentId),format.raw/*32.53*/(""""</a></label>
            <label>"""),_display_(/*33.21*/orderDetails/*33.33*/.status),format.raw/*33.40*/("""</label>
            <label>"""),_display_(/*34.21*/if(orderDetails.isScheduleOrder)/*34.53*/ {_display_(Seq[Any](format.raw/*34.55*/(""""Yes"""")))}/*34.62*/else/*34.67*/{_display_(Seq[Any](format.raw/*34.68*/(""""No"""")))}),format.raw/*34.73*/("""</label>
            <label>"""),_display_(/*35.21*/DateInterpreterStatic/*35.42*/.getDateWithDayName(orderDetails.dateOrdered)),format.raw/*35.87*/("""</label>
            <label>"""),_display_(/*36.21*/DateInterpreterStatic/*36.42*/.getTime(orderDetails.dateOrdered)),format.raw/*36.76*/("""</label>
            <label>"""),_display_(/*37.21*/AppTags/*37.28*/.Locale.Currency.ZAR.toString),format.raw/*37.57*/(""" """),_display_(/*37.59*/String/*37.65*/.valueOf(orderDetails.amount)),format.raw/*37.94*/("""</label>
        </div>
    </div>
    <br/>

    <div class="panel panel-default">
        <div class="panel-heading">
            Hover Rows
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Meal #</th>
                            <th>Meal Name</th>
                            <th>Type</th>
                            <th>Qty</th>
                            <th>Unit Price</th>
                            <th>Total</th>
                        </tr>
                    </thead>
                    <tbody>
                    """),_display_(/*60.22*/for((mealOrderItem, index) <- orderDetails.mealOrders.zipWithIndex) yield /*60.89*/ {_display_(Seq[Any](format.raw/*60.91*/("""
                        """),format.raw/*61.25*/("""<tr class="gradeA """),_display_(/*61.44*/if((index % 2) == 0)/*61.64*/ {_display_(Seq[Any](format.raw/*61.66*/("""odd""")))}/*61.71*/else/*61.76*/{_display_(Seq[Any](format.raw/*61.77*/("""even""")))}),format.raw/*61.82*/("""">
                            <td>"""),_display_(/*62.34*/mealOrderItem/*62.47*/.mealOrderId),format.raw/*62.59*/("""</td>
                            <td>"""),_display_(/*63.34*/mealOrderItem/*63.47*/.mealName),format.raw/*63.56*/("""</td>
                            <td>"""),_display_(/*64.34*/mealOrderItem/*64.47*/.mealType),format.raw/*64.56*/("""</td>
                            <td>"""),_display_(/*65.34*/AppTags/*65.41*/.Locale.Currency.ZAR.toString),format.raw/*65.70*/(""" """),_display_(/*65.72*/String/*65.78*/.valueOf(mealOrderItem.price)),format.raw/*65.107*/("""</td>
                            <td>"""),_display_(/*66.34*/String/*66.40*/.valueOf(mealOrderItem.getQty)),format.raw/*66.70*/("""</td>
                            <td>"""),_display_(/*67.34*/AppTags/*67.41*/.Locale.Currency.ZAR.toString),format.raw/*67.70*/(""" """),_display_(/*67.72*/String/*67.78*/.valueOf(mealOrderItem.getTotal)),format.raw/*67.110*/("""</td>
                        </tr>
                    """)))}),format.raw/*69.22*/("""
                    """),format.raw/*70.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>

"""),_display_(/*76.2*/form(action = controllers.User.routes.CustomerController.index())/*76.67*/ {_display_(Seq[Any](format.raw/*76.69*/("""
    """),_display_(/*77.6*/CSRF/*77.10*/.formField),format.raw/*77.20*/("""
    """),format.raw/*78.5*/("""<input class="btn btn-info" type="submit" name="Home">
""")))}),format.raw/*79.2*/("""
""")))};
Seq[Any](format.raw/*7.33*/("""

"""),format.raw/*80.2*/("""

"""),_display_(/*82.2*/masterpage/*82.12*/.apply(" :: Previous Orders", bodyContent)))
      }
    }
  }

  def render(orderDetails:OrderItemDetail): play.twirl.api.HtmlFormat.Appendable = apply(orderDetails)

  def f:((OrderItemDetail) => play.twirl.api.HtmlFormat.Appendable) = (orderDetails) => apply(orderDetails)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewHistoricOrder.scala.html
=======
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Customer/viewHistoricOrder.scala.html
>>>>>>> master
                  HASH: 5a3e081fa22543bdd1653cf77ef13ec76cb573e3
                  MATRIX: 665->1|704->34|750->74|784->102|827->139|1189->178|1298->212|1317->223|1397->227|1429->232|2012->788|2033->800|2062->808|2118->837|2133->843|2183->872|2239->901|2279->932|2319->934|2344->941|2357->946|2396->947|2432->952|2488->981|2509->993|2544->1007|2609->1045|2629->1056|2729->1134|2778->1156|2799->1168|2841->1189|2902->1223|2923->1235|2951->1242|3007->1271|3048->1303|3088->1305|3113->1312|3126->1317|3165->1318|3201->1323|3257->1352|3287->1373|3353->1418|3409->1447|3439->1468|3494->1502|3550->1531|3566->1538|3616->1567|3645->1569|3660->1575|3710->1604|4451->2318|4534->2385|4574->2387|4627->2412|4673->2431|4702->2451|4742->2453|4765->2458|4778->2463|4817->2464|4853->2469|4916->2505|4938->2518|4971->2530|5037->2569|5059->2582|5089->2591|5155->2630|5177->2643|5207->2652|5273->2691|5289->2698|5339->2727|5368->2729|5383->2735|5434->2764|5500->2803|5515->2809|5566->2839|5632->2878|5648->2885|5698->2914|5727->2916|5742->2922|5796->2954|5884->3011|5933->3032|6040->3113|6114->3178|6154->3180|6186->3186|6199->3190|6230->3200|6262->3205|6348->3261|6389->209|6418->3263|6447->3266|6466->3276
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|57->27|57->27|57->27|58->28|58->28|58->28|59->29|59->29|59->29|59->29|59->29|59->29|59->29|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|64->34|64->34|64->34|64->34|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|67->37|67->37|67->37|90->60|90->60|90->60|91->61|91->61|91->61|91->61|91->61|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|97->67|97->67|97->67|99->69|100->70|106->76|106->76|106->76|107->77|107->77|107->77|108->78|109->79|111->7|113->80|115->82|115->82
                  -- GENERATED --
              */
          