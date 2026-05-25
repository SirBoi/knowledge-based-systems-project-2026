package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.service.EventListener;
import sbz.service.Util;

public class BasicSimulation {
    public static void run() {

        KieContainer kc = Util.createRuleBase();
		KieSession session = Util.getStatefulKnowledgeSession(kc, "basic-simulation");
        
        session.addEventListener(new EventListener());

        // Drools stuff here...

        session.fireAllRules();
        session.dispose();
    }
}