package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.*;
import sbz.model.enums.*;
import sbz.service.EventListener;
import sbz.service.Util;

public class CriticalSimulation {

    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(130);
        v.setSpeedLimit(80);
        v.setMass(22000);
        v.setLoadLevel(LoadLevel.HEAVY);
        v.setFrontVehicleDistance(8);
        v.setBrakeCondition(BrakeCondition.CRITICAL);
        v.setLightsOn(false);

        Road r = new Road();
        r.setType(RoadType.HIGHWAY);
        r.setLaneCount(2);
        r.setSlope(-6);
        r.setCondition(RoadConditionType.ICY);

        Weather w = new Weather();
        w.setFoggy(true);
        w.setSnowing(true);
        w.setDay(false);
        w.setVisibility(VisibilityLevel.CRITICAL);

        Traffic t = new Traffic();
        t.setDensity(TrafficDensity.HIGH);
        t.setCongested(true);
        t.setFrontVehicleType(VehicleType.TRUCK);

        Driver d = new Driver();
        d.setContinuousDrivingTime(210);
        d.setTotalDailyDrivingTime(12);
        d.setHardBrakingCount(8);
        d.setHardAccelerationCount(9);
        d.setDrivingStyle(DrivingStyle.AGGRESSIVE);

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(w);
        kSession.insert(t);
        kSession.insert(d);

        int fired = kSession.fireAllRules();
        System.out.println("CriticalSimulation rules fired: " + fired);

        kSession.dispose();
    }
}