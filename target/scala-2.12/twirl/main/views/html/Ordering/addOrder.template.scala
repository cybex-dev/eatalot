
package views.html.Ordering

object addOrder extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>

    <body>
        <h1>Add Meal to Menu</h1>
        <form action=""""),_display_(/*9.24*/controllers/*9.35*/.Order.routes.OrderController.addMeal()),format.raw/*9.74*/("""" method="post">




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
                  DATE: Tue Oct 17 23:44:34 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Ordering/addOrder.scala.html
                  HASH: b21237f0b1c64e0c456bd5fb0da40e4ba2be5a74
                  MATRIX: 953->1|1049->3|1077->5|1196->98|1215->109|1274->148
                  LINES: 28->1|33->1|35->3|41->9|41->9|41->9
                  -- GENERATED --
              */
          