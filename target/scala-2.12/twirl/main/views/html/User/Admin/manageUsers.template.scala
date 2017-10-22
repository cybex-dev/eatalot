
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
/*1.2*/import Global.Static.masterpage
/*2.2*/import java.util.List
/*3.2*/import models.User.Admin.UserItem
/*4.2*/import helper._

object manageUsers extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template3[List[UserItem],List[UserItem],List[UserItem],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*6.2*/(customerList: List[UserItem], kitchenStaffList: List[UserItem], deliveryStaffList: List[UserItem]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {

def /*8.6*/getTableHeader/*8.20*/(isCustomer: Boolean):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*8.45*/("""
        """),format.raw/*9.9*/("""<thead>
            <tr role="row">
                <th class="sorting_asc" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-sort="ascending" aria-label="# Order: activate to sort column ascending" style="width: 150px;">
                    User Id</th>
                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Meals: activate to sort column ascending" style="width: 250px;">
                    Name</th>
                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 250px;">
                    Surname</th>
                """),_display_(/*17.18*/if(!isCustomer)/*17.33*/ {_display_(Seq[Any](format.raw/*17.35*/("""
                    """),format.raw/*18.21*/("""<th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 300px;">
                        Alias</th>
                """)))}),format.raw/*20.18*/("""
                """),format.raw/*21.17*/("""<th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 400px;">
                    Email</th>
                <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 250px;">
                    CellNumber</th>

                """),_display_(/*26.18*/if(isCustomer)/*26.32*/ {_display_(Seq[Any](format.raw/*26.34*/("""
                    """),format.raw/*27.21*/("""<th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 120px;">
                        Email Verified</th>
                    <th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 120px;">
                        Profile Complete</th>
                """)))}),format.raw/*31.18*/("""
                """),format.raw/*32.17*/("""<th class="sorting" tabindex="0" aria-controls="dataTables-example" rowspan="1" colspan="1" aria-label="Date: activate to sort column ascending" style="width: 120px;">
                    Profile Enabled</th>

            </tr>
        </thead>
    """)))};def /*39.6*/getColor/*39.14*/(isActive: Boolean, isVerified: Boolean = true, index: Integer):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*39.81*/("""
    """),_display_(/*40.6*/if(isActive)/*40.18*/ {_display_(Seq[Any](format.raw/*40.20*/("""
        """),_display_(/*41.10*/if(isVerified)/*41.24*/ {_display_(Seq[Any](format.raw/*41.26*/("""
            """),_display_(/*42.14*/if((index % 2) == 0)/*42.34*/ {_display_(Seq[Any](format.raw/*42.36*/("""
                """),format.raw/*43.17*/("""odd
            """)))}/*44.15*/else/*44.20*/{_display_(Seq[Any](format.raw/*44.21*/("""
                """),format.raw/*45.17*/("""even
            """)))}),format.raw/*46.14*/("""
        """)))}/*47.11*/else/*47.16*/{_display_(Seq[Any](format.raw/*47.17*/("""
            """),format.raw/*48.13*/("""unverifiedAccount
        """)))}),format.raw/*49.10*/("""
    """)))}/*50.7*/else/*50.12*/{_display_(Seq[Any](format.raw/*50.13*/("""
        """),format.raw/*51.9*/("""disabledAccount
    """)))}),format.raw/*52.6*/("""
    """)))};def /*63.6*/getTableBody/*63.18*/(isCustomer: Boolean, list: List[UserItem]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*63.65*/("""
        """),format.raw/*64.9*/("""<tbody>
            """),format.raw/*65.88*/("""
            """),_display_(/*66.14*/for((item, index) <- list.zipWithIndex) yield /*66.53*/ {_display_(Seq[Any](format.raw/*66.55*/("""
                """),format.raw/*67.17*/("""<tr class=""""),_display_(/*67.29*/getColor(item.isActive, if(isCustomer) {
                    item.isVerified
                } else {
                    true
                }, index)),format.raw/*71.26*/("""">
                    <td class="sorting_1"><a href=""""),_display_(/*72.53*/getEditLink(isCustomer, item.getUserId)),format.raw/*72.92*/("""">"""),_display_(/*72.95*/item/*72.99*/.getUserId),format.raw/*72.109*/("""</a></td>
                    <td class="">"""),_display_(/*73.35*/item/*73.39*/.getName),format.raw/*73.47*/("""</td>
                    <td class="">"""),_display_(/*74.35*/item/*74.39*/.getSurname),format.raw/*74.50*/("""</td>
                    """),_display_(/*75.22*/if(!isCustomer)/*75.37*/ {_display_(Seq[Any](format.raw/*75.39*/("""
                        """),format.raw/*76.25*/("""<td class="sorting_1">"""),_display_(/*76.48*/item/*76.52*/.getAlias),format.raw/*76.61*/("""</td>
                    """)))}),format.raw/*77.22*/("""
                    """),format.raw/*78.21*/("""<td class="">"""),_display_(/*78.35*/item/*78.39*/.getEmail),format.raw/*78.48*/("""</td>
                    <td class="">"""),_display_(/*79.35*/item/*79.39*/.getCellNumber),format.raw/*79.53*/("""</td>

                    """),_display_(/*81.22*/if(isCustomer)/*81.36*/ {_display_(Seq[Any](format.raw/*81.38*/("""
                        """),format.raw/*82.25*/("""<td class=" "><input type="checkbox" disabled class="pull-center" """),_display_(/*82.92*/if(item.isVerified)/*82.111*/ {_display_(Seq[Any](format.raw/*82.113*/("""checked""")))}),format.raw/*82.121*/("""/></td>
                        <td class=" "><input type="checkbox" disabled class="pull-center" """),_display_(/*83.92*/if(item.isComplete)/*83.111*/ {_display_(Seq[Any](format.raw/*83.113*/("""checked""")))}),format.raw/*83.121*/("""/></td>
                    """)))}),format.raw/*84.22*/("""

                    """),format.raw/*86.21*/("""<td class=" "><input type="checkbox" disabled class="pull-center"
                        """),_display_(/*87.26*/if(item.isActive)/*87.43*/ {_display_(Seq[Any](format.raw/*87.45*/("""checked""")))}),format.raw/*87.53*/("""/></td>
                </tr>
            """)))}),format.raw/*89.14*/("""
        """),format.raw/*90.9*/("""</tbody>
    """)))};def /*93.6*/tableGeneric/*93.18*/(isCustomer: Boolean, list: List[UserItem]):play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*93.65*/("""
        """),format.raw/*94.9*/("""<div class="panel panel-default">
            """),format.raw/*95.44*/("""
            """),format.raw/*96.32*/("""
            """),format.raw/*97.23*/("""
            """),format.raw/*98.13*/("""<div class="panel-body">
                <div class="table-responsive">
                    <div id="dataTables-example_wrapper" class="dataTables_wrapper form-inline" role="grid">
                        <table class="table table-bordered no-footer table-hover dataTable" id="dataTables-example" aria-describedby="dataTables-example_info">
                            """),_display_(/*102.30*/getTableHeader(isCustomer)),format.raw/*102.56*/("""
                            """),_display_(/*103.30*/getTableBody(isCustomer, list)),format.raw/*103.60*/("""
                        """),format.raw/*104.25*/("""</table>
                    </div>

                </div>
            </div>
        </div>
    """)))};def /*112.6*/tableCustomers/*112.20*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*112.24*/("""
        """),format.raw/*113.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h1 class="header-line">Customers</h1>
            </div>
        </div>
    """),_display_(/*118.6*/tableGeneric(true, customerList)),format.raw/*118.38*/("""
    """)))};def /*121.6*/tableKitchen/*121.18*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*121.22*/("""
        """),format.raw/*122.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h1 class="header-line">Kitchen Staff</h1>
            </div>
        </div>
    """),_display_(/*127.6*/tableGeneric(false, kitchenStaffList)),format.raw/*127.43*/("""
    """)))};def /*130.6*/tableDelivery/*130.19*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*130.23*/("""
        """),format.raw/*131.9*/("""<div class="row pad-botm">
            <div class="col-md-12">
                <h1 class="header-line">Delivery Staff</h1>
            </div>
        </div>
    """),_display_(/*136.6*/tableGeneric(false, deliveryStaffList)),format.raw/*136.44*/("""
    """)))};def /*139.6*/bodyContent/*139.17*/:play.twirl.api.HtmlFormat.Appendable = {_display_(

Seq[Any](format.raw/*139.21*/("""

        """),format.raw/*141.9*/("""<div class="panel-body">
            <div class="center-parent">
                <ul class="nav nav-pills center-child">
                    <li class="text-larger active"><a href="#customerTab" data-toggle="tab">Customers</a>
                    </li>
                    <li class="text-larger"><a href="#kitchenTab" data-toggle="tab">Kitchen Staff</a>
                    </li>
                    <li class="text-larger"><a href="#deliveryTab" data-toggle="tab">Delivery Staff</a>
                    </li>
                </ul>
            </div>

            <div class="tab-content">
                <div class="tab-pane fade active in" id="customerTab">
                """),_display_(/*155.18*/tableCustomers),format.raw/*155.32*/("""
                """),format.raw/*156.17*/("""</div>
                <div class="tab-pane fade" id="kitchenTab">
                """),_display_(/*158.18*/tableKitchen),format.raw/*158.30*/("""
                """),format.raw/*159.17*/("""</div>
                <div class="tab-pane fade" id="deliveryTab">
                """),_display_(/*161.18*/tableDelivery),format.raw/*161.31*/("""
                """),format.raw/*162.17*/("""</div>
            </div>
        </div>

        <div class="row-width-center">
            <div class="small-margin">
            """),_display_(/*168.14*/form(action = controllers.User.routes.AdminController.index())/*168.76*/ {_display_(Seq[Any](format.raw/*168.78*/("""
                """),_display_(/*169.18*/CSRF/*169.22*/.formField),format.raw/*169.32*/("""
                """),format.raw/*170.17*/("""<input class="btn btn-info button-small" type="submit" value="Home">
                """)))}),format.raw/*171.18*/("""
            """),format.raw/*172.13*/("""</div>
        </div>

    """)))};def /*55.6*/getEditLink/*55.17*/(isCustomer: Boolean, id: String) = {{
        if(isCustomer) {
            CSRF(controllers.User.routes.AdminController.editCustomer(id))
        } else {
            CSRF(controllers.User.routes.AdminController.editStaff(id))
        }
    }};
