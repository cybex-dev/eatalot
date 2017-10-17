
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
/*2.2*/import java.util.List
/*3.2*/import models.Order.ActiveOrder
/*4.2*/import models.Order.MealOrderItem
/*5.2*/import controllers.Application.AppTags
/*6.2*/import helper.form
/*7.2*/import helper.CSRF
/*9.2*/import models.Order.MealOrderItem

object viewActiveOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[ActiveOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*10.2*/(activeOrderList: List[ActiveOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*12.2*/parseQueuePosition/*12.20*/(pos: Integer):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*12.38*/("""
    """),_display_(/*13.6*/if(pos == 0)/*13.18*/{_display_(Seq[Any](format.raw/*13.19*/("""
        """),format.raw/*14.9*/(""""first"
    """)))}/*15.7*/else/*15.12*/{_display_(Seq[Any](format.raw/*15.13*/("""
        """),_display_(/*16.10*/if(pos == 1)/*16.22*/ {_display_(Seq[Any](format.raw/*16.24*/("""
        """),format.raw/*17.9*/(""""next"
        """)))}/*18.11*/else/*18.16*/{_display_(Seq[Any](format.raw/*18.17*/("""
        """),format.raw/*19.9*/(""""#" """),_display_(/*19.14*/pos),format.raw/*19.17*/("""
        """)))}),format.raw/*20.10*/("""
    """)))}),format.raw/*21.6*/("""
""")))};def /*24.2*/generateOrderContent/*24.22*/(activeOrder: ActiveOrder):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*24.52*/("""
    """),format.raw/*25.5*/("""<div class="small-margin">
        <div class="row">
            <div class="single-border">
                <a href=""><h3># """),_display_(/*28.35*/activeOrder/*28.46*/.orderId),format.raw/*28.54*/("""</h3></a>
                <hr/>
                <div>
                    <h3>Order Details</h3>
                    <br/>
                    <h6>Amount:</h6> """),_display_(/*33.39*/AppTags/*33.46*/.Locale.Currency.ZAR.toString),format.raw/*33.75*/(""" """),_display_(/*33.77*/activeOrder/*33.88*/.amount),format.raw/*33.95*/("""
                    """),format.raw/*34.21*/("""<h6>Delivery Date:</h6> """),_display_(/*34.46*/activeOrder/*34.57*/.getDate),format.raw/*34.65*/("""
                    """),format.raw/*35.21*/("""<h6>Delivery Time:</h6> """),_display_(/*35.46*/activeOrder/*35.57*/.getTime),format.raw/*35.65*/("""
                    """),format.raw/*36.21*/("""<br/>
                    <h6>Status:</h6> """),_display_(/*37.39*/activeOrder/*37.50*/.queueStatus),format.raw/*37.62*/("""
                    """),format.raw/*38.21*/("""<h6>Position:</h6> """),_display_(/*38.41*/parseQueuePosition(activeOrder.queuePosition)),format.raw/*38.86*/("""
                    """),format.raw/*39.21*/("""<br/>
                </div>
                <hr/>
                <br/>
                <div class="small-indent auto-margin">
                """),_display_(/*44.18*/generateMealTable(activeOrder.mealOrdersList, activeOrder.amount)),format.raw/*44.83*/("""
                """),format.raw/*45.17*/("""</div>
            </div>
        </div>
    </div>
""")))};def /*51.2*/generateMealTable/*51.19*/(mealList: List[MealOrderItem], total: String):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*51.69*/("""
    """),format.raw/*52.5*/("""<div class="panel panel-default">
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
                        """),_display_(/*69.26*/for((mealOrderItem, index) <- mealList.zipWithIndex) yield /*69.78*/ {_display_(Seq[Any](format.raw/*69.80*/("""
                            """),format.raw/*70.29*/("""<tr>
                                <td>"""),_display_(/*71.38*/mealOrderItem/*71.51*/.mealName),format.raw/*71.60*/("""</td>
                                <td>"""),_display_(/*72.38*/AppTags/*72.45*/.Locale.Currency.ZAR.toString),format.raw/*72.74*/(""" """),_display_(/*72.76*/String/*72.82*/.valueOf(mealOrderItem.price)),format.raw/*72.111*/("""</td>
                                <td>"""),_display_(/*73.38*/String/*73.44*/.valueOf(mealOrderItem.getQty)),format.raw/*73.74*/("""</td>
                                <td> = </td>
                                <td>"""),_display_(/*75.38*/AppTags/*75.45*/.Locale.Currency.ZAR.toString),format.raw/*75.74*/(""" """),_display_(/*75.76*/String/*75.82*/.valueOf(mealOrderItem.getTotal)),format.raw/*75.114*/("""</td>
                            </tr>
                        """)))}),format.raw/*77.26*/("""
                        """),format.raw/*78.25*/("""<tr/>
                        <tr>
                            <td/>
                            <td/>
                            <td><h4>Order Total</h4></td>
                            <td> = </td>
                            <td><h4>"""),_display_(/*84.38*/AppTags/*84.45*/.Locale.Currency.ZAR.toString),format.raw/*84.74*/(""" """),format.raw/*84.75*/("""</h4></td>
                        </tr>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
""")))};def /*93.2*/bodyContent/*93.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*93.17*/("""
    """),format.raw/*94.5*/("""<h1>Active Orders</h1>
    <br/>
    """),_display_(/*96.6*/if(activeOrderList.size() == 0)/*96.37*/ {_display_(Seq[Any](format.raw/*96.39*/("""
        """),format.raw/*97.9*/("""<h6>No active orders</h6>
    """)))}/*98.7*/else/*98.12*/{_display_(Seq[Any](format.raw/*98.13*/("""
        """),_display_(/*99.10*/for(item <- activeOrderList) yield /*99.38*/ {_display_(Seq[Any](format.raw/*99.40*/("""
            """),_display_(/*100.14*/generateOrderContent(item)),format.raw/*100.40*/("""
            """),format.raw/*101.13*/("""<br/>
        """)))}),format.raw/*102.10*/("""
    """)))}),format.raw/*103.6*/("""
    """),_display_(/*104.6*/form(action = controllers.User.routes.CustomerController.index())/*104.71*/ {_display_(Seq[Any](format.raw/*104.73*/("""
        """),_display_(/*105.10*/CSRF/*105.14*/.formField),format.raw/*105.24*/("""
        """),format.raw/*106.9*/("""<input class="btn btn-info" type="submit" name="Back">
    """)))}),format.raw/*107.6*/("""
    """),format.raw/*108.5*/("""<br/>

""")))};
Seq[Any](format.raw/*10.38*/("""

"""),format.raw/*22.2*/("""

"""),format.raw/*49.2*/("""

"""),format.raw/*91.2*/("""

"""),format.raw/*110.2*/("""

"""),_display_(/*112.2*/masterpage/*112.12*/.apply(" :: Active Orders", bodyContent)))
      }
    }
  }

  def render(activeOrderList:List[ActiveOrder]): play.twirl.api.HtmlFormat.Appendable = apply(activeOrderList)

  def f:((List[ActiveOrder]) => play.twirl.api.HtmlFormat.Appendable) = (activeOrderList) => apply(activeOrderList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 14:32:11 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewActiveOrders.scala.html
                  HASH: ab56e09015734a1b0182796ca1587c5f7067fa69
                  MATRIX: 665->1|704->34|733->57|772->90|813->125|859->165|885->185|911->206|1272->241|1387->280|1414->298|1509->316|1541->322|1562->334|1601->335|1637->344|1668->358|1681->363|1720->364|1757->374|1778->386|1818->388|1854->397|1889->414|1902->419|1941->420|1977->429|2009->434|2033->437|2074->447|2110->453|2135->458|2164->478|2271->508|2303->513|2457->640|2477->651|2506->659|2694->820|2710->827|2760->856|2789->858|2809->869|2837->876|2886->897|2938->922|2958->933|2987->941|3036->962|3088->987|3108->998|3137->1006|3186->1027|3257->1071|3277->1082|3310->1094|3359->1115|3406->1135|3472->1180|3521->1201|3693->1346|3779->1411|3824->1428|3900->1484|3926->1501|4053->1551|4085->1556|4741->2185|4809->2237|4849->2239|4906->2268|4975->2310|4997->2323|5027->2332|5097->2375|5113->2382|5163->2411|5192->2413|5207->2419|5258->2448|5328->2491|5343->2497|5394->2527|5509->2615|5525->2622|5575->2651|5604->2653|5619->2659|5673->2691|5769->2756|5822->2781|6088->3020|6104->3027|6154->3056|6183->3057|6347->3201|6367->3212|6448->3216|6480->3221|6544->3259|6584->3290|6624->3292|6660->3301|6709->3333|6722->3338|6761->3339|6798->3349|6842->3377|6882->3379|6924->3393|6972->3419|7014->3432|7061->3447|7098->3453|7131->3459|7206->3524|7247->3526|7285->3536|7299->3540|7331->3550|7368->3559|7459->3619|7492->3624|7540->277|7569->455|7598->1481|7627->3198|7657->3632|7687->3635|7707->3645
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|30->7|31->9|36->10|40->12|40->12|42->12|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|48->18|48->18|48->18|49->19|49->19|49->19|50->20|51->21|52->24|52->24|54->24|55->25|58->28|58->28|58->28|63->33|63->33|63->33|63->33|63->33|63->33|64->34|64->34|64->34|64->34|65->35|65->35|65->35|65->35|66->36|67->37|67->37|67->37|68->38|68->38|68->38|69->39|74->44|74->44|75->45|79->51|79->51|81->51|82->52|99->69|99->69|99->69|100->70|101->71|101->71|101->71|102->72|102->72|102->72|102->72|102->72|102->72|103->73|103->73|103->73|105->75|105->75|105->75|105->75|105->75|105->75|107->77|108->78|114->84|114->84|114->84|114->84|121->93|121->93|123->93|124->94|126->96|126->96|126->96|127->97|128->98|128->98|128->98|129->99|129->99|129->99|130->100|130->100|131->101|132->102|133->103|134->104|134->104|134->104|135->105|135->105|135->105|136->106|137->107|138->108|141->10|143->22|145->49|147->91|149->110|151->112|151->112
                  -- GENERATED --
              */
          