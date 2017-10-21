
package views.html.User.Staff

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
/*3.2*/import models.User.KitchenStaff.KitchenStaffInfo
/*4.2*/import utility.DashboardButton
/*5.2*/import views.html.Global.Static.dashboard

object kitchenHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],KitchenStaffInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(dashButtons: List[DashboardButton], kitchenStaffInfo: KitchenStaffInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/bodyContent/*9.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.17*/("""
    """),format.raw/*10.5*/("""<h1>Kitchen Page</h1>
""")))};
Seq[Any](format.raw/*7.74*/("""

"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/dashboard/*13.11*/.apply(dashButtons, bodyContent)),format.raw/*13.43*/("""
"""))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],kitchenStaffInfo:KitchenStaffInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,kitchenStaffInfo)

  def f:((List[DashboardButton],KitchenStaffInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,kitchenStaffInfo) => apply(dashButtons,kitchenStaffInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:58 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/User/Staff/kitchenHome.scala.html
                  HASH: 4e498419e74f93c293b202cc4cf0e1e25cccbf2e
                  MATRIX: 662->1|691->25|747->75|785->107|1169->151|1319->226|1338->237|1418->241|1450->246|1512->223|1541->269|1570->272|1588->281|1641->313
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|39->10|41->7|43->11|45->13|45->13|45->13
                  -- GENERATED --
              */
          