Seq[Any](format.raw/*6.101*/("""

    """),format.raw/*37.6*/("""

    """),format.raw/*53.6*/("""

    """),format.raw/*61.6*/("""

    """),format.raw/*91.6*/("""

    """),format.raw/*110.6*/("""

    """),format.raw/*119.6*/("""

    """),format.raw/*128.6*/("""

    """),format.raw/*137.6*/("""

    """),format.raw/*175.6*/("""

    """),_display_(/*177.6*/masterpage/*177.16*/.apply(" :: Manage Users", bodyContent)))
      }
    }
  }

  def render(customerList:List[UserItem],kitchenStaffList:List[UserItem],deliveryStaffList:List[UserItem]): play.twirl.api.HtmlFormat.Appendable = apply(customerList,kitchenStaffList,deliveryStaffList)

  def f:((List[UserItem],List[UserItem],List[UserItem]) => play.twirl.api.HtmlFormat.Appendable) = (customerList,kitchenStaffList,deliveryStaffList) => apply(customerList,kitchenStaffList,deliveryStaffList)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  DATE: Sun Oct 22 11:23:03 SAST 2017
                  SOURCE: /home/dylan/Desktop/eatalot/eatalot/app/views/User/Admin/manageUsers.scala.html
                  HASH: bb8f7fac78487d492fcbf8fb6aac40be3f266ea1
                  MATRIX: 662->1|701->34|730->57|771->92|1135->110|1312->216|1334->230|1435->255|1470->264|2228->995|2252->1010|2292->1012|2341->1033|2592->1253|2637->1270|3101->1707|3124->1721|3164->1723|3213->1744|3707->2207|3752->2224|4025->2481|4042->2489|4186->2556|4218->2562|4239->2574|4279->2576|4316->2586|4339->2600|4379->2602|4420->2616|4449->2636|4489->2638|4534->2655|4570->2673|4583->2678|4622->2679|4667->2696|4716->2714|4745->2725|4758->2730|4797->2731|4838->2744|4896->2771|4920->2778|4933->2783|4972->2784|5008->2793|5059->2814|5088->3088|5109->3100|5233->3147|5269->3156|5317->3251|5358->3265|5413->3304|5453->3306|5498->3323|5537->3335|5710->3487|5792->3542|5852->3581|5882->3584|5895->3588|5927->3598|5998->3642|6011->3646|6040->3654|6107->3694|6120->3698|6152->3709|6206->3736|6230->3751|6270->3753|6323->3778|6373->3801|6386->3805|6416->3814|6474->3841|6523->3862|6564->3876|6577->3880|6607->3889|6674->3929|6687->3933|6722->3947|6777->3975|6800->3989|6840->3991|6893->4016|6987->4083|7016->4102|7057->4104|7097->4112|7223->4211|7252->4230|7293->4232|7333->4240|7393->4269|7443->4291|7561->4382|7587->4399|7627->4401|7666->4409|7740->4452|7776->4461|7813->4482|7834->4494|7958->4541|7994->4550|8068->4627|8109->4659|8150->4682|8191->4695|8589->5065|8637->5091|8695->5121|8747->5151|8801->5176|8924->5282|8948->5296|9030->5300|9067->5309|9251->5466|9305->5498|9335->5511|9357->5523|9439->5527|9476->5536|9664->5697|9723->5734|9753->5747|9776->5760|9858->5764|9895->5773|10084->5935|10144->5973|10174->5986|10195->5997|10277->6001|10315->6011|11022->6690|11058->6704|11104->6721|11216->6805|11250->6817|11296->6834|11409->6919|11444->6932|11490->6949|11651->7082|11723->7144|11764->7146|11810->7164|11824->7168|11856->7178|11902->7195|12020->7281|12062->7294|12113->2827|12133->2838|12407->209|12440->2474|12473->2820|12506->3081|12539->4475|12573->5275|12607->5504|12641->5740|12675->5979|12709->7322|12743->7329|12763->7339
                  LINES: 24->1|25->2|26->3|27->4|32->6|36->8|36->8|38->8|39->9|47->17|47->17|47->17|48->18|50->20|51->21|56->26|56->26|56->26|57->27|61->31|62->32|67->39|67->39|69->39|70->40|70->40|70->40|71->41|71->41|71->41|72->42|72->42|72->42|73->43|74->44|74->44|74->44|75->45|76->46|77->47|77->47|77->47|78->48|79->49|80->50|80->50|80->50|81->51|82->52|83->63|83->63|85->63|86->64|87->65|88->66|88->66|88->66|89->67|89->67|93->71|94->72|94->72|94->72|94->72|94->72|95->73|95->73|95->73|96->74|96->74|96->74|97->75|97->75|97->75|98->76|98->76|98->76|98->76|99->77|100->78|100->78|100->78|100->78|101->79|101->79|101->79|103->81|103->81|103->81|104->82|104->82|104->82|104->82|104->82|105->83|105->83|105->83|105->83|106->84|108->86|109->87|109->87|109->87|109->87|111->89|112->90|113->93|113->93|115->93|116->94|117->95|118->96|119->97|120->98|124->102|124->102|125->103|125->103|126->104|132->112|132->112|134->112|135->113|140->118|140->118|141->121|141->121|143->121|144->122|149->127|149->127|150->130|150->130|152->130|153->131|158->136|158->136|159->139|159->139|161->139|163->141|177->155|177->155|178->156|180->158|180->158|181->159|183->161|183->161|184->162|190->168|190->168|190->168|191->169|191->169|191->169|192->170|193->171|194->172|197->55|197->55|204->6|206->37|208->53|210->61|212->91|214->110|216->119|218->128|220->137|222->175|224->177|224->177
                  -- GENERATED --
              */
          