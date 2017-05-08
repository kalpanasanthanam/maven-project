package fd.training.mulesoft.custom;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class StatusException implements Callable{
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		// throw exception
		throw new Exception("Failed Status");
		
	}
	
}
