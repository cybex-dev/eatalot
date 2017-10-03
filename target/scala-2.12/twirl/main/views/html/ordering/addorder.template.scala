
package views.html.ordering

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

object addorder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>

    <body>
        <h1>Add Meal to Menu</h1>
        <form action=""""),_display_(/*9.24*/routes/*9.30*/.OrderController.addMeal()),format.raw/*9.56*/("""" method="post">




        </form>
    </body>
</html>"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
<<<<<<< HEAD
                  DATE: Sun Sep 24 23:41:09 SAST 2017
=======
                  DATE: Tue Oct 03 04:34:57 SAST 2017
>>>>>>> Order-Management-Devel
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/ordering/addorder.scala.html
                  HASH: 79e0319f7fffd2f20c8b97704f54330d0acb9cda
                  MATRIX: 953->1|1049->3|1077->5|1196->98|1210->104|1256->130
                  LINES: 28->1|33->1|35->3|41->9|41->9|41->9
                  -- GENERATED --
              */
          