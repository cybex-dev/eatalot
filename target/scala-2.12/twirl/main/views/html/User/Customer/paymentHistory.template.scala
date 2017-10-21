
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
/*4.2*/import helper._
/*5.2*/import models.Finance.PaymentItemBasic

object paymentHistory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[PaymentItemBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(paymentList: List[PaymentItemBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*10.2*/table/*10.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.11*/("""
    """),format.raw/*11.5*/("""<div class="row-width-center">
        <div class="panel panel-default">
            """),format.raw/*13.44*/("""
            """),format.raw/*14.32*/("""
            """),format.raw/*15.23*/("""
            """),format.raw/*16.13*/("""<div class="panel-body">
                <div class="table-responsive">
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid">
                        <div class="row">
                            <div class="col-sm-6">
                                <div id="dataTables-example_filter" class="dataTables_filter">
                                    <div class="pull-left">
                                        <input id="searchInput" type="search" onkeyup="searchPayment()" placeholder="Search here..." class="form-control input-sm search-box standard-box-height" aria-controls="dataTables-example">
                                    </div>
                                    <div class="pull-left margin-left-small">
                                        <h4>Filter:
                                            <select id="paymentsTable_search_column" aria-controls="dataTables-example" class="standard-box-height form-control input-sm ">
                                                <option value="query_payment_id">Payment Number</option>
                                                <option value="query_total">Total Amount</option>
                                                <option value="query_cash_payment">Cash Payments</option>
                                                <option value="query_credit_payment">Credit Payments</option>
                                                <option value="query_deliverer">Deliverer</option>
                                            </select>
                                        </h4>
                                    </div>
                                </div>
                            </div>
                        </div>
                        <table class="table table-striped table-bordered table-hover dataTable no-footer" id="paymentsTable" aria-describedby="dataTables-example_info">
                            <thead>
                                <tr role="row">
                                    <th class="sorting_asc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="# Payment: activate to sort column ascending" style="width: 189px;">
                                        # Payment</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Total: activate to sort column ascending" style="width: 291px;">
                                        Total</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Cash: activate to sort column ascending" style="width: 264px;">
                                        Cash</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Delivered By: activate to sort column ascending" style="width: 160px;">
                                        Delivered By</th>
                                </tr>
                            </thead>
                            <tbody>
                                """),format.raw/*53.108*/("""
                                """),_display_(/*54.34*/for((item, index) <- paymentList.zipWithIndex) yield /*54.80*/ {_display_(Seq[Any](format.raw/*54.82*/("""
                                    """),format.raw/*55.37*/("""<tr class="gradeA """),_display_(/*55.56*/if((index % 2) == 0)/*55.76*/ {_display_(Seq[Any](format.raw/*55.78*/("""odd""")))}/*55.83*/else/*55.88*/{_display_(Seq[Any](format.raw/*55.89*/("""even""")))}),format.raw/*55.94*/("""">
                                        <td class="sorting_1"><a href=""""),_display_(/*56.73*/CSRF(controllers.User.routes.CustomerController.viewPayment(item.paymentId))),format.raw/*56.149*/("""">"""),_display_(/*56.152*/item/*56.156*/.paymentId),format.raw/*56.166*/("""</a></td>
                                        <td class=" ">"""),_display_(/*57.56*/item/*57.60*/.amount),format.raw/*57.67*/("""</td>
                                        <td class=" ">"""),_display_(/*58.56*/if(item.isCash == true)/*58.79*/ {_display_(Seq[Any](format.raw/*58.81*/(""""Yes"""")))}/*58.88*/else/*58.93*/{_display_(Seq[Any](format.raw/*58.94*/(""""No"""")))}),format.raw/*58.99*/("""</td>
                                        <td class=" ">"""),_display_(/*59.56*/item/*59.60*/.delivererName),format.raw/*59.74*/("""</td>
                                    </tr>
                                """)))}),format.raw/*61.34*/("""
                            """),format.raw/*62.29*/("""</tbody>
                        </table>
                    </div>

                </div>
            </div>
        </div>
        <div class="small-margin">
        """),_display_(/*70.10*/form(action = controllers.User.routes.CustomerController.index())/*70.75*/ {_display_(Seq[Any](format.raw/*70.77*/("""
            """),_display_(/*71.14*/CSRF/*71.18*/.formField),format.raw/*71.28*/("""
            """),format.raw/*72.13*/("""<input class="btn btn-info button-small" type="submit" value="Home">
            """)))}),format.raw/*73.14*/("""
        """),format.raw/*74.9*/("""</div>
    </div>
""")))};def /*78.2*/bodyContent/*78.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*78.17*/("""
    """),format.raw/*79.5*/("""<div class="row pad-botm">
        <div class="col-md-12">
            <h1 class="header-line">Payment History</h1>
        </div>
    </div>
"""),_display_(/*84.2*/table),format.raw/*84.7*/("""

""")))};
Seq[Any](format.raw/*7.39*/("""


"""),format.raw/*76.2*/("""

"""),format.raw/*86.2*/("""

"""),_display_(/*88.2*/masterpage/*88.12*/.apply(" :: Past Payments", bodyContent)),format.raw/*88.52*/("""
"""))
      }
    }
  }

  def render(paymentList:List[PaymentItemBasic]): play.twirl.api.HtmlFormat.Appendable = apply(paymentList)

  def f:((List[PaymentItemBasic]) => play.twirl.api.HtmlFormat.Appendable) = (paymentList) => apply(paymentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/paymentHistory.scala.html
                  HASH: 8c3350cb54ecac5463cdd1ed9d467e9743f5b20d
                  MATRIX: 665->1|694->25|733->58|756->75|1124->116|1240->157|1253->162|1334->166|1366->171|1479->287|1520->319|1561->342|1602->355|4867->3666|4928->3700|4990->3746|5030->3748|5095->3785|5141->3804|5170->3824|5210->3826|5233->3831|5246->3836|5285->3837|5321->3842|5423->3917|5521->3993|5552->3996|5566->4000|5598->4010|5690->4075|5703->4079|5731->4086|5819->4147|5851->4170|5891->4172|5916->4179|5929->4184|5968->4185|6004->4190|6092->4251|6105->4255|6140->4269|6252->4350|6309->4379|6507->4550|6581->4615|6621->4617|6662->4631|6675->4635|6706->4645|6747->4658|6860->4740|6896->4749|6938->4771|6958->4782|7039->4786|7071->4791|7240->4934|7265->4939|7307->153|7337->4768|7366->4942|7395->4945|7414->4955|7475->4995
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->10|36->10|38->10|39->11|41->13|42->14|43->15|44->16|81->53|82->54|82->54|82->54|83->55|83->55|83->55|83->55|83->55|83->55|83->55|83->55|84->56|84->56|84->56|84->56|84->56|85->57|85->57|85->57|86->58|86->58|86->58|86->58|86->58|86->58|86->58|87->59|87->59|87->59|89->61|90->62|98->70|98->70|98->70|99->71|99->71|99->71|100->72|101->73|102->74|104->78|104->78|106->78|107->79|112->84|112->84|115->7|118->76|120->86|122->88|122->88|122->88
                  -- GENERATED --
              */
          