package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.*;
import sbz.model.enums.*;
import sbz.service.EventListener;
import sbz.service.Util;

public class TrafficSimulation {

    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(115);
        v.setSpeedLimit(80);
        v.setMass(18000);
        v.setLoadLevel(LoadLevel.HEAVY);
        v.setAcceleration(1);
        v.setFrontVehicleDistance(12);
        v.setBrakeCondition(BrakeCondition.NORMAL);
        v.setLightsOn(true);

        Road r = new Road();
        r.setType(RoadType.HIGHWAY);
        r.setLaneCount(2);
        r.setSlope(0);
        r.setCondition(RoadConditionType.DRY);

        Traffic t = new Traffic();
        t.setDensity(TrafficDensity.HIGH);
        t.setCongested(true);
        t.setFrontVehicleType(VehicleType.TRUCK);

        Driver d = new Driver();
        d.setContinuousDrivingTime(80);
        d.setHardBrakingCount(1);
        d.setHardAccelerationCount(2);
        d.setDrivingStyle(DrivingStyle.CALM);

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(t);
        kSession.insert(d);

        int fired = kSession.fireAllRules();
        System.out.println("TrafficSimulation rules fired: " + fired);

        kSession.dispose();
    }
}