
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
/*4.2*/import controllers.Application.AppTags
/*5.2*/import helper.form
/*6.2*/import helper.CSRF

object viewActiveOrders extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[ActiveOrder],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(activeOrderList: List[ActiveOrder]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/bodyContent/*10.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.17*/("""
    """),format.raw/*11.5*/("""<h1>Active Orders</h1>
    <br/>
"""),_display_(/*13.2*/if(activeOrderList.size() == 0)/*13.33*/{_display_(Seq[Any](format.raw/*13.34*/("""
    """),format.raw/*14.5*/("""<h6>No active orders</h6>
""")))}/*15.3*/else/*15.8*/{_display_(Seq[Any](format.raw/*15.9*/("""
    """),_display_(/*16.6*/for(item <- activeOrderList) yield /*16.34*/ {_display_(Seq[Any](format.raw/*16.36*/("""
        """),format.raw/*17.9*/("""<div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">Order #"""),_display_(/*19.49*/item/*19.53*/.orderId),format.raw/*19.61*/("""</h4><p class="tab">Deliver Time: """),_display_(/*19.96*/item/*19.100*/.getTime),format.raw/*19.108*/("""</p><button class="btn btn-warning" type="submit" href="#">Cancel Order</button>
                <br/>
                <h6 class="tab">Status = """),_display_(/*21.43*/item/*21.47*/.queueStatus),format.raw/*21.59*/("""</h6>
            </div>
            <div class="panel-collapse" style="">
                <div class="panel-body">
                """),_display_(/*25.18*/for((mealOrderItem, index) <- item.mealOrdersList.zipWithIndex) yield /*25.81*/ {_display_(Seq[Any](format.raw/*25.83*/("""
                    """),format.raw/*26.21*/("""<tr class="gradeA """),_display_(/*26.40*/if((index % 2) == 0)/*26.60*/ {_display_(Seq[Any](format.raw/*26.62*/("""odd""")))}/*26.67*/else/*26.72*/{_display_(Seq[Any](format.raw/*26.73*/("""even""")))}),format.raw/*26.78*/("""">
                        <td>"""),_display_(/*27.30*/mealOrderItem/*27.43*/.mealName),format.raw/*27.52*/("""</td>
                        <td>"""),_display_(/*28.30*/AppTags/*28.37*/.Locale.Currency.ZAR.toString),format.raw/*28.66*/(""" """),_display_(/*28.68*/String/*28.74*/.valueOf(mealOrderItem.price)),format.raw/*28.103*/("""</td>
                        <td>"""),_display_(/*29.30*/String/*29.36*/.valueOf(mealOrderItem.getQty)),format.raw/*29.66*/("""</td>
                        <td> = </td>
                        <td>"""),_display_(/*31.30*/AppTags/*31.37*/.Locale.Currency.ZAR.toString),format.raw/*31.66*/(""" """),_display_(/*31.68*/String/*31.74*/.valueOf(mealOrderItem.getTotal)),format.raw/*31.106*/("""</td>
                    </tr>
                """)))}),format.raw/*33.18*/("""
                """),format.raw/*34.17*/("""</div>
            </div>
        </div>
        <div class="panel panel-default">
            <h4 class="panel-footer">Total = """),_display_(/*38.47*/AppTags/*38.54*/.Locale.Currency.ZAR.toString),format.raw/*38.83*/(""" """),_display_(/*38.85*/item/*38.89*/.amount),format.raw/*38.96*/("""</h4>
        </div>
        <br/>
    """)))}),format.raw/*41.6*/("""
""")))}),format.raw/*42.2*/("""
    """),_display_(/*43.6*/form( action = controllers.User.routes.CustomerController.index())/*43.72*/{_display_(Seq[Any](format.raw/*43.73*/("""
        """),_display_(/*44.10*/CSRF/*44.14*/.formField),format.raw/*44.24*/("""
        """),format.raw/*45.9*/("""<input class="btn btn-info" type="submit" name="Back">
    """)))}),format.raw/*46.6*/("""
""")))};
Seq[Any](format.raw/*8.38*/("""

"""),format.raw/*47.2*/("""

"""),_display_(/*49.2*/masterpage/*49.12*/.apply(" :: Active Orders", bodyContent)))
      }
    }
  }

  def render(activeOrderList:List[ActiveOrder]): play.twirl.api.HtmlFormat.Appendable = apply(activeOrderList)

  def f:((List[ActiveOrder]) => play.twirl.api.HtmlFormat.Appendable) = (activeOrderList) => apply(activeOrderList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 08 09:51:03 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/viewActiveOrders.scala.html
                  HASH: 86b40ebf49ee04d6b6a1dac7c96d90f80e22ec05
                  MATRIX: 665->1|704->34|733->57|772->90|818->130|844->150|1189->171|1304->210|1324->221|1405->225|1437->230|1497->264|1537->295|1576->296|1608->301|1653->329|1665->334|1703->335|1735->341|1779->369|1819->371|1855->380|2004->502|2017->506|2046->514|2108->549|2122->553|2152->561|2324->706|2337->710|2370->722|2530->855|2609->918|2649->920|2698->941|2744->960|2773->980|2813->982|2836->987|2849->992|2888->993|2924->998|2983->1030|3005->1043|3035->1052|3097->1087|3113->1094|3163->1123|3192->1125|3207->1131|3258->1160|3320->1195|3335->1201|3386->1231|3485->1303|3501->1310|3551->1339|3580->1341|3595->1347|3649->1379|3729->1428|3774->1445|3930->1574|3946->1581|3996->1610|4025->1612|4038->1616|4066->1623|4136->1663|4168->1665|4200->1671|4275->1737|4314->1738|4351->1748|4364->1752|4395->1762|4431->1771|4521->1831|4562->207|4591->1833|4620->1836|4639->1846
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->10|38->10|40->10|41->11|43->13|43->13|43->13|44->14|45->15|45->15|45->15|46->16|46->16|46->16|47->17|49->19|49->19|49->19|49->19|49->19|49->19|51->21|51->21|51->21|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|58->28|58->28|58->28|58->28|59->29|59->29|59->29|61->31|61->31|61->31|61->31|61->31|61->31|63->33|64->34|68->38|68->38|68->38|68->38|68->38|68->38|71->41|72->42|73->43|73->43|73->43|74->44|74->44|74->44|75->45|76->46|78->8|80->47|82->49|82->49
                  -- GENERATED --
              */
          