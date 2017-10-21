
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
/*2.2*/import controllers.Application.AppTags
/*3.2*/import helper.{CSRF, form}
/*4.2*/import models.Order.{CustomerOrderItem, OrderScheduleDays}

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[OrderScheduleDays,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(orderScheduleWeek: OrderScheduleDays):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/generateDayTable/*8.18*/(dayName: String, dayOrderList: List[CustomerOrderItem]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.78*/("""
    """),format.raw/*9.5*/("""<div class="panel panel-default">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*12.76*/dayName),format.raw/*12.83*/("""" class="collapsed">"""),_display_(/*12.104*/dayName),format.raw/*12.111*/("""</a>
            </h4>
        </div>
        <div id=""""),_display_(/*15.19*/dayName),format.raw/*15.26*/("""" class="panel-collapse collapse" style="height: 0px;">
           <div class="panel-body">
            """),_display_(/*17.14*/if(dayOrderList.size() == 0)/*17.42*/ {_display_(Seq[Any](format.raw/*17.44*/("""
                    """),format.raw/*18.21*/("""<p class="tab">No scheduled orders</p>
            """)))}/*19.15*/else/*19.20*/{_display_(Seq[Any](format.raw/*19.21*/("""

                """),_display_(/*21.18*/for((item, index) <- dayOrderList.zipWithIndex) yield /*21.65*/ {_display_(Seq[Any](format.raw/*21.67*/("""
                    """),format.raw/*22.21*/("""<tr class="gradeA """),_display_(/*22.40*/if((index % 2) == 0)/*22.60*/ {_display_(Seq[Any](format.raw/*22.62*/("""odd""")))}/*22.67*/else/*22.72*/{_display_(Seq[Any](format.raw/*22.73*/("""even""")))}),format.raw/*22.78*/("""">
                        <td class="sorting_1"><a href=""""),_display_(/*23.57*/controllers/*23.68*/.User.routes.CustomerController.viewOrder(item.orderId)),format.raw/*23.123*/("""">"""),_display_(/*23.126*/item/*23.130*/.orderId),format.raw/*23.138*/("""</a></td>
                        <td class=" ">"""),_display_(/*24.40*/AppTags/*24.47*/.Locale.Currency.ZAR.toString),format.raw/*24.76*/(""" """),_display_(/*24.78*/item/*24.82*/.amount),format.raw/*24.89*/("""</td>
                        <td class=" ">"""),_display_(/*25.40*/item/*25.44*/.getTime),format.raw/*25.52*/("""</td>
                        <td class=" "><button class="btn btn-danger" href=""""),_display_(/*26.77*/CSRF(controllers.Order.routes.ScheduleController.removeOrder(item.orderId))),format.raw/*26.152*/("""">Remove</button></td>
                    </tr>
                """)))}),format.raw/*28.18*/("""
            """)))}),format.raw/*29.14*/("""
        """),format.raw/*30.9*/("""</div>
        </div>
    </div>
""")))};def /*35.2*/generateScheduleTable/*35.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*35.27*/("""
    """),format.raw/*36.5*/("""<br/>
    <div class="panel-group" id="accordion">
        """),_display_(/*38.10*/generateDayTable("Monday", orderScheduleWeek.getMonday)),format.raw/*38.65*/("""<br/>
        """),_display_(/*39.10*/generateDayTable("Tuesday", orderScheduleWeek.getTuesday)),format.raw/*39.67*/("""<br/>
        """),_display_(/*40.10*/generateDayTable("Wednesday", orderScheduleWeek.getWednesday)),format.raw/*40.71*/("""<br/>
        """),_display_(/*41.10*/generateDayTable("Thursday", orderScheduleWeek.getThursday)),format.raw/*41.69*/("""<br/>
        """),_display_(/*42.10*/generateDayTable("Friday", orderScheduleWeek.getFriday)),format.raw/*42.65*/("""<br/>
        """),_display_(/*43.10*/generateDayTable("Saturday", orderScheduleWeek.getSaturday)),format.raw/*43.69*/("""<br/>
        """),_display_(/*44.10*/generateDayTable("Sunday", orderScheduleWeek.getSunday)),format.raw/*44.65*/("""<br/>
        <br/>
        """),_display_(/*46.10*/form(action = controllers.Order.routes.ScheduleController.addOrder(), '_class -> "pull-right")/*46.104*/ {_display_(Seq[Any](format.raw/*46.106*/("""
            """),_display_(/*47.14*/CSRF/*47.18*/.formField),format.raw/*47.28*/("""
            """),format.raw/*48.13*/("""<input type="submit" class="btn btn-success" value="Add Order (TODO)">
            """)))}),format.raw/*49.14*/("""
        """),format.raw/*50.9*/("""<br/>
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

""")))};def /*69.2*/bodyContent/*69.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*69.17*/("""
    """),_display_(/*70.6*/form(action = controllers.Order.routes.ScheduleController.editScheduleName())/*70.83*/ {_display_(Seq[Any](format.raw/*70.85*/("""
        """),_display_(/*71.10*/CSRF/*71.14*/.formField),format.raw/*71.24*/("""
        """),format.raw/*72.9*/("""<h1>Your Order Schedule </h1><input type="button" class="btn btn-info" value=""""),_display_(/*72.88*/if(orderScheduleWeek == null)/*72.117*/{_display_(Seq[Any](format.raw/*72.118*/("""Create Schedule""")))}/*72.134*/else/*72.138*/{_display_(Seq[Any](format.raw/*72.139*/("""Change Schedule Name""")))}),format.raw/*72.160*/("""" onclick=""""),_display_(/*72.172*/if(orderScheduleWeek == null)/*72.201*/{_display_(Seq[Any](format.raw/*72.202*/("""createSchedule()""")))}/*72.219*/else/*72.223*/{_display_(Seq[Any](format.raw/*72.224*/("""changeScheduleName()""")))}),format.raw/*72.245*/(""""/>"""),_display_(/*72.249*/if(orderScheduleWeek != null)/*72.278*/{_display_(Seq[Any](format.raw/*72.279*/("""<input id="btnScheduleStatus" type="button" class="btn button-small """),_display_(/*72.348*/if(orderScheduleWeek.isActive)/*72.378*/{_display_(Seq[Any](format.raw/*72.379*/("""btn-success""")))}/*72.391*/else/*72.395*/{_display_(Seq[Any](format.raw/*72.396*/("""btn-danger""")))}),format.raw/*72.407*/("""" onclick="setScheduleStatus("""),_display_(/*72.437*/session()/*72.446*/.get(AppTags.AppCookie.user_id.toString)),format.raw/*72.486*/(""")" value=""""),_display_(/*72.497*/if(orderScheduleWeek.isActive)/*72.527*/{_display_(Seq[Any](format.raw/*72.528*/("""Active""")))}/*72.535*/else/*72.539*/{_display_(Seq[Any](format.raw/*72.540*/("""Inactive""")))}),format.raw/*72.549*/("""">""")))}),format.raw/*72.552*/("""
    """)))}),format.raw/*73.6*/("""
    """),_display_(/*74.6*/generateScheduleTable),format.raw/*74.27*/("""
"""),_display_(/*75.2*/form(action = controllers.Order.routes.ScheduleController.clearSchedule(), '_class -> "pull-right")/*75.101*/ {_display_(Seq[Any](format.raw/*75.103*/("""
    """),_display_(/*76.6*/CSRF/*76.10*/.formField),format.raw/*76.20*/("""
    """),format.raw/*77.5*/("""<input type="submit" class="btn btn-danger" value="Clear Schedule">
""")))}),format.raw/*78.2*/("""
""")))};
Seq[Any](format.raw/*6.40*/("""

"""),format.raw/*33.2*/("""

"""),format.raw/*67.2*/("""

"""),format.raw/*79.2*/("""


"""),_display_(/*82.2*/masterpage/*82.12*/.apply(" :: Schedule", bodyContent)),format.raw/*82.47*/("""





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
                  DATE: Sat Oct 21 09:12:57 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/Order/Schedule/index.scala.html
                  HASH: 4964cfb960a6bae92e0bbb73b7f816cf4de05eac
                  MATRIX: 666->1|705->34|751->74|785->102|1159->163|1275->204|1299->220|1435->280|1466->285|1675->467|1703->474|1752->495|1781->502|1864->558|1892->565|2024->670|2061->698|2101->700|2150->721|2221->774|2234->779|2273->780|2319->799|2382->846|2422->848|2471->869|2517->888|2546->908|2586->910|2609->915|2622->920|2661->921|2697->926|2783->985|2803->996|2880->1051|2911->1054|2925->1058|2955->1066|3031->1115|3047->1122|3097->1151|3126->1153|3139->1157|3167->1164|3239->1209|3252->1213|3281->1221|3390->1303|3487->1378|3584->1444|3629->1458|3665->1467|3722->1504|3752->1525|3833->1529|3865->1534|3952->1594|4028->1649|4070->1664|4148->1721|4190->1736|4272->1797|4314->1812|4394->1871|4436->1886|4512->1941|4554->1956|4634->2015|4676->2030|4752->2085|4808->2114|4912->2208|4953->2210|4994->2224|5007->2228|5038->2238|5079->2251|5194->2335|5230->2344|6229->3323|6249->3334|6330->3338|6362->3344|6448->3421|6488->3423|6525->3433|6538->3437|6569->3447|6605->3456|6711->3535|6750->3564|6790->3565|6826->3581|6840->3585|6880->3586|6933->3607|6973->3619|7012->3648|7052->3649|7089->3666|7103->3670|7143->3671|7196->3692|7228->3696|7267->3725|7307->3726|7404->3795|7444->3825|7484->3826|7516->3838|7530->3842|7570->3843|7613->3854|7671->3884|7690->3893|7752->3933|7791->3944|7831->3974|7871->3975|7898->3982|7912->3986|7952->3987|7993->3996|8028->3999|8064->4005|8096->4011|8138->4032|8166->4034|8275->4133|8316->4135|8348->4141|8361->4145|8392->4155|8424->4160|8523->4229|8564->201|8593->1501|8622->3320|8651->4231|8681->4235|8700->4245|8756->4280
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|42->12|42->12|42->12|42->12|45->15|45->15|47->17|47->17|47->17|48->18|49->19|49->19|49->19|51->21|51->21|51->21|52->22|52->22|52->22|52->22|52->22|52->22|52->22|52->22|53->23|53->23|53->23|53->23|53->23|53->23|54->24|54->24|54->24|54->24|54->24|54->24|55->25|55->25|55->25|56->26|56->26|58->28|59->29|60->30|63->35|63->35|65->35|66->36|68->38|68->38|69->39|69->39|70->40|70->40|71->41|71->41|72->42|72->42|73->43|73->43|74->44|74->44|76->46|76->46|76->46|77->47|77->47|77->47|78->48|79->49|80->50|97->69|97->69|99->69|100->70|100->70|100->70|101->71|101->71|101->71|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|102->72|103->73|104->74|104->74|105->75|105->75|105->75|106->76|106->76|106->76|107->77|108->78|110->6|112->33|114->67|116->79|119->82|119->82|119->82
                  -- GENERATED --
              */
          