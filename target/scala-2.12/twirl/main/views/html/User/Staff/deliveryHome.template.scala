
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
/*3.2*/import models.User.DeliveryStaff.DeliveryStaffInfo
/*4.2*/import utility.DashboardButton
/*5.2*/import views.html.Global.Static.dashboard

object deliveryHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],DeliveryStaffInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(dashButtons: List[DashboardButton], deliveryStaffInfo: DeliveryStaffInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/bodyContent/*9.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.17*/("""
    """),format.raw/*10.5*/("""<h1>Delivery Page</h1>
""")))};
Seq[Any](format.raw/*7.76*/("""

"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/dashboard/*13.11*/.apply(dashButtons, bodyContent)),format.raw/*13.43*/("""
"""))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],deliveryStaffInfo:DeliveryStaffInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,deliveryStaffInfo)

  def f:((List[DashboardButton],DeliveryStaffInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,deliveryStaffInfo) => apply(dashButtons,deliveryStaffInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Wed Oct 18 00:03:04 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/deliveryHome.scala.html
                  HASH: 81d86ce6f63b1896d78cb3535ab82a45af9c363c
                  MATRIX: 662->1|691->25|749->77|787->109|1173->153|1325->230|1344->241|1424->245|1456->250|1519->227|1548->274|1577->277|1595->286|1648->318
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|39->10|41->7|43->11|45->13|45->13|45->13
                  -- GENERATED --
              */
          