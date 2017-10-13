
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
/*1.2*/import models.Order.OrderItemDetail
/*2.2*/import Global.Static.masterpage
/*3.2*/import utility.DateInterpreterStatic
/*4.2*/import controllers.Application.AppTags
/*5.2*/import helper.CSRF
/*6.2*/import helper.form

object viewHistoricOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[OrderItemDetail,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(orderDetails: OrderItemDetail):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/bodyContent/*10.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.17*/("""
    """),format.raw/*11.5*/("""<h1>Order details</h1>
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
            <label>"""),_display_(/*28.21*/orderDetails/*28.33*/.orderId),format.raw/*28.41*/("""</label>
            <label>"""),_display_(/*29.21*/String/*29.27*/.valueOf(orderDetails.amount)),format.raw/*29.56*/("""</label>
            <label>"""),_display_(/*30.21*/if(orderDetails.payment.isCash)/*30.52*/ {_display_(Seq[Any](format.raw/*30.54*/(""""Yes"""")))}/*30.61*/else/*30.66*/{_display_(Seq[Any](format.raw/*30.67*/(""""No"""")))}),format.raw/*30.72*/("""</label>
            <label>"""),_display_(/*31.21*/orderDetails/*31.33*/.delivererName),format.raw/*31.47*/("""</label>
            <label><a href=""""),_display_(/*32.30*/controllers/*32.41*/.User.routes.CustomerController.viewPayment(orderDetails.payment.getPaymentId)),format.raw/*32.119*/("""">
                "#"""),_display_(/*33.20*/orderDetails/*33.32*/.payment.getPaymentId),format.raw/*33.53*/(""""</a></label>
            <label>"""),_display_(/*34.21*/orderDetails/*34.33*/.status),format.raw/*34.40*/("""</label>
            <label>"""),_display_(/*35.21*/if(orderDetails.isScheduleOrder)/*35.53*/ {_display_(Seq[Any](format.raw/*35.55*/(""""Yes"""")))}/*35.62*/else/*35.67*/{_display_(Seq[Any](format.raw/*35.68*/(""""No"""")))}),format.raw/*35.73*/("""</label>
            <label>"""),_display_(/*36.21*/DateInterpreterStatic/*36.42*/.getDateWithDayName(orderDetails.dateOrdered)),format.raw/*36.87*/("""</label>
            <label>"""),_display_(/*37.21*/DateInterpreterStatic/*37.42*/.getTime(orderDetails.dateOrdered)),format.raw/*37.76*/("""</label>
            <label>"""),_display_(/*38.21*/AppTags/*38.28*/.Locale.Currency.ZAR.toString),format.raw/*38.57*/(""" """),_display_(/*38.59*/String/*38.65*/.valueOf(orderDetails.amount)),format.raw/*38.94*/("""</label>
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
                    """),_display_(/*61.22*/for((mealOrderItem, index) <- orderDetails.mealOrders.zipWithIndex) yield /*61.89*/ {_display_(Seq[Any](format.raw/*61.91*/("""
                        """),format.raw/*62.25*/("""<tr class="gradeA """),_display_(/*62.44*/if((index % 2) == 0)/*62.64*/ {_display_(Seq[Any](format.raw/*62.66*/("""odd""")))}/*62.71*/else/*62.76*/{_display_(Seq[Any](format.raw/*62.77*/("""even""")))}),format.raw/*62.82*/("""">
                            <td>"""),_display_(/*63.34*/mealOrderItem/*63.47*/.mealOrderId),format.raw/*63.59*/("""</td>
                            <td>"""),_display_(/*64.34*/mealOrderItem/*64.47*/.mealName),format.raw/*64.56*/("""</td>
                            <td>"""),_display_(/*65.34*/mealOrderItem/*65.47*/.mealType),format.raw/*65.56*/("""</td>
                            <td>"""),_display_(/*66.34*/AppTags/*66.41*/.Locale.Currency.ZAR.toString),format.raw/*66.70*/(""" """),_display_(/*66.72*/String/*66.78*/.valueOf(mealOrderItem.price)),format.raw/*66.107*/("""</td>
                            <td>"""),_display_(/*67.34*/String/*67.40*/.valueOf(mealOrderItem.getQty)),format.raw/*67.70*/("""</td>
                            <td>"""),_display_(/*68.34*/AppTags/*68.41*/.Locale.Currency.ZAR.toString),format.raw/*68.70*/(""" """),_display_(/*68.72*/String/*68.78*/.valueOf(mealOrderItem.getTotal)),format.raw/*68.110*/("""</td>
                        </tr>
                    """)))}),format.raw/*70.22*/("""
                    """),format.raw/*71.21*/("""</tbody>
                </table>
            </div>
        </div>
    </div>

"""),_display_(/*77.2*/form(action = controllers.User.routes.CustomerController.index())/*77.67*/ {_display_(Seq[Any](format.raw/*77.69*/("""
    """),_display_(/*78.6*/CSRF/*78.10*/.formField),format.raw/*78.20*/("""
    """),format.raw/*79.5*/("""<input class="btn btn-info" type="submit" name="Home">
""")))}),format.raw/*80.2*/("""
""")))};
Seq[Any](format.raw/*8.33*/("""

"""),format.raw/*81.2*/("""

"""),_display_(/*83.2*/masterpage/*83.12*/.apply(" :: Previous Orders", bodyContent)))
      }
    }
  }

  def render(orderDetails:OrderItemDetail): play.twirl.api.HtmlFormat.Appendable = apply(orderDetails)

  def f:((OrderItemDetail) => play.twirl.api.HtmlFormat.Appendable) = (orderDetails) => apply(orderDetails)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Thu Oct 12 15:36:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewHistoricOrder.scala.html
                  HASH: 9530b339e21759f7c608648b2e35664ca091dd23
                  MATRIX: 665->1|708->38|747->71|791->109|837->149|863->169|1207->190|1317->224|1337->235|1418->239|1450->244|2033->800|2054->812|2083->820|2139->849|2154->855|2204->884|2260->913|2300->944|2340->946|2365->953|2378->958|2417->959|2453->964|2509->993|2530->1005|2565->1019|2630->1057|2650->1068|2750->1146|2799->1168|2820->1180|2862->1201|2923->1235|2944->1247|2972->1254|3028->1283|3069->1315|3109->1317|3134->1324|3147->1329|3186->1330|3222->1335|3278->1364|3308->1385|3374->1430|3430->1459|3460->1480|3515->1514|3571->1543|3587->1550|3637->1579|3666->1581|3681->1587|3731->1616|4472->2330|4555->2397|4595->2399|4648->2424|4694->2443|4723->2463|4763->2465|4786->2470|4799->2475|4838->2476|4874->2481|4937->2517|4959->2530|4992->2542|5058->2581|5080->2594|5110->2603|5176->2642|5198->2655|5228->2664|5294->2703|5310->2710|5360->2739|5389->2741|5404->2747|5455->2776|5521->2815|5536->2821|5587->2851|5653->2890|5669->2897|5719->2926|5748->2928|5763->2934|5817->2966|5905->3023|5954->3044|6061->3125|6135->3190|6175->3192|6207->3198|6220->3202|6251->3212|6283->3217|6369->3273|6410->221|6439->3275|6468->3278|6487->3288
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->10|38->10|40->10|41->11|58->28|58->28|58->28|59->29|59->29|59->29|60->30|60->30|60->30|60->30|60->30|60->30|60->30|61->31|61->31|61->31|62->32|62->32|62->32|63->33|63->33|63->33|64->34|64->34|64->34|65->35|65->35|65->35|65->35|65->35|65->35|65->35|66->36|66->36|66->36|67->37|67->37|67->37|68->38|68->38|68->38|68->38|68->38|68->38|91->61|91->61|91->61|92->62|92->62|92->62|92->62|92->62|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|96->66|96->66|96->66|97->67|97->67|97->67|98->68|98->68|98->68|98->68|98->68|98->68|100->70|101->71|107->77|107->77|107->77|108->78|108->78|108->78|109->79|110->80|112->8|114->81|116->83|116->83
                  -- GENERATED --
              */
          