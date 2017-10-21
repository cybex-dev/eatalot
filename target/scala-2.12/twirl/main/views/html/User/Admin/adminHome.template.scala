
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
                  DATE: Sun Oct 22 04:28:36 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Admin/adminHome.scala.html
                  HASH: 29a94d68fe17cf31e5cf5c93e351dcb3c7814353
                  MATRIX: 662->1|691->25|733->61|771->93|1146->137|1282->198|1301->209|1381->213|1423->195|1452->216|1481->219|1499->228
                  LINES: 24->1|25->3|26->4|27->5|32->7|36->9|36->9|38->9|41->7|43->11|45->13|45->13
                  -- GENERATED --
              */
          