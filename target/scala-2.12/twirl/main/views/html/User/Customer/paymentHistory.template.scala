
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

def /*10.6*/table/*10.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*10.15*/("""
        """),format.raw/*11.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">Payments History</h4>

            </div>

        </div>
        <div class="panel panel-default">
            """),format.raw/*19.44*/("""
                """),format.raw/*20.36*/("""
            """),format.raw/*21.23*/("""
            """),format.raw/*22.13*/("""<div class="panel-body">
                <div class="table-responsive">
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid"><div class="row"><div class="col-sm-6"><div class="dataTables_length" id="dataTables-example_length"><label><select name="dataTables-example_length" aria-controls="dataTables-example" class="form-control input-sm"><option value="10">
                        10</option><option value="25">25</option><option value="50">50</option><option value="100">
                        100</option></select>
                        records per page</label></div></div><div class="col-sm-6"><div id="dataTables-example_filter" class="dataTables_filter"><label>
                        Search:<input type="search" class="form-control input-sm" aria-controls="dataTables-example"></label></div></div></div><table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" aria-describedby="dataTables-example_info">
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
                            """),format.raw/*42.104*/("""
                            """),_display_(/*43.30*/for((item, index) <- paymentList.zipWithIndex) yield /*43.76*/ {_display_(Seq[Any](format.raw/*43.78*/("""
                                """),format.raw/*44.95*/("""
                                """),format.raw/*45.33*/("""<tr class="gradeA """),_display_(/*45.52*/if((index % 2) == 0)/*45.72*/ {_display_(Seq[Any](format.raw/*45.74*/("""odd""")))}/*45.79*/else/*45.84*/{_display_(Seq[Any](format.raw/*45.85*/("""even""")))}),format.raw/*45.90*/("""">
                                    <td class="sorting_1"><a href=""""),_display_(/*46.69*/controllers/*46.80*/.User.routes.CustomerController.viewPayment(item.paymentId)),format.raw/*46.139*/("""">"""),_display_(/*46.142*/item/*46.146*/.paymentId),format.raw/*46.156*/("""</a></td>
                                    <td class=" ">"""),_display_(/*47.52*/item/*47.56*/.amount),format.raw/*47.63*/("""</td>
                                    <td class=" ">"""),_display_(/*48.52*/if(item.isCash == true)/*48.75*/{_display_(Seq[Any](format.raw/*48.76*/(""""Yes"""")))}/*48.82*/else/*48.86*/{_display_(Seq[Any](format.raw/*48.87*/(""""No"""")))}),format.raw/*48.92*/("""</td>
                                    <td class=" ">"""),_display_(/*49.52*/item/*49.56*/.delivererName),format.raw/*49.70*/("""</td>
                                </tr>
                            """)))}),format.raw/*51.30*/("""
                        """),format.raw/*52.25*/("""</tbody>
                    </table>

                        <div class="row"><div class="col-sm-6"><div class="dataTables_info" id="dataTables-example_info" role="alert" aria-live="polite" aria-relevant="all">
                            Showing 1 to 10 of 57 entries</div></div><div class="col-sm-6"><div class="dataTables_paginate paging_simple_numbers" id="dataTables-example_paginate"><ul class="pagination"><li class="paginate_button previous disabled" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_previous"><a href="#">
                            Previous</a></li><li class="paginate_button active" aria-controls="dataTables-example" tabindex="0"><a href="#">
                            1</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">
                            2</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">
                            3</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">
                            4</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">
                            5</a></li><li class="paginate_button " aria-controls="dataTables-example" tabindex="0"><a href="#">
                            6</a></li><li class="paginate_button next" aria-controls="dataTables-example" tabindex="0" id="dataTables-example_next"><a href="#">
                            Next</a></li></ul></div></div></div></div>
                </div>

            </div>
        </div>
    """),_display_(/*69.6*/form( action = controllers.User.routes.CustomerController.index())/*69.72*/{_display_(Seq[Any](format.raw/*69.73*/("""
        """),_display_(/*70.10*/CSRF/*70.14*/.formField),format.raw/*70.24*/("""
        """),format.raw/*71.9*/("""<input class="btn btn-info" type="submit" name="Home">
    """)))}),format.raw/*72.6*/("""
    """)))};
Seq[Any](format.raw/*7.39*/("""


    """),format.raw/*73.6*/("""

    """),_display_(/*75.6*/masterpage/*75.16*/.apply(" :: Past Payments", table)),format.raw/*75.50*/("""
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
                  DATE: Sat Oct 21 09:12:57 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/User/Customer/paymentHistory.scala.html
                  HASH: b60e1a4ebd6b6d8b4bb9524a1ac330ac5d6a4d50
                  MATRIX: 665->1|694->25|733->58|756->75|1124->116|1240->161|1254->166|1335->170|1371->179|1614->425|1659->461|1700->484|1741->497|4032->2834|4089->2864|4151->2910|4191->2912|4252->3007|4313->3040|4359->3059|4388->3079|4428->3081|4451->3086|4464->3091|4503->3092|4539->3097|4637->3168|4657->3179|4738->3238|4769->3241|4783->3245|4815->3255|4903->3316|4916->3320|4944->3327|5028->3384|5060->3407|5099->3408|5124->3414|5137->3418|5176->3419|5212->3424|5296->3481|5309->3485|5344->3499|5448->3572|5501->3597|7158->5228|7233->5294|7272->5295|7309->5305|7322->5309|7353->5319|7389->5328|7479->5388|7524->153|7558->5394|7591->5401|7610->5411|7665->5445
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->10|36->10|38->10|39->11|47->19|48->20|49->21|50->22|70->42|71->43|71->43|71->43|72->44|73->45|73->45|73->45|73->45|73->45|73->45|73->45|73->45|74->46|74->46|74->46|74->46|74->46|74->46|75->47|75->47|75->47|76->48|76->48|76->48|76->48|76->48|76->48|76->48|77->49|77->49|77->49|79->51|80->52|97->69|97->69|97->69|98->70|98->70|98->70|99->71|100->72|102->7|105->73|107->75|107->75|107->75
                  -- GENERATED --
              */
          