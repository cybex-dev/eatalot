
package views.html.Global.Static

import controllers._

object meta extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),format.raw/*3.1*/("""<link rel="shortcut icon" href=""""),_display_(/*3.34*/routes/*3.40*/.Assets.versioned("images/favicon.png")),format.raw/*3.79*/("""">
<meta charset="utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1" />
<meta name="description" content="" />
<meta name="author" content="" />
    <!--[if IE]>
        <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>
        <![endif]-->"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 23:44:32 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/Global/Static/meta.scala.html
                  HASH: c80ff87a8891e305490009f09f54952542e6707a
                  MATRIX: 954->1|1050->3|1078->5|1137->38|1151->44|1210->83
                  LINES: 28->1|33->1|35->3|35->3|35->3|35->3
                  -- GENERATED --
              */
          