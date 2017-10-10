
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
/*4.2*/import models.User.DeliveryStaff.DeliveryStaffInfo

object deliveryHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],DeliveryStaffInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(dashButtons: List[DashboardButton], deliveryStaffInfo: DeliveryStaffInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Delivery Page</h1>
""")))};
Seq[Any](format.raw/*6.76*/("""

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/dashboard/*12.11*/.apply(dashButtons, bodyContent)),format.raw/*12.43*/("""
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
                  DATE: Tue Oct 10 18:16:54 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Staff/deliveryHome.scala.html
                  HASH: 2e5ffef6ab3f9b6cccd13b1373bbc1f4f11f7667
                  MATRIX: 662->1|700->33|729->56|778->99|1173->152|1325->229|1344->240|1424->244|1455->249|1518->226|1547->273|1576->276|1594->285|1647->317
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|41->6|43->10|45->12|45->12|45->12
                  -- GENERATED --
              */
          