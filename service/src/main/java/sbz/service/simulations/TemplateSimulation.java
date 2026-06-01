package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.Vehicle;
import sbz.model.input.Road;
import sbz.model.input.Weather;
import sbz.model.enums.*;
import sbz.model.derived.RiskFactor;
import sbz.service.EventListener;
import sbz.service.Util;

public class TemplateSimulation {

    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(118);
        v.setSpeedLimit(80);
        v.setMass(20000);
        v.setLoadLevel(LoadLevel.HEAVY);
        v.setAcceleration(1.5);
        v.setFrontVehicleDistance(9);
        v.setBrakeCondition(BrakeCondition.NORMAL);
        v.setLightsOn(false);

        Road r = new Road();
        r.setType(RoadType.HIGHWAY);
        r.setLaneCount(2);
        r.setSlope(-5);
        r.setCondition(RoadConditionType.ICY);

        Weather w = new Weather();
        w.setRaining(true);
        w.setSnowing(true);
        w.setFoggy(true);
        w.setDay(false);
        w.setVisibility(VisibilityLevel.CRITICAL);

        Vehicle v2 = new Vehicle();
        v2.setSpeed(60);
        v2.setSpeedLimit(50);
        v2.setMass(1500);
        v2.setLoadLevel(LoadLevel.MEDIUM);
        v2.setAcceleration(1.0);
        v2.setFrontVehicleDistance(30);
        v2.setBrakeCondition(BrakeCondition.NORMAL);
        v2.setLightsOn(true);

        Road r2 = new Road();
        r2.setType(RoadType.CITY);
        r2.setLaneCount(4);
        r2.setSlope(0);
        r2.setCondition(RoadConditionType.DRY);

        Weather w2 = new Weather();
        w2.setRaining(false);
        w2.setSnowing(false);
        w2.setFoggy(false);
        w2.setDay(true);
        w2.setVisibility(VisibilityLevel.HIGH);

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(w);
        kSession.insert(v2);
        kSession.insert(r2);
        kSession.insert(w2);

        RiskFactor rfProbe = new RiskFactor("INIT");
        kSession.insert(rfProbe);

        int fired = kSession.fireAllRules();

        System.out.println("TemplateSimulation rules fired: " + fired);

        kSession.dispose();
    }
}