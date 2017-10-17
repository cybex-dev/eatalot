
package views.html.Order.Schedule

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
/*1.2*/import models.Order.OrderSchedule
/*2.2*/import Global.Static.masterpage
/*3.2*/import play.data.Form
/*4.2*/import views.html.helper.CSRF

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template1[Form[OrderSchedule],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(scheduleForm: Form[OrderSchedule]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.2*/bodyContent/*8.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.17*/("""
    """),format.raw/*9.5*/("""<h1>Create order schedule</h1>
    <br/>
    """),_display_(/*11.6*/helper/*11.12*/.form(action = controllers.Order.routes.ScheduleController.doCreateSchedule())/*11.90*/ {_display_(Seq[Any](format.raw/*11.92*/("""
        """),_display_(/*12.10*/CSRF/*12.14*/.formField),format.raw/*12.24*/("""
        """),_display_(/*13.10*/helper/*13.16*/.inputText(scheduleForm("title"), '_name -> "Schedule Name")),format.raw/*13.76*/("""
        """),format.raw/*14.9*/("""<div class="container input-container">
            <input class="btn btn-success button-padding" type="button" value="Create Schedule">
        </div>
    """)))}),format.raw/*17.6*/("""
""")))};
Seq[Any](format.raw/*6.37*/("""

"""),format.raw/*18.2*/("""

"""),_display_(/*20.2*/masterpage/*20.12*/.apply(" :: Create Schedule", bodyContent)),format.raw/*20.54*/("""



"""))
      }
    }
  }

  def render(scheduleForm:Form[OrderSchedule]): play.twirl.api.HtmlFormat.Appendable = apply(scheduleForm)

  def f:((Form[OrderSchedule]) => play.twirl.api.HtmlFormat.Appendable) = (scheduleForm) => apply(scheduleForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 15 08:39:00 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/create.scala.html
                  HASH: fee81659d70948f83707582693b7338d62194edc
                  MATRIX: 666->1|707->36|746->69|775->92|1123->124|1236->162|1255->173|1335->177|1366->182|1438->228|1453->234|1540->312|1580->314|1617->324|1630->328|1661->338|1698->348|1713->354|1794->414|1830->423|2017->580|2058->159|2087->582|2116->585|2135->595|2198->637
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|47->17|49->6|51->18|53->20|53->20|53->20
                  -- GENERATED --
              */
          