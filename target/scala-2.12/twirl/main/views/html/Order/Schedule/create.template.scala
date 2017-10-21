
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import models.Order.OrderSchedule
/*3.2*/import play.data.Form
/*4.2*/import views.html.helper.CSRF

object create extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template2[Boolean,Form[OrderSchedule],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(create: Boolean, scheduleForm: Form[OrderSchedule]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*24.6*/bodyContent/*24.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*24.21*/("""
        """),format.raw/*25.9*/("""<div class="container-dashboard">
            <h1 class="margin-left-small">"""),_display_(/*26.44*/if(create)/*26.54*/ {_display_(Seq[Any](format.raw/*26.56*/("""Create""")))}/*26.64*/else/*26.69*/{_display_(Seq[Any](format.raw/*26.70*/("""Update""")))}),format.raw/*26.77*/(""" """),format.raw/*26.78*/("""Order Schedule</h1>
            <br/>
            """),_display_(/*28.14*/helper/*28.20*/.form(action = getLink)/*28.43*/ {_display_(Seq[Any](format.raw/*28.45*/("""
                """),_display_(/*29.18*/CSRF/*29.22*/.formField),format.raw/*29.32*/("""
                """),format.raw/*30.17*/("""<div class="center-parent">
                    <div class="center-child">
                        """),_display_(/*32.26*/helper/*32.32*/.inputText(scheduleForm("title"), '_name -> "Schedule Name")),format.raw/*32.92*/("""
                        """),format.raw/*33.25*/("""<input class="btn btn-success button-padding" type="submit" value=""""),_display_(/*33.93*/if(create)/*33.103*/ {_display_(Seq[Any](format.raw/*33.105*/("""Create""")))}/*33.113*/else/*33.118*/{_display_(Seq[Any](format.raw/*33.119*/("""Update""")))}),format.raw/*33.126*/(""" """),format.raw/*33.127*/("""Schedule">
                    </div>
                </div>
            """)))}),format.raw/*36.14*/("""
        """),format.raw/*37.9*/("""</div>
    """)))};def /*8.6*/getLink/*8.13*/ = {{
        if(create) {
            controllers.Order.routes.ScheduleController.doCreateSchedule()
        } else {
            controllers.Order.routes.ScheduleController.updateScheduleName()
        }
    }};def /*16.6*/pageTitle/*16.15*/ = {{
        if(create) {
            " :: Set Schedule Name"
        } else {
            " :: Update Schedule Name"
        }
    }};
Seq[Any](format.raw/*6.54*/("""

    """),format.raw/*14.6*/("""

    """),format.raw/*22.6*/("""

    """),format.raw/*38.6*/("""

    """),_display_(/*40.6*/masterpage/*40.16*/.apply(pageTitle, bodyContent)),format.raw/*40.46*/("""



"""))
      }
    }
  }

  def render(create:Boolean,scheduleForm:Form[OrderSchedule]): play.twirl.api.HtmlFormat.Appendable = apply(create,scheduleForm)

  def f:((Boolean,Form[OrderSchedule]) => play.twirl.api.HtmlFormat.Appendable) = (create,scheduleForm) => apply(create,scheduleForm)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sat Oct 21 11:02:14 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Order/Schedule/create.scala.html
                  HASH: 545e05cd39fb5deb9ed527f69ee9d740dfb6638b
                  MATRIX: 666->1|705->34|746->69|775->92|1131->124|1262->558|1282->569|1363->573|1399->582|1503->659|1522->669|1562->671|1588->679|1601->684|1640->685|1678->692|1707->693|1785->744|1800->750|1832->773|1872->775|1917->793|1930->797|1961->807|2006->824|2133->924|2148->930|2229->990|2282->1015|2377->1083|2397->1093|2438->1095|2465->1103|2479->1108|2519->1109|2558->1116|2588->1117|2693->1191|2729->1200|2763->183|2778->190|3003->408|3021->417|3185->176|3218->401|3251->551|3284->1212|3317->1219|3336->1229|3387->1259
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->24|36->24|38->24|39->25|40->26|40->26|40->26|40->26|40->26|40->26|40->26|40->26|42->28|42->28|42->28|42->28|43->29|43->29|43->29|44->30|46->32|46->32|46->32|47->33|47->33|47->33|47->33|47->33|47->33|47->33|47->33|47->33|50->36|51->37|52->8|52->8|58->16|58->16|65->6|67->14|69->22|71->38|73->40|73->40|73->40
                  -- GENERATED --
              */
          