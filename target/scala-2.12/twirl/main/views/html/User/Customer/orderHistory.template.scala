
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
/*1.2*/import models.Order.OrderItemBasic
/*2.2*/import java.util.List
/*3.2*/import Global.Static.masterpage
/*5.2*/import controllers.Application.AppTags

object orderHistory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[String,List[OrderItemBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(pageTitle: String, ordersList: List[OrderItemBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.6*/table/*8.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.15*/("""
        """),format.raw/*9.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">Ordering History</h4>

            </div>

        </div>
        <div class="panel panel-default">
            """),format.raw/*17.44*/("""
                """),format.raw/*18.36*/("""
            """),format.raw/*19.23*/("""
            """),format.raw/*20.13*/("""<div class="panel-body">
                <div class="table-responsive">
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid"><div class="row"><div class="col-sm-6"><div class="dataTables_length" id="dataTables-example_length"><label><select name="dataTables-example_length" aria-controls="dataTables-example" class="form-control input-sm"><option value="10">
                        10</option><option value="25">25</option><option value="50">50</option><option value="100">
                        100</option></select>
                        Orders per page</label></div></div><div class="col-sm-6"><div id="dataTables-example_filter" class="dataTables_filter"><label>
                        Search:<input type="search" class="form-control input-sm" aria-controls="dataTables-example"></label></div></div></div><table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" aria-describedby="dataTables-example_info">
                        <thead>
                            <tr role="row">
                                <th class="sorting_asc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="# Order: activate to sort column ascending" style="width: 189px;">
                                    # Order</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Meals: activate to sort column ascending" style="width: 291px;">
                                    Meals</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Total: activate to sort column ascending" style="width: 264px;">
                                    Total ("""),_display_(/*34.45*/AppTags/*34.52*/.Locale.Currency.ZAR),format.raw/*34.72*/(""")</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                    Date</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Time: activate to sort column ascending" style="width: 264px;">
                                    Time</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 113px;">
                                    Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            """),format.raw/*44.104*/("""
                            """),_display_(/*45.30*/for((item, index) <- ordersList.zipWithIndex) yield /*45.75*/ {_display_(Seq[Any](format.raw/*45.77*/("""
"""),format.raw/*46.63*/("""
                                """),format.raw/*47.33*/("""<tr class="gradeA """),_display_(/*47.52*/if((index % 2) == 0)/*47.72*/ {_display_(Seq[Any](format.raw/*47.74*/("""odd""")))}/*47.79*/else/*47.84*/{_display_(Seq[Any](format.raw/*47.85*/("""even""")))}),format.raw/*47.90*/("""">
                                    <td class="sorting_1"><a href=""""),_display_(/*48.69*/controllers/*48.80*/.User.routes.CustomerController.viewOrder(item.orderId)),format.raw/*48.135*/("""">"""),_display_(/*48.138*/item/*48.142*/.orderId),format.raw/*48.150*/("""</a></td>
                                    <td class=" ">"""),_display_(/*49.52*/item/*49.56*/.mealNames),format.raw/*49.66*/("""</td>
                                    <td class=" ">"""),_display_(/*50.52*/AppTags/*50.59*/.Locale.Currency.ZAR),format.raw/*50.79*/(""" """),_display_(/*50.81*/item/*50.85*/.amount),format.raw/*50.92*/("""</td>
                                    <td class="center ">"""),_display_(/*51.58*/String/*51.64*/.format("%d-%d-%d, %s", item.getYear(), item.getMonth(), item.getDay, item.getWeekDay)),format.raw/*51.150*/("""</td>
                                    <td class="center ">"""),_display_(/*52.58*/String/*52.64*/.format("%sh%s", item.getHour(), item.getMinute())),format.raw/*52.114*/("""</td>
                                    <td class=" ">"""),_display_(/*53.52*/item/*53.56*/.status),format.raw/*53.63*/("""</td>
                                </tr>
                            """)))}),format.raw/*55.30*/("""
                        """),format.raw/*56.25*/("""</tbody>
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
Seq[Any](format.raw/*6.55*/("""

    """),format.raw/*73.6*/("""

    """),_display_(/*75.6*/masterpage/*75.16*/.apply(pageTitle, table)),format.raw/*75.40*/("""
"""))
      }
    }
  }

  def render(pageTitle:String,ordersList:List[OrderItemBasic]): play.twirl.api.HtmlFormat.Appendable = apply(pageTitle,ordersList)

  def f:((String,List[OrderItemBasic]) => play.twirl.api.HtmlFormat.Appendable) = (pageTitle,ordersList) => apply(pageTitle,ordersList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Fri Oct 06 20:53:11 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/orderHistory.scala.html
                  HASH: e850792017f64beea99c3543c469e38b5491e42f
                  MATRIX: 665->1|707->37|736->60|775->94|1146->134|1277->194|1290->199|1370->203|1405->212|1648->458|1693->494|1734->517|1775->530|3669->2397|3685->2404|3726->2424|4631->3375|4688->3405|4749->3450|4789->3452|4818->3515|4879->3548|4925->3567|4954->3587|4994->3589|5017->3594|5030->3599|5069->3600|5105->3605|5203->3676|5223->3687|5300->3742|5331->3745|5345->3749|5375->3757|5463->3818|5476->3822|5507->3832|5591->3889|5607->3896|5648->3916|5677->3918|5690->3922|5718->3929|5808->3992|5823->3998|5931->4084|6021->4147|6036->4153|6108->4203|6192->4260|6205->4264|6233->4271|6337->4344|6390->4369|8060->187|8093->6000|8126->6007|8145->6017|8190->6041
                  LINES: 24->1|25->2|26->3|27->5|32->6|36->8|36->8|38->8|39->9|47->17|48->18|49->19|50->20|64->34|64->34|64->34|74->44|75->45|75->45|75->45|76->46|77->47|77->47|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|78->48|78->48|78->48|79->49|79->49|79->49|80->50|80->50|80->50|80->50|80->50|80->50|81->51|81->51|81->51|82->52|82->52|82->52|83->53|83->53|83->53|85->55|86->56|104->6|106->73|108->75|108->75|108->75
                  -- GENERATED --
              */
          