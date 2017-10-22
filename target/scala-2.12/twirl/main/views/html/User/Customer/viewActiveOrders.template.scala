
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
/*1.2*/import java.util.List
/*3.2*/import Global.Static.masterpage
/*4.2*/import controllers.Application.AppTags
/*5.2*/import helper.{CSRF, form}
/*6.2*/import models.Order.{ActiveOrder, MealOrderItem}

object viewActiveOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[ActiveOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(activeOrderList: List[ActiveOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/parseQueuePosition/*9.20*/(pos: Integer):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.38*/("""
    """),_display_(/*10.6*/if(pos == 0)/*10.18*/{_display_(Seq[Any](format.raw/*10.19*/("""
        """),format.raw/*11.9*/(""""first"
    """)))}/*12.7*/else/*12.12*/{_display_(Seq[Any](format.raw/*12.13*/("""
        """),_display_(/*13.10*/if(pos == 1)/*13.22*/ {_display_(Seq[Any](format.raw/*13.24*/("""
        """),format.raw/*14.9*/(""""next"
        """)))}/*15.11*/else/*15.16*/{_display_(Seq[Any](format.raw/*15.17*/("""
        """),format.raw/*16.9*/(""""#" """),_display_(/*16.14*/pos),format.raw/*16.17*/("""
        """)))}),format.raw/*17.10*/("""
    """)))}),format.raw/*18.6*/("""
""")))};def /*21.2*/generateOrderContent/*21.22*/(activeOrder: ActiveOrder):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.52*/("""
    """),format.raw/*22.5*/("""<div class="small-margin">
        <div class="row">
            <div class="single-border">
                <a href=""><h3># """),_display_(/*25.35*/activeOrder/*25.46*/.orderId),format.raw/*25.54*/("""</h3></a>
                <hr/>
                <div>
                    <h3>Order Details</h3>
                    <br/>
                    <h6>Amount:</h6> """),_display_(/*30.39*/AppTags/*30.46*/.Locale.Currency.ZAR.toString),format.raw/*30.75*/(""" """),_display_(/*30.77*/activeOrder/*30.88*/.amount),format.raw/*30.95*/("""
                    """),format.raw/*31.21*/("""<h6>Delivery Date:</h6> """),_display_(/*31.46*/activeOrder/*31.57*/.getDate),format.raw/*31.65*/("""
                    """),format.raw/*32.21*/("""<h6>Delivery Time:</h6> """),_display_(/*32.46*/activeOrder/*32.57*/.getTime),format.raw/*32.65*/("""
                    """),format.raw/*33.21*/("""<br/>
                    <h6>Status:</h6> """),_display_(/*34.39*/activeOrder/*34.50*/.queueStatus),format.raw/*34.62*/("""
                    """),format.raw/*35.21*/("""<h6>Position:</h6> """),_display_(/*35.41*/parseQueuePosition(activeOrder.queuePosition)),format.raw/*35.86*/("""
                    """),format.raw/*36.21*/("""<br/>
                </div>
                <hr/>
                <br/>
                <div class="small-indent auto-margin">
                """),_display_(/*41.18*/generateMealTable(activeOrder.mealOrdersList, activeOrder.amount)),format.raw/*41.83*/("""
                """),format.raw/*42.17*/("""</div>
            </div>
        </div>
    </div>
""")))};def /*48.2*/generateMealTable/*48.19*/(mealList: List[MealOrderItem], total: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*48.69*/("""
    """),format.raw/*49.5*/("""<div class="panel panel-default">
        <div class="panel-heading">
            Meals Ordered
        </div>
        <div class="panel-body">
            <div class="table-responsive">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>Description</th>
                            <th>Price/per</th>
                            <th>Quantity</th>
                            <th></th>
                            <th>Total</th>
                        </tr>
                    </thead>
                    <tbody>
                        """),_display_(/*66.26*/for((mealOrderItem, index) <- mealList.zipWithIndex) yield /*66.78*/ {_display_(Seq[Any](format.raw/*66.80*/("""
                            """),format.raw/*67.29*/("""<tr>
                                <td>"""),_display_(/*68.38*/mealOrderItem/*68.51*/.mealName),format.raw/*68.60*/("""</td>
                                <td>"""),_display_(/*69.38*/AppTags/*69.45*/.Locale.Currency.ZAR.toString),format.raw/*69.74*/(""" """),_display_(/*69.76*/String/*69.82*/.valueOf(mealOrderItem.price)),format.raw/*69.111*/("""</td>
                                <td>"""),_display_(/*70.38*/String/*70.44*/.valueOf(mealOrderItem.getQty)),format.raw/*70.74*/("""</td>
                                <td> = </td>
                                <td>"""),_display_(/*72.38*/AppTags/*72.45*/.Locale.Currency.ZAR.toString),format.raw/*72.74*/(""" """),_display_(/*72.76*/String/*72.82*/.valueOf(mealOrderItem.getTotal)),format.raw/*72.114*/("""</td>
                            </tr>
                        """)))}),format.raw/*74.26*/("""
                        """),format.raw/*75.25*/("""<tr/>
                        <tr>
                            <td/>
                            <td/>
                            <td><h4>Order Total</h4></td>
                            <td> = </td>
                            <td><h4>"""),_display_(/*81.38*/AppTags/*81.45*/.Locale.Currency.ZAR.toString),format.raw/*81.74*/(""" """),format.raw/*81.75*/("""</h4></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
""")))};def /*90.2*/bodyContent/*90.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*90.17*/("""
    """),format.raw/*91.5*/("""<h1>Active Orders</h1>
    <br/>
    """),_display_(/*93.6*/if(activeOrderList.size() == 0)/*93.37*/ {_display_(Seq[Any](format.raw/*93.39*/("""
        """),format.raw/*94.9*/("""<h6>No active orders</h6>
    """)))}/*95.7*/else/*95.12*/{_display_(Seq[Any](format.raw/*95.13*/("""
        """),_display_(/*96.10*/for(item <- activeOrderList) yield /*96.38*/ {_display_(Seq[Any](format.raw/*96.40*/("""
            """),_display_(/*97.14*/generateOrderContent(item)),format.raw/*97.40*/("""
            """),format.raw/*98.13*/("""<br/>
        """)))}),format.raw/*99.10*/("""
    """)))}),format.raw/*100.6*/("""
    """),_display_(/*101.6*/form(action = controllers.User.routes.CustomerController.index())/*101.71*/ {_display_(Seq[Any](format.raw/*101.73*/("""
        """),_display_(/*102.10*/CSRF/*102.14*/.formField),format.raw/*102.24*/("""
        """),format.raw/*103.9*/("""<input class="btn btn-info" type="submit" name="Back">
    """)))}),format.raw/*104.6*/("""
    """),format.raw/*105.5*/("""<br/>

""")))};
Seq[Any](format.raw/*7.38*/("""

"""),format.raw/*19.2*/("""

"""),format.raw/*46.2*/("""

"""),format.raw/*88.2*/("""

"""),format.raw/*107.2*/("""

"""),_display_(/*109.2*/masterpage/*109.12*/.apply(" :: Active Orders", bodyContent)))
      }
    }
  }

  def render(activeOrderList:List[ActiveOrder]): play.twirl.api.HtmlFormat.Appendable = apply(activeOrderList)

  def f:((List[ActiveOrder]) => play.twirl.api.HtmlFormat.Appendable) = (activeOrderList) => apply(activeOrderList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewActiveOrders.scala.html
                  HASH: 327b65f6f45f850a9081fa94e73ac47e367b47b2
                  MATRIX: 665->1|694->25|733->58|779->98|813->126|1188->176|1302->215|1328->233|1422->251|1454->257|1475->269|1514->270|1550->279|1581->293|1594->298|1633->299|1670->309|1691->321|1731->323|1767->332|1802->349|1815->354|1854->355|1890->364|1922->369|1946->372|1987->382|2023->388|2048->393|2077->413|2184->443|2216->448|2370->575|2390->586|2419->594|2607->755|2623->762|2673->791|2702->793|2722->804|2750->811|2799->832|2851->857|2871->868|2900->876|2949->897|3001->922|3021->933|3050->941|3099->962|3170->1006|3190->1017|3223->1029|3272->1050|3319->1070|3385->1115|3434->1136|3606->1281|3692->1346|3737->1363|3813->1419|3839->1436|3966->1486|3998->1491|4654->2120|4722->2172|4762->2174|4819->2203|4888->2245|4910->2258|4940->2267|5010->2310|5026->2317|5076->2346|5105->2348|5120->2354|5171->2383|5241->2426|5256->2432|5307->2462|5422->2550|5438->2557|5488->2586|5517->2588|5532->2594|5586->2626|5682->2691|5735->2716|6001->2955|6017->2962|6067->2991|6096->2992|6260->3136|6280->3147|6361->3151|6393->3156|6457->3194|6497->3225|6537->3227|6573->3236|6622->3268|6635->3273|6674->3274|6711->3284|6755->3312|6795->3314|6836->3328|6883->3354|6924->3367|6970->3382|7007->3388|7040->3394|7115->3459|7156->3461|7194->3471|7208->3475|7240->3485|7277->3494|7368->3554|7401->3559|7448->212|7477->390|7506->1416|7535->3133|7565->3567|7595->3570|7615->3580
                  LINES: 24->1|25->3|26->4|27->5|28->6|33->7|37->9|37->9|39->9|40->10|40->10|40->10|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|49->21|49->21|51->21|52->22|55->25|55->25|55->25|60->30|60->30|60->30|60->30|60->30|60->30|61->31|61->31|61->31|61->31|62->32|62->32|62->32|62->32|63->33|64->34|64->34|64->34|65->35|65->35|65->35|66->36|71->41|71->41|72->42|76->48|76->48|78->48|79->49|96->66|96->66|96->66|97->67|98->68|98->68|98->68|99->69|99->69|99->69|99->69|99->69|99->69|100->70|100->70|100->70|102->72|102->72|102->72|102->72|102->72|102->72|104->74|105->75|111->81|111->81|111->81|111->81|118->90|118->90|120->90|121->91|123->93|123->93|123->93|124->94|125->95|125->95|125->95|126->96|126->96|126->96|127->97|127->97|128->98|129->99|130->100|131->101|131->101|131->101|132->102|132->102|132->102|133->103|134->104|135->105|138->7|140->19|142->46|144->88|146->107|148->109|148->109
                  -- GENERATED --
              */
          