
package views.html.User.Admin

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
/*3.2*/import controllers.Application.AppTags
/*4.2*/import helper._
/*5.2*/import models.User.Admin.DiscountItem

object manageDiscounts extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[DiscountItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(discountList: List[DiscountItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.6*/getColor/*9.14*/(isActive: Boolean, index: Integer):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.53*/("""
        """),_display_(/*10.10*/if(isActive)/*10.22*/ {_display_(Seq[Any](format.raw/*10.24*/("""
            """),_display_(/*11.14*/if((index % 2) == 0)/*11.34*/ {_display_(Seq[Any](format.raw/*11.36*/("""
                """),format.raw/*12.17*/("""odd
            """)))}/*13.15*/else/*13.20*/{_display_(Seq[Any](format.raw/*13.21*/("""
                """),format.raw/*14.17*/("""even
            """)))}),format.raw/*15.14*/("""
        """)))}/*16.11*/else/*16.16*/{_display_(Seq[Any](format.raw/*16.17*/("""
            """),format.raw/*17.13*/("""disabledAccount
        """)))}),format.raw/*18.10*/("""
    """)))};def /*21.2*/table/*21.7*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.11*/("""
    """),format.raw/*22.5*/("""<div class="row-width-center">
        <div class="panel panel-default">
            """),format.raw/*24.44*/("""
            """),format.raw/*25.32*/("""
            """),format.raw/*26.23*/("""
            """),format.raw/*27.13*/("""<div class="panel-body">
                <div class="table-responsive">
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid">
                        <table class="table table-bordered table-hover dataTable no-footer" id="dataTables-example" aria-describedby="dataTables-example_info">
                            <thead>
                                <tr role="row">
                                    <th class="sorting_asc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="# Order: activate to sort column ascending" style="width: 189px;">
                                        Discount Id</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Meals: activate to sort column ascending" style="width: 291px;">
                                        Description</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                        Discount Percentage</th>
                                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                        Discount Enabled</th>
                                </tr>
                            </thead>
                            <tbody>
                                """),format.raw/*44.108*/("""
                                """),_display_(/*45.34*/for((item, index) <- discountList.zipWithIndex) yield /*45.81*/ {_display_(Seq[Any](format.raw/*45.83*/("""
                                    """),format.raw/*46.37*/("""<tr class=""""),_display_(/*46.49*/getColor(item.isEnabled, index)),format.raw/*46.80*/("""">
                                        <td class="sorting_1"><a href=""""),_display_(/*47.73*/CSRF(controllers.Finance.routes.UserFinanceController.editDiscount(item.getId))),format.raw/*47.152*/("""">"""),_display_(/*47.155*/item/*47.159*/.getId),format.raw/*47.165*/(""" """),format.raw/*47.166*/("""</a></td>
                                        <td class=" ">"""),_display_(/*48.56*/item/*48.60*/.getDescription),format.raw/*48.75*/("""</td>
                                        <td class=" ">"""),_display_(/*49.56*/String/*49.62*/.valueOf(item.getPercentage)),format.raw/*49.90*/(""" """),format.raw/*49.91*/("""%</td>
                                        <td class=" "><input type="checkbox" disabled class="pull-center" """),_display_(/*50.108*/if(item.isEnabled)/*50.126*/ {_display_(Seq[Any](format.raw/*50.128*/("""checked""")))}),format.raw/*50.136*/("""/></td>
                                    </tr>
                                """)))}),format.raw/*52.34*/("""
                            """),format.raw/*53.29*/("""</tbody>
                        </table>
                    </div>

                </div>
            </div>
        </div>
        <div class="small-margin">
        """),_display_(/*61.10*/form(action = controllers.User.routes.CustomerController.index())/*61.75*/ {_display_(Seq[Any](format.raw/*61.77*/("""
            """),_display_(/*62.14*/CSRF/*62.18*/.formField),format.raw/*62.28*/("""
            """),format.raw/*63.13*/("""<input class="btn btn-info button-small" type="submit" value="Home">
            """)))}),format.raw/*64.14*/("""
        """),format.raw/*65.9*/("""</div>
    </div>
""")))};def /*69.2*/bodyContent/*69.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*69.17*/("""
    """),format.raw/*70.5*/("""<div class="row pad-botm">
        <div class="col-md-12">
            <h1 class="header-line">Manage Discounts</h1>
        </div>
    </div>
"""),_display_(/*75.2*/table),format.raw/*75.7*/("""
""")))};
Seq[Any](format.raw/*7.36*/("""

    """),format.raw/*19.6*/("""

"""),format.raw/*67.2*/("""

"""),format.raw/*76.2*/("""

"""),_display_(/*78.2*/masterpage/*78.12*/.apply(" :: Manage Discounts", bodyContent)))
      }
    }
  }

  def render(discountList:List[DiscountItem]): play.twirl.api.HtmlFormat.Appendable = apply(discountList)

  def f:((List[DiscountItem]) => play.twirl.api.HtmlFormat.Appendable) = (discountList) => apply(discountList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Admin/manageDiscounts.scala.html
                  HASH: 4bf6656666064ca1a1caace9c897ac3b04fa6a5b
                  MATRIX: 662->1|701->34|730->57|776->97|799->114|1163->154|1275->195|1291->203|1406->242|1443->252|1464->264|1504->266|1545->280|1574->300|1614->302|1659->319|1695->337|1708->342|1747->343|1792->360|1841->378|1870->389|1883->394|1922->395|1963->408|2019->433|2048->442|2061->447|2142->451|2174->456|2287->572|2328->604|2369->627|2410->640|4094->2370|4155->2404|4218->2451|4258->2453|4323->2490|4362->2502|4414->2533|4516->2608|4617->2687|4648->2690|4662->2694|4690->2700|4720->2701|4812->2766|4825->2770|4861->2785|4949->2846|4964->2852|5013->2880|5042->2881|5184->2995|5212->3013|5253->3015|5293->3023|5407->3106|5464->3135|5662->3306|5736->3371|5776->3373|5817->3387|5830->3391|5861->3401|5902->3414|6015->3496|6051->3505|6093->3527|6113->3538|6194->3542|6226->3547|6396->3691|6421->3696|6462->188|6495->439|6524->3524|6553->3698|6582->3701|6601->3711
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->21|49->21|51->21|52->22|54->24|55->25|56->26|57->27|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|80->50|80->50|80->50|82->52|83->53|91->61|91->61|91->61|92->62|92->62|92->62|93->63|94->64|95->65|97->69|97->69|99->69|100->70|105->75|105->75|107->7|109->19|111->67|113->76|115->78|115->78
                  -- GENERATED --
              */
          