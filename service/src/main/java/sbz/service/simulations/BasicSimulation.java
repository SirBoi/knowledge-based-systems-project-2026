package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.service.EventListener;
import sbz.service.Util;
import sbz.model.VehicleState;
import sbz.model.RoadCondition;
import sbz.model.DriverState;

public class BasicSimulation {
    public static void run() {

        KieContainer kc = Util.createRuleBase();
		KieSession session = Util.getStatefulKnowledgeSession(kc, "basic-simulation");
        
        session.addEventListener(new EventListener());

        System.out.println("\n --> First part");

        session.insert(new VehicleState(80, 100));
        session.insert(new RoadCondition("HIGHWAY", false));
        session.insert(new DriverState(30));

        session.fireAllRules();

        // System.out.println("\n --> Second part");

        // session.insert(new VehicleState(120, 90));
        // session.insert(new RoadCondition("HIGHWAY", true));
        // session.insert(new DriverState(150));

        // session.fireAllRules();
        session.dispose();
    }
}