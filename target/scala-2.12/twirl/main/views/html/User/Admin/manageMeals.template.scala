
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
/*5.2*/import models.User.Admin.MealItem

object manageMeals extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[List[MealItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(mealsList: List[MealItem]):play.twirl.api.HtmlFormat.Appendable = {
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
                                            Meal Id</th>
                                        <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Meals: activate to sort column ascending" style="width: 291px;">
                                            Description</th>
                                        <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                            Price</th>
                                        <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 291px;">
                                            Active</th>
                                    </tr>
                                </thead>
                                <tbody>
                                    """),format.raw/*44.112*/("""
                                    """),_display_(/*45.38*/for((item, index) <- mealsList.zipWithIndex) yield /*45.82*/ {_display_(Seq[Any](format.raw/*45.84*/("""
                                        """),format.raw/*46.41*/("""<tr class=""""),_display_(/*46.53*/getColor(item.isActive, index)),format.raw/*46.83*/("""">
                                            <td class="sorting_1"><a href=""""),_display_(/*47.77*/CSRF(controllers.User.routes.AdminController.editMeal(item.getMealId))),format.raw/*47.147*/("""">"""),_display_(/*47.150*/item/*47.154*/.getMealId),format.raw/*47.164*/("""</a></td>
                                            <td class=" ">"""),_display_(/*48.60*/item/*48.64*/.getMealDescription),format.raw/*48.83*/("""</td>
                                            <td class=" ">"""),_display_(/*49.60*/AppTags/*49.67*/.Locale.Currency.ZAR.toString),format.raw/*49.96*/(""" """),_display_(/*49.98*/String/*49.104*/.valueOf(item.getPrice)),format.raw/*49.127*/("""</td>
                                            <td class=" "><input type="checkbox" disabled class="pull-center"
                                                """),_display_(/*51.50*/if(item.isActive)/*51.67*/ {_display_(Seq[Any](format.raw/*51.69*/("""checked""")))}),format.raw/*51.77*/("""
                                                """),format.raw/*52.49*/("""/></td>
                                        </tr>
                                    """)))}),format.raw/*54.38*/("""
                                """),format.raw/*55.33*/("""</tbody>
                            </table>
                        </div>

                    </div>
                </div>
            </div>
            <div class="small-margin">
            """),_display_(/*63.14*/form(action = controllers.User.routes.CustomerController.index())/*63.79*/ {_display_(Seq[Any](format.raw/*63.81*/("""
                """),_display_(/*64.18*/CSRF/*64.22*/.formField),format.raw/*64.32*/("""
                """),format.raw/*65.17*/("""<input class="btn btn-info button-small" type="submit" value="Home">
                """)))}),format.raw/*66.18*/("""
            """),format.raw/*67.13*/("""</div>
        </div>
    """)))};def /*71.6*/bodyContent/*71.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*71.21*/("""
        """),format.raw/*72.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h1 class="header-line">Manage Meals</h1>
            </div>
        </div>
    """),_display_(/*77.6*/table),format.raw/*77.11*/("""
    """)))};
Seq[Any](format.raw/*7.29*/("""

    """),format.raw/*19.6*/("""

    """),format.raw/*69.6*/("""

    """),format.raw/*78.6*/("""

    """),_display_(/*80.6*/masterpage/*80.16*/.apply(" :: Manage Meals", bodyContent)))
      }
    }
  }

  def render(mealsList:List[MealItem]): play.twirl.api.HtmlFormat.Appendable = apply(mealsList)

  def f:((List[MealItem]) => play.twirl.api.HtmlFormat.Appendable) = (mealsList) => apply(mealsList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Admin/manageMeals.scala.html
                  HASH: a5c35d96a8d6322dc95a3de125e0630627ae6356
                  MATRIX: 662->1|701->34|730->57|776->97|799->114|1151->150|1256->184|1272->192|1387->231|1424->241|1445->253|1485->255|1526->269|1555->289|1595->291|1640->308|1676->326|1689->331|1728->332|1773->349|1822->367|1851->378|1864->383|1903->384|1944->397|2000->422|2029->435|2043->440|2124->444|2160->453|2281->577|2326->613|2371->640|2416->657|4140->2427|4205->2465|4265->2509|4305->2511|4374->2552|4413->2564|4464->2594|4570->2673|4662->2743|4693->2746|4707->2750|4739->2760|4835->2829|4848->2833|4888->2852|4980->2917|4996->2924|5046->2953|5075->2955|5091->2961|5136->2984|5328->3149|5354->3166|5394->3168|5433->3176|5510->3225|5632->3316|5693->3349|5919->3548|5993->3613|6033->3615|6078->3633|6091->3637|6122->3647|6167->3664|6284->3750|6325->3763|6375->3797|6395->3808|6476->3812|6512->3821|6698->3981|6724->3986|6769->177|6802->428|6835->3790|6868->3992|6901->3999|6920->4009
                  LINES: 24->1|25->2|26->3|27->4|28->5|33->7|37->9|37->9|39->9|40->10|40->10|40->10|41->11|41->11|41->11|42->12|43->13|43->13|43->13|44->14|45->15|46->16|46->16|46->16|47->17|48->18|49->21|49->21|51->21|52->22|54->24|55->25|56->26|57->27|74->44|75->45|75->45|75->45|76->46|76->46|76->46|77->47|77->47|77->47|77->47|77->47|78->48|78->48|78->48|79->49|79->49|79->49|79->49|79->49|79->49|81->51|81->51|81->51|81->51|82->52|84->54|85->55|93->63|93->63|93->63|94->64|94->64|94->64|95->65|96->66|97->67|99->71|99->71|101->71|102->72|107->77|107->77|109->7|111->19|113->69|115->78|117->80|117->80
                  -- GENERATED --
              */
          