package uk.ac.kcl.informatics.sourcesource;

import uk.ac.kcl.inf.provoking.model.Activity;
import uk.ac.kcl.inf.provoking.model.Document;
import uk.ac.kcl.inf.provoking.model.Entity;

public interface PlugIn {
    void activity (Document graph, Activity occurred);
    void variable (Document graph, Entity occurred);
    void wasGeneratedBy (Document graph, Entity effect, String role, Activity cause);
    void used (Document graph, Activity effect, Entity cause, String role);
}
