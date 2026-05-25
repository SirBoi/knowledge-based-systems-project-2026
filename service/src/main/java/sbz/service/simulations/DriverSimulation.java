package sbz.service.simulations;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import sbz.model.input.*;
import sbz.model.enums.*;
import sbz.service.EventListener;
import sbz.service.Util;

public class DriverSimulation {

    public static void run() {

        KieContainer kc = Util.createRuleBase();
        KieSession kSession = Util.getStatefulKnowledgeSession(kc, "basic-simulation");

        kSession.addEventListener(new EventListener());

        Vehicle v = new Vehicle();
        v.setSpeed(75);
        v.setSpeedLimit(80);
        v.setMass(14000);
        v.setLoadLevel(LoadLevel.MEDIUM);
        v.setFrontVehicleDistance(25);
        v.setBrakeCondition(BrakeCondition.NORMAL);
        v.setLightsOn(true);

        Road r = new Road();
        r.setType(RoadType.CITY);
        r.setCondition(RoadConditionType.DRY);

        Driver d = new Driver();
        d.setContinuousDrivingTime(170);
        d.setHardBrakingCount(5);
        d.setHardAccelerationCount(6);
        d.setDrivingStyle(DrivingStyle.AGGRESSIVE);

        kSession.insert(v);
        kSession.insert(r);
        kSession.insert(d);

        int fired = kSession.fireAllRules();
        System.out.println("DriverSimulation rules fired: " + fired);

        kSession.dispose();
    }
}