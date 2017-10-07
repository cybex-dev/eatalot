
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

object paymentHistory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[PaymentItemBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*4.2*/(pageTitle: String, paymentList: List[PaymentItemBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*7.6*/table/*7.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*7.15*/("""
        """),format.raw/*8.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">Payments History</h4>

            </div>

        </div>
        <div class="panel panel-default">
            """),format.raw/*16.44*/("""
                """),format.raw/*17.36*/("""
            """),format.raw/*18.23*/("""
            """),format.raw/*19.13*/("""<div class="panel-body">
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
                            """),format.raw/*39.104*/("""
                            """),_display_(/*40.30*/for((item, index) <- paymentList.zipWithIndex) yield /*40.76*/ {_display_(Seq[Any](format.raw/*40.78*/("""
                                """),format.raw/*41.95*/("""
                                """),format.raw/*42.33*/("""<tr class="gradeA """),_display_(/*42.52*/if((index % 2) == 0)/*42.72*/ {_display_(Seq[Any](format.raw/*42.74*/("""odd""")))}/*42.79*/else/*42.84*/{_display_(Seq[Any](format.raw/*42.85*/("""even""")))}),format.raw/*42.90*/("""">
                                    <td class="sorting_1"><a href=""""),_display_(/*43.69*/controllers/*43.80*/.User.routes.CustomerController.viewPayment(item.paymentId)),format.raw/*43.139*/("""">"""),_display_(/*43.142*/item/*43.146*/.paymentId),format.raw/*43.156*/("""</a></td>
                                    <td class=" ">"""),_display_(/*44.52*/item/*44.56*/.amount),format.raw/*44.63*/("""</td>
                                    <td class=" ">"""),_display_(/*45.52*/if(item.isCash == true)/*45.75*/{_display_(Seq[Any](format.raw/*45.76*/(""""Yes"""")))}/*45.82*/else/*45.86*/{_display_(Seq[Any](format.raw/*45.87*/(""""No"""")))}),format.raw/*45.92*/("""</td>
                                    <td class=" ">"""),_display_(/*46.52*/item/*46.56*/.delivererName),format.raw/*46.70*/("""</td>
                                </tr>
                            """)))}),format.raw/*48.30*/("""
                        """),format.raw/*49.25*/("""</tbody>
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
    """)))};
Seq[Any](format.raw/*4.58*/("""


    """),format.raw/*66.6*/("""

    """),_display_(/*68.6*/masterpage/*68.16*/.apply(pageTitle, table)),format.raw/*68.40*/("""
"""))
      }
    }
  }

  def render(pageTitle:String,paymentList:List[PaymentItemBasic]): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle,paymentList)

  def f:((String,List[PaymentItemBasic]) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle,paymentList) => apply(pageTitle,paymentList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Oct 06 20:53:11 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/paymentHistory.scala.html
                  HASH: 4619d82844b48a7ded47014df024fa0a60f2b956
                  MATRIX: 665->1|704->34|733->57|1108->97|1242->161|1255->166|1335->170|1370->179|1613->425|1658->461|1699->484|1740->497|4031->2834|4088->2864|4150->2910|4190->2912|4251->3007|4312->3040|4358->3059|4387->3079|4427->3081|4450->3086|4463->3091|4502->3092|4538->3097|4636->3168|4656->3179|4737->3238|4768->3241|4782->3245|4814->3255|4902->3316|4915->3320|4943->3327|5027->3384|5059->3407|5098->3408|5123->3414|5136->3418|5175->3419|5211->3424|5295->3481|5308->3485|5343->3499|5447->3572|5500->3597|7170->153|7204->5228|7237->5235|7256->5245|7301->5269
                  LINES: 24->1|25->2|26->3|31->4|35->7|35->7|37->7|38->8|46->16|47->17|48->18|49->19|69->39|70->40|70->40|70->40|71->41|72->42|72->42|72->42|72->42|72->42|72->42|72->42|72->42|73->43|73->43|73->43|73->43|73->43|73->43|74->44|74->44|74->44|75->45|75->45|75->45|75->45|75->45|75->45|75->45|76->46|76->46|76->46|78->48|79->49|97->4|100->66|102->68|102->68|102->68
                  -- GENERATED --
              */
          