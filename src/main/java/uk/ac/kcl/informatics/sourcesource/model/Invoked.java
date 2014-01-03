package uk.ac.kcl.informatics.sourcesource.model;

import java.util.Date;
import uk.ac.kcl.inf.provoking.model.Activity;

public class Invoked extends Activity {
    private String _methodName;

    public Invoked (Object identifier) {
        super (identifier);
    }
    
    public Invoked (Object identifier, Date startedAt, Date endedAt, String methodName) {
        super (identifier, startedAt, endedAt);
        _methodName = methodName;
    }
    
    public String getMethodName () {
        return _methodName;
    }
    
    public void setMethodName (String methodName) {
        _methodName = methodName;
    }
}
