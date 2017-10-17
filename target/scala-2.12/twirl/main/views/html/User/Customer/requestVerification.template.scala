
package views.html.User.Customer

import views.html.Global.Static.masterpage

object requestVerification extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*3.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*5.2*/bodyContent/*5.13*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*5.17*/("""
    """),format.raw/*6.5*/("""<div class="container">
        <div class="center-block">
                <form class="input-group" href=""""),_display_(/*8.50*/controllers/*8.61*/.User.routes.CustomerController.reverify()),format.raw/*8.103*/("""" method="post">
                    <input class="text-info" placeholder="Email Address" id="edtEmail">
                    <br/>
                    <br/>
                    <input type="button" class="btn btn-default" value="Submit">
                </form>
        </div>
    </div>
""")))};
Seq[Any](format.raw/*3.4*/("""

"""),format.raw/*16.2*/("""

    """),_display_(/*18.6*/masterpage/*18.16*/.apply(" :: Verify Account", bodyContent)))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Tue Oct 17 23:44:33 SAST 2017
                  SOURCE: /home/cybex/Projects/project-eatalot/app/views/User/Customer/requestVerification.scala.html
                  HASH: 0d9aa0880bf091e1cd9bf0cb837a7f68efa8c67c
                  MATRIX: 665->1|1019->46|1099->51|1118->62|1198->66|1229->71|1363->179|1382->190|1445->232|1772->48|1801->521|1834->528|1853->538
                  LINES: 24->1|29->3|33->5|33->5|35->5|36->6|38->8|38->8|38->8|47->3|49->16|51->18|51->18
                  -- GENERATED --
              */
          