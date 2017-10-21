
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

object index extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,OrderScheduleDays,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(scheduleName: String, orderScheduleWeek: OrderScheduleDays):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/generateDayTable/*8.18*/(dayName: String, dayOrderList: List[CustomerOrderItem]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.78*/("""

    """),format.raw/*10.5*/("""<div class="panel panel-default">
        <div class="panel-heading schedule-week">
            <a data-toggle="collapse" data-parent="#accordion" href="#"""),_display_(/*12.72*/dayName),format.raw/*12.79*/("""" class="collapsed">
                <div>
                    <div class="row">
                        <div class="pull-left margin-left-small">
                            <h2 class="panel-title larger-text schedule-text """),_display_(/*16.79*/if(dayOrderList.size() > 0)/*16.106*/ {_display_(Seq[Any](format.raw/*16.108*/("""schedule-day-bold""")))}),format.raw/*16.126*/("""">
                            """),_display_(/*17.30*/dayName),format.raw/*17.37*/("""
                            """),format.raw/*18.29*/("""</h2>
                            <h5 class="schedule-text margin-left-small">
                            """),_display_(/*20.30*/if(dayOrderList.size() == 0)/*20.58*/ {_display_(Seq[Any](format.raw/*20.60*/("""
                                """),format.raw/*21.33*/("""No orders
                            """)))}/*22.31*/else/*22.36*/{_display_(Seq[Any](format.raw/*22.37*/("""
                                """),_display_(/*23.34*/dayOrderList/*23.46*/.size),format.raw/*23.51*/(""" """),format.raw/*23.52*/("""orders
                            """)))}),format.raw/*24.30*/("""
                            """),format.raw/*25.29*/("""</h5>
                        </div>
                    </div>

                </div>
            </a>
        </div>
        <div id=""""),_display_(/*32.19*/dayName),format.raw/*32.26*/("""" class="panel-collapse collapse" style="height: 0px;">
            <div class="panel-body">
            """),_display_(/*34.14*/if(dayOrderList.size() == 0)/*34.42*/ {_display_(Seq[Any](format.raw/*34.44*/("""
                """),format.raw/*35.17*/("""<p class="tab">No scheduled orders</p>
            """)))}/*36.15*/else/*36.20*/{_display_(Seq[Any](format.raw/*36.21*/("""

                """),_display_(/*38.18*/for((item, index) <- dayOrderList.zipWithIndex) yield /*38.65*/ {_display_(Seq[Any](format.raw/*38.67*/("""
                    """),format.raw/*39.21*/("""<tr class="gradeA """),_display_(/*39.40*/if((index % 2) == 0)/*39.60*/ {_display_(Seq[Any](format.raw/*39.62*/("""odd""")))}/*39.67*/else/*39.72*/{_display_(Seq[Any](format.raw/*39.73*/("""even""")))}),format.raw/*39.78*/("""">
                        <td class="sorting_1"><a href=""""),_display_(/*40.57*/controllers/*40.68*/.User.routes.CustomerController.viewOrder(item.orderId)),format.raw/*40.123*/("""">"""),_display_(/*40.126*/item/*40.130*/.orderId),format.raw/*40.138*/("""</a></td>
                        <td class=" ">"""),_display_(/*41.40*/AppTags/*41.47*/.Locale.Currency.ZAR.toString),format.raw/*41.76*/(""" """),_display_(/*41.78*/item/*41.82*/.amount),format.raw/*41.89*/("""</td>
                        <td class=" ">"""),_display_(/*42.40*/item/*42.44*/.getTime),format.raw/*42.52*/("""</td>
                        <td class=" "><button class="btn btn-danger" onclick="removeScheduleOrder(item.orderId)">Remove</button></td>
                    </tr>
                """)))}),format.raw/*45.18*/("""
            """)))}),format.raw/*46.14*/("""
            """),format.raw/*47.13*/("""</div>
        </div>
    </div>
""")))};def /*52.2*/generateScheduleTable/*52.23*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*52.27*/("""
"""),_display_(/*53.2*/if(orderScheduleWeek != null)/*53.31*/ {_display_(Seq[Any](format.raw/*53.33*/("""
    """),format.raw/*54.5*/("""<button onclick="addOrder()" type="button" class="btn btn-success add-button text-bold">
        Add Order<img class="small-icon invert align-button-contents" src=""""),_display_(/*55.77*/routes/*55.83*/.Assets.versioned("images/icons/add.png")),format.raw/*55.124*/("""">
    </button>
    <br/>
    <br/>
""")))}),format.raw/*59.2*/("""
    """),format.raw/*60.5*/("""<div class="panel-group" id="accordion">
        """),_display_(/*61.10*/generateDayTable("Monday", orderScheduleWeek.getMonday)),format.raw/*61.65*/(""" """),format.raw/*61.66*/("""<br/>
        """),_display_(/*62.10*/generateDayTable("Tuesday", orderScheduleWeek.getTuesday)),format.raw/*62.67*/(""" """),format.raw/*62.68*/("""<br/>
        """),_display_(/*63.10*/generateDayTable("Wednesday", orderScheduleWeek.getWednesday)),format.raw/*63.71*/(""" """),format.raw/*63.72*/("""<br/>
        """),_display_(/*64.10*/generateDayTable("Thursday", orderScheduleWeek.getThursday)),format.raw/*64.69*/(""" """),format.raw/*64.70*/("""<br/>
        """),_display_(/*65.10*/generateDayTable("Friday", orderScheduleWeek.getFriday)),format.raw/*65.65*/(""" """),format.raw/*65.66*/("""<br/>
        """),_display_(/*66.10*/generateDayTable("Saturday", orderScheduleWeek.getSaturday)),format.raw/*66.69*/(""" """),format.raw/*66.70*/("""<br/>
        """),_display_(/*67.10*/generateDayTable("Sunday", orderScheduleWeek.getSunday)),format.raw/*67.65*/(""" """),format.raw/*67.66*/("""<br/>
        <br/>
        <div class="col-md-12">
            <div class="pull-right">
                <input type="button" class="btn btn-danger " onclick="clearSchedule()" value="Clear Schedule">
            </div>
        </div>
        <br/>
        <br/>
    </div>
""")))};def /*79.2*/getHeader/*79.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*79.15*/("""
    """),format.raw/*80.5*/("""<div class="col-lg">
        <div class="pull-center">
            <div class="row-width-center">
            """),_display_(/*83.14*/if(orderScheduleWeek == null)/*83.43*/ {_display_(Seq[Any](format.raw/*83.45*/("""
                """),format.raw/*84.17*/("""<div class="display-inline">
                    <h1 class="float-left">Your Order Schedule</h1>
                </div>
                <br/>
                <input class="btn btn-info margin-left-small" type="button" onclick="createSchedule()" value="Create Order Schedule"/>
            """)))}/*89.15*/else/*89.20*/{_display_(Seq[Any](format.raw/*89.21*/("""
                """),format.raw/*90.17*/("""<div class="row">
                    <div class="col-md-12">
                        <div class="pull-left">
                            <h1 class="small-margin"><span class="underline">Schedule:</span> """),_display_(/*93.96*/scheduleName),format.raw/*93.108*/("""
                                """),format.raw/*94.33*/("""<a href="#edit" onclick="changeScheduleName()">
                                    <img id="editScheduleName" class="schedule-heading small-image" src=""""),_display_(/*95.107*/routes/*95.113*/.Assets.versioned("images/icons/edit.png")),format.raw/*95.155*/("""">
                                </a>
                            </h1>
                        </div>
                        <div class="pull-right margin-left-small">
                            <h4 class="text-bold">Schedule Status: <input type="button" class="btn button-status """),_display_(/*100.115*/if(orderScheduleWeek.isActive)/*100.145*/ {_display_(Seq[Any](format.raw/*100.147*/("""btn-success""")))}/*100.160*/else/*100.165*/{_display_(Seq[Any](format.raw/*100.166*/("""btn-danger""")))}),format.raw/*100.177*/("""" onclick="setScheduleStatus()" id="btnScheduleStatus" value=""""),_display_(/*100.240*/if(orderScheduleWeek.isActive)/*100.270*/ {_display_(Seq[Any](format.raw/*100.272*/("""Active""")))}/*100.280*/else/*100.285*/{_display_(Seq[Any](format.raw/*100.286*/("""Inactive""")))}),format.raw/*100.295*/(""""></h4>
                        </div>
                    </div>
                </div>

            </div>
        </div>
        <br/>
        """)))}),format.raw/*108.10*/("""
    """),format.raw/*109.5*/("""</div>
    </div>
    </div>
""")))};def /*114.2*/bodyContent/*114.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*114.17*/("""

"""),_display_(/*116.2*/getHeader),format.raw/*116.11*/("""
    """),format.raw/*117.5*/("""<div class="row-width-center">
    """),_display_(/*118.6*/if(orderScheduleWeek != null)/*118.35*/ {_display_(Seq[Any](format.raw/*118.37*/("""
        """),_display_(/*119.10*/generateScheduleTable),format.raw/*119.31*/("""
    """)))}/*120.7*/else/*120.12*/{_display_(Seq[Any](format.raw/*120.13*/("""
        """),format.raw/*121.9*/("""<br/>
        <h6 >No order schedule</h6>
    """)))}),format.raw/*123.6*/("""
    """),format.raw/*124.5*/("""</div>
""")))};
Seq[Any](format.raw/*6.62*/("""

"""),format.raw/*50.2*/("""

"""),format.raw/*77.2*/("""

"""),format.raw/*112.2*/("""

"""),format.raw/*125.2*/("""


"""),_display_(/*128.2*/masterpage/*128.12*/.apply(" :: Schedule", bodyContent)),format.raw/*128.47*/("""





"""))
      }
    }
  }

  def render(scheduleName:String,orderScheduleWeek:OrderScheduleDays): play.twirl.api.HtmlFormat.Appendable = apply(scheduleName,orderScheduleWeek)

  def f:((String,OrderScheduleDays) => play.twirl.api.HtmlFormat.Appendable) = (scheduleName,orderScheduleWeek) => apply(scheduleName,orderScheduleWeek)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/index.scala.html
                  HASH: bb93b5e04ecd16c07ff759526b5e34247f48d901
                  MATRIX: 666->1|705->34|751->74|785->102|1166->163|1304->226|1328->242|1464->302|1497->308|1679->463|1707->470|1959->695|1996->722|2037->724|2087->742|2146->774|2174->781|2231->810|2366->918|2403->946|2443->948|2504->981|2562->1021|2575->1026|2614->1027|2675->1061|2696->1073|2722->1078|2751->1079|2818->1115|2875->1144|3040->1282|3068->1289|3201->1395|3238->1423|3278->1425|3323->1442|3394->1495|3407->1500|3446->1501|3492->1520|3555->1567|3595->1569|3644->1590|3690->1609|3719->1629|3759->1631|3782->1636|3795->1641|3834->1642|3870->1647|3956->1706|3976->1717|4053->1772|4084->1775|4098->1779|4128->1787|4204->1836|4220->1843|4270->1872|4299->1874|4312->1878|4340->1885|4412->1930|4425->1934|4454->1942|4668->2125|4713->2139|4754->2152|4811->2189|4841->2210|4922->2214|4950->2216|4988->2245|5028->2247|5060->2252|5252->2417|5267->2423|5330->2464|5398->2502|5430->2507|5507->2557|5583->2612|5612->2613|5654->2628|5732->2685|5761->2686|5803->2701|5885->2762|5914->2763|5956->2778|6036->2837|6065->2838|6107->2853|6183->2908|6212->2909|6254->2924|6334->2983|6363->2984|6405->2999|6481->3054|6510->3055|6807->3332|6825->3341|6906->3345|6938->3350|7076->3461|7114->3490|7154->3492|7199->3509|7508->3800|7521->3805|7560->3806|7605->3823|7837->4028|7871->4040|7932->4073|8114->4227|8130->4233|8194->4275|8509->4561|8550->4591|8592->4593|8625->4606|8640->4611|8681->4612|8725->4623|8817->4686|8858->4716|8900->4718|8928->4726|8943->4731|8984->4732|9026->4741|9205->4888|9238->4893|9292->4926|9313->4937|9395->4941|9425->4944|9456->4953|9489->4958|9552->4994|9591->5023|9632->5025|9670->5035|9713->5056|9738->5063|9752->5068|9792->5069|9829->5078|9907->5125|9940->5130|9987->223|10016->2186|10045->3329|10075->4923|10105->5138|10136->5142|10156->5152|10213->5187
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|40->10|42->12|42->12|46->16|46->16|46->16|46->16|47->17|47->17|48->18|50->20|50->20|50->20|51->21|52->22|52->22|52->22|53->23|53->23|53->23|53->23|54->24|55->25|62->32|62->32|64->34|64->34|64->34|65->35|66->36|66->36|66->36|68->38|68->38|68->38|69->39|69->39|69->39|69->39|69->39|69->39|69->39|69->39|70->40|70->40|70->40|70->40|70->40|70->40|71->41|71->41|71->41|71->41|71->41|71->41|72->42|72->42|72->42|75->45|76->46|77->47|80->52|80->52|82->52|83->53|83->53|83->53|84->54|85->55|85->55|85->55|89->59|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|96->66|96->66|96->66|97->67|97->67|97->67|107->79|107->79|109->79|110->80|113->83|113->83|113->83|114->84|119->89|119->89|119->89|120->90|123->93|123->93|124->94|125->95|125->95|125->95|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|130->100|138->108|139->109|142->114|142->114|144->114|146->116|146->116|147->117|148->118|148->118|148->118|149->119|149->119|150->120|150->120|150->120|151->121|153->123|154->124|156->6|158->50|160->77|162->112|164->125|167->128|167->128|167->128
                  -- GENERATED --
              */
          