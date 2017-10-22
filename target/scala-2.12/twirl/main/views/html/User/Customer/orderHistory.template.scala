
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
/*5.2*/import helper._
/*6.2*/import models.Order.OrderItemBasic

object orderHistory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[OrderItemBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(ordersList: List[OrderItemBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/table/*9.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.11*/("""
    """),format.raw/*10.5*/("""<div class="row-width-center">
        <div class="panel panel-default">
            """),format.raw/*12.44*/("""
            """),format.raw/*13.32*/("""
            """),format.raw/*14.23*/("""
            """),format.raw/*15.13*/("""<div class="panel-body">
                <div class="table-responsive">
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid">
                        <div class="row">
                            <div class="col-sm-6">
                                <div id="dataTables-example_filter" class="dataTables_filter">
                                    <div class="pull-left">
                                        <input id="searchInput" type="search" onkeyup="searchOrder()" placeholder="Search here..." class="form-control input-sm search-box standard-box-height" aria-controls="dataTables-example">
                                    </div>
                                    <div class="pull-left margin-left-small">
                                        <h4>Filter:
                                            <select id="paymentsTable_search_column" aria-controls="dataTables-example" class="standard-box-height form-control input-sm ">
                                                <option value="query_order_id">Order Number</option>
                                                <option value="query_meals_desc">Meals Description</option>
                                                <option value="query_date">Date Delivered</option>
                                                <option value="query_time">Time Delivered</option>
                                                <option value="query_status">Status</option>
                                                <option value="query_total">Total Amount</option>
                                            </select>
                                        </h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" aria-describedby="dataTables-example_info">
                            <thead>
                                <tr role="row">
                                    <th class="sorting_asc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="# Order: activate to sort column ascending" style="width: 189px;">
                                        # Order</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Meals: activate to sort column ascending" style="width: 291px;">
                                        Meals</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                        Date</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                        Time</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 113px;">
                                        Status</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Total: activate to sort column ascending" style="width: 264px;">
                                        Total ("""),_display_(/*53.49*/AppTags/*53.56*/.Locale.Currency.ZAR),format.raw/*53.76*/(""")</th>
                                </tr>
                            </thead>
                            <tbody>
                                """),format.raw/*57.108*/("""
                                """),_display_(/*58.34*/for((item, index) <- ordersList.zipWithIndex) yield /*58.79*/ {_display_(Seq[Any](format.raw/*58.81*/("""
                                    """),format.raw/*59.37*/("""<tr class="gradeA """),_display_(/*59.56*/if((index % 2) == 0)/*59.76*/ {_display_(Seq[Any](format.raw/*59.78*/("""odd""")))}/*59.83*/else/*59.88*/{_display_(Seq[Any](format.raw/*59.89*/("""even""")))}),format.raw/*59.94*/("""">
                                        <td class="sorting_1"><a href=""""),_display_(/*60.73*/CSRF(controllers.User.routes.CustomerController.viewOrder(item.orderId))),format.raw/*60.145*/("""">"""),_display_(/*60.148*/item/*60.152*/.orderId),format.raw/*60.160*/("""</a></td>
                                        <td class=" ">"""),_display_(/*61.56*/item/*61.60*/.mealNames),format.raw/*61.70*/("""</td>
                                        <td class="center ">"""),_display_(/*62.62*/item/*62.66*/.getDate),format.raw/*62.74*/("""</td>
                                        <td class="center ">"""),_display_(/*63.62*/item/*63.66*/.getTime),format.raw/*63.74*/("""</td>
                                        <td class=" ">"""),_display_(/*64.56*/item/*64.60*/.status),format.raw/*64.67*/("""</td>
                                        <td class=" ">"""),_display_(/*65.56*/AppTags/*65.63*/.Locale.Currency.ZAR),format.raw/*65.83*/(""" """),_display_(/*65.85*/item/*65.89*/.amount),format.raw/*65.96*/("""</td>
                                    </tr>
                                """)))}),format.raw/*67.34*/("""
                            """),format.raw/*68.29*/("""</tbody>
                        </table>
                    </div>

                </div>
            </div>
        </div>
        <div class="small-margin">
        """),_display_(/*76.10*/form(action = controllers.User.routes.CustomerController.index())/*76.75*/ {_display_(Seq[Any](format.raw/*76.77*/("""
            """),_display_(/*77.14*/CSRF/*77.18*/.formField),format.raw/*77.28*/("""
            """),format.raw/*78.13*/("""<input class="btn btn-info button-small" type="submit" value="Home">
            """)))}),format.raw/*79.14*/("""
        """),format.raw/*80.9*/("""</div>
    </div>
""")))};def /*84.2*/bodyContent/*84.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*84.17*/("""
    """),format.raw/*85.5*/("""<div class="row pad-botm">
        <div class="col-md-12">
            <h1 class="header-line">Ordering History</h1>
        </div>
    </div>
"""),_display_(/*90.2*/table),format.raw/*90.7*/("""
"""),_display_(/*91.2*/helper/*91.8*/.form( action = controllers.User.routes.CustomerController.index())/*91.75*/ {_display_(Seq[Any](format.raw/*91.77*/("""
    """),_display_(/*92.6*/helper/*92.12*/.CSRF.formField),format.raw/*92.27*/("""
    """),format.raw/*93.5*/("""<input type="submit" class="btn btn-default button-small" value="Home">
""")))}),format.raw/*94.2*/("""

""")))};
Seq[Any](format.raw/*7.36*/("""

"""),format.raw/*82.2*/("""

"""),format.raw/*96.2*/("""

"""),_display_(/*98.2*/masterpage/*98.12*/.apply(" :: Past Orders", bodyContent)),format.raw/*98.50*/("""
"""))
      }
    }
  }

  def render(ordersList:List[OrderItemBasic]): play.twirl.api.HtmlFormat.Appendable = apply(ordersList)

  def f:((List[OrderItemBasic]) => play.twirl.api.HtmlFormat.Appendable) = (ordersList) => apply(ordersList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Oct 22 22:44:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/orderHistory.scala.html
=======
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Customer/orderHistory.scala.html
>>>>>>> master
                  HASH: 3ff08fe3bc29fa75cf688d162cfbff3b3a75a858
                  MATRIX: 665->1|694->25|733->58|779->98|802->115|1162->151|1274->188|1286->193|1366->197|1398->202|1511->318|1552->350|1593->373|1634->386|5328->4053|5344->4060|5385->4080|5564->4305|5625->4339|5686->4384|5726->4386|5791->4423|5837->4442|5866->4462|5906->4464|5929->4469|5942->4474|5981->4475|6017->4480|6119->4555|6213->4627|6244->4630|6258->4634|6288->4642|6380->4707|6393->4711|6424->4721|6518->4788|6531->4792|6560->4800|6654->4867|6667->4871|6696->4879|6784->4940|6797->4944|6825->4951|6913->5012|6929->5019|6970->5039|6999->5041|7012->5045|7040->5052|7152->5133|7209->5162|7407->5333|7481->5398|7521->5400|7562->5414|7575->5418|7606->5428|7647->5441|7760->5523|7796->5532|7838->5554|7858->5565|7939->5569|7971->5574|8141->5718|8166->5723|8194->5725|8208->5731|8284->5798|8324->5800|8356->5806|8371->5812|8407->5827|8439->5832|8542->5905|8584->185|8613->5551|8642->5908|8671->5911|8690->5921|8749->5959
                  LINES: 24->1|25->3|26->4|27->5|28->6|33->7|37->9|37->9|39->9|40->10|42->12|43->13|44->14|45->15|83->53|83->53|83->53|87->57|88->58|88->58|88->58|89->59|89->59|89->59|89->59|89->59|89->59|89->59|89->59|90->60|90->60|90->60|90->60|90->60|91->61|91->61|91->61|92->62|92->62|92->62|93->63|93->63|93->63|94->64|94->64|94->64|95->65|95->65|95->65|95->65|95->65|95->65|97->67|98->68|106->76|106->76|106->76|107->77|107->77|107->77|108->78|109->79|110->80|112->84|112->84|114->84|115->85|120->90|120->90|121->91|121->91|121->91|121->91|122->92|122->92|122->92|123->93|124->94|127->7|129->82|131->96|133->98|133->98|133->98
                  -- GENERATED --
              */
          