
package views.html.User.Temp

object signup extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""


"""),format.raw/*4.1*/("""<!DOCTYPE html>
<html>
    <body>
        <h1>Sign up</h1>
        <a href=""""),_display_(/*8.19*/controllers/*8.30*/.Order.routes.AccountController.doLogin()),format.raw/*8.71*/("""">Login</a>
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
                  DATE: Tue Oct 17 23:44:34 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Temp/signup.scala.html
                  HASH: 21c3860a053b646e8ed1e908de136064030a5b8b
                  MATRIX: 952->1|1048->3|1077->6|1180->83|1199->94|1260->135
                  LINES: 28->1|33->1|36->4|40->8|40->8|40->8
                  -- GENERATED --
              */
          