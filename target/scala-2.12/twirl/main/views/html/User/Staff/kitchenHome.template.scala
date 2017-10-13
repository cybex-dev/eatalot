
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
/*1.2*/import utility.DashboardButton
/*2.2*/import java.util.List
/*3.2*/import views.html.Global.Static.dashboard
/*4.2*/import models.User.KitchenStaff.KitchenStaffInfo

object kitchenHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],KitchenStaffInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(dashButtons: List[DashboardButton], kitchenStaffInfo: KitchenStaffInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Kitchen Page</h1>
""")))};
Seq[Any](format.raw/*6.74*/("""

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/dashboard/*12.11*/.apply(dashButtons, bodyContent)),format.raw/*12.43*/("""
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
                  DATE: Thu Oct 12 15:36:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/kitchenHome.scala.html
                  HASH: 6b8e1dd0eb68fab007d6bda345bfe3dca5a44d35
                  MATRIX: 662->1|700->33|729->56|778->99|1169->150|1319->225|1338->236|1418->240|1449->245|1511->222|1540->268|1569->271|1587->280|1640->312
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|41->6|43->10|45->12|45->12|45->12
                  -- GENERATED --
              */
          