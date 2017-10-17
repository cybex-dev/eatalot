
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
/*1.2*/import utility.DashboardButton
/*2.2*/import java.util.List
/*3.2*/import views.html.Global.Static.dashboard
/*4.2*/import models.User.Admin.AdminInfo

object adminHome extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[List[DashboardButton],AdminInfo,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(dashButtons: List[DashboardButton], adminInfo: AdminInfo):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<script href=""""),_display_(/*9.20*/controllers/*9.31*/.User.routes.javascript.AdminController.adminJSRoutes),format.raw/*9.84*/("""" type="text/javascript"></script>
""")))};
Seq[Any](format.raw/*6.60*/("""

"""),format.raw/*10.2*/("""

"""),_display_(/*12.2*/dashboard/*12.11*/.apply(dashButtons, bodyContent)))
      }
    }
  }

  def render(dashButtons:List[DashboardButton],adminInfo:AdminInfo): play.twirl.api.HtmlFormat.Appendable = apply(dashButtons,adminInfo)

  def f:((List[DashboardButton],AdminInfo) => play.twirl.api.HtmlFormat.Appendable) = (dashButtons,adminInfo) => apply(dashButtons,adminInfo)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 15 23:36:45 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Admin/adminHome.scala.html
                  HASH: 4d456577985d3d303981b6b7e0256cbd0f9bfffa
                  MATRIX: 662->1|700->33|729->56|778->99|1146->136|1282->197|1301->208|1381->212|1412->217|1453->232|1472->243|1545->296|1620->194|1649->332|1678->335|1696->344
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|39->9|39->9|39->9|41->6|43->10|45->12|45->12
                  -- GENERATED --
              */
          