
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
                  DATE: Thu Oct 12 15:36:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Admin/adminHome.scala.html
                  HASH: f907affa0961cf74f71bd850cc558d1dc999ae9b
                  MATRIX: 662->1|700->33|729->56|778->99|1146->136|1282->197|1301->208|1381->212|1423->194|1452->215|1481->218|1499->227
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|41->6|43->10|45->12|45->12
                  -- GENERATED --
              */
          