package fd.training.mulesoft.custom;
import org.mule.api.MuleEventContext;
import org.mule.api.lifecycle.Callable;

public class WFRequestStatusSleep implements Callable{
	
	@Override
	public Object onCall(MuleEventContext eventContext) throws Exception {
		
		// Sleep for 10s
		Thread.sleep(20000);
		
		// return the same message
		return eventContext.getMessage();
	}
	
	

}
