
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
/*3.2*/import models.Finance.PaymentItemBasic
/*4.2*/import helper._

object paymentHistory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[PaymentItemBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(paymentList: List[PaymentItemBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.6*/table/*9.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.15*/("""
        """),format.raw/*10.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">Payments History</h4>

            </div>

        </div>
        <div class="panel panel-default">
            """),format.raw/*18.44*/("""
                """),format.raw/*19.36*/("""
            """),format.raw/*20.23*/("""
            """),format.raw/*21.13*/("""<div class="panel-body">
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
                            """),format.raw/*41.104*/("""
                            """),_display_(/*42.30*/for((item, index) <- paymentList.zipWithIndex) yield /*42.76*/ {_display_(Seq[Any](format.raw/*42.78*/("""
                                """),format.raw/*43.95*/("""
                                """),format.raw/*44.33*/("""<tr class="gradeA """),_display_(/*44.52*/if((index % 2) == 0)/*44.72*/ {_display_(Seq[Any](format.raw/*44.74*/("""odd""")))}/*44.79*/else/*44.84*/{_display_(Seq[Any](format.raw/*44.85*/("""even""")))}),format.raw/*44.90*/("""">
                                    <td class="sorting_1"><a href=""""),_display_(/*45.69*/controllers/*45.80*/.User.routes.CustomerController.viewPayment(item.paymentId)),format.raw/*45.139*/("""">"""),_display_(/*45.142*/item/*45.146*/.paymentId),format.raw/*45.156*/("""</a></td>
                                    <td class=" ">"""),_display_(/*46.52*/item/*46.56*/.amount),format.raw/*46.63*/("""</td>
                                    <td class=" ">"""),_display_(/*47.52*/if(item.isCash == true)/*47.75*/{_display_(Seq[Any](format.raw/*47.76*/(""""Yes"""")))}/*47.82*/else/*47.86*/{_display_(Seq[Any](format.raw/*47.87*/(""""No"""")))}),format.raw/*47.92*/("""</td>
                                    <td class=" ">"""),_display_(/*48.52*/item/*48.56*/.delivererName),format.raw/*48.70*/("""</td>
                                </tr>
                            """)))}),format.raw/*50.30*/("""
                        """),format.raw/*51.25*/("""</tbody>
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
    """),_display_(/*68.6*/form( action = controllers.User.routes.CustomerController.index())/*68.72*/{_display_(Seq[Any](format.raw/*68.73*/("""
        """),_display_(/*69.10*/CSRF/*69.14*/.formField),format.raw/*69.24*/("""
        """),format.raw/*70.9*/("""<input class="btn btn-info" type="submit" name="Home">
    """)))}),format.raw/*71.6*/("""
    """)))};
Seq[Any](format.raw/*6.39*/("""


    """),format.raw/*72.6*/("""

    """),_display_(/*74.6*/masterpage/*74.16*/.apply(" :: Past Payments", table)),format.raw/*74.50*/("""
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
                  DATE: Sat Oct 14 13:03:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/paymentHistory.scala.html
                  HASH: 1fe8b49076763cc90dba7598a26cfc453354c146
                  MATRIX: 665->1|704->34|733->57|779->97|1124->115|1239->160|1252->165|1332->169|1368->178|1611->424|1656->460|1697->483|1738->496|4029->2833|4086->2863|4148->2909|4188->2911|4249->3006|4310->3039|4356->3058|4385->3078|4425->3080|4448->3085|4461->3090|4500->3091|4536->3096|4634->3167|4654->3178|4735->3237|4766->3240|4780->3244|4812->3254|4900->3315|4913->3319|4941->3326|5025->3383|5057->3406|5096->3407|5121->3413|5134->3417|5173->3418|5209->3423|5293->3480|5306->3484|5341->3498|5445->3571|5498->3596|7155->5227|7230->5293|7269->5294|7306->5304|7319->5308|7350->5318|7386->5327|7476->5387|7521->152|7555->5393|7588->5400|7607->5410|7662->5444
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->9|36->9|38->9|39->10|47->18|48->19|49->20|50->21|70->41|71->42|71->42|71->42|72->43|73->44|73->44|73->44|73->44|73->44|73->44|73->44|73->44|74->45|74->45|74->45|74->45|74->45|74->45|75->46|75->46|75->46|76->47|76->47|76->47|76->47|76->47|76->47|76->47|77->48|77->48|77->48|79->50|80->51|97->68|97->68|97->68|98->69|98->69|98->69|99->70|100->71|102->6|105->72|107->74|107->74|107->74
                  -- GENERATED --
              */
          