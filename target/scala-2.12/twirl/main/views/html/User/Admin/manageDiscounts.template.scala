
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
    """),_display_(/*10.6*/if(isActive)/*10.18*/ {_display_(Seq[Any](format.raw/*10.20*/("""
        """),_display_(/*11.10*/if((index % 2) == 0)/*11.30*/ {_display_(Seq[Any](format.raw/*11.32*/("""
            """),format.raw/*12.13*/("""odd
        """)))}/*13.11*/else/*13.16*/{_display_(Seq[Any](format.raw/*13.17*/("""
            """),format.raw/*14.13*/("""even
        """)))}),format.raw/*15.10*/("""
    """)))}/*16.7*/else/*16.12*/{_display_(Seq[Any](format.raw/*16.13*/("""
        """),format.raw/*17.9*/("""disabledAccount
    """)))}),format.raw/*18.6*/("""
    """)))};def /*21.6*/table/*21.11*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*21.15*/("""
        """),format.raw/*22.9*/("""<div class="row-width-center">
            <div class="panel panel-default">
                """),format.raw/*24.48*/("""
                """),format.raw/*25.36*/("""
                """),format.raw/*26.27*/("""
                """),format.raw/*27.17*/("""<div class="panel-body">
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
                                    """),format.raw/*44.112*/("""
                                    """),_display_(/*45.38*/for((item, index) <- discountList.zipWithIndex) yield /*45.85*/ {_display_(Seq[Any](format.raw/*45.87*/("""
                                        """),format.raw/*46.41*/("""<tr class=""""),_display_(/*46.53*/getColor(item.isEnabled, index)),format.raw/*46.84*/("""">
                                            <td class="sorting_1"><a href=""""),_display_(/*47.77*/CSRF(controllers.Finance.routes.UserFinanceController.editDiscount(item.getId))),format.raw/*47.156*/("""">"""),_display_(/*47.159*/item/*47.163*/.getId),format.raw/*47.169*/(""" """),format.raw/*47.170*/("""</a></td>
                                            <td class=" ">"""),_display_(/*48.60*/item/*48.64*/.getDescription),format.raw/*48.79*/("""</td>
                                            <td class=" ">"""),_display_(/*49.60*/String/*49.66*/.valueOf(item.getPercentage)),format.raw/*49.94*/(""" """),format.raw/*49.95*/("""%</td>
                                            <td class=" "><input type="checkbox" disabled class="pull-center"
                                                """),_display_(/*51.50*/if(item.isEnabled)/*51.68*/ {_display_(Seq[Any](format.raw/*51.70*/("""checked""")))}),format.raw/*51.78*/("""/></td>
                                        </tr>
                                    """)))}),format.raw/*53.38*/("""
                                """),format.raw/*54.33*/("""</tbody>
                            </table>
                        </div>

                    </div>
                </div>
            </div>
            <div class="small-margin">
            """),_display_(/*62.14*/form(action = controllers.User.routes.CustomerController.index())/*62.79*/ {_display_(Seq[Any](format.raw/*62.81*/("""
                """),_display_(/*63.18*/CSRF/*63.22*/.formField),format.raw/*63.32*/("""
                """),format.raw/*64.17*/("""<input class="btn btn-info button-small" type="submit" value="Home">
                """)))}),format.raw/*65.18*/("""
            """),format.raw/*66.13*/("""</div>
        </div>
    """)))};def /*70.6*/bodyContent/*70.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*70.21*/("""
        """),format.raw/*71.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h1 class="header-line">Manage Discounts</h1>
            </div>
        </div>
    """),_display_(/*76.6*/table),format.raw/*76.11*/("""
    """)))};
Seq[Any](format.raw/*7.36*/("""

    """),format.raw/*19.6*/("""

    """),format.raw/*68.6*/("""

    """),format.raw/*77.6*/("""

    """),_display_(/*79.6*/masterpage/*79.16*/.apply(" :: Manage Discounts", bodyContent)))
      }
    }
  }

  def render(discountList:List[DiscountItem]): play.twirl.api.HtmlFormat.Appendable = apply(discountList)

  def f:((List[DiscountItem]) => play.twirl.api.HtmlFormat.Appendable) = (discountList) => apply(discountList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Oct 22 23:21:39 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Admin/manageDiscounts.scala.html
                  HASH: c221e07c7bc19b441ad9d4878dad7f117c31e268
                  MATRIX: 662->1|701->34|730->57|776->97|799->114|1163->154|1275->195|1291->203|1406->242|1438->248|1459->260|1499->262|1536->272|1565->292|1605->294|1646->307|1678->321|1691->326|1730->327|1771->340|1816->354|1840->361|1853->366|1892->367|1928->376|1979->397|2008->410|2022->415|2103->419|2139->428|2260->552|2305->588|2350->615|2395->632|4147->2430|4212->2468|4275->2515|4315->2517|4384->2558|4423->2570|4475->2601|4581->2680|4682->2759|4713->2762|4727->2766|4755->2772|4785->2773|4881->2842|4894->2846|4930->2861|5022->2926|5037->2932|5086->2960|5115->2961|5308->3127|5335->3145|5375->3147|5414->3155|5536->3246|5597->3279|5823->3478|5897->3543|5937->3545|5982->3563|5995->3567|6026->3577|6071->3594|6188->3680|6229->3693|6279->3727|6299->3738|6380->3742|6416->3751|6606->3915|6632->3920|6677->188|6710->403|6743->3720|6776->3926|6809->3933|6828->3943
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->21|49->21|51->21|52->22|54->24|55->25|56->26|57->27|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|81->51|81->51|81->51|81->51|83->53|84->54|92->62|92->62|92->62|93->63|93->63|93->63|94->64|95->65|96->66|98->70|98->70|100->70|101->71|106->76|106->76|108->7|110->19|112->68|114->77|116->79|116->79
=======
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Admin/manageDiscounts.scala.html
                  HASH: 4bf6656666064ca1a1caace9c897ac3b04fa6a5b
                  MATRIX: 662->1|701->34|730->57|776->97|799->114|1163->154|1275->195|1291->203|1406->242|1443->252|1464->264|1504->266|1545->280|1574->300|1614->302|1659->319|1695->337|1708->342|1747->343|1792->360|1841->378|1870->389|1883->394|1922->395|1963->408|2019->433|2048->442|2061->447|2142->451|2174->456|2287->572|2328->604|2369->627|2410->640|4094->2370|4155->2404|4218->2451|4258->2453|4323->2490|4362->2502|4414->2533|4516->2608|4617->2687|4648->2690|4662->2694|4690->2700|4720->2701|4812->2766|4825->2770|4861->2785|4949->2846|4964->2852|5013->2880|5042->2881|5184->2995|5212->3013|5253->3015|5293->3023|5407->3106|5464->3135|5662->3306|5736->3371|5776->3373|5817->3387|5830->3391|5861->3401|5902->3414|6015->3496|6051->3505|6093->3527|6113->3538|6194->3542|6226->3547|6396->3691|6421->3696|6462->188|6495->439|6524->3524|6553->3698|6582->3701|6601->3711
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->21|49->21|51->21|52->22|54->24|55->25|56->26|57->27|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|80->50|80->50|80->50|80->50|82->52|83->53|91->61|91->61|91->61|92->62|92->62|92->62|93->63|94->64|95->65|97->69|97->69|99->69|100->70|105->75|105->75|107->7|109->19|111->67|113->76|115->78|115->78
>>>>>>> master
                  -- GENERATED --
              */
          