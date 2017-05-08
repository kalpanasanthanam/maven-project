package fd.training.mulesoft.custom;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class BuildProcessing implements Callable{
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
	
	throw new Exception("Build Still Processing");

}
}