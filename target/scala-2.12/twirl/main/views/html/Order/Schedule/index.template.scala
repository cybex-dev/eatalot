
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[OrderScheduleDays,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(orderScheduleWeek: OrderScheduleDays):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*13.2*/generateDayTable/*13.18*/(dayName: String, dayOrderList: List[CustomerOrderItem]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*13.78*/("""

"""),_display_(/*15.2*/if(dayOrderList.size() == 0)/*15.30*/ {_display_(Seq[Any](format.raw/*15.32*/("""
    """),format.raw/*16.5*/("""<label class="tab">No scheduled orders</label>
""")))}/*17.3*/else/*17.8*/{_display_(Seq[Any](format.raw/*17.9*/("""

    """),format.raw/*19.5*/("""<div class="panel panel-default">
        <div class="panel-heading">
            <h4 class="panel-title">
                <a data-toggle="collapse" data-parent="#accordion" href=""""),_display_(/*22.75*/getCollapseName(dayName)),format.raw/*22.99*/("""" class="collapse">
                    dayName</a>
            </h4>
        </div>
        <div id=""""),_display_(/*26.19*/getCollapseName(dayName)),format.raw/*26.43*/("""" class="panel-collapse collapse" style="">
            <div class="panel-body">
            """),_display_(/*28.14*/for((item, index) <- dayOrderList.zipWithIndex) yield /*28.61*/ {_display_(Seq[Any](format.raw/*28.63*/("""
                """),format.raw/*29.17*/("""<tr class="gradeA """),_display_(/*29.36*/if((index % 2) == 0)/*29.56*/{_display_(Seq[Any](format.raw/*29.57*/("""odd""")))}/*29.61*/else/*29.65*/{_display_(Seq[Any](format.raw/*29.66*/("""even""")))}),format.raw/*29.71*/("""">
                    <td class="sorting_1"><a href=""""),_display_(/*30.53*/controllers/*30.64*/.User.routes.CustomerController.viewOrder(item.orderId)),format.raw/*30.119*/("""">"""),_display_(/*30.122*/item/*30.126*/.orderId),format.raw/*30.134*/("""</a></td>
                    <td class=" ">"""),_display_(/*31.36*/AppTags/*31.43*/.Locale.Currency.ZAR.toString),format.raw/*31.72*/(""" """),_display_(/*31.74*/item/*31.78*/.amount),format.raw/*31.85*/("""</td>
                    <td class=" ">"""),_display_(/*32.36*/item/*32.40*/.getTime()),format.raw/*32.50*/("""</td>
                    <td class=" "><button class="btn btn-danger" href=""""),_display_(/*33.73*/CSRF(controllers.Order.routes.ScheduleController.removeOrder(item.orderId))),format.raw/*33.148*/("""">Remove</button></td>
                </tr>
            """)))}),format.raw/*35.14*/("""
            """),format.raw/*36.13*/("""</div>
        </div>
    </div>
""")))}),format.raw/*39.2*/("""

""")))};def /*43.2*/bodyContent/*43.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*43.17*/("""
    """),format.raw/*44.5*/("""<h1>Your order schedule</h1>
    <br/>


"""),_display_(/*48.2*/if(orderScheduleWeek == null)/*48.31*/ {_display_(Seq[Any](format.raw/*48.33*/("""
    """),_display_(/*49.6*/helper/*49.12*/.form),format.raw/*49.17*/(""" """),format.raw/*49.18*/("""( action = """),_display_(/*49.30*/controllers/*49.41*/.Order.routes.ScheduleController.createSchedule()),format.raw/*49.90*/(""")"""),format.raw/*49.91*/("""{"""),format.raw/*49.92*/("""
        """),_display_(/*50.10*/CSRF/*50.14*/.formField),format.raw/*50.24*/("""
        """),format.raw/*51.9*/("""<input type="submit" class="btn btn-info" name="Create Schedule">
    """),format.raw/*52.5*/("""}"""),format.raw/*52.6*/("""
""")))}/*53.3*/else/*53.8*/{_display_(Seq[Any](format.raw/*53.9*/("""
    """),_display_(/*54.6*/helper/*54.12*/.form),format.raw/*54.17*/(""" """),format.raw/*54.18*/("""( action = """),_display_(/*54.30*/controllers/*54.41*/.Order.routes.ScheduleController.editScheduleName()),format.raw/*54.92*/(""")"""),format.raw/*54.93*/("""{"""),format.raw/*54.94*/("""
        """),_display_(/*55.10*/CSRF/*55.14*/.formField),format.raw/*55.24*/("""
        """),format.raw/*56.9*/("""<input type="submit" class="btn btn-info" name="Change Schedule Name">
    """),format.raw/*57.5*/("""}"""),format.raw/*57.6*/("""
    """),format.raw/*58.5*/("""<div class="panel-group" id="accordion"><input type="button """),_display_(/*58.66*/if(orderScheduleWeek.isActive)/*58.96*/ {_display_(Seq[Any](format.raw/*58.98*/("""btn-success""")))}/*58.111*/else/*58.116*/{_display_(Seq[Any](format.raw/*58.117*/("""btn-warning""")))}),format.raw/*58.129*/("""" name=""""),_display_(/*58.138*/if(orderScheduleWeek.isActive)/*58.168*/ {_display_(Seq[Any](format.raw/*58.170*/("""Active""")))}/*58.178*/else/*58.183*/{_display_(Seq[Any](format.raw/*58.184*/("""Inactive""")))}),format.raw/*58.193*/("""">
        """),_display_(/*59.10*/generateDayTable("Monday", orderScheduleWeek.getMonday)),format.raw/*59.65*/("""
        """),_display_(/*60.10*/generateDayTable("Tuesday", orderScheduleWeek.getTuesday)),format.raw/*60.67*/("""
        """),_display_(/*61.10*/generateDayTable("Wednesday", orderScheduleWeek.getWednesday)),format.raw/*61.71*/("""
        """),_display_(/*62.10*/generateDayTable("Thursday", orderScheduleWeek.getThursday)),format.raw/*62.69*/("""
        """),_display_(/*63.10*/generateDayTable("Friday", orderScheduleWeek.getFriday)),format.raw/*63.65*/("""
        """),_display_(/*64.10*/generateDayTable("Saturday", orderScheduleWeek.getSaturday)),format.raw/*64.69*/("""
        """),_display_(/*65.10*/generateDayTable("Sunday", orderScheduleWeek.getSunday)),format.raw/*65.65*/("""
        """),format.raw/*66.9*/("""<input type="submit" class="btn btn-success" name="Add Order (TODO)" href=""""),_display_(/*66.85*/controllers/*66.96*/.Order.routes.ScheduleController.addOrder()),format.raw/*66.139*/("""">
    </div>
    """),_display_(/*68.6*/helper/*68.12*/.form),format.raw/*68.17*/(""" """),format.raw/*68.18*/("""( action = """),_display_(/*68.30*/controllers/*68.41*/.Order.routes.ScheduleController.clearSchedule()),format.raw/*68.89*/(""")"""),format.raw/*68.90*/("""{"""),format.raw/*68.91*/("""
        """),_display_(/*69.10*/CSRF/*69.14*/.formField),format.raw/*69.24*/("""
        """),format.raw/*70.9*/("""<input type="submit" class="btn btn-info" name="Clear Schedule">
    """),format.raw/*71.5*/("""}"""),format.raw/*71.6*/("""
""")))}),format.raw/*72.2*/("""
""")))};def /*9.2*/getCollapseName/*9.17*/(dayName: String) = {{
    "#collapse" + dayName
}};
Seq[Any](format.raw/*7.40*/("""

"""),format.raw/*11.2*/("""

"""),format.raw/*41.2*/("""

"""),format.raw/*73.2*/("""


"""),_display_(/*76.2*/masterpage/*76.12*/.apply(" :: Schedule", bodyContent)),format.raw/*76.47*/("""




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
                  DATE: Thu Oct 12 15:36:15 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/index.scala.html
                  HASH: 90b81c79c50e81c287766855780e2032c6765995
                  MATRIX: 666->1|705->34|750->73|795->112|841->152|1175->173|1292->282|1317->298|1454->358|1483->361|1520->389|1560->391|1592->396|1658->445|1670->450|1708->451|1741->457|1949->638|1994->662|2124->765|2169->789|2290->883|2353->930|2393->932|2438->949|2484->968|2513->988|2552->989|2575->993|2588->997|2627->998|2663->1003|2745->1058|2765->1069|2842->1124|2873->1127|2887->1131|2917->1139|2989->1184|3005->1191|3055->1220|3084->1222|3097->1226|3125->1233|3193->1274|3206->1278|3237->1288|3342->1366|3439->1441|3528->1499|3569->1512|3633->1546|3659->1552|3679->1563|3760->1567|3792->1572|3860->1614|3898->1643|3938->1645|3970->1651|3985->1657|4011->1662|4040->1663|4079->1675|4099->1686|4169->1735|4198->1736|4227->1737|4264->1747|4277->1751|4308->1761|4344->1770|4441->1840|4469->1841|4489->1844|4501->1849|4539->1850|4571->1856|4586->1862|4612->1867|4641->1868|4680->1880|4700->1891|4772->1942|4801->1943|4830->1944|4867->1954|4880->1958|4911->1968|4947->1977|5049->2052|5077->2053|5109->2058|5197->2119|5236->2149|5276->2151|5308->2164|5322->2169|5362->2170|5406->2182|5443->2191|5483->2221|5524->2223|5551->2231|5565->2236|5605->2237|5646->2246|5685->2258|5761->2313|5798->2323|5876->2380|5913->2390|5995->2451|6032->2461|6112->2520|6149->2530|6225->2585|6262->2595|6342->2654|6379->2664|6455->2719|6491->2728|6594->2804|6614->2815|6679->2858|6724->2877|6739->2883|6765->2888|6794->2889|6833->2901|6853->2912|6922->2960|6951->2961|6980->2962|7017->2972|7030->2976|7061->2986|7097->2995|7193->3064|7221->3065|7253->3067|7277->214|7300->229|7380->211|7409->279|7438->1549|7467->3069|7497->3073|7516->3083|7572->3118
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->13|37->13|39->13|41->15|41->15|41->15|42->16|43->17|43->17|43->17|45->19|48->22|48->22|52->26|52->26|54->28|54->28|54->28|55->29|55->29|55->29|55->29|55->29|55->29|55->29|55->29|56->30|56->30|56->30|56->30|56->30|56->30|57->31|57->31|57->31|57->31|57->31|57->31|58->32|58->32|58->32|59->33|59->33|61->35|62->36|65->39|67->43|67->43|69->43|70->44|74->48|74->48|74->48|75->49|75->49|75->49|75->49|75->49|75->49|75->49|75->49|75->49|76->50|76->50|76->50|77->51|78->52|78->52|79->53|79->53|79->53|80->54|80->54|80->54|80->54|80->54|80->54|80->54|80->54|80->54|81->55|81->55|81->55|82->56|83->57|83->57|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|84->58|85->59|85->59|86->60|86->60|87->61|87->61|88->62|88->62|89->63|89->63|90->64|90->64|91->65|91->65|92->66|92->66|92->66|92->66|94->68|94->68|94->68|94->68|94->68|94->68|94->68|94->68|94->68|95->69|95->69|95->69|96->70|97->71|97->71|98->72|99->9|99->9|102->7|104->11|106->41|108->73|111->76|111->76|111->76
                  -- GENERATED --
              */
          