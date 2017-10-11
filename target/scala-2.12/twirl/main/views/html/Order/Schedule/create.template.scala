
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
"""),_display_(/*11.2*/helper/*11.8*/.form( action = controllers.Order.routes.ScheduleController.doCreateSchedule())/*11.87*/{_display_(Seq[Any](format.raw/*11.88*/("""
    """),_display_(/*12.6*/CSRF/*12.10*/.formField),format.raw/*12.20*/("""
    """),_display_(/*13.6*/helper/*13.12*/.inputText(scheduleForm("title"), '_name -> "Schedule Name")),format.raw/*13.72*/("""
    """),format.raw/*14.5*/("""<div class="container input-container">
        <input class="btn btn-success button-padding" type="button" value="Create Schedule">
    </div>
""")))}),format.raw/*17.2*/("""
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
                  DATE: Wed Oct 11 22:25:23 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/create.scala.html
                  HASH: 6f169c8cf07847675499cafff1f16c2cbf80f3a0
                  MATRIX: 666->1|707->36|746->69|775->92|1123->124|1236->162|1255->173|1335->177|1366->182|1434->224|1448->230|1536->309|1575->310|1607->316|1620->320|1651->330|1683->336|1698->342|1779->402|1811->407|1986->552|2027->159|2056->554|2085->557|2104->567|2167->609
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|41->11|41->11|41->11|41->11|42->12|42->12|42->12|43->13|43->13|43->13|44->14|47->17|49->6|51->18|53->20|53->20|53->20
                  -- GENERATED --
              */
          