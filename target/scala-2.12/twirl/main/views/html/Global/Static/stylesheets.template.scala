
package views.html.Global.Static

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

object stylesheets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!-- BOOTSTRAP CORE STYLE  -->
<link href=""""),_display_(/*4.14*/routes/*4.20*/.Assets.versioned("stylesheets/bootstrap.css")),format.raw/*4.66*/("""" rel="stylesheet" />
    <!-- MAIN STYLE  -->
<link href=""""),_display_(/*6.14*/routes/*6.20*/.Assets.versioned("stylesheets/main.css")),format.raw/*6.61*/("""" rel="stylesheet" />"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Sep 24 23:41:09 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/stylesheets.scala.html
                  HASH: a08a1c68361a6e1acfaf329e85d95e3025637c98
                  MATRIX: 961->1|1057->3|1085->5|1155->49|1169->55|1235->101|1321->161|1335->167|1396->208
                  LINES: 28->1|33->1|35->3|36->4|36->4|36->4|38->6|38->6|38->6
                  -- GENERATED --
              */
          