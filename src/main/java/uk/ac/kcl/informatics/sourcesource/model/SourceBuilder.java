package uk.ac.kcl.informatics.sourcesource.model;

import java.util.Date;
import uk.ac.kcl.inf.provoking.builder.ProvBuilder;

public class SourceBuilder extends ProvBuilder {
    public SourceBuilder invoked (String methodName, Date started, Date ended, String... attributes) {
        setExtendedDescriptionKind (Invoked.class);
        activity (started, ended, attributes);
        
        Invoked invoked = (Invoked) getLastAdded ();
        invoked.setMethodName (methodName);
        return this;
    }
}
