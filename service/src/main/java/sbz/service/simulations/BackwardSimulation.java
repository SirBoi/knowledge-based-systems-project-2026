package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.*;
import sbz.model.enums.*;
import sbz.service.EventListener;
import sbz.service.Util;

public class BackwardSimulation {

    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(110);
        v.setSpeedLimit(80);
        v.setMass(20000);
        v.setLoadLevel(LoadLevel.HEAVY);
        v.setAcceleration(1);
        v.setFrontVehicleDistance(10);
        v.setBrakeCondition(BrakeCondition.NORMAL);
        v.setLightsOn(false);

        Road r = new Road();
        r.setType(RoadType.HIGHWAY);
        r.setLaneCount(2);
        r.setSlope(-5);
        r.setCondition(RoadConditionType.WET);

        Weather w = new Weather();
        w.setFoggy(true);
        w.setRaining(true);
        w.setSnowing(false);
        w.setDay(false);
        w.setVisibility(VisibilityLevel.CRITICAL);

        Driver d = new Driver();
        d.setContinuousDrivingTime(150);
        d.setTotalDailyDrivingTime(10);
        d.setHardBrakingCount(4);
        d.setHardAccelerationCount(5);
        d.setDrivingStyle(DrivingStyle.AGGRESSIVE);

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(w);
        kSession.insert(d);

        int fired = kSession.fireAllRules();
        System.out.println("BackwardChainingSimulation rules fired: " + fired);

        kSession.dispose();
    }
}