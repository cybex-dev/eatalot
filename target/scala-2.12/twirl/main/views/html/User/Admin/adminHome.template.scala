
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
/*1.2*/import java.util.List
/*3.2*/import models.User.Admin.AdminInfo
/*4.2*/import utility.DashboardButton
/*5.2*/import views.html.Global.Static.dashboard

object adminHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],AdminInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*7.2*/(dashButtons: List[DashboardButton], adminInfo: AdminInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*9.2*/bodyContent/*9.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*9.17*/("""
    """),format.raw/*10.5*/("""<script href=""""),_display_(/*10.20*/controllers/*10.31*/.User.routes.javascript.AdminController.adminJSRoutes),format.raw/*10.84*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*7.60*/("""

"""),format.raw/*11.2*/("""

"""),_display_(/*13.2*/dashboard/*13.11*/.apply(dashButtons, bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],adminInfo:AdminInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,adminInfo)

  def f:((List[DashboardButton],AdminInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,adminInfo) => apply(dashButtons,adminInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 09:12:57 SAST 2017
                  SOURCE: /home/cybex/Projects/eatalot-temp/app/views/User/Admin/adminHome.scala.html
                  HASH: 33e0f4541cf32214a7b5402d78a426c1ba841483
                  MATRIX: 662->1|691->25|733->61|771->93|1146->137|1282->198|1301->209|1381->213|1413->218|1455->233|1475->244|1549->297|1624->195|1653->333|1682->336|1700->345
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|39->10|39->10|39->10|39->10|41->7|43->11|45->13|45->13
                  -- GENERATED --
              */
          