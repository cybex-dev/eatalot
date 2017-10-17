
package views.html.Order.Schedule

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
/*2.2*/import models.Order.OrderScheduleDays
/*3.2*/import models.Order.CustomerOrderItem
/*4.2*/import controllers.Application.AppTags
/*5.2*/import helper.CSRF
/*6.2*/import helper.form

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[OrderScheduleDays,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*8.2*/(orderScheduleWeek: OrderScheduleDays):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/generateDayTable/*10.18*/(dayName: String, dayOrderList: List[CustomerOrderItem]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.78*/("""
    """),format.raw/*11.5*/("""<div class="panel panel-default">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*14.76*/dayName),format.raw/*14.83*/("""" class="collapsed">"""),_display_(/*14.104*/dayName),format.raw/*14.111*/("""</a>
            </h4>
        </div>
        <div id=""""),_display_(/*17.19*/dayName),format.raw/*17.26*/("""" class="panel-collapse collapse" style="height: 0px;">
           <div class="panel-body">
            """),_display_(/*19.14*/if(dayOrderList.size() == 0)/*19.42*/ {_display_(Seq[Any](format.raw/*19.44*/("""
                    """),format.raw/*20.21*/("""<p class="tab">No scheduled orders</p>
            """)))}/*21.15*/else/*21.20*/{_display_(Seq[Any](format.raw/*21.21*/("""

                """),_display_(/*23.18*/for((item, index) <- dayOrderList.zipWithIndex) yield /*23.65*/ {_display_(Seq[Any](format.raw/*23.67*/("""
                    """),format.raw/*24.21*/("""<tr class="gradeA """),_display_(/*24.40*/if((index % 2) == 0)/*24.60*/ {_display_(Seq[Any](format.raw/*24.62*/("""odd""")))}/*24.67*/else/*24.72*/{_display_(Seq[Any](format.raw/*24.73*/("""even""")))}),format.raw/*24.78*/("""">
                        <td class="sorting_1"><a href=""""),_display_(/*25.57*/controllers/*25.68*/.User.routes.CustomerController.viewOrder(item.orderId)),format.raw/*25.123*/("""">"""),_display_(/*25.126*/item/*25.130*/.orderId),format.raw/*25.138*/("""</a></td>
                        <td class=" ">"""),_display_(/*26.40*/AppTags/*26.47*/.Locale.Currency.ZAR.toString),format.raw/*26.76*/(""" """),_display_(/*26.78*/item/*26.82*/.amount),format.raw/*26.89*/("""</td>
                        <td class=" ">"""),_display_(/*27.40*/item/*27.44*/.getTime),format.raw/*27.52*/("""</td>
                        <td class=" "><button class="btn btn-danger" href=""""),_display_(/*28.77*/CSRF(controllers.Order.routes.ScheduleController.removeOrder(item.orderId))),format.raw/*28.152*/("""">Remove</button></td>
                    </tr>
                """)))}),format.raw/*30.18*/("""
            """)))}),format.raw/*31.14*/("""
        """),format.raw/*32.9*/("""</div>
        </div>
    </div>
""")))};def /*37.2*/generateScheduleTable/*37.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*37.27*/("""
    """),_display_(/*38.6*/form(action = controllers.Order.routes.ScheduleController.editScheduleName())/*38.83*/ {_display_(Seq[Any](format.raw/*38.85*/("""
        """),_display_(/*39.10*/CSRF/*39.14*/.formField),format.raw/*39.24*/("""
        """),format.raw/*40.9*/("""<h1>Your Order Schedule </h1><input type="button" class="btn btn-info" value=""""),_display_(/*40.88*/if(orderScheduleWeek == null)/*40.117*/{_display_(Seq[Any](format.raw/*40.118*/("""Create Schedule""")))}/*40.134*/else/*40.138*/{_display_(Seq[Any](format.raw/*40.139*/("""Change Schedule Name""")))}),format.raw/*40.160*/("""" onclick=""""),_display_(/*40.172*/if(orderScheduleWeek == null)/*40.201*/{_display_(Seq[Any](format.raw/*40.202*/("""createSchedule()""")))}/*40.219*/else/*40.223*/{_display_(Seq[Any](format.raw/*40.224*/("""changeScheduleName()""")))}),format.raw/*40.245*/(""""/>"""),_display_(/*40.249*/if(orderScheduleWeek != null)/*40.278*/{_display_(Seq[Any](format.raw/*40.279*/("""<input id="btnScheduleStatus" type="button" class="btn """),_display_(/*40.335*/if(orderScheduleWeek.isActive)/*40.365*/{_display_(Seq[Any](format.raw/*40.366*/("""btn-success""")))}/*40.378*/else/*40.382*/{_display_(Seq[Any](format.raw/*40.383*/("""btn-danger""")))}),format.raw/*40.394*/("""" onclick="setScheduleStatus("""),_display_(/*40.424*/session()/*40.433*/.get(AppTags.AppCookie.user_id.toString)),format.raw/*40.473*/(""")" value=""""),_display_(/*40.484*/if(orderScheduleWeek.isActive)/*40.514*/{_display_(Seq[Any](format.raw/*40.515*/("""Active""")))}/*40.522*/else/*40.526*/{_display_(Seq[Any](format.raw/*40.527*/("""Inactive""")))}),format.raw/*40.536*/("""">""")))}),format.raw/*40.539*/("""
    """)))}),format.raw/*41.6*/("""
    """),format.raw/*42.5*/("""<br/>
    <div class="panel-group" id="accordion">
        """),_display_(/*44.10*/generateDayTable("Monday", orderScheduleWeek.getMonday)),format.raw/*44.65*/("""<br/>
        """),_display_(/*45.10*/generateDayTable("Tuesday", orderScheduleWeek.getTuesday)),format.raw/*45.67*/("""<br/>
        """),_display_(/*46.10*/generateDayTable("Wednesday", orderScheduleWeek.getWednesday)),format.raw/*46.71*/("""<br/>
        """),_display_(/*47.10*/generateDayTable("Thursday", orderScheduleWeek.getThursday)),format.raw/*47.69*/("""<br/>
        """),_display_(/*48.10*/generateDayTable("Friday", orderScheduleWeek.getFriday)),format.raw/*48.65*/("""<br/>
        """),_display_(/*49.10*/generateDayTable("Saturday", orderScheduleWeek.getSaturday)),format.raw/*49.69*/("""<br/>
        """),_display_(/*50.10*/generateDayTable("Sunday", orderScheduleWeek.getSunday)),format.raw/*50.65*/("""<br/>
        <br/>
        """),_display_(/*52.10*/form(action = controllers.Order.routes.ScheduleController.addOrder(), '_class -> "pull-right")/*52.104*/ {_display_(Seq[Any](format.raw/*52.106*/("""
            """),_display_(/*53.14*/CSRF/*53.18*/.formField),format.raw/*53.28*/("""
            """),format.raw/*54.13*/("""<input type="submit" class="btn btn-success" value="Add Order (TODO)">
            """)))}),format.raw/*55.14*/("""
        """),format.raw/*56.9*/("""<br/>
        <br/>
        <div class="panel panel-default">
            <div class="panel-heading">
                <h4 class="panel-title">
                    <a data-toggle="collapse" data-parent="#accordion" href="#Monday" class="">Collapsible Group Item #1</a>
                </h4>
            </div>
            <div id="collapseOne" class="panel-collapse collapse in" style="">
                <div class="panel-body">
                    Lorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
                </div>
            </div>
        </div>
    </div>
    <br/>
"""),_display_(/*72.2*/form(action = controllers.Order.routes.ScheduleController.clearSchedule(), '_class -> "pull-right")/*72.101*/ {_display_(Seq[Any](format.raw/*72.103*/("""
    """),_display_(/*73.6*/CSRF/*73.10*/.formField),format.raw/*73.20*/("""
    """),format.raw/*74.5*/("""<input type="submit" class="btn btn-danger" value="Clear Schedule">
""")))}),format.raw/*75.2*/("""
""")))};def /*78.2*/bodyContent/*78.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*78.17*/("""

    """),_display_(/*80.6*/generateScheduleTable),format.raw/*80.27*/("""
""")))};
Seq[Any](format.raw/*8.40*/("""

"""),format.raw/*35.2*/("""

"""),format.raw/*76.2*/("""

"""),format.raw/*81.2*/("""


"""),_display_(/*84.2*/masterpage/*84.12*/.apply(" :: Schedule", bodyContent)),format.raw/*84.47*/("""





"""))
      }
    }
  }

  def render(orderScheduleWeek:OrderScheduleDays): play.twirl.api.HtmlFormat.Appendable = apply(orderScheduleWeek)

  def f:((OrderScheduleDays) => play.twirl.api.HtmlFormat.Appendable) = (orderScheduleWeek) => apply(orderScheduleWeek)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Mon Oct 16 08:34:22 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/index.scala.html
                  HASH: 05f4c94c525aef2738c68294f9af77aeab56b829
                  MATRIX: 666->1|705->34|750->73|795->112|841->152|867->172|1201->193|1318->234|1343->250|1480->310|1512->315|1721->497|1749->504|1798->525|1827->532|1910->588|1938->595|2070->700|2107->728|2147->730|2196->751|2267->804|2280->809|2319->810|2365->829|2428->876|2468->878|2517->899|2563->918|2592->938|2632->940|2655->945|2668->950|2707->951|2743->956|2829->1015|2849->1026|2926->1081|2957->1084|2971->1088|3001->1096|3077->1145|3093->1152|3143->1181|3172->1183|3185->1187|3213->1194|3285->1239|3298->1243|3327->1251|3436->1333|3533->1408|3630->1474|3675->1488|3711->1497|3768->1534|3798->1555|3879->1559|3911->1565|3997->1642|4037->1644|4074->1654|4087->1658|4118->1668|4154->1677|4260->1756|4299->1785|4339->1786|4375->1802|4389->1806|4429->1807|4482->1828|4522->1840|4561->1869|4601->1870|4638->1887|4652->1891|4692->1892|4745->1913|4777->1917|4816->1946|4856->1947|4940->2003|4980->2033|5020->2034|5052->2046|5066->2050|5106->2051|5149->2062|5207->2092|5226->2101|5288->2141|5327->2152|5367->2182|5407->2183|5434->2190|5448->2194|5488->2195|5529->2204|5564->2207|5600->2213|5632->2218|5719->2278|5795->2333|5837->2348|5915->2405|5957->2420|6039->2481|6081->2496|6161->2555|6203->2570|6279->2625|6321->2640|6401->2699|6443->2714|6519->2769|6575->2798|6679->2892|6720->2894|6761->2908|6774->2912|6805->2922|6846->2935|6961->3019|6997->3028|7998->4003|8107->4102|8148->4104|8180->4110|8193->4114|8224->4124|8256->4129|8355->4198|8380->4203|8400->4214|8481->4218|8514->4225|8556->4246|8597->231|8626->1531|8655->4200|8684->4248|8714->4252|8733->4262|8789->4297
                  LINES: 24->1|25->2|26->3|27->4|28->5|29->6|34->8|38->10|38->10|40->10|41->11|44->14|44->14|44->14|44->14|47->17|47->17|49->19|49->19|49->19|50->20|51->21|51->21|51->21|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|55->25|55->25|55->25|56->26|56->26|56->26|56->26|56->26|56->26|57->27|57->27|57->27|58->28|58->28|60->30|61->31|62->32|65->37|65->37|67->37|68->38|68->38|68->38|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|70->40|71->41|72->42|74->44|74->44|75->45|75->45|76->46|76->46|77->47|77->47|78->48|78->48|79->49|79->49|80->50|80->50|82->52|82->52|82->52|83->53|83->53|83->53|84->54|85->55|86->56|102->72|102->72|102->72|103->73|103->73|103->73|104->74|105->75|106->78|106->78|108->78|110->80|110->80|112->8|114->35|116->76|118->81|121->84|121->84|121->84
                  -- GENERATED --
              */
          