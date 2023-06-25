package controllers;

import models.Hotel;
import play.mvc.*;

import java.util.List;

/**
 * This controller contains an action to handle HTTP requests
 * to the application's home page.
 */
public class HomeController extends Controller {

    /**
     * An action that renders an HTML page with a welcome message.
     * The configuration in the <code>routes</code> file means that
     * this method will be called when the application receives a
     * <code>GET</code> request with a path of <code>/</code>.
     */
    public Result index() {
        return ok(views.html.index.render());
    }
    public Result rooms() {
        return ok(views.html.rooms.render());
    }
    public Result contact() {
        return ok(views.html.contact.render());
    }
    public Result aboutus() {
        return ok(views.html.aboutus.render());
    }
    public Result services() {
        return ok(views.html.services.render());
    }
}