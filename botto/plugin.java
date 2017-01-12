import org.openqa.selenium.WebDriver;
class Plugin extends Controller{
    Plugin(String tag){
	super(tag);
    }
    Plugin(WebDriver driver,String tag){
	super(driver,tag);
    }
    public boolean startup(){
	return false;//will do more stuff later
    }
    public boolean tick(){
	return false;//not supposed to do anything
    }
    Controller nextPlugin(WebDriver driver,String tag){
	Controller plugin = new Plugin0(driver,tag);
	return plugin;
    }
}
