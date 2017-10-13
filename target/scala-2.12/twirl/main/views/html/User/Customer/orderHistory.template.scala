
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
/*4.2*/import helper._
/*6.2*/import controllers.Application.AppTags

object orderHistory extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[OrderItemBasic],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(ordersList: List[OrderItemBasic]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.6*/table/*9.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.15*/("""
        """),format.raw/*10.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h4 class="header-line">Ordering History</h4>

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
                        Orders per page</label></div></div><div class="col-sm-6"><div id="dataTables-example_filter" class="dataTables_filter"><label>
                        Search:<input type="search" class="form-control input-sm" aria-controls="dataTables-example"></label></div></div></div><table class="table table-striped table-bordered table-hover dataTable no-footer" id="dataTables-example" aria-describedby="dataTables-example_info">
                        <thead>
                            <tr role="row">
                                <th class="sorting_asc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="# Order: activate to sort column ascending" style="width: 189px;">
                                    # Order</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Meals: activate to sort column ascending" style="width: 291px;">
                                    Meals</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Total: activate to sort column ascending" style="width: 264px;">
                                    Total ("""),_display_(/*35.45*/AppTags/*35.52*/.Locale.Currency.ZAR),format.raw/*35.72*/(""")</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                    Date</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Time: activate to sort column ascending" style="width: 264px;">
                                    Time</th>
                                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Status: activate to sort column ascending" style="width: 113px;">
                                    Status</th>
                            </tr>
                        </thead>
                        <tbody>
                            """),format.raw/*45.104*/("""
                            """),_display_(/*46.30*/for((item, index) <- ordersList.zipWithIndex) yield /*46.75*/ {_display_(Seq[Any](format.raw/*46.77*/("""
"""),format.raw/*47.63*/("""
                                """),format.raw/*48.33*/("""<tr class="gradeA """),_display_(/*48.52*/if((index % 2) == 0)/*48.72*/ {_display_(Seq[Any](format.raw/*48.74*/("""odd""")))}/*48.79*/else/*48.84*/{_display_(Seq[Any](format.raw/*48.85*/("""even""")))}),format.raw/*48.90*/("""">
                                    <td class="sorting_1"><a href=""""),_display_(/*49.69*/controllers/*49.80*/.User.routes.CustomerController.viewOrder(item.orderId)),format.raw/*49.135*/("""">"""),_display_(/*49.138*/item/*49.142*/.orderId),format.raw/*49.150*/("""</a></td>
                                    <td class=" ">"""),_display_(/*50.52*/item/*50.56*/.mealNames),format.raw/*50.66*/("""</td>
                                    <td class=" ">"""),_display_(/*51.52*/AppTags/*51.59*/.Locale.Currency.ZAR),format.raw/*51.79*/(""" """),_display_(/*51.81*/item/*51.85*/.amount),format.raw/*51.92*/("""</td>
                                    <td class="center "></td>
                                    <td class="center ">"""),_display_(/*53.58*/String/*53.64*/.format("%sh%s", item.getHour(), item.getMinute())),format.raw/*53.114*/("""</td>
                                    <td class=" ">"""),_display_(/*54.52*/item/*54.56*/.status),format.raw/*54.63*/("""</td>
                                </tr>
                            """)))}),format.raw/*56.30*/("""
                        """),format.raw/*57.25*/("""</tbody>
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
        """),_display_(/*74.10*/form( action = controllers.User.routes.CustomerController.index())/*74.76*/{_display_(Seq[Any](format.raw/*74.77*/("""
            """),_display_(/*75.14*/CSRF/*75.18*/.formField),format.raw/*75.28*/("""
            """),format.raw/*76.13*/("""<input class="btn btn-info" type="submit" name="Home">
        """)))}),format.raw/*77.10*/("""
    """)))};
Seq[Any](format.raw/*7.36*/("""

    """),format.raw/*78.6*/("""

    """),_display_(/*80.6*/masterpage/*80.16*/.apply(" :: Past Orders", table)),format.raw/*80.48*/("""
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
                  DATE: Thu Oct 12 15:36:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/orderHistory.scala.html
                  HASH: 82db9dc40b571f801cfed56c8a4559c6fa64e4e6
                  MATRIX: 665->1|707->37|736->60|775->93|798->111|1162->151|1274->192|1287->197|1367->201|1403->210|1646->456|1691->492|1732->515|1773->528|3667->2395|3683->2402|3724->2422|4629->3373|4686->3403|4747->3448|4787->3450|4816->3513|4877->3546|4923->3565|4952->3585|4992->3587|5015->3592|5028->3597|5067->3598|5103->3603|5201->3674|5221->3685|5298->3740|5329->3743|5343->3747|5373->3755|5461->3816|5474->3820|5505->3830|5589->3887|5605->3894|5646->3914|5675->3916|5688->3920|5716->3927|5868->4052|5883->4058|5955->4108|6039->4165|6052->4169|6080->4176|6184->4249|6237->4274|7899->5909|7974->5975|8013->5976|8054->5990|8067->5994|8098->6004|8139->6017|8234->6081|8279->185|8312->6087|8345->6094|8364->6104|8417->6136
                  LINES: 24->1|25->2|26->3|27->4|28->6|33->7|37->9|37->9|39->9|40->10|48->18|49->19|50->20|51->21|65->35|65->35|65->35|75->45|76->46|76->46|76->46|77->47|78->48|78->48|78->48|78->48|78->48|78->48|78->48|78->48|79->49|79->49|79->49|79->49|79->49|79->49|80->50|80->50|80->50|81->51|81->51|81->51|81->51|81->51|81->51|83->53|83->53|83->53|84->54|84->54|84->54|86->56|87->57|104->74|104->74|104->74|105->75|105->75|105->75|106->76|107->77|109->7|111->78|113->80|113->80|113->80
                  -- GENERATED --
              */
          