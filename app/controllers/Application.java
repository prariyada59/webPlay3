package controllers;

import play.api.templates.Html;
import play.data.DynamicForm;
import play.data.Form;
import play.mvc.*;
import views.html.*;
import models.products;


public class Application extends Controller {

    public static products pro1 = new products("001","iPhone","ดำ-เงิน",124,12000,24);
    public static products pro2 = new products("002","SamSung","แดง-เงิน",64,13000,15);
    public static products pro3 = new products("003","Huawei","ดำ-เงิน",64,20000,24);
    public static products pro4 = new products("004","Oppo","ดำ-เงิน",124,12000,24);
    public static products pro5 = new products("005","Vivo","ดำ-เงิน",64,17000,29);


    public static Result main(Html content) {
   return ok(main.render(content));
    }

    public static products products;

    public static Result index() {
        return main(home.render());
    }

     public static Result header(){
        return ok(header.render());
 }
     public static Result Huawei(){
       return ok(Huawei.render());
 }

    public static Result iPhone(){
         return ok(iPhone.render());
    }

    public static Result Oppo(){
        return ok(Oppo.render());
    }

    public static Result Vivo(){
        return ok(Vivo.render());
    }

    public static Result SamSung(){
        return ok(SamSung.render());
    }

    public static Result order() {
        return ok(order.render());
    }

    public static Result show() {return main(show.render(pro1,pro2,pro3,pro4,pro5));}

    public static Result products_form (){
        return main(products_form.render());
    }

    public static Result product_post() {
        DynamicForm myForm = Form.form().bindFromRequest();
        String id,name,col;
        Double price,amount;
        int capacity;

        id=myForm.get("id");
        name=myForm.get("name");
        col=myForm.get("col");

        price=Double.parseDouble(myForm.get("price"));
        amount=Double.parseDouble(myForm.get("amount"));
        capacity=Integer.parseInt(myForm.get("capacity"));

        products=new products(id,name,col,capacity,price,amount);

        { return main(products_show.render(products));
    }


    }}